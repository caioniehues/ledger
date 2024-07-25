package pt.niehues.ledger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import pt.niehues.ledger.entities.EnvelopePeriod;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

/**
 * DTO for {@link pt.niehues.ledger.entities.Envelope}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record EnvelopeDto(Long id, String name, BigDecimal budget,
                          EnvelopePeriod envelopePeriod, Set<ExpenseDto> expenses) implements Serializable {
}