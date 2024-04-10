package com.library.appu.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.appu.Entities.Transactions;


@Repository
public interface TransactionsRepo extends JpaRepository<Transactions , Integer> {
    
}