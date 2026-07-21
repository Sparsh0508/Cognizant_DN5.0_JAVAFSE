public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(int id) {

        String customer = repository.findCustomerById(id);

        System.out.println("Customer ID   : " + id);
        System.out.println("Customer Name : " + customer);
    }
}
