/**
 * 
 */
package com.everis.alicante.courses.beca.summer17.friendsnet.domain;

import java.util.HashSet;
import java.util.Set;

import org.junit.*;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.*;

public class PersonTest {

	private Person expectedPerson;

	private final Long idperson = (long) 10000;

	private final String name = "cristhian";

	private final String surname = "Cabrera";

	private final Byte[] picture = new Byte[1];

	private final Set<Person> friends = new HashSet<>();

	private final Set<Event> events = new HashSet<>();

	private final Set<Group> groups = new HashSet<>();

	private final Set<Like> likes = new HashSet<>();

	private final Set<Person> newFriends = new HashSet<>();

	private final Set<Post> posts = new HashSet<>();

	@Before
	public void init() {
		this.expectedPerson = new Person();
		this.expectedPerson.setIdperson(idperson);
		this.expectedPerson.setName(name);
		this.expectedPerson.setSurname(surname);
		this.expectedPerson.setPicture(picture);
		this.expectedPerson.setFriends(friends);
		this.expectedPerson.setEvents(events);
		this.expectedPerson.setGroups(groups);
		this.expectedPerson.setLikes(likes);
		this.expectedPerson.setNewFriends(newFriends);
		this.expectedPerson.setPosts(posts);
	}

	@Test
	public void testGetIdperson() {
		// Act
		Long result = this.expectedPerson.getIdperson();
		// Assert
		Assert.assertEquals(expectedPerson.getIdperson(), result);
	}

	@Test
	public void testGetName() {
		// Act
		String result = this.expectedPerson.getName();
		// Assert
		Assert.assertEquals(expectedPerson.getName(), result);
	}

	@Test
	public void testGetSurname() {
		// Act
		String result = this.expectedPerson.getSurname();
		// Assert
		Assert.assertEquals(expectedPerson.getSurname(), result);
	}

	@Test
	public void testGetPicture() {
		// Act
		Byte[] result = this.expectedPerson.getPicture();
		// Assert
		Assert.assertArrayEquals(expectedPerson.getPicture(), result);
	}

	@Test
	public void testGetFriends() {
		// Act
		Set<Person> result = this.expectedPerson.getFriends();
		// Assert
		Assert.assertEquals(expectedPerson.getFriends(), result);
	}

	@Test
	public void testGetNewFriends() {
		// Act
		Set<Person> result = this.expectedPerson.getNewFriends();
		// Assert
		Assert.assertEquals(expectedPerson.getNewFriends(), result);
	}

	@Test
	public void testGetGroups() {
		// Act
		Set<Group> result = this.expectedPerson.getGroups();
		// Assert
		Assert.assertEquals(expectedPerson.getGroups(), result);
	}

	@Test
	public void testGetLikes() {
		// Act
		Set<Like> result = this.expectedPerson.getLikes();
		// Assert
		Assert.assertEquals(expectedPerson.getLikes(), result);
	}

	@Test
	public void testGetPosts() {
		// Act
		Set<Post> result = this.expectedPerson.getPosts();
		// Assert
		Assert.assertEquals(expectedPerson.getPosts(), result);
	}

	@Test
	public void testGetEvents() {
		// Act
		Set<Event> result = this.expectedPerson.getEvents();
		// Assert
		Assert.assertEquals(expectedPerson.getEvents(), result);
	}

	@Test
	public void testSetIdperson() {
		// Arrange
		Person person = new Person();
		person.setIdperson(expectedPerson.getIdperson());

		// Act
		person.setIdperson(idperson);

		// Assert
		Assert.assertEquals(Long.valueOf(idperson), Long.valueOf(person.getIdperson()));
	}

	@Test
	public void testSetName() {
		// Arrange
		Person person = new Person();
		person.setName(expectedPerson.getName());

		// Act
		person.setName(name);

		// Assert
		Assert.assertEquals(String.valueOf(name), String.valueOf(person.getName()));
	}

	@Test
	public void testSetSurname() {
		// Arrange
		Person person = new Person();
		person.setSurname(expectedPerson.getSurname());

		// Act
		person.setSurname(surname);

		// Assert
		Assert.assertEquals(String.valueOf(surname), String.valueOf(person.getSurname()));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSetPicture() {
		// Arrange
		Person person = new Person();
		person.setPicture(expectedPerson.getPicture());

		// Act
		person.setPicture(picture);

		// Assert
		Assert.assertEquals(picture, person.getPicture());
	}

	@Test
	public void testSetFriends() {
		// Arrange
		Person person = new Person();
		person.setFriends(expectedPerson.getFriends());

		// Act
		person.setFriends(friends);

		// Assert
		Assert.assertEquals(friends, person.getFriends());
	}

	@Test
	public void testSetNewFriends() {
		// Arrange
		Person person = new Person();
		person.setNewFriends(expectedPerson.getNewFriends());

		// Act
		person.setNewFriends(newFriends);

		// Assert
		Assert.assertEquals(newFriends, person.getNewFriends());
	}

	@Test
	public void testSetGroups() {
		// Arrange
		Person person = new Person();
		person.setGroups(expectedPerson.getGroups());

		// Act
		person.setGroups(groups);

		// Assert
		Assert.assertEquals(groups, person.getGroups());
	}

	@Test
	public void testSetLikes() {
		// Arrange
		Person person = new Person();
		person.setLikes(expectedPerson.getLikes());

		// Act
		person.setLikes(likes);

		// Assert
		Assert.assertEquals(likes, person.getLikes());
	}

	@Test
	public void testSetPosts() {
		// Arrange
		Person person = new Person();
		person.setPosts(expectedPerson.getPosts());

		// Act
		person.setPosts(posts);

		// Assert
		Assert.assertEquals(posts, person.getPosts());
	}

	@Test
	public void testSetEvents() {
		// Arrange
		Person person = new Person();
		person.setEvents(expectedPerson.getEvents());

		// Act
		person.setEvents(events);

		// Assert
		Assert.assertEquals(events, person.getEvents());
	}
}
