package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class describes how bank works with users and users accounts
 *
 * @author - Dmitriy
 * @version 1.0
 */
public class BankService {

    /**
     * HashMap collection is stored in user accounts
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Add user to the bank system
     *
     * @param user instance of the user class
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Add user account to the user in bank system
     *
     * @param passport id of user in the bank
     * @param account instance of the account class
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * Search user by passport in bank system
     *
     * @param passport id user in bank
     * @return instance of the user class or null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Search for user's account by requisite
     *
     * @param passport id user in bank
     * @param requisite user account requisite
     * @return instance of the account class or null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Transfer money between users accounts
     *
     * @param srcPassport source passport id user
     * @param srcRequisite source requisite user's account
     * @param destPassport destination passport id user
     * @param destRequisite destination requisite user's account
     * @param amount amount of money
     * @return false if some account was not found or not enough money for transfer, true if transfers success
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || srcAccount.getBalance() < amount || destAccount == null) {
            return false;
        }

        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }
}