package com.company;

import java.util.ArrayList;

public class Account {
    /* Account name */
    private String name;
    /* Current account balance */
    private double balance;
    /* Account ID number */
    private String uuid;
    /* User object that owns this account */
    private User holder;
    /* List of transaction objects for this account */
    private ArrayList<Transaction> transactions;
}
