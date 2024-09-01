package app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.config.MYSQLConnection;
import app.dao.interfeces.PartherDao;
import app.dto.PartherDto;
import app.dto.PersonDto;
import app.dto.UserDto;
import app.helpers.Helper;
import app.model.Parther;
import app.model.Person;
import app.model.User;

public class PartherDaoImplementation implements PartherDao {
	
	@Override 
	public void createParther(PartherDto partherDto ) throws Exception{
		Parther parther = Helper.parse(partherDto);
		String query= "INSERT INTO PARTNER(USERID,AMOUNT,TYPE,CREATIONDATE)VALUES(?,?,?,?)";
		PreparedStatement preparedStatement = MYSQLConnection.getConnection().prepareStatement(query);
		preparedStatement.setLong(1, parther.getUserId().getId());
		preparedStatement.setLong(2, parther.getAvailableFunds());
		preparedStatement.setString(3, parther.getSubscriptionType());
		preparedStatement.setDate(4, parther.getMembersphipDate());
		preparedStatement.execute();
		preparedStatement.close();
		
	}
	@Override 
	public void deleteParther(PartherDto partherDto) throws Exception{
		Parther parther= Helper.parse(partherDto);
		String query = "DELETE FROM PARTNER WHERE USERID = ?";
		PreparedStatement preparedStatement = MYSQLConnection.getConnection().prepareStatement(query);
		preparedStatement.setLong(1, parther.getUserId().getId());
		preparedStatement.execute();
		preparedStatement.close();
		
	}
	
	@Override
	public PartherDto existById(UserDto userDto) throws Exception{
		String query = "SELECT ID,USERID,AMOUNT,TYPE,CREATIONDATE FROM PARTNER WHERE USERID =?";
		PreparedStatement preparedStatement = MYSQLConnection.getConnection().prepareStatement(query);
		preparedStatement.setLong(1, userDto.getId());
		ResultSet resulSet = preparedStatement.executeQuery();
		if(resulSet.next()) {
			Parther parther = new Parther();
			parther.setId(resulSet.getLong("ID"));
			parther.setAvailableFunds(resulSet.getLong("AMOUNT"));
			parther.setSubscriptionType(resulSet.getString("TYPE"));
			parther.setMembersphipDate(resulSet.getDate("CREATIONDATE"));
			User user = new User();
			user.setId(resulSet.getLong("USERID"));
			parther.setUserId(user);
			resulSet.close();
			preparedStatement.close();
			return Helper.parse(parther);
		}
		resulSet.close();
		preparedStatement.close();
		return null;
		
	}
        
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
