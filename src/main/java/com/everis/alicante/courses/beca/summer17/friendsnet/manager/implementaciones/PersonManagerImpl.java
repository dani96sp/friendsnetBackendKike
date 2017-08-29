package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implementaciones;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@Service
public class PersonManagerImpl implements PersonManager {

	@Autowired
	PersonDAO dao;

	@Override
	public Iterable<Person> findAll() {
		return dao.findAll();
	}

	@Override
	public Person findById(Long id) {
		return dao.findOne(id);
	}

	@Override
	public Person save(Person e) {
		return dao.save(e);
	}

	@Override
	public Iterable<Person> saveAll(Iterable<Person> e) {
		return dao.save(e);
	}

	@Override
	public Person update(Person e) {
		return dao.save(e);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> e) {
		return dao.save(e);
	}

	@Override
	public void delete(Person e) {
		dao.delete(e);
	}

	@Override
	public Person relatePersons(Long id, Set<Long> newFriendsIds) {
		Person person = this.findById(id);
		Set<Person> friends = new HashSet<Person>();
		friends.addAll((Collection<? extends Person>) this.dao.findAll(newFriendsIds));
		person.getFriends().addAll(friends);
		dao.save(person);
		return person;
	}

	@Override
	public Iterable<Person> findByIds(Iterable<Long> ids) {
		return dao.findAll(ids);
	}

}
