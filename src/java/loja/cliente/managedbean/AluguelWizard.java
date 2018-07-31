/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.cliente.managedbean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.FlowEvent;

@ManagedBean
@ViewScoped
public class AluguelWizard implements Serializable {

    private static final long serialVersionUID = 8326123330475710683L;
    
    public String onFlowProcess(FlowEvent event) {
        return event.getNewStep();
    }
}
