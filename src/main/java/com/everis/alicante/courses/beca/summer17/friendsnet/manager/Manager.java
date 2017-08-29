package com.everis.alicante.courses.beca.summer17.friendsnet.manager;



public interface Manager<E, ID> {

	public Iterable<E> findAll();
	
	public E findById(ID id);

	public Iterable<E> findByIds(Iterable<ID> ids);

	<S extends E> S save(S e);

	public Iterable<E> saveAll(Iterable<E> e);

	public E update(E e);

	public Iterable<E> update(Iterable<E> e);

	public void delete(E e);
}
