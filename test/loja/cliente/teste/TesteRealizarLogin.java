package loja.cliente.teste;

import loja.cliente.ws.conta.Conta;
import loja.cliente.ws.conta.ContaWS;
import loja.cliente.ws.conta.ContaWS_Service;
import loja.cliente.ws.conta.Endereco;
import loja.cliente.ws.conta.Telefone;

public class TesteRealizarLogin {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setEmail("luiz@teste");
        conta.setSenha("teste123");
        
        ContaWS_Service service = new ContaWS_Service();
        ContaWS port = service.getContaWSPort();
        
        conta = port.realizarLogin(conta.getEmail(), conta.getSenha());
        
        System.out.println(conta.getId() + " / " + conta.getNome() + " / " + conta.getCpf());
        
        Endereco endereco = conta.getEndereco();
        System.out.println(endereco.getId());
        
        Telefone telefone = conta.getTelefone();
        System.out.println(telefone.getId());
        
        Conta conta2 = new Conta();
        conta2.setEmail("teste@teste");
        conta2.setSenha("123");
        
        conta2 = port.realizarLogin(conta2.getEmail(), conta2.getSenha());
        
        System.out.println(conta2.getId() + " / " + conta2.getNome() + " / " + conta2.getCpf());
    }
}
