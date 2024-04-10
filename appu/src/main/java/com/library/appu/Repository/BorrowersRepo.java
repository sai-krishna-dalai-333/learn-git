package com.library.appu.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.library.appu.Entities.Borrowers;
import com.library.appu.Entities.Transactions;

@Repository
public interface BorrowersRepo extends JpaRepository<Borrowers, Integer> {
    @Query("SELECT new BorrowingHistory(b.isnb,  b.borrowedDate, b.returnedDate) FROM Transactions b WHERE b.Id = ?1")
    List<Transactions> getBorrowingHistory(int Id);
}