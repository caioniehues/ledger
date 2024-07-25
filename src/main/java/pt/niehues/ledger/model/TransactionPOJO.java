package pt.niehues.ledger.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class TransactionPOJO {

    private Long id;

    private BigDecimal amount;

    private ZonedDateTime timestamp;

    private String description;

    private AccountPOJO account;
}
