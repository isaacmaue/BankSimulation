class Address{
    private String streetAddress;
    private String city;
    private String state;
    private int zipcode;


    public Address(){
    }

    public Address(String streetAddress, String city, String state, int zipcode){
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String toString(){
        return "Customer address: " + this.getStreetAddress() + ", " + this.getCity() + ", " + this.getState() + ", " + this.getZipcode();
    }
}