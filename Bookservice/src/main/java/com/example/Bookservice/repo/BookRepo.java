package com.example.Bookservice.repo;

import com.example.Bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>
{

    Optional<Book> findByTitle(String title);
}

