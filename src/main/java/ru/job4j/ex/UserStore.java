package ru.job4j.ex;

public class UserStore {

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;

        try {
            user = findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("Don't have such user");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() || user.getUsername().length() >= 3) {
            return true;
        } else {
            throw new UserInvalidException("not valid user");
        }
    }
}