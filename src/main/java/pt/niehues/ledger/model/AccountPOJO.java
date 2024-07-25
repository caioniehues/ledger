package pt.niehues.ledger.model;

import java.math.BigDecimal;
import java.util.Set;

public class AccountPOJO {

    private Long id;

    private String name;

    private BigDecimal balance;

    private Set<TransactionPOJO> transactions;


}
