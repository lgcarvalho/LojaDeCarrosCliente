package loja.cliente.teste;

import loja.cliente.ws.classificacao.Classificacao;
import loja.cliente.ws.classificacao.ClassificacaoWS;
import loja.cliente.ws.classificacao.ClassificacaoWS_Service;

public class TesteSalvarClassificacao {

    public static void main(String[] args) {
        ClassificacaoWS_Service service = new ClassificacaoWS_Service();
        ClassificacaoWS port = service.getClassificacaoWSPort();

        Classificacao classificacao = new Classificacao();

        classificacao.setNome("Compacto");
        classificacao.setImagem("class_compacto.png");
        classificacao = port.salvarClassificacao(classificacao.getNome(), classificacao.getImagem());
        System.out.println(classificacao.getId());
        
        classificacao.setNome("Sedan");
        classificacao.setImagem("class_sedan.png");
        classificacao = port.salvarClassificacao(classificacao.getNome(), classificacao.getImagem());
        System.out.println(classificacao.getId());
        
        classificacao.setNome("Luxo");
        classificacao.setImagem("class_luxo.png");
        classificacao = port.salvarClassificacao(classificacao.getNome(), classificacao.getImagem());
        System.out.println(classificacao.getId());
        
        classificacao.setNome("SUV");
        classificacao.setImagem("class_suv.png");
        classificacao = port.salvarClassificacao(classificacao.getNome(), classificacao.getImagem());
        System.out.println(classificacao.getId());
    }
}
