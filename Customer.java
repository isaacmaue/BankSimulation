class Customer{
    private String name;
    private int age;
    private Address address;

    //Zero parameter Customer constructor to allow Customer obj creation as "Customer customer = new Customer();"
    public Customer(){
    }

    public Customer(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Getter and setter methods to interact with the class instance variables.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Customer name: " + this.getName() + ", Customer age: " + this.getAge() + this.getAddress();
    }


    //Getter method to access the address instance variable.
    public Address getAddress() {
        return address;
    }
}