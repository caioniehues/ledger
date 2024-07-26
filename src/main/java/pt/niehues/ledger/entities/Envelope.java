package pt.niehues.ledger.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
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

    @Column(name = "year_month", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private YearMonth yearMonth;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Envelope envelope = (Envelope) o;
        return getId() != null && Objects.equals(getId(), envelope.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}