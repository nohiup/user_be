package com.vou.user_be.core.constant;

public class AccountStatus {
    public static AccountStatus instance;
    public String PENDING = "pending";
    public String VERIFIED = "verified";
    public String DISABLED = "disabled";
    private AccountStatus() {
    }

    public static AccountStatus getInstance() {
        if (instance == null) {
            instance = new AccountStatus();
        }
        return instance;
    }
}
