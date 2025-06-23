package com.banking.securebankingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.banking.securebankingapi.model.Account;
import com.banking.securebankingapi.model.Transaction;
import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccount(Account account);

    // Optional: For filtering by date or type
    List<Transaction> findByAccountAndTimestampBetween(Account account, LocalDateTime start, LocalDateTime end);
    List<Transaction> findByAccountAndType(Account account, String type);
}

