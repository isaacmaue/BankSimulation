class Interaction {
    private InputHandler inputHandler;
    private Account account;
    private Customer customer;
    private Address address;

    public Interaction(){
        this.inputHandler = new InputHandler();
        this.account = new Account();
    }

    public static void showMenu() {
        System.out.println("What would you like to do today?");
        System.out.println(" ");
        System.out.println("A - View balance");
        System.out.println("B - Make a withdrawal");
        System.out.println("C - Make a deposit");
        System.out.println("Q - Quit program");
    }

    public void greetCustomer() {
        System.out.println("Hello! Thank you for inquiring about opening an account at Bank of the World.");
        System.out.println("Let's start by getting some basic information about you to create your account.");
        System.out.println(" ");
    }

    public String userChoice() {
        return inputHandler.generalInput();
    }

    public String actOnUserChoice(String choice){
        if (choice.contains("a")){
            System.out.println(account.getBalance());
            return choice;
        }else if(choice.contains("b")){
            double amount = inputHandler.intPrompt("How much would you like to withdrawal?");
            account.withdrawal(amount);
            return choice;
        }else if(choice.contains("c")){
            double amount = inputHandler.intPrompt("How much would you like to deposit?");
            account.deposit(amount);
            return choice;
        }else if(choice.contains("q")){
            return choice;
        }else{
            return choice;
        }
    }

    //This method will
    public void fillOutPersonalInformation() {
        try {

            String userName = inputHandler.promptString("Please enter your name: ");
            int userAge = inputHandler.intPrompt("Please enter your age: ");
            Customer customer = new Customer(userName, userAge, address);

            System.out.println(customer.getName()+ ", now that we some basic information, I'll need you to fill out your address information.");

            System.out.println("Please enter your street address (number and street name only): ");
            String userStreetAddress = inputHandler.generalInput();
            String userCity = inputHandler.promptString("Please enter your city: ");
            String userState = inputHandler.promptString("Please enter your state: ");
            int userZipCode = inputHandler.intPrompt("Please enter your zip code: ");

            //Create an Address object
            Address address = new Address(userStreetAddress, userCity, userState, userZipCode);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
