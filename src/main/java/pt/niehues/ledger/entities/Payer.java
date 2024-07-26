package pt.niehues.ledger.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "payer")
public class Payer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payer payer)) return false;
        return Objects.equals(id, payer.id) && Objects.equals(name, payer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}