package cassa;

public class Customer {
    private final String name;
    private final String accountNumber;

    public Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "\n+--------------------------------+\n" +
                String.format("| Name:   %22s |\n",name) +
                String.format("| Account no: %18s |\n",accountNumber) +
                "+--------------------------------+\n";
    }
}
