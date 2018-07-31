package loja.cliente.teste;

import loja.cliente.ws.loja.Endereco;
import loja.cliente.ws.loja.Telefone;
import loja.cliente.ws.loja.Loja;
import loja.cliente.ws.loja.LojaWS;
import loja.cliente.ws.loja.LojaWS_Service;

public class TesteSalvarLoja {

    public static void main(String[] args) {
        LojaWS_Service service = new LojaWS_Service();
        LojaWS port = service.getLojaWSPort();

        Endereco endereco = new Endereco();
        Telefone telefone = new Telefone();
        Loja loja = new Loja();

        // Loja Caminho do Mar
        endereco.setCep("09619110");
        endereco.setCidade("São Bernardo do Campo");
        endereco.setEstado("São Paulo");

        telefone.setNumero("1146985214");
        telefone.setTipo("Fixo");

        loja.setNome("Loja AluCar Caminho do Mar");
        loja.setCoordenada("-23.665605, -46.566337");
        loja.setImagem("img_caminhodomar.png");

        loja = port.salvarLoja(loja.getNome(), loja.getCoordenada(), loja.getImagem(),
                endereco.getCep(), endereco.getCidade(), endereco.getEstado(),
                telefone.getNumero(), telefone.getTipo());

        System.out.println(loja.getId());

        // Loja Vila Scarpelli
        endereco.setCep("09050180");
        endereco.setCidade("Santo André");
        endereco.setEstado("São Paulo");

        telefone.setNumero("1148522147");
        telefone.setTipo("Fixo");

        loja.setNome("Loja AluCar Vila Scarpelli");
        loja.setCoordenada("-23.673180, -46.542855");
        loja.setImagem("img_vilascarpelli.png");

        loja = port.salvarLoja(loja.getNome(), loja.getCoordenada(), loja.getImagem(),
                endereco.getCep(), endereco.getCidade(), endereco.getEstado(),
                telefone.getNumero(), telefone.getTipo());

        System.out.println(loja.getId());

        // Loja Matriz
        endereco.setCep("09370670");
        endereco.setCidade("Mauá");
        endereco.setEstado("São Paulo");

        telefone.setNumero("1142358741");
        telefone.setTipo("Fixo");

        loja.setNome("Loja AluCar Matriz");
        loja.setCoordenada("-23.679682, -46.460845");
        loja.setImagem("img_matriz.png");

        loja = port.salvarLoja(loja.getNome(), loja.getCoordenada(), loja.getImagem(),
                endereco.getCep(), endereco.getCidade(), endereco.getEstado(),
                telefone.getNumero(), telefone.getTipo());

        System.out.println(loja.getId());

        // Loja Rudge Ramos
        endereco.setCep("09635060");
        endereco.setCidade("São Bernardo do Campo");
        endereco.setEstado("São Paulo");

        telefone.setNumero("1141368254");
        telefone.setTipo("Fixo");

        loja.setNome("Loja AluCar Rudge Ramos");
        loja.setCoordenada("-23.652913, -46.570083");
        loja.setImagem("img_rudgeramos.png");

        loja = port.salvarLoja(loja.getNome(), loja.getCoordenada(), loja.getImagem(),
                endereco.getCep(), endereco.getCidade(), endereco.getEstado(),
                telefone.getNumero(), telefone.getTipo());

        System.out.println(loja.getId());

        // Loja São Pedro
        endereco.setCep("09784060");
        endereco.setCidade("São Bernardo do Campo");
        endereco.setEstado("São Paulo");

        telefone.setNumero("1145963217");
        telefone.setTipo("Fixo");

        loja.setNome("Loja AluCar São Pedro");
        loja.setCoordenada("-23.722040, -46.524845");
        loja.setImagem("img_saopedro.png");

        loja = port.salvarLoja(loja.getNome(), loja.getCoordenada(), loja.getImagem(),
                endereco.getCep(), endereco.getCidade(), endereco.getEstado(),
                telefone.getNumero(), telefone.getTipo());

        System.out.println(loja.getId());
    }
}
