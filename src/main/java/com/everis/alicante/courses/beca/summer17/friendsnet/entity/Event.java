package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.EventType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "events")
public class Event implements FNEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private Date startingDate;
	
	@Getter
	@Setter
	private Date endingDate;

	@Getter
	@Setter
	private EventType type;
	
	@Getter
	@Setter
	private byte[] picture;

}
