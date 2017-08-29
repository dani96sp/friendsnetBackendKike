package com.everis.alicante.courses.beca.summer17.friendsnet.domain;

import java.util.*;

import org.junit.*;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.*;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.EventType;

public class EventTest {

	private Event expectedEvent;

	private final Long idevent = (long) 1000;

	private final String name = "Google Party";

	private final Date startingDate = new Date();

	private final Date endingdDate = new Date();

	private final EventType type = EventType.PARTY;

	private final Byte[] picture = new Byte[1];

	private final Set<Person> personsPerEvent = new HashSet<>();

	private final Set<Post> posts = new HashSet<>();

	@Before
	public void init() {
		this.expectedEvent = new Event();
		this.expectedEvent.setIdevent(idevent);
		this.expectedEvent.setName(name);
		this.expectedEvent.setStartingDate(startingDate);
		this.expectedEvent.setEndingDate(endingdDate);
		this.expectedEvent.setType(type);
		this.expectedEvent.setPicture(picture);
		this.expectedEvent.setPersonsPerEvent(personsPerEvent);
		this.expectedEvent.setPosts(posts);
	}

	@Test
	public void testGetIdevent() {
		// Act
		Long result = this.expectedEvent.getIdevent();
		// Assert
		Assert.assertEquals(expectedEvent.getIdevent(), result);
	}

	@Test
	public void testGetName() {
		// Act
		String result = this.expectedEvent.getName();
		// Assert
		Assert.assertEquals(expectedEvent.getName(), result);
	}

	@Test
	public void testGetStartingDate() {
		// Act
		Date result = this.expectedEvent.getStartingDate();
		// Assert
		Assert.assertEquals(expectedEvent.getStartingDate(), result);
	}

	@Test
	public void testGetEndingdDate() {
		// Act
		Date result = this.expectedEvent.getEndingDate();
		// Assert
		Assert.assertEquals(expectedEvent.getEndingDate(), result);
	}

	@Test
	public void testGetType() {
		// Act
		EventType result = this.expectedEvent.getType();
		// Assert
		Assert.assertEquals(expectedEvent.getType(), result);
	}

	@Test
	public void testGetPicture() {
		// Act
		Byte[] result = this.expectedEvent.getPicture();
		// Assert
		Assert.assertArrayEquals(expectedEvent.getPicture(), result);
	}

	@Test
	public void testGetPersonsPerEvent() {
		// Act
		Set<Person> result = this.expectedEvent.getPersonsPerEvent();
		// Assert
		Assert.assertEquals(expectedEvent.getPersonsPerEvent(), result);
	}

	@Test
	public void testGetPosts() {
		// Act
		Set<Post> result = this.expectedEvent.getPosts();
		// Assert
		Assert.assertEquals(expectedEvent.getPosts(), result);
	}

	@Test
	public void testSetIdevent() {
		// Arrange
		Event event = new Event();
		event.setIdevent(expectedEvent.getIdevent());

		// Act
		event.setIdevent(idevent);

		// Assert
		Assert.assertEquals(Long.valueOf(idevent), Long.valueOf(event.getIdevent()));
	}

	@Test
	public void testSetName() {
		// Arrange
		Event event = new Event();
		event.setName(expectedEvent.getName());

		// Act
		event.setName(name);

		// Assert
		Assert.assertEquals(String.valueOf(name), String.valueOf(expectedEvent.getName()));
	}

	@Test
	public void testSetStartingDate() {
		// Arrange
		Event event = new Event();
		event.setStartingDate(expectedEvent.getStartingDate());

		// Act
		event.setStartingDate(startingDate);

		// Assert
		Assert.assertEquals(startingDate, expectedEvent.getStartingDate());
	}

	@Test
	public void testSetEndingdDate() {
		// Arrange
		Event event = new Event();
		event.setEndingDate(expectedEvent.getEndingDate());

		// Act
		event.setEndingDate(endingdDate);

		// Assert
		Assert.assertEquals(endingdDate, expectedEvent.getEndingDate());
	}

	@Test
	public void testSetType() {
		// Arrange
		Event event = new Event();
		event.setType(expectedEvent.getType());

		// Act
		event.setType(type);

		// Assert
		Assert.assertEquals(type, expectedEvent.getType());
	}

	@Test
	public void testSetPicture() {
		// Arrange
		Event event = new Event();
		event.setPicture(expectedEvent.getPicture());

		// Act
		event.setPicture(picture);

		// Assert
		Assert.assertArrayEquals(picture, expectedEvent.getPicture());
	}

	@Test
	public void testSetPersonsPerEvent() {
		// Arrange
		Event event = new Event();
		event.setPersonsPerEvent(expectedEvent.getPersonsPerEvent());

		// Act
		event.setPersonsPerEvent(personsPerEvent);

		// Assert
		Assert.assertEquals(personsPerEvent, expectedEvent.getPersonsPerEvent());
	}

	@Test
	public void testSetPosts() {
		// Arrange
		Event event = new Event();
		event.setPosts(expectedEvent.getPosts());

		// Act
		event.setPosts(posts);

		// Assert
		Assert.assertEquals(posts, expectedEvent.getPosts());
	}

}
