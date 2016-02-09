package eventPlanner.facade;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import eventPlanner.eao.eventEAOLocal;
import eventPlanner.eao.userEAOLocal;



@Stateless
@LocalBean
public class Facade implements FacadeRemote, FacadeLocal {

	@EJB
	eventEAOLocal eventEAO;
	@EJB
	userEAOLocal userEAO;
	
	
    public Facade() {
  
    }
    
    //public Event findByUserId(String userId) {
    	//return eventEAO.findByEventId
    //}
    

}
