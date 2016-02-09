package eventPlanner.ejb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "EventAttendee",uniqueConstraints={
		@UniqueConstraint(columnNames = {"EventId", "UserId"})
		})

public class EventAttendee {
	
	private int eventId;
	private int userId;
	private int amount;
	
	
	@Column(name = "EventID")
	public int getEventID() {
		return eventId;
	}
	public void setEventID(int eventID) {
		this.eventId = eventID;
	}
	@Column(name = "UserID")
	public int getUserID() {
		return userId;
	}
	public void setUserID(int userID) {
		this.userId = userID;
	}
	@Column(name = "Amount")
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
