package app.controller.validator;

public class PersonValidator extends CommonsValidator{
	
	public PersonValidator() {
		super();
	}
	public void validName(String name) throws Exception{
		super.isValidString("El nombre de la persona", name);
	}
	public long validDocument(String document) throws Exception{
		return super.isValidLong("La cedula de la persona", document);
	}
	public long validCellnumber(String cellnumber) throws Exception{
		return super.isValidLong("El numero de celular de la persona", cellnumber);
	}

}
