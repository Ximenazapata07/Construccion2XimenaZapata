package app.dao.interfeces;

import app.dto.PartherDto;


public interface PartherDao {
	public void createParther(PartherDto partherDto) throws Exception;
	public boolean existsById(PartherDto partherDto) throws Exception;
	public void deleteParther(PartherDto partherDto) throws Exception;
	public PartherDto findByUserName(PartherDto partherDto) throws Exception;
	
}
