package com.library.appu.Service;

import java.util.List;

//import com.library.appu.Entities.Books;
import com.library.appu.Entities.Borrowers;
import com.library.appu.Entities.Transactions;

public interface BorrowersService {
    void addBorrower(Borrowers borrower);
    List<Transactions> viewBorrowingHistory(int id);
}