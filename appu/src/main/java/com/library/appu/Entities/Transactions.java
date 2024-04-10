package com.library.appu.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//import javax.persistence.*;
import java.util.Date;

@Entity
public class Transactions {

    @Id
    private Long id;

    private Long borrowerId;

    private String bookIsbn;

    private Date borrowingDate;


    private Date returnDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrower_id", nullable = false)
    private Borrowers borrower;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Books books;

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Long borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    // Non-parameterized constructor
    public Transactions() {
    }

    // Parameterized constructor
    public Transactions(Long id, Long borrowerId, String bookIsbn, Date borrowingDate, Date returnDate) {
        this.id = id;
        this.borrowerId = borrowerId;
        this.bookIsbn = bookIsbn;
        this.borrowingDate = borrowingDate;
        this.returnDate = returnDate;
    }
}