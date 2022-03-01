package com.company.bank;

/*
    Access modifier:
    1. Public: Anybody who created an object of the class can
    access this function/parameter.
    2. Default: Any file with package as same as the one in which
    the function/parameter is defined, can access it.
    3. Protected: Can we access in the scope of our package.
    But in other packages only subclasses can access them.
    4. Private: Can only be accessed in the scope of the class
    in which they are defined.
    To access this, we create getters and setter for them
*/

class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

}

public class Bank {
    public static void main() {
        Account account = new Account();

        account.name = "Harshal";

        account.email = "h@gmail.com";

        // account.password = "new password"
        // This gives error as we cannot change
        // a private parameter
        account.setPassword("New Password");
        System.out.println(account.getPassword());

    }
}
