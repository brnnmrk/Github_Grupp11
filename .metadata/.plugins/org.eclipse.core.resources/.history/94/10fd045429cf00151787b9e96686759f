package eventPlanner.facade;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import eventPlanner.eao.eventEAOLocal;
import eventPlanner.eao.userEAOLocal;

/**
 * Session Bean implementation class Facade
 */

@Stateless
@LocalBean
public class Facade implements FacadeRemote, FacadeLocal {

	@EJB
	eventEAOLocal eventEAO;
	@EJB
	userEAOLocal userEAO;
	
	
    public Facade() {
        // TODO Auto-generated constructor stub
    }
    
    public Event findByUserId(String userId) {
    	return ecentEAO.findByEventId
    }
    

}
