package loja.cliente.teste;
import loja.carros.webservice.Aluguel;
import loja.carros.webservice.AluguelWS;
import loja.carros.webservice.AluguelWS_Service;
import loja.cliente.ws.carro.Carro;
import loja.cliente.ws.conta.Conta;
import loja.cliente.ws.loja.Loja;

public class TesteSalvarAluguel {

    public static void main(String[] args) {
        AluguelWS_Service service = new AluguelWS_Service();
        AluguelWS port = service.getAluguelWSPort();

        Aluguel aluguel = new Aluguel();
        aluguel.setDias(5);
        aluguel.setStatus("Aguardando retirada");

        Carro carro = new Carro();
        carro.setId(1L);

        Conta conta = new Conta();
        conta.setId(1L);

        Loja loja = new Loja();
        loja.setId(1L);
        
        aluguel = port.salvarAluguel(Integer.toString(aluguel.getDias()), aluguel.getStatus(),
                Long.toString(conta.getId()), Long.toString(carro.getId()),
                Long.toString(loja.getId()));

        System.out.println(aluguel.getId());
    }
}
