public class Customer {
    private String firstname;
    private String lastname;
    private String username;
    private int id;

    public Customer(String firstname, String lastname, String username, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username =username;
        this.id = id;

    }

    public String toString() {
        return "\n" + firstname + "\n" + id+"\n"+lastname+"\n"+username;
    }
}

