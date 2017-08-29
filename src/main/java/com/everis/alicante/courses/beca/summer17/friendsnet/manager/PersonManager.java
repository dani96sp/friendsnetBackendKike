package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import java.util.List;
import java.util.Set;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public interface PersonManager extends Manager<Person, Long> {

	public Person relatePersons(Long id, Set<Long> ids);

}
