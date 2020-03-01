package advancedJavaFive;

public class Person implements Comparable<Person>{
    private final int id;
    private final String lastName;
    private final String firstName;
    private final String address;
    private final String city;

    public Person(int id, String lastName, String firstName, String address, String city) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        return sb.toString();
    }    
    
    @Override
    public int compareTo(Person o) { // Poređenje imena, a zatim prezimena kako bi se osobe printale abecednim redom
        int result = this.firstName.compareTo(o.getFirstName());
        if(result == 0){
            result = this.lastName.compareTo(lastName);
        }
        return result;
    }
}
