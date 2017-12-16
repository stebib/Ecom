package com.business.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.PersonBusiness;
import com.dao.PersonIDao;
import com.model.Person;

@Repository
@Transactional
public class PersonBusinessImpl implements PersonBusiness {

	@Autowired
	private PersonIDao _personDao;

	@Override
	public void signUpPerson(Person person) {
		// TODO Auto-generated method stub
		_personDao.save(person);

	}

	@Override
	public void modifyPerson(Person person) {
		// TODO Auto-generated method stub
		_personDao.update(person);
	}

	@Override
	public void removePerson(Person person) {
		// TODO Auto-generated method stub
		_personDao.delete(person);
	}

	@Override
	public List<Person> getAllPerson(Class clazz) {
		// TODO Auto-generated method stub
		return (List<Person>) (Object) _personDao.findAll(Person.class);

	}

	@Override
	public Person getPersonById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return (Person) _personDao.findById(Person.class, id);
	}

}
