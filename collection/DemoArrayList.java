package collection;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<customer18> customers = new ArrayList<>();

        customer18 customer1 = new customer18(1, "Zakia");
        customer18 customer2 = new customer18(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new customer18(4, "Cica"));

        customers.add(new customer18(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        customer18 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<customer18> newcCustomers = new ArrayList<>();

        newcCustomers.add(new customer18(201, "Della"));
        newcCustomers.add(new customer18(202, "Victor"));
        newcCustomers.add(new customer18(203, "Sarah"));

        customers.addAll(newcCustomers);

        System.out.println(customers);

        for(customer18 cust : customers){
            System.out.println(cust.toString());
        }

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}

