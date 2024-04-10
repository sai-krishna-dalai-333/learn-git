package com.library.appu.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.appu.Entities.Books;


@Repository
public interface BookRepo extends JpaRepository<Books, String> {
    
}