package loja.cliente.teste;

import java.util.List;
import loja.cliente.ws.marca.Marca;
import loja.cliente.ws.marca.MarcaWS;
import loja.cliente.ws.marca.MarcaWS_Service;

public class TesteListagem {
    public static void main(String[] args) {
        MarcaWS_Service service = new MarcaWS_Service();
        MarcaWS port = service.getMarcaWSPort();
        
        List<Marca> marcas;
        
        marcas = port.consultarMarcas();
        
        System.out.println(marcas.size());
        
        for(Marca m : marcas) {
            System.out.println(m.getId() + " / " + m.getNome());
        }
    }
}
