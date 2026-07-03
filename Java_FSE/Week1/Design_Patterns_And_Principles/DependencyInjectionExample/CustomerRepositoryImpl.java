public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Rahul Sharma";
        } else if (id == 102) {
            return "Amit Verma";
        } else if (id == 103) {
            return "Priya Singh";
        }

        return "Customer Not Found";
    }
}
