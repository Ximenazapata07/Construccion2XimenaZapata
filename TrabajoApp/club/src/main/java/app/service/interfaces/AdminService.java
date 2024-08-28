package app.service.interfaces;
import app.dto.UserDto;

public interface AdminService {
	public void createPather(UserDto userDto) throws Exception;
	public void createPromotion() throws Exception;
	
	}


