package com.example.Library_Management_System.RepositoryLayer;

import com.example.Library_Management_System.EntityLayer.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Additional methods for custom queries if needed
}
