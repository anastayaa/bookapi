package com.tayaa.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tayaa.demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);
	
}
