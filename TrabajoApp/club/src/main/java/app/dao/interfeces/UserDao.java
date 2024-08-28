package app.dao.interfeces;

import app.dto.UserDto;

public interface UserDao {
	public UserDto findByUserName(UserDto userDto) throws Exception;
	public boolean existsByUserName(UserDto userDto) throws Exception;
	public void createUser(UserDto userDto) throws Exception;
	
	
}
