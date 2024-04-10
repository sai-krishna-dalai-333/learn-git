package com.library.appu.ServiceImplementation;

import com.library.appu.Entities.Borrowers;
import com.library.appu.Entities.Transactions;
import com.library.appu.Repository.BorrowersRepo;
import com.library.appu.Service.BorrowersService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerServiceImplementation implements BorrowersService {
    
    @Autowired
    private BorrowersRepo borrowerRepo;

    @Override
    public void addBorrower(Borrowers borrower) {
        borrowerRepo.save(borrower);
    }
    @Override
    public List<Transactions> viewBorrowingHistory(int Id) {
        return borrowerRepo.getBorrowingHistory(Id);
    }
}
