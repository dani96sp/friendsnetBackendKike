package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@Service
public class GroupManagerImpl implements GroupManager {

	@Autowired
	GroupDAO dao;

	@Override
	public Iterable<Group> findAll() {
		return dao.findAll();
	}

	@Override
	public Group findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public Group save(Group e) {
		return dao.save(e);
	}

	@Override
	public Iterable<Group> saveAll(Iterable<Group> e) {
		return dao.saveAll(e);
		
	}

	@Override
	public Group update(Group e) {
		return dao.update(e);
	}

	@Override
	public Iterable<Group> update(Iterable<Group> e) {
		return dao.update(e);
	}

	@Override
	public void remove(Group e) {
		dao.remove(e);
	}

	@Override
	public  Group addPersons(Iterable<Person> groups) {
		return null;
	}

}
