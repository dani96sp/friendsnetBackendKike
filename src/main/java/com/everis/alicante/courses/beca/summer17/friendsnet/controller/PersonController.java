package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonManager manager;

	@GetMapping
	public List<Person> getAll() {
		return (List<Person>) manager.findAll();
	}

	@GetMapping("/{id}")
	public Person getById(@RequestParam Long id) {
		return (Person) manager.findById(id);
	}

	@PostMapping
	public Person create(@RequestBody Person person) {
		return manager.save(person);
	}

   @PostMapping("/{id}/relate")
    public Person relate(@RequestParam Long id, @RequestBody List<Long> persons){
        return this.manager.relatePersons(id, persons);
    }

	@DeleteMapping("/{id}")
	public void remove(@RequestParam Long id) {
		manager.remove(manager.findById(id));
	}

}
