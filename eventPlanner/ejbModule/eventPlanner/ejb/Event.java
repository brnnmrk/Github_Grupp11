package eventPlanner.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Event")
public class Event implements Serializable {

	private int eventId;
	private String location;
	private int eventTime;
	private int zipCode;
	private int openSlots;
	private String note;
	private User user;

	@Id

	@Column(name = "eventID")
	public int getEventID() {
		return eventId;
	}

	public void setEventID(int eventID) {
		this.eventId = eventID;
	}

	@Column(name = "Location")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "EventTime")
	public int getEventTime() {
		return eventTime;
	}

	public void setEventTime(int eventTime) {
		this.eventTime = eventTime;
	}

	@Column(name = "ZipCode")
	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "OpenSlots")
	public int getOpenSlots() {
		return openSlots;
	}

	public void setOpenSlots(int openSlots) {
		this.openSlots = openSlots;
	}

	@Column(name = "Note")
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@ManyToOne
	@JoinColumn(name = "eId", referencedColumnName = "EventId")
	public User getUser() {
		return user;
	}

	public void setUser(User customer) {
		this.user = customer;
	}

}
