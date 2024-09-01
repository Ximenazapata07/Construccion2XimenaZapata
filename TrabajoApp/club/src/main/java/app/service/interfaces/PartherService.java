package app.service.interfaces;

import app.dto.GuestDto;
import app.dto.InvoiceDto;
import app.dto.UserDto;

public interface PartherService {
	public void createGuest(GuestDto guestDto) throws Exception;
	public void createInvoice(InvoiceDto invoiceDto) throws Exception;
	
	
}
