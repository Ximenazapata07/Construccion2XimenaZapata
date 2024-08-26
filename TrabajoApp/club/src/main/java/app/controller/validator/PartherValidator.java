package app.controller.validator;

public class PartherValidator extends CommonsValidator {
	
	public PartherValidator() {
		super();
	}
	
	public long validAvailableFunds(String availableFunds) throws Exception{
		return super.isValidLong("Fondos disponibles del socio", availableFunds);
	}
	
	public void validSubscriptionType(String subscriptionType ) throws Exception {
		super.isValidString("El tipo de suscripcion del socio", subscriptionType);
	}
	
	
}
