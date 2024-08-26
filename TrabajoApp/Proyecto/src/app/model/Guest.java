package app.model;

public class Guest {
	private long id;
	private Person personId;
	private User userId;
	private Parther partherId;
	private Boolean guestStatus;
	
	public Guest() {}

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

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Parther getPartherId() {
		return partherId;
	}

	public void setPartherId(Parther partherId) {
		this.partherId = partherId;
	}

	public Boolean getGuestStatus() {
		return guestStatus;
	}

	public void setGuestStatus(Boolean guestStatus) {
		this.guestStatus = guestStatus;
	}
	

}
