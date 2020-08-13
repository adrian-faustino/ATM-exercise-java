package com.company;

import java.util.Date;

public class Transaction {
    /* Transaction amount */
    private double amount;
    /* Time and date of transaction */
    private Date timestamp;
    /* Optional memo. i.e. "Leisure money, Rent money, etc."
    private String memo;
    /* Account in which transaction was performed */
    private Account fromAccount;
}
