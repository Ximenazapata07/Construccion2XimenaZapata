package app.model;

//import java.sql.Date;

public class Invoice {
	private long id;
	private Person personId;
	private Parther partherId;
	//private Date consumptionDate;
	private double total;
	private boolean status;
	private String items;
	
	public Invoice () {}

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

	public Parther getPartherId() {
		return partherId;
	}

	public void setPartherId(Parther partherId) {
		this.partherId = partherId;
	}

	/*public Date getConsumptionDate() {
		return consumptionDate;
	}

	public void setConsumptionDate(Date consumptionDate) {
		this.consumptionDate = consumptionDate;
	}*/


	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	
	
	

}
