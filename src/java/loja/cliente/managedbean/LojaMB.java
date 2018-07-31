package loja.cliente.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import loja.cliente.ws.conta.Endereco;
import loja.cliente.ws.conta.Telefone;
import loja.cliente.ws.loja.Loja;
import loja.cliente.ws.loja.LojaWS;
import loja.cliente.ws.loja.LojaWS_Service;

@ManagedBean
@SessionScoped
public class LojaMB implements Serializable {

    private static final long serialVersionUID = 2912591947003134691L;
    
    Loja loja = new Loja();
    Endereco endereco = new Endereco();
    Telefone telefone = new Telefone();

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    public List<Loja> getLojas() {
        LojaWS_Service service = new LojaWS_Service();
        LojaWS port = service.getLojaWSPort();
        
        return port.consultarLojas();
    }
    
    public void guardarLoja(Loja loja) {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
        session.setAttribute("loja", loja);
    }
}
