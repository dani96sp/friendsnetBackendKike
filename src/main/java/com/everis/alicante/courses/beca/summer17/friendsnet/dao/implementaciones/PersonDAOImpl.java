package com.everis.alicante.courses.beca.summer17.friendsnet.dao.implementaciones;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

@Service
public class PersonDAOImpl extends AbstractDAO<Person, Long> implements PersonDAO {

	@Override
	public Person relatePersons(Iterable<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}



}