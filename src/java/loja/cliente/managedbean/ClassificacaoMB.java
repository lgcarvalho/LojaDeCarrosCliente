package loja.cliente.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import loja.cliente.ws.classificacao.Classificacao;
import loja.cliente.ws.classificacao.ClassificacaoWS;
import loja.cliente.ws.classificacao.ClassificacaoWS_Service;

@ManagedBean
@SessionScoped
public class ClassificacaoMB implements Serializable {

    private static final long serialVersionUID = -7284521460604060043L;
    
    private Classificacao classificacao = new Classificacao();

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
    
    public List<Classificacao> getClassificacoes() {
        ClassificacaoWS_Service service = new ClassificacaoWS_Service();
        ClassificacaoWS port = service.getClassificacaoWSPort();
        
        return port.consultarClassificacoes();
    }
}
