package pt.niehues.ledger.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "envelope")
public class Envelope {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "budget", nullable = false)
    private BigDecimal budget;

    @OneToMany(mappedBy = "envelope", orphanRemoval = true)
    private Set<Expense> expenses = new LinkedHashSet<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "envelope_period", nullable = false, length = 50)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private EnvelopePeriod envelopePeriod;

}