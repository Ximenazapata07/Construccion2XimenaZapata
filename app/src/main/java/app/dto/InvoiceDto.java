package app.dto;

//import java.sql.Date;

public class InvoiceDto {
	private long id;
	private PersonDto personId;
	private PartherDto partherId;
	//private Date consumptionDate;
	private double total;
	private boolean status;
	private String items;
	
	public InvoiceDto() {
		super ();
	}

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

	public PartherDto getPartherId() {
		return partherId;
	}

	public void setPartherId(PartherDto partherId) {
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

