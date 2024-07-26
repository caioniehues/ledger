package pt.niehues.ledger.entities;

import lombok.Getter;


@Getter
public enum EnvelopePeriod {

    MONTHLY("Monthly"),
    TWO_MONTHS("Two Months"),
    THREE_MONTHS("Three Months"),
    SIX_MONTHS("Six Months"),
    ANNUAL("Annual"),
    GOAL("Goal");



    private final String name;


    EnvelopePeriod(String name) {
        this.name = name;
    }
}
