package pt.niehues.ledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.niehues.ledger.entities.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}