package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implementaciones;

import java.util.Set;

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
	GroupDAO groupDao;
	
	@Autowired
	PersonDAO personDao;
	

	@Override
	public Iterable<Group> findAll() {
		return groupDao.findAll();
	}

	@Override
	public Group findById(Long id) {
		return groupDao.findOne(id);
	}

	@Override
	public Group save(Group e) {
		return groupDao.save(e);
	}

	@Override
	public Iterable<Group> saveAll(Iterable<Group> e) {
		return groupDao.save(e);
		
	}

	@Override
	public Group update(Group e) {
		return groupDao.save(e);
	}

	@Override
	public Iterable<Group> update(Iterable<Group> e) {
		return groupDao.save(e);
	}

	@Override
	public void delete(Group e) {
		groupDao.delete(e);
	}

	 @Override
	 public Group addPersons(Long id, Iterable<Long> ids) {
	    Set<Person> persons = (Set<Person>) this.personDao.findAll(ids);
	    Group group = this.groupDao.findOne(id);
	    group.setPersonsPerGroup(persons);
	    return this.groupDao.save(group);
	 }

	@Override
	public Iterable<Group> findByIds(Iterable<Long> ids) {
		return groupDao.findAll(ids);
	}

}
