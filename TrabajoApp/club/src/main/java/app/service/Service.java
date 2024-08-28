package app.service;

import app.dao.interfeces.InvoiceDao;
import app.dao.interfeces.PersonDao;
import app.dao.interfeces.UserDao;
import app.dto.GuestDto;
import app.dto.InvoiceDto;
import app.dto.PartherDto;
import app.dto.UserDto;
import app.service.interfaces.AdminService;
import app.service.interfaces.LoginService;
import app.service.interfaces.PartherService;

public class Service implements LoginService,AdminService,PartherService{
	
	private UserDao userDao;
	private PersonDao personDao;
	private InvoiceDao invoiceDao;
	private static UserDto user;
	
	
	@Override
	public void createGuest(GuestDto guestDto) throws Exception {
		this.createGuest(guestDto);
		
	}
	@Override
	public void createInvoice(InvoiceDto invoiceDto) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void createParther (PartherDto partherDto) throws Exception {
		this.createPather(partherDto.getUserId());
		UserDto userDto= userDao.findByUserName(partherDto.getUserId());
		partherDto.setUserId(userDto);
		
			
		
		
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
