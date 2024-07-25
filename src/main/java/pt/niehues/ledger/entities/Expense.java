package pt.niehues.ledger.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Expense extends Transaction {

    @ManyToOne(optional = false)
    @JoinColumn(name = "envelope_id", nullable = false)
    private Envelope envelope;

    @Column(name = "amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "payee_id", nullable = false)
    private Payee payee;

}