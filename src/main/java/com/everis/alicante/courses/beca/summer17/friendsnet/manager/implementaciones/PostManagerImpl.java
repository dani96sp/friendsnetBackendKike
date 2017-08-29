package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PostManager;

@Service
public class PostManagerImpl implements PostManager {

	@Autowired
	PostDAO dao;

	@Override
	public Iterable<Post> findAll() {
		return dao.findAll();
	}

	@Override
	public Post findById(Long id) {
		return dao.findOne(id);
	}

	@Override
	public Post save(Post e) {
		return dao.save(e);
	}

	@Override
	public Iterable<Post> saveAll(Iterable<Post> e) {
		return dao.save(e);
		
	}

	@Override
	public Post update(Post e) {
		return dao.save(e);
	}

	@Override
	public Iterable<Post> update(Iterable<Post> e) {
		return dao.save(e);
	}

	@Override
	public void delete(Post e) {
		dao.delete(e);
	}


	@Override
	public Post addLike(Long id, Like like) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Post> findByIds(Iterable<Long> ids) {
		return dao.findAll(ids);
	}

}
