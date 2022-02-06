package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * Search user by passport in bank system
     *
     * @param passport id user in bank
     * @return instance of the user class or null
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
                //.orElse(null);
    }

    /**
     * Search for user's account by requisite
     *
     * @param passport id user in bank
     * @param requisite user account requisite
     * @return instance of the account class or null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get()).stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (!srcAccount.isPresent() || srcAccount.get().getBalance() < amount || !destAccount.isPresent()) {
            return false;
        }

        srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
        destAccount.get().setBalance(destAccount.get().getBalance() + amount);
        return true;
    }
}