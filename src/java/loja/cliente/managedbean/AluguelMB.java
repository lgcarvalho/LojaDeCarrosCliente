package loja.cliente.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import loja.carros.webservice.Aluguel;
import loja.carros.webservice.AluguelWS;
import loja.carros.webservice.AluguelWS_Service;
import loja.cliente.ws.carro.Carro;
import loja.cliente.ws.conta.Conta;
import loja.cliente.ws.loja.Loja;

@ManagedBean
@SessionScoped
public class AluguelMB implements Serializable {

    private static final long serialVersionUID = -7026088662881306441L;

    private Aluguel aluguel = new Aluguel();
    private Conta conta = new Conta();
    private Carro carro = new Carro();
    private Loja loja = new Loja();

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public String salvarAluguel() {
        AluguelWS_Service service = new AluguelWS_Service();
        AluguelWS port = service.getAluguelWSPort();
        FacesContext context = FacesContext.getCurrentInstance();

        aluguel.setStatus("Aguardando retirada");

        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession();

        conta = (Conta) session.getAttribute("contaLogada");
        carro = (Carro) session.getAttribute("carro");
        loja = (Loja) session.getAttribute("loja");

        aluguel = port.salvarAluguel(Integer.toString(aluguel.getDias()),
                aluguel.getStatus(), Long.toString(conta.getId()), Long.toString(carro.getId()),
                Long.toString(loja.getId()));

        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(null, new FacesMessage("Aluguel " + aluguel.getId() + " realizado com sucesso!!"));

        return "perfil?faces-redirect=true";
    }

    public List<Aluguel> getAlugueis() {
        AluguelWS_Service service = new AluguelWS_Service();
        AluguelWS port = service.getAluguelWSPort();

        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession();

        conta = (Conta) session.getAttribute("contaLogada");

        return port.consultarPedidos(Long.toString(conta.getId()));
    }

    public String excluirPedido(Long id) {
        AluguelWS_Service service = new AluguelWS_Service();
        AluguelWS port = service.getAluguelWSPort();
        FacesContext context = FacesContext.getCurrentInstance();

        port.excluirPedido(id);
        
        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(null, new FacesMessage("Aluguel " + id + " cancelado com sucesso!!"));

        return "perfil?faces-redirect=true";
    }
}
