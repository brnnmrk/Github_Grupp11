package eventPlanner.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import eventPlanner.ejb.Event;



@Stateless
@LocalBean

public class eventEAOImpl implements eventEAOLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;
	
    public eventEAOImpl() {
        
    }
    
    public Event createEvent(Event event) {
    	em.persist(event);
    	return event;
    }
    
    public Event updateEvent(Event event){
    	em.merge(event);
    	return event;
    }
    
    public Event findEvent(int eventId){
    	return em.find(Event.class, eventId);
    }
    
    public void deleteEvent (int eventId, String location, int eventTime, int zipCode, int openSlots, String note){
    	Event e = this.findEvent(eventId);
    	if (e != null){
    		em.remove(e);
    	}
    }
    
  

}
