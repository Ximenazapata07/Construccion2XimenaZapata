package app.dto;

import java.sql.Date;

public class PartherDto {
	private long id;
	private PersonDto personId;
	private UserDto userId;
	private long availableFunds;
	private String subscriptionType;
	private Date membersphipDate;
	
	public PartherDto() {}

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

	public long getAvailableFunds() {
		return availableFunds;
	}

	public void setAvailableFunds(long availableFunds) {
		this.availableFunds = availableFunds;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public Date getMembersphipDate() {
		return membersphipDate;
	}

	public void setMembersphipDate(Date membersphipDate) {
		this.membersphipDate = membersphipDate;
	}
	
	
}
