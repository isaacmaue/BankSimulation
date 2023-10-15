import java.util.Scanner;
class InputHandler{
    private Scanner inputHandler;

    public InputHandler(){
        this.inputHandler = new Scanner(System.in);
    }

    //This method, "promptString" is used for taking user input. One use of this method is to create customer and
    //address objects based on user input.
    //The required parameter is a String called "message" that will be displayed to the end user of the program.
    //If the user enters anything other than a character or string of characters, such as a number or special character,
    //the program provides an error message.
    public String promptString(String message) {
        while(true){
            try{
                System.out.print(message);
                String input = inputHandler.nextLine();
                //check to see if the input variable contains only characters or strings, return "input" if so.
                if(isValidString(input)){
                    return input;
                }else{
                    System.out.println("Error: you must enter a string of text only.");
                }
            }catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    //This method returns a value of true if the supplied String parameter contains only 1 character [a-zA-A].
    //This is used in the "stringPrompt" method to determine if the user inputs something other than the allowed
    //characters.
    public static boolean isValidString(String input){
        return !input.isEmpty();
    }

    //Getting integer input from the user. This will loop until the user gives the correct type as an input (integer).
    //If the user does not enter an integer, print "Error: you must enter an integer."
    //Parameter message is a string prompt you would like to give to the user. If the user enters anything other than
    //an integer, the program handles the exception and requests the user to try again.
    public int intPrompt(String message){
        while(true){
            try{
                System.out.print(message);
                return Integer.parseInt(inputHandler.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Error: You must enter an integer.");
            }
        }
    }

    public String generalInput(){
        while(true) {
            try {
                String input = inputHandler.nextLine();
                if (input.isBlank()){
                    System.out.println("Please re-enter that.");
                    continue;
                }else{
                    return input;
                }
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}