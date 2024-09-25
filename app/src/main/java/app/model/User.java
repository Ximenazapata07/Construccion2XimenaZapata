package app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@Column(name="personid")
	private Person personId;
	@Column(name="password")
	private String password;
	@Column(name="username")
	private String userName;
	@Column(name="role")
	private String role;
	
	public User() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPersonId() {
		return personId;
	}

	public void setPersonId(Person personId) {
		this.personId = personId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
