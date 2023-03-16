import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer("Nikolai", "Langergaard","nikolai1",10));
        customers.add(new Customer("Lars","larsen","lars1",20));
        customers.add(new Customer("Anders","and","and1",7));
        customers.add(new Customer("tony","Stark","Stark3",43));


        for (Customer i: customers) {
            System.out.println(i);
            
        }

        Customer customer = new Customer("Nikolai", "Langergaard","nikolai1",10);


        System.out.println(customer);
    }
}
