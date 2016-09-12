package bellamy.armard.JavaLabCD11;
import java.util.Scanner;

/**
 * Created by armardbellamy on 9/9/16.
 */
public class GreetAliceandBob {

    static Scanner scanner = new Scanner(System.in);
    static String personName;


    public static void main(String[] args){

        GreetAliceandBob greetings = new GreetAliceandBob();
        greetings.askName();
        greetings.greetPerson();
    }

    public void askName(){
        System.out.print("Hello! What is your name? ");
    }

    public void greetPerson(){
        personName = scanner.nextLine().toLowerCase();
        if (personName.equals("alice") || personName.equals("bob")){
            System.out.println("Hello " + personName.substring(0,1).toUpperCase() + personName.substring(1,personName.length()));
        }
    }
}
