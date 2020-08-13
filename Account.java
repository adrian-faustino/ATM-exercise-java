package com.company;

import java.util.ArrayList;

public class Account {
    /* Account name */
    private String name;
    /* Account ID number */
    private String uuid;
    /* User object that owns this account */
    private User holder;
    /* List of transaction objects for this account */
    private ArrayList<Transaction> transactions;

    public Account(String name, User holder, Bank bank) {

        // set account name and holder
        this.name = name;
        this.holder = holder;

        // get new account UUID
        this.uuid = bank.genNewAccountUUID();

        // init transactions
        this.transactions = new ArrayList<Transaction>();

        /* Add self to holder (USER) obj's accts and bank obj's accts
         * Notes: although this object is added to 2 different lists,
         * those lists are pointer to same obj so changes made from
         * different locations will affect same obj instance
         */
        holder.addAccount(this);
        bank.addAccount(this);
    }
}
