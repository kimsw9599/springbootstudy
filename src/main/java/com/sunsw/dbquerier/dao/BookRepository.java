package com.sunsw.dbquerier.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sunsw.dbquerier.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findByTitle(String title);
}
