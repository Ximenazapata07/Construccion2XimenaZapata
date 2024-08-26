package app.dto;



public class GuestDto {
	private long id;
	private PersonDto personId;
	private UserDto userId;
	private PartherDto partherId;
	private Boolean guestStatus;
	
	public GuestDto() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PersonDto getPersonId() {
		return personId;
	}

	public void setPersonId(PersonDto personId) {
		this.personId = personId;
	}

	public UserDto getUserId() {
		return userId;
	}

	public void setUserId(UserDto userId) {
		this.userId = userId;
	}

	public PartherDto getPartherId() {
		return partherId;
	}

	public void setPartherId(PartherDto partherId) {
		this.partherId = partherId;
	}

	public Boolean getGuestStatus() {
		return guestStatus;
	}

	public void setGuestStatus(Boolean guestStatus) {
		this.guestStatus = guestStatus;
	}
	
	
}
