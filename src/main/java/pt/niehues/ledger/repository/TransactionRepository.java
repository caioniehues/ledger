package pt.niehues.ledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.niehues.ledger.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}