package pt.niehues.ledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.niehues.ledger.entities.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}