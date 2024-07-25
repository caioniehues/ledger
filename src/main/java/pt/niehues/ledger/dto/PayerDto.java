package pt.niehues.ledger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * DTO for {@link pt.niehues.ledger.entities.Payer}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PayerDto(Long id, String name) implements Serializable {
}