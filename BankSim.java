class BankSim{
    private Interaction interaction;
    private Account account;
    private Customer customer;
//This class controls the logic of the entire program

    public BankSim(){
    }
    public void bankSimulation(){
        //Greet the customer
        Interaction interaction = new Interaction();
        interaction.greetCustomer();
        interaction.fillOutPersonalInformation();

        //Creating the account
        Account account = new Account(112299,customer);

        //Contain the menu and user choices in a while loop until the user decides to quit the program.

        boolean programFlag = true;
        while (programFlag){
            //Show the menu to the customer
            Interaction.showMenu();
            String choice = interaction.userChoice();
            //pass choice to actOnUserChoice();
            String booleanFlagWatch = interaction.actOnUserChoice(choice);
            if (booleanFlagWatch.contains("q")){
                programFlag = false;
            }else{
                continue;
            }
        }
    }
}
