package com.company;

import java.util.ArrayList;

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
}
