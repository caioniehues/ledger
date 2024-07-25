package pt.niehues.ledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.niehues.ledger.entities.Envelope;

public interface EnvelopeRepository extends JpaRepository<Envelope, Long> {
}