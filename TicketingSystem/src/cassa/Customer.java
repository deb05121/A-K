package cassa;

public class Customer {
    private String name;
    private String accountNumber;

    public Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "+----------------------------+\n" +
                "| Name:      " + name + '\'' +
                "| Account no: " + accountNumber + '\'' +
                "+----------------------------+\n";
    }
}
