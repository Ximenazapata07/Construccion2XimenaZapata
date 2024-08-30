package app.controller;

import java.util.Scanner;

import app.controller.validator.PersonValidator;
import app.controller.validator.UserValidator;
import app.dto.GuestDto;
import app.dto.InvoiceDto;
import app.dto.PersonDto;
import app.dto.UserDto;
import app.controller.validator.InvoiceValidator;



public class PartherController implements ControllerInterface{
	private PersonValidator personValidator;
	private UserValidator userValidator;
	private InvoiceValidator invoiceValidator;
	
	
	
	
	private static final String MENU= "ingrese la opcion que desea \n 1.Para consultar e incrementar tus fondos  \n 2. Para realizar pedidos\n 3. Para crear invitados \n 4. Desactivar invitados \n 5.cerrar sesion ";
	private static final String MENU2= "Ingrese la opcion que desea \n 1. para consultar fondos \n 2. para incremento de fondos \n 3. para volver al menu principal";
	public PartherController() {
		this.personValidator= new PersonValidator();
		this.userValidator = new UserValidator();
		this.invoiceValidator= new InvoiceValidator();
		
		
		
	}
	
	@Override 
	public void session() throws Exception {
		boolean session = true ;
		while(session) {
			session= menu();
			
		}
	}
	private boolean menu() {
		try {
			System.out.println(MENU);
			String option= Utils.getReader().nextLine();
			return options(option);
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return true;
		}
		
		
	}
	private boolean options(String option) throws Exception {
		switch (option) {
		case "1":{
			//this.availableFunds();
			return true ;
			
		}
		case "2":{
			this.billing();
			return true;
		}
		case "3":{
			this.createGuest();
			return true;
		}
		case "4":{
			//this.removerGuest();
		}
		case "5":{
			System.out.println("Se ha cerrado seccion");
			return false;
			}
		default :
			System.out.println("Ingrese una opcion valida");
			return true;
			
		}
		
		
			
			
		}
	//Este se puede eliminar y utilizar el mismo de Arriba?
	private boolean menu2() {
		try {
			System.out.println(MENU2);
			String option2= Utils.getReader().nextLine();
			return options(option2);
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return true;
		}
		}
	
	//poner la opcion 3 , aun nose como puedo obtener el saldo 
	private boolean availableFunds(String opcion2)throws Exception {
		switch (opcion2) {
		case "1":{
			System.out.println("saldo actual: "+ obtenersaldo());
			break;
		}
		case"2":{
			System.out.println("Ingresa la cantidad a agragar : $");
			long amount= Scanner.nextlong();
			
			obtenersaldo.add(amount);
			System.out.println("Fondos agregados exitosamente.");
			break;
		}
		default:
			System.out.println("Ingrese una opcion valida");
			break;
			
				
	}
}
	//cosa que va en el service 
	/*
	public void add(long amount) {
	if(amount>0) {
		obtenersaldo+= amount;
	}else {
		System.out.println("La cantidad debe ser mayor a cero");
	}
	
}*/
	public void createGuest() throws Exception {
		System.out.println("Ingrese el nombre del invitado");
		String name= Utils.getReader().nextLine();
		personValidator.validName(name);
		System.out.println("Ingrese el documento del invitado");
		long document= personValidator.validDocument(Utils.getReader().nextLine());
		
		System.out.println("Ingrese el nombre de usuario del invitado");
		String userName=Utils.getReader().nextLine();
		userValidator.validUserName(userName);
		System.out.println("Ingrese la contraseña del invitado");
		String password=Utils.getReader().nextLine();
		userValidator.validPassword(password);
		
		
		PersonDto personDto =new PersonDto();
		personDto.setName(userName);
		personDto.setDocument(document);
		
		UserDto userDto = new UserDto();
		userDto.setRole("invitado");
		userDto.setUserName(userName);
		userDto.setPassword(password);
		
		GuestDto guestDto = new GuestDto();
		guestDto.setGuestStatus(true);
		
		
		
		
		
		
	}
	//Para la facturacion como poner los id, y el estado de pago 
	
	public void billing () throws Exception{
		System.out.print("Descripcion de los productos");
		String validIntems= Utils.getReader().nextLine();
		invoiceValidator.validItems(validIntems);
		System.out.println("Ingrese el monto de la factura");
		double Total= invoiceValidator.validTotal(Utils.getReader().nextLine());
		
		
		InvoiceDto invoiceDto =new InvoiceDto();
		invoiceDto.setItems(validIntems);
		invoiceDto.setTotal(Total);
		
		
		
	}
	
	// necesito ayuda a como eliminar un guest 
	
	
	
	
}