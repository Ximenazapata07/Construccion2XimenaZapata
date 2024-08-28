package app.model;

import java.sql.Date;

public class Parther {
	private long id;
	private Person personId;
	private User userId;
	private long availableFunds;
	private String subscriptionType;
	private Date membersphipDate;
	
	public Parther() {}

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
