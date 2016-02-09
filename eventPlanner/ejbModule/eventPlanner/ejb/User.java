package eventPlanner.ejb;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	private int userId;
	private String phoneNbr;
	private String name;
	private String email;
	private String password;
	private int sex;
	private int age;
	private Set<Event> events;
	
	@Id
	
	@Column(name = "UserID")
	public int getUserID() {
		return userId;
	}
	public void setUserID(int userID) {
		this.userId = userID;
	}
	@Column(name = "PhoneNbr")
	public String getPhoneNbr() {
		return phoneNbr;
	}
	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
	@Column(name = "Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "Email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "Password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "Sex")
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Column(name = "Age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	public Set<Event> getEvents() {
	return events;
	}
	
	public void setEvents(Set<Event> events) {
		this.events = events;
		}

}
