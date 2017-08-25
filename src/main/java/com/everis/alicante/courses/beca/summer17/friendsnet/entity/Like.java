package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.LikeType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "likes")
public class Like implements FNEntity {
	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Getter
	@Setter
	private Date createDate;
	
	
	@Getter
	@Setter
	private LikeType type;

}
