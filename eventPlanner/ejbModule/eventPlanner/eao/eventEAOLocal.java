package eventPlanner.eao;

import javax.ejb.Local;

import eventPlanner.ejb.Event;

@Local
public interface eventEAOLocal {
	
	public Event createEvent(Event event);
	public Event findEvent(int eventId);
	public Event updateEvent(Event event);
	public void deleteEvent(int eventId, String location, int eventTime, int zipCode, int openSlots, String note);
	
	

}
