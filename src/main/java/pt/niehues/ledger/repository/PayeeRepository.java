package pt.niehues.ledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.niehues.ledger.entities.Payee;

public interface PayeeRepository extends JpaRepository<Payee, Long> {
}