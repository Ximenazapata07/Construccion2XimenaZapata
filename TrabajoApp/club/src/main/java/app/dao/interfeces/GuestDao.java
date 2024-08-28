package app.dao.interfeces;

import app.dto.GuestDto;

public interface GuestDao {
	public void createGuest(GuestDto guestDto) throws Exception;
	public boolean existById(GuestDto guestDto) throws Exception;
	public void deleteGuest(GuestDto guestDto) throws Exception;
	public GuestDto finById(GuestDto guestDto) throws Exception;
	
}
