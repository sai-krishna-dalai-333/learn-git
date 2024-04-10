

package com.library.appu.Service;

import com.library.appu.Entities.Books;

public interface BooksService {
    abstract void addBook(Books book);
    abstract Books searchBookByISBN(String isbn);
    abstract Books searchBookByTitle(String title);
    abstract Books searchBookByAuthor(String author);
    abstract Books searchBookByGener(String gener);
    abstract Books searchBooksByPublicationYear(int publicationYear);
}