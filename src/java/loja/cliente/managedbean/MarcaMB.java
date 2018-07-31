package loja.cliente.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import loja.cliente.ws.marca.Marca;
import loja.cliente.ws.marca.MarcaWS;
import loja.cliente.ws.marca.MarcaWS_Service;

@ManagedBean
@SessionScoped
public class MarcaMB implements Serializable {

    private static final long serialVersionUID = -7751916944979759233L;
    
    private Marca marca = new Marca();
    
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public List<Marca> getMarcas() {
        MarcaWS_Service service = new MarcaWS_Service();
        MarcaWS port = service.getMarcaWSPort();
        
        return port.consultarMarcas();
    }
}
