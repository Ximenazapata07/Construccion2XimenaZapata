package app.helpers;
import app.dto.GuestDto;
import app.dto.PartherDto;
import app.dto.PersonDto;
import app.dto.UserDto;
import app.model.Guest;
import app.model.Parther;
import app.model.Person;
import app.model.User;

public abstract class Helper {
	
	public static PersonDto parse(Person person) {
		PersonDto personDto = new PersonDto();
		personDto.setId(person.getId());
		personDto.setDocument(person.getDocument());
		personDto.setCellnumber(person.getCellnumber());
		personDto.setName(person.getName());
		return personDto;
	}
	
	public static Person parse(PersonDto personDto) {
		Person person= new Person();
		person.setId(personDto.getId());
		person.setCellnumber(personDto.getCellnumber());
		person.setDocument(personDto.getDocument());
		person.setName(personDto.getName());
		return person;
	}
	
	public static UserDto parse (User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setPassword(user.getPassword());
		userDto.setPersonId(parse(user.getPersonId()));
		userDto.setRole(user.getRole());
		userDto.setUserName(user.getUserName());
		return userDto;
		
	}
	
	public static User parse(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setPassword(userDto.getPassword());
		user.setPersonId(parse(userDto.getPersonId()));
		user.setRole(userDto.getRole());
		user.setUserName(userDto.getUserName());
		return user;
	}
	public static PartherDto parse (Parther parther) {
		PartherDto partherDto = new PartherDto();
		partherDto.setId(parther.getId());
		partherDto.setSubscriptionType(parther.getSubscriptionType());
		partherDto.setAvailableFunds(parther.getAvailableFunds());
		partherDto.setMembersphipDate(parther.getMembersphipDate());
		partherDto.setUserId(parse(parther.getUserId()));
		return partherDto;
		
	}
	
	public static Parther parse (PartherDto partherDto) {
		Parther parther = new Parther();
		parther.setId(partherDto.getId());
		parther.setSubscriptionType(partherDto.getSubscriptionType());
		parther.setAvailableFunds(partherDto.getAvailableFunds());
		parther.setMembersphipDate(partherDto.getMembersphipDate());
		parther.setUserId(parse(partherDto.getUserId()));
		return parther;
		
	}
	
	public static Guest parse(GuestDto guestDto) {
		Guest guest = new Guest();
		guest.setId(guestDto.getId());
		guest.setUserId(parse(guestDto.getUserId()));
		guest.setPartherId(parse(guestDto.getPartherId()));
		guest.setGuestStatus(guestDto.getGuestStatus());
		return guest;
		
	}

	public static GuestDto parse(Guest guest) {
		GuestDto guestDto = new GuestDto();
		guestDto.setId(guest.getId());
		guestDto.setPartherId(parse(guest.getPartherId()));
		guestDto.setUserId(parse(guest.getUserId()));
		guestDto.setGuestStatus(guest.getGuestStatus());
		return guestDto;
				
		
	}
}
