package app.dao.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{

	public boolean existsByDocument(Long document); 
	public Person findByDocument(Long document);
	
}
