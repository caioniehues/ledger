package pt.niehues.ledger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * DTO for {@link pt.niehues.ledger.entities.Payee}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PayeeDto(Long id, String name) implements Serializable {
}