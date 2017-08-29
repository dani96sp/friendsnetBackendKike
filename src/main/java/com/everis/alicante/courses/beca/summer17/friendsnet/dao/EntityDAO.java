package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;

public interface EntityDAO<E extends FNEntity, ID extends Serializable> {

	 Iterable<E> findAll();

	 E findById(ID id);

	 E findByIds(List<ID> ids);

	 E save(E e);

	 Iterable<E> saveAll(Iterable<E> e);

	 E update(E e);

	 Iterable<E> update(Iterable<E> e);

	 void remove(E e);
}
