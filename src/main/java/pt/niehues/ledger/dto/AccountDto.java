package pt.niehues.ledger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

/**
 * DTO for {@link pt.niehues.ledger.entities.Account}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record AccountDto(Long id, String name, BigDecimal balance, Set<TransactionDto> transactions) implements Serializable {
  }