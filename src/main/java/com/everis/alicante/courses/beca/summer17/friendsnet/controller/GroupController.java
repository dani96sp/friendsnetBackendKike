package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RestController
@RequestMapping("/group")
public class GroupController {

	@Autowired
	GroupManager manager;

	@GetMapping
	public List<Group> getAll() {
		return (List<Group>) manager.findAll();
	}

	@GetMapping("/{id}")
	public Group getById(@RequestParam Long id) {
		return (Group) manager.findById(id);
	}

	@PostMapping
	public Group create(@RequestBody final Group group) {
		return manager.save(group);
	}

	@DeleteMapping("/{id}")
	public void remove(@RequestParam Long id) {
		manager.delete(manager.findById(id));
	}

}
