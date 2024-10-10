package thursdayFive.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>(Arrays.asList(new Customer("Benjamin"), new Customer("Peter"), new Customer("Jack"), new Customer("Mary")));
        customers.add(new Customer("Ingolf"));
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
