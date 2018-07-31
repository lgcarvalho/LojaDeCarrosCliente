package loja.cliente.managedbean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import loja.cliente.ws.conta.Conta;
import loja.cliente.ws.conta.ContaWS;
import loja.cliente.ws.conta.ContaWS_Service;
import loja.cliente.ws.conta.Endereco;
import loja.cliente.ws.conta.Exception_Exception;
import loja.cliente.ws.conta.Telefone;

@ManagedBean
@ViewScoped
public class ContaMB {

    private Conta conta = new Conta();
    private Endereco endereco = new Endereco();
    private Telefone telefone = new Telefone();

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String salvar() {
        ContaWS_Service service = new ContaWS_Service();
        ContaWS port = service.getContaWSPort();
        FacesContext context = FacesContext.getCurrentInstance();

        List<Conta> contas = port.consultarContas();

        for (Conta c : contas) {
            if (c.getEmail().equals(conta.getEmail())) {
                context.getExternalContext().getFlash().setKeepMessages(true);
                context.addMessage(null, new FacesMessage("E-mail " + conta.getEmail() + " já registrado"));

                return "login?faces-redirect=true";
            }
        }

        port.salvarConta(conta.getCpf(), conta.getEmail(), conta.getSenha(), conta.getNome(),
                conta.getSobrenome(), endereco.getCep(), endereco.getCidade(), endereco.getEstado(),
                telefone.getNumero(), telefone.getTipo());

        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(null, new FacesMessage("Usuário " + conta.getEmail() + " criado com sucesso!!"));

        return "login?faces-redirect=true";
    }

    public String atualizar() throws Exception_Exception {
        ContaWS_Service service = new ContaWS_Service();
        ContaWS port = service.getContaWSPort();

        FacesContext context = FacesContext.getCurrentInstance();
        this.conta = (Conta) context.getExternalContext().getSessionMap().remove("contaLogada");

        context.getExternalContext().getSessionMap().remove("contaLogada");

        System.out.println(this.conta.getId() + " / " + this.conta.getNome() + " / " + this.conta.getEndereco().getId() + " / "
                + this.conta.getTelefone().getId());

        port.atualizarConta(Long.toString(conta.getId()), conta.getCpf(), conta.getEmail(), conta.getSenha(), conta.getNome(), conta.getSobrenome(),
                Long.toString(conta.getEndereco().getId()), conta.getEndereco().getCep(), conta.getEndereco().getCidade(), conta.getEndereco().getCep(),
                Long.toString(conta.getTelefone().getId()), conta.getTelefone().getNumero(), conta.getTelefone().getTipo());

        context.getExternalContext().getSessionMap().put("contaLogada", this.conta);

        return "perfil?faces-redirect=true";
    }

    public String realizarLogin() {
        ContaWS_Service service = new ContaWS_Service();
        ContaWS port = service.getContaWSPort();
        FacesContext context = FacesContext.getCurrentInstance();

        this.conta = port.realizarLogin(conta.getEmail(), conta.getSenha());

        if (conta.getId() != null) {
            context.getExternalContext().getSessionMap().put("contaLogada", this.conta);

            return "index?faces-redirect=true";
        }

        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(null, new FacesMessage("Usuário/senha inválidos"));

        return "login?faces-redirect=true";
    }

    public String deslogar() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().remove("contaLogada");

        return "index?faces-redirect=true";
    }
}
