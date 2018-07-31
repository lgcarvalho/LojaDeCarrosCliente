package loja.cliente.teste;

import loja.cliente.ws.marca.Marca;
import loja.cliente.ws.marca.MarcaWS;
import loja.cliente.ws.marca.MarcaWS_Service;

public class TesteSalvarMarca {

    public static void main(String[] args) {
        MarcaWS_Service service = new MarcaWS_Service();
        MarcaWS port = service.getMarcaWSPort();

        Marca marca = new Marca();

        marca.setNome("Chevrolet");
        marca.setImagem("logo_chevrolet.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());

        marca.setNome("Volkswagen");
        marca.setImagem("logo_volkswagen.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());

        marca.setNome("Ford");
        marca.setImagem("logo_ford.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());

        marca.setNome("Fiat");
        marca.setImagem("logo_fiat.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());

        marca.setNome("Renault");
        marca.setImagem("logo_renault.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());

        marca.setNome("Hyundai");
        marca.setImagem("logo_hyundai.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());

        marca.setNome("Mercedes-Benz");
        marca.setImagem("logo_mercedes-benz.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());

        marca.setNome("BMW");
        marca.setImagem("logo_bmw.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());

        marca.setNome("Audi");
        marca.setImagem("logo_audi.png");
        marca = port.salvarMarca(marca.getNome(), marca.getImagem());
        System.out.println(marca.getId());
    }
}
