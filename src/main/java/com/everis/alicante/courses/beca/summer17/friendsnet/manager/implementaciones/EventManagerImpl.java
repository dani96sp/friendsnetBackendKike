package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.EventManager;

@Service
public class EventManagerImpl implements EventManager {

	@Autowired
	EventDAO dao;

	@Override
	public Iterable<Event> findAll() {
		return dao.findAll();
	}

	@Override
	public Event findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public Event save(Event e) {
		return dao.save(e);
	}

	@Override
	public Iterable<Event> saveAll(Iterable<Event> e) {
		return dao.saveAll(e);
		
	}

	@Override
	public Event update(Event e) {
		return dao.update(e);
	}

	@Override
	public Iterable<Event> update(Iterable<Event> e) {
		return dao.update(e);
	}

	@Override
	public void remove(Event e) {
		dao.remove(e);
	}


}
