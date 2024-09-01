package app.controller;

import app.controller.validator.InvoiceValidator;

public class GuestController implements ControllerInterface {
	private InvoiceValidator invoiceValidator;
	
	private static final String MENU= "Ingrese la opcion que desea \n 1. Para realizar pedidos \n 2. para realiza paso a socio \n 3. para cerrar sesion ";

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
	public boolean options( String option) throws Exception{
		switch (option) {
		case "1": {
		
		}
		}
		return true;
	}

}
