package app.controller.validator;

public class AvailableFundsValidator extends CommonsValidator {
	public AvailableFundsValidator() {
		super();
	}
	public long validFunds(String funds) throws Exception{
		return super.isValidLong("El fondo del socio ", funds);
	}
	
	
	
}

