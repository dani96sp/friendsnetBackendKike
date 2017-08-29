package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implementaciones;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
		return dao.findById(id);
	}

	@Override
	public Person save(Person e) {
		return dao.save(e);
	}

	@Override
	public Iterable<Person> saveAll(Iterable<Person> e) {
		return dao.saveAll(e);
		
	}

	@Override
	public Person update(Person e) {
		return dao.update(e);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> e) {
		return dao.update(e);
	}

	@Override
	public void remove(Person e) {
		dao.remove(e);
	}

	@Override
    public Person relatePersons(Long personId, List<Long> newFriendIds) {
        Person person = dao.findById(personId);
        final Set<Person> personSet = StreamSupport.stream(newFriendIds.spliterator(), false)
                .map(dao::findById).collect(Collectors.toSet());
        person.getChildren().addAll(personSet);
        
        return dao.update(person);
	}


}
