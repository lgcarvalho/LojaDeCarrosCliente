package loja.cliente.teste;

import loja.cliente.ws.conta.Conta;
import loja.cliente.ws.conta.ContaWS;
import loja.cliente.ws.conta.ContaWS_Service;
import loja.cliente.ws.conta.Endereco;
import loja.cliente.ws.conta.Telefone;

public class TesteSalvarConta {

    public static void main(String[] args) throws Exception {
        ContaWS_Service service = new ContaWS_Service();
        ContaWS port = service.getContaWSPort();

        Endereco endereco = new Endereco();
        Telefone telefone = new Telefone();
        Conta conta = new Conta();

        endereco.setCep("09619110");
        endereco.setCidade("Sao Bernardo do Campo");
        endereco.setEstado("Sao Paulo");

        telefone.setNumero("11972407255");
        telefone.setTipo("Celular");

        conta.setCpf("12345678910");
        conta.setEmail("luiz@teste");
        conta.setNome("Luiz");
        conta.setSobrenome("Carvalho");
        conta.setSenha("teste123");

        conta = port.salvarConta(conta.getCpf(), conta.getEmail(), conta.getSenha(), conta.getNome(), conta.getSobrenome(),
                endereco.getCep(), endereco.getCidade(), endereco.getEstado(),
                telefone.getNumero(), telefone.getTipo());

        System.out.println(conta.getId());
    }

}
