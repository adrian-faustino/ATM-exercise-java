package com.company;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest; // for hashing user pin

public class User {
    /* User first name */
    private String firstName;
    /* User last name */
    private String lastName;
    /* User ID */
    private String uuid;
    /* MD5 Hash of user's pin */
    private byte pinHash[];
    /* List of account objects for this user */
    private ArrayList<Account> accounts;

    /*
     * Create a new user
     * @param firstName     the user's first name
     * @param lastName      the user's last name
     * @param pin           the user's account pint number
     * @param bank          the Bank object that the user is a customer of
     */
    public User(String firstName, String lastName, String pin, Bank bank) {

        // set user's name
        this.firstName = firstName;
        this.lastName = lastName;

        // store the pin's MD5 hash
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            // since argument passed in md.getInstance() "MD5" is valid, this catch shouldn't be called
            System.err.println("error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }

        // get a new, unique universal ID for user
        this.uuid = bank.genNewUserUUID();

        // create empty list of accounts
        this.accounts = new ArrayList<Account>();

        // print log success
        System.out.printf("New user %s, %s with ID %s created.\n", lastName, firstName, this.uuid);
    }
}
