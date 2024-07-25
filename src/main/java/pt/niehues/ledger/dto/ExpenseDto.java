package pt.niehues.ledger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * DTO for {@link pt.niehues.ledger.entities.Expense}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ExpenseDto(Long id, BigDecimal amount, ZonedDateTime dateAndTime, String description, AccountDto account,
                         EnvelopeDto envelope, PayeeDto payee) implements Serializable {
}