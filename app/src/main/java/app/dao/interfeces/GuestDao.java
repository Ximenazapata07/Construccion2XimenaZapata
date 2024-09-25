package app.dao.interfeces;

import app.dto.GuestDto;
import app.dto.UserDto;

public interface GuestDao {
	
	public void createGuest(GuestDto guestDto) throws Exception;
	public boolean existById(GuestDto guestDto) throws Exception;
	public void deleteGuest(GuestDto guestDto) throws Exception;
	public GuestDto finById(UserDto userDto) throws Exception;
	
}
