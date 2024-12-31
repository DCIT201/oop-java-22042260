public class Customer {
    private String customerId;
    private String name;
    private String email;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public String getInfo() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Email: " + email;
    }

}