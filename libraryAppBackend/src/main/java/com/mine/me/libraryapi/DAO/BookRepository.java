package com.mine.me.libraryapi.DAO;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.mine.me.libraryapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>
{
	Page<Book> findByTitleContaining(@RequestParam("title") String title, Pageable pageable );
	Page<Book> findByCategory(@RequestParam("category") String category, Pageable pageable );
}
