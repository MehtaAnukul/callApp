package classobj;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anukul-PC on 12-07-2018.
 */
public class ConsoleData {


    public static void main(String[] args) throws IOException {

        Console console = System.console();

        console.readLine("Enter Name");
        console.readPassword("Password");


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Hello. Please write your name: ");
//        String name = br.readLine();
//        System.out.println("Your name is: "+name);


    }
}
