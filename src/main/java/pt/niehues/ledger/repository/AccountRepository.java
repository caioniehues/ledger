package pt.niehues.ledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.niehues.ledger.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}