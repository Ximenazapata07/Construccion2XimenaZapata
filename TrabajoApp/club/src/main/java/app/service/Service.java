package app.service;

import java.sql.SQLException;

import app.dao.PersonDaoImplementation;
import app.dao.UserDaoImplementation;
import app.dao.interfeces.GuestDao;
import app.dao.interfeces.InvoiceDao;
import app.dao.interfeces.PartherDao;
import app.dao.interfeces.PersonDao;
import app.dao.interfeces.UserDao;
import app.dto.GuestDto;
import app.dto.InvoiceDto;
import app.dto.PartherDto;
import app.dto.PersonDto;
import app.dto.UserDto;
import app.helpers.Helper;
import app.model.Guest;
import app.model.Parther;
import app.service.interfaces.AdminService;
import app.service.interfaces.LoginService;
import app.service.interfaces.PartherService;
import app.dao.GuestDaoImplementation;
import app.dao.PartherDaoImplementation;
public class Service implements LoginService,AdminService,PartherService{
	
	private UserDao userDao;
	private PersonDao personDao;
	private InvoiceDao invoiceDao;
	private static UserDto user;
	private PartherDao partherDao;
	private GuestDao guestDao;
	
	
	public Service() {
		this.userDao= new UserDaoImplementation();
		this.personDao= new PersonDaoImplementation();
		this.guestDao= new GuestDaoImplementation();
		this.partherDao= new PartherDaoImplementation();
		
		
	}
	
	@Override
	public void createGuest(GuestDto guestDto) throws Exception {
		this.personDao.createPerson(guestDto.getUserId().getPersonId());
		guestDto.getUserId().setPersonId(this.personDao.findByDocument(guestDto.getUserId().getPersonId()));
		this.userDao.createUser(guestDto.getUserId());
		UserDto userDto= userDao.findByUserName(guestDto.getUserId());
		guestDto.setUserId(userDto);
		guestDto.setPartherId(this.partherDao.existById(user));
		try {
			
			this.guestDao.createGuest(guestDto);
			
		}catch (SQLException e) {
			this.personDao.deletePerson(userDto.getPersonId());
			throw new Exception ("No se puede crear el invitado");
		}
		
	}
	@Override
	public void createInvoice(InvoiceDto invoiceDto) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void createParther(PartherDto partherDto) throws Exception{
		this.personDao.createPerson(partherDto.getUserId().getPersonId());
		partherDto.getUserId().setPersonId(this.personDao.findByDocument(partherDto.getUserId().getPersonId()));
		PersonDto personDto = partherDto.getUserId().getPersonId();
		this.userDao.createUser(partherDto.getUserId());
		UserDto userDto= userDao.findByUserName(partherDto.getUserId());
		userDto.setPersonId(personDto);
		partherDto.setUserId(userDto);
		try {
 			this.partherDao.createParther(partherDto);
		
		}catch (SQLException e) {
			this.personDao.deletePerson(userDto.getPersonId());
			throw new Exception ("No se puedo crear el socio");
		}
		
	}
	@Override
	public void createPromotion() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Login(UserDto userDto) throws Exception {
		UserDto validateDto= userDao.findByUserName(userDto);
		if (validateDto ==null) {
			throw new Exception  ("No existe usuario registrado");
			
		}
		if (!userDto.getPassword().equals(validateDto.getPassword())) {
			throw new Exception ("Usuario o contraseña inconrrecto");
			
		}
		userDto.setRole(validateDto.getRole());
		user =validateDto;
		
		
	}
	@Override
	public void logout() {
		user=null;
		System.out.println("Se ha cerrado sesion");
		
	}
	
}
