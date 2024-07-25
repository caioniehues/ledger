package pt.niehues.ledger.model;

import pt.niehues.ledger.entities.EnvelopePeriod;

import java.math.BigDecimal;
import java.util.Set;

public class EnvelopePOJO {

    private Long id;

    private String name;

    private BigDecimal budget;

    private Set<ExpensePOJO> expenses;

    private EnvelopePeriod period;



}
