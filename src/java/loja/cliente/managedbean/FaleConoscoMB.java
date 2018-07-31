package loja.cliente.managedbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class FaleConoscoMB {
    
    public String encaminharDuvida() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(null, new FacesMessage("Formulário encaminhado com sucesso"));
        
        return "faleconosco?faces-redirect=true";
    }
    
}
