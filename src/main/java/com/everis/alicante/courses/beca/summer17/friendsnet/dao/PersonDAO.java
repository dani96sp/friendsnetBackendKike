package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

@Service
public interface PersonDAO extends CrudRepository<Person, Long> {

}
