package pt.niehues.ledger.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Income extends Transaction {

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "payer_id", nullable = false)
    private Payer payer;


}