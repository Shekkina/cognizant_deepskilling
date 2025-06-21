public class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void printCustomer(int id) {
        System.out.println(repository.findCustomerById(id));
    }
}