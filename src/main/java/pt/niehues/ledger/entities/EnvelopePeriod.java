package pt.niehues.ledger.entities;

import lombok.Getter;


@Getter
public enum EnvelopePeriod {

    MONTHLY("Monthly", 1),
    TWO_MONTHS("Two Months", 2),
    THREE_MONTHS("Three Months", 3),
    SIX_MONTHS("Six Months", 6),
    ANNUAL("Annual", 12),
    GOAL("Goal", 0);



    private final String name;
    private final int months;


    EnvelopePeriod(String name, int months) {
        this.name = name;
        this.months = months;
    }
}
