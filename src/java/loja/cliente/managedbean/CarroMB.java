package loja.cliente.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import loja.cliente.ws.carro.Carro;
import loja.cliente.ws.carro.CarroWS;
import loja.cliente.ws.carro.CarroWS_Service;

@ManagedBean
@SessionScoped
public class CarroMB implements Serializable {

    private static final long serialVersionUID = 1626519983374014900L;

    private Carro carro = new Carro();

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        CarroWS_Service service = new CarroWS_Service();
        CarroWS port = service.getCarroWSPort();

        return port.consultarCarros();
    }

    public List<Carro> getOfertas() {
        CarroWS_Service service = new CarroWS_Service();
        CarroWS port = service.getCarroWSPort();

        return port.consultarOfertas();
    }

    public String irParaAluguel(Carro carro) {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
        session.setAttribute("carro", carro);

        return "aluguel?faces-redirect=true";
    }

    public Carro consultarPorId() {
        CarroWS_Service service = new CarroWS_Service();
        CarroWS port = service.getCarroWSPort();

        return port.consultarPorId(Long.toString(carro.getId()));
    }

    public List<Carro> consultarPorMarca(Long idMarca) {
        CarroWS_Service service = new CarroWS_Service();
        CarroWS port = service.getCarroWSPort();

        return port.consultarPorMarca(Long.toString(idMarca));
    }

    public List<Carro> consultarPorClass(Long idClassificacao) {
        CarroWS_Service service = new CarroWS_Service();
        CarroWS port = service.getCarroWSPort();

        return port.consultarPorClass(Long.toString(idClassificacao));
    }

    public List<Carro> consultarPorMarcaEClass(Long idMarca, Long idClassificacao) {
        CarroWS_Service service = new CarroWS_Service();
        CarroWS port = service.getCarroWSPort();

        return port.consultarPorMarcaEClass(Long.toString(idMarca), Long.toString(idClassificacao));
    }
    
}
