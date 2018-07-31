package loja.cliente.teste;

import loja.cliente.ws.marca.Exception_Exception;
import loja.cliente.ws.marca.Marca;
import loja.cliente.ws.marca.MarcaWS;
import loja.cliente.ws.marca.MarcaWS_Service;

public class TesteAlterarMarca {

    public static void main(String[] args) throws Exception_Exception {
        MarcaWS_Service service = new MarcaWS_Service();
        MarcaWS port = service.getMarcaWSPort();

        Marca marca = new Marca();
        marca.setId(15L);

        marca = port.consultarPorId(Long.toString(marca.getId()));

        System.out.println(marca.getId() + " / " + marca.getNome() + " / " + marca.getImagem());

        marca.setNome("Mercedes-Benz");
        marca.setImagem("logo_mercedes-benz.png");

        port.atualizarMarca(Long.toString(marca.getId()), marca.getNome(), marca.getImagem());

        System.out.println(marca.getId() + " / " + marca.getNome() + " / " + marca.getImagem());
    }
}
