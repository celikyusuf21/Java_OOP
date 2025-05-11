import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(21,"Yusuf","Celik"));
        customers.add(new Customer(34,"Murat","Kaymaz"));
        customers.add(new Customer(45,"Ahmet","Barut"));

        for(Customer customer:customers){
            System.out.println(customer.firsName);
        }

    }
}
