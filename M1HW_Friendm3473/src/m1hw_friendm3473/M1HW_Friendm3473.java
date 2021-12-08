// CTS 285
// M1HW
// Mateo Friend
// 8/31/2021
package m1hw_friendm3473;
import java.awt.Component;
import javax.swing.JOptionPane;

public class M1HW_Friendm3473 {

    public static void main(String[] args) {
     //Variables for loop
        int loop = 1;

        // do while loop 
        do{
            
        //Method calls
        loop = calculator();
        
        }while (loop == 1); 
    }

    private static int calculator() {
        //variables
        int loop = 1;
        
        //create the buttons for the question
        Object[] options = {"Add or Subtract",
                    "Divide or Multiply",
                    "Exit"};
        Component frame = null;
        // create a button only box for the switch statement
        int choice = JOptionPane.showOptionDialog(frame,
        "Welcome to the calculator program ",
        "Super Calculator",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         options,
         options[2]);
        
        // create the switch statement for the users choice
        switch (choice) {
            case 0:
                loop = subAdd();
                break;
                
            case 1:
                loop = divideMultiply();
                break;
                
            case 2:
                loop = -1;
                break;
                
            default:  
                loop = -1;
                break;
        }
        return loop;
    }

    private static int subAdd() {
        //variables
        int loop = 1;
        
        do{
        //create the buttons for the question
        Object[] options = {"Add",
                    "Subtract",
                    "Exit"};
        Component frame = null;
        // create a button only box for the switch statement
        int choice = JOptionPane.showOptionDialog(frame,
        "Add or Subtract ",
        "Super Calculator",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         options,
         options[2]);
        
        // create the switch statement for the users choice
        switch (choice) {
            case 0:
                loop = add();
                break;
                
            case 1:
                loop = sub();
                break;
                
            case 2:
                loop = -1;
                break;
                
            default:  
                loop = -1;
                break;
        }
    }while (loop == 1);
        return loop;
    }
    
    private static int divideMultiply() {
        //variables
        int loop = 1;
        
        do{
        //create the buttons for the question
        Object[] options = {"Divide",
                    "Multiply",
                    "Exit"};
        Component frame = null;
        // create a button only box for the switch statement
        int choice = JOptionPane.showOptionDialog(frame,
        "Divide or Multiply ",
        "Super Calculator",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         options,
         options[2]);
        
        // create the switch statement for the users choice
        switch (choice) {
            case 0:
                loop = divide();
                break;
                
            case 1:
                loop = multiply();
                break;
                
            case 2:
                loop = -1;
                break;
                
            default:  
                loop = -1;
                break;
        }
    }while (loop == 1);
        return loop;
    }

    private static int sub() {
        //variables
        int loop = 1;
        
        // get users input
        String firstNumber = JOptionPane.showInputDialog("First Number");
        String secondNumber = JOptionPane.showInputDialog("Second Number");
        
        // parse the strings to integers
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        
        //do the math
        double sum = num1 - num2;
        
        //display the math
        JOptionPane.showMessageDialog( null, "The Subtraction is " + sum, "Subtraction of Two Integers", JOptionPane.PLAIN_MESSAGE );
        
        do{
        //create the buttons for the question
        Object[] options = {"Repeat",
                    "Main Menu",
                    "Exit"};
        Component frame = null;
        // create a button only box for the switch statement
        int choice = JOptionPane.showOptionDialog(frame,
        "Do you wanna try this again or go back to main menu ",
        "Super Calculator",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         options,
         options[2]);
        
        // create the switch statement for the users choice
        switch (choice) {
            case 0:
                loop = sub();
                break;
                
            case 1:
                loop = calculator();
                break;
                
            case 2:
                loop = -1;
                break;
                
            default:  
                loop = -1;
                break;
        }
    }while (loop == 1);
        return loop;
    }

    private static int add() {
        //variables
        int loop = 1;
        
        // get users input
        String firstNumber = JOptionPane.showInputDialog("First Number");
        String secondNumber = JOptionPane.showInputDialog("Second Number");
        
        // parse the strings to integers
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        
        //do the math
        double sum = num1 + num2;
        
        //display the math
        JOptionPane.showMessageDialog( null, "The Addition is " + sum, "Addition of Two Integers", JOptionPane.PLAIN_MESSAGE );
        
        do{
        //create the buttons for the question
        Object[] options = {"Repeat",
                    "Main Menu",
                    "Exit"};
        Component frame = null;
        // create a button only box for the switch statement
        int choice = JOptionPane.showOptionDialog(frame,
        "Do you wanna try this again or go back to main menu ",
        "Super Calculator",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         options,
         options[2]);
        
        // create the switch statement for the users choice
        switch (choice) {
            case 0:
                loop = add();
                break;
                
            case 1:
                loop = calculator();
                break;
                
            case 2:
                loop = -1;
                break;
                
            default:  
                loop = -1;
                break;
        }
    }while (loop == 1);
        return loop;
    }

    private static int divide() {
        //variables
        int loop = 1;
        
        // get users input
        String firstNumber = JOptionPane.showInputDialog("First Number");
        String secondNumber = JOptionPane.showInputDialog("Second Number");
        
        // parse the strings to integers
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        
        //do the math
        double sum = num1 / num2;
        
        //display the math
        JOptionPane.showMessageDialog( null, "The Division is " + sum, "Division of Two Integers", JOptionPane.PLAIN_MESSAGE );
        
        do{
        //create the buttons for the question
        Object[] options = {"Repeat",
                    "Main Menu",
                    "Exit"};
        Component frame = null;
        // create a button only box for the switch statement
        int choice = JOptionPane.showOptionDialog(frame,
        "Do you wanna try this again or go back to main menu ",
        "Super Calculator",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         options,
         options[2]);
        
        // create the switch statement for the users choice
        switch (choice) {
            case 0:
                loop = divide();
                break;
                
            case 1:
                loop = calculator();
                break;
                
            case 2:
                loop = -1;
                break;
                
            default:  
                loop = -1;
                break;
        }
    }while (loop == 1);
        return loop;
    }

    private static int multiply() {
        //variables
        int loop = 1;
        
        // get users input
        String firstNumber = JOptionPane.showInputDialog("First Number");
        String secondNumber = JOptionPane.showInputDialog("Second Number");
        
        // parse the strings to integers
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        
        //do the math
        double sum = num1 * num2;
        
        //display the math
        JOptionPane.showMessageDialog( null, "The Muliplication is " + sum, "Multiplication of Two Integers", JOptionPane.PLAIN_MESSAGE );
        
        do{
        //create the buttons for the question
        Object[] options = {"Repeat",
                    "Main Menu",
                    "Exit"};
        Component frame = null;
        // create a button only box for the switch statement
        int choice = JOptionPane.showOptionDialog(frame,
        "Do you wanna try this again or go back to main menu ",
        "Super Calculator",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         options,
         options[2]);
        
        // create the switch statement for the users choice
        switch (choice) {
            case 0:
                loop = multiply();
                break;
                
            case 1:
                loop = calculator();
                break;
                
            case 2:
                loop = -1;
                break;
                
            default:  
                loop = -1;
                break;
        }
    }while (loop == 1);
        return loop;
    }  
}
