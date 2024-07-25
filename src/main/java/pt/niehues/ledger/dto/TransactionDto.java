package pt.niehues.ledger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * DTO for {@link pt.niehues.ledger.entities.Transaction}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransactionDto(Long id, BigDecimal amount, ZonedDateTime dateAndTime, String description, AccountDto account) implements Serializable {
  }