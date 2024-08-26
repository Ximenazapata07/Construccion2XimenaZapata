package app.controller;

import java.sql.Date;

import app.controller.validator.PersonValidator;
import app.controller.validator.UserValidator;
import app.dto.PartherDto;
import app.service.Service;
import app.service.interfaces.AdminService;



public class AdminController implements ControllerInterface {
	private PersonValidator personValidator;
	private UserValidator userValidator;
	private AdminService service;
	
	private static final String MENU ="ingrese la opcion que desea \n 1.para crear socio \n 2. visualización de facturas  \n 3. para promocion VIP \n  4. para cerrar sesion";

	public AdminController() {
		this.personValidator = new PersonValidor();
		this.userValidator = new UserValidator();
		this.service = new Service();
	}
	@Override
	public void session() throws Exception {
		boolean session = true;
		while (session) {
			session= menu();
		}
	}
	private boolean options(String option) throws Exception {
		switch (option) {
		case "1" :{
			this.createParther();
			return true;
		}
		case "2":{
			this.invoiceDisplay();
			return true;
		}
		case"3":{
			this.createPromotion();
			return true;
		}
		case"4":{
			System.out.println("Se ha cerrado sesion");
			return false;
		}
		default:{
			System.out.println("Ingrese una opcion valida");
			return true;
		}
		
		}
	}
		
	private boolean menu() {
			try {
				System.out.print(MENU);
				String option= Utils.getReader().nextLine();
				return options(option);
				
				
			}catch (Exception e) {
				System.out.println(e.getMessage());		
				return true;
				}	
		}
	private void createParther() throws Exception {
		System.out.println("Ingrese el nombre del socio");
		String name= Utils.getReader().nextLine();
		personValidator.validName(name);
		System.out.println("Ingrese la cedula del socio");
		long document= personValidator.validDocument(Utils.getReader().nextLine());
		
		PartherDto partnerDto = new PartherDto();
		partnerDto.setMembersphipDate(new Date(System.currentTimeMillis()));
		
	}
		
		
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
