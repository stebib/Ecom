package com.business;

import java.io.Serializable;
import java.util.List;

import com.model.Person;

public interface PersonBusiness {
	public void signUpPerson(Person person);

	public void modifyPerson(Person person);

	public void removePerson(Person person);

	public List<Person> getAllPerson(Class clazz);

	public Person getPersonById(Class clazz, Serializable id);

}
