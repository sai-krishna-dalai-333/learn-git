package com.library.appu.ServiceImplementation;

import com.library.appu.Repository.BookRepo;
import com.library.appu.Entities.Books;
import com.library.appu.Service.BooksService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplementation implements BooksService {
    
    @Autowired
    private BookRepo bookRepo;

    @Override
    public void addBook(Books book) {
        bookRepo.save(book);
    }
   
        private List<Books> booksList; // Assuming you have a list of books
    
        public BookServiceImplementation(List<Books> booksList) {
            this.booksList = booksList;
        }
    
        @Override
        public Books searchBookByISBN(String isbn) {
            return booksList.stream()
                    .filter(book -> book.getIsbn().equals(isbn))
                    .findFirst()
                    .orElse(null);
        }
    
        @Override
        public Books searchBookByTitle(String title) {
            return booksList.stream()
                    .filter(book -> book.getTitle().equals(title))
                    .findFirst()
                    .orElse(null);
        }
    
        @Override
        public Books searchBookByAuthor(String author) {
            return booksList.stream()
                    .filter(book -> book.getAuthor().equals(author))
                    .findFirst()
                    .orElse(null);
        }
    
        @Override
        public Books searchBookByGener(String gener) {
            return booksList.stream()
                    .filter(book -> book.getGenre().equals(gener))
                    .findFirst()
                    .orElse(null);
        }
    
        @Override
        public Books searchBooksByPublicationYear(int publicationYear) {
            return booksList.stream()
                    .filter(book -> book.getPublicationYear() == publicationYear)
                    .findFirst()
                    .orElse(null);
        }
    }
