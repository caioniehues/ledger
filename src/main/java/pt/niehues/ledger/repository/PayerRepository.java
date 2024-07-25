package pt.niehues.ledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.niehues.ledger.entities.Payer;

public interface PayerRepository extends JpaRepository<Payer, Long> {
}