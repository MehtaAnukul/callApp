package ClassObj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anukul-PC on 22-06-2018.
 */
public class CallAppArrayList {
    private Scanner s;
    private ArrayList<CallAppModel> callAppModelArrayList;

    CallAppArrayList() {
        s = new Scanner(System.in);
        callAppModelArrayList = new ArrayList<>();
        choice();
    }

    private void choice() {
        int choice;
        System.out.println("choice");
        System.out.println("1.Call details entered");
        System.out.println("2.see the call details list");
        System.out.println("3.Exit");
        System.out.println("choose the choice");
        choice = s.nextInt();

        switch (choice) {
            case 1:
                insertCalldetails();
                choice();
                break;
            case 2:
                viewCalldetails();
                choice();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Choice...!!");
                choice();
                break;
        }
    }

    private void viewCalldetails() {
        int choice;
        System.out.println("1.If you want to see the Misscall");
        System.out.println("2.If you want to see the Incoming call");
        System.out.println("3.If you want to see the Outcoming call");
        System.out.println("4.If you want to see the All the call list");
        System.out.println("5.Exit");
        System.out.println("choose the your choice");
        choice = s.nextInt();

        switch (choice) {
            case 1:
                miscall();
                choice();
                break;
            case 2:
                incomingCall();
                choice();
                break;
            case 3:
                outcomingCall();
                choice();
                break;
            case 4:
                allCalldetails();
                choice();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice....!!");
                choice();
                break;
        }
    }

    private void allCalldetails() {

        for (int i = 0; i < callAppModelArrayList.size(); i++) {
            System.out.println("NUMBER : " + callAppModelArrayList.get(i).getNumber() +
                    " | NAME : " + callAppModelArrayList.get(i).getName() +
                    " | PIC : " + callAppModelArrayList.get(i).isPic() +
                    "| DATE : " + callAppModelArrayList.get(i).getDate() +
                    "| MISSCALL : " + callAppModelArrayList.get(i).getMisscall() +
                    "| INCOMINGCALL : " + callAppModelArrayList.get(i).getIncoming() +
                    "| OUTCOMINGCALL : " + callAppModelArrayList.get(i).getOutcoming());
        }

    }

    private void outcomingCall() {
        int choice;
        System.out.println("1.If you want to see all the Outcomingcall of users");
        System.out.println("2.If you want to see particular Outcomingcall of users");
        System.out.println("3.Exit");
        System.out.println("choose your choice");
        choice = s.nextInt();

        switch (choice) {
            case 1:
                allOutcomingcall();
                choice();
                break;
            case 2:
                perticularUserOutcomingCall();
                choice();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Entered choice it's wrong");
                choice();
                break;
        }


    }

    private void perticularUserOutcomingCall() {
        int index;
        for (int i = 0; i < callAppModelArrayList.size(); i++) {
            System.out.println(i + 1 + "." + callAppModelArrayList.get(i).getName());
        }
        System.out.println("Enter the Index");
        index = s.nextInt();
        System.out.println("Outcomingcall: " +callAppModelArrayList.get(index).getOutcoming());
        choice();

    }

    private void allOutcomingcall() {
        for (int i = 0; i < callAppModelArrayList.size(); i++) {
            System.out.println("Outcoming call of " + callAppModelArrayList.get(i).getOutcoming());
        }

    }

    private void incomingCall() {
        int choice;
        System.out.println("1.If you want to see the all Incomingcall of the users");
        System.out.println("2.If you want to see the Perticular incomingcall of users");
        System.out.println("3.Exit");
        System.out.println("chose your choice");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                allIncomingCallofusers();
                choice();
                break;
            case 2:
                perticularUserIncomingCall();
                choice();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("you enterted it's wrong choice");
                choice();
                break;
        }
    }

    private void perticularUserIncomingCall() {
        int index;
        for (int i = 0; i < callAppModelArrayList.size(); i++) {
            System.out.println(i + 1 + "." + callAppModelArrayList.get(i).getName());
        }
        System.out.println("Enter the Index");
        index = s.nextInt();
        System.out.println("Incomingcall: "+callAppModelArrayList.get(index).getIncoming());
        choice();
    }


    private void allIncomingCallofusers() {
        for (int i = 0; i < callAppModelArrayList.size(); i++) {
            System.out.println("Incoming call of : " + callAppModelArrayList.get(i).getName() + " | " +
                    "" + callAppModelArrayList.get(i).getIncoming());
        }
    }

    private void miscall() {
        int choice;
        System.out.println("1.If you want to see all miscall of users:");
        System.out.println("2.If you want to see particular user misscall:");
        System.out.println("3.Exit");
        System.out.println("choose your chioce");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                allmisscallofusers();
                choice();
                break;
            case 2:
                perticularUserMissCall();
                choice();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Entered choice it's wrong");
                choice();
                break;
        }
    }

    private void perticularUserMissCall() {
        int index;
        for (int i = 0; i < callAppModelArrayList.size(); i++) {
            System.out.println(i + 1 + "." + callAppModelArrayList.get(i).getName());
        }
        System.out.println("Enter the Index: ");
        index = s.nextInt();
        System.out.println("Misscall: " +callAppModelArrayList.get(index).getMisscall());
        choice();


    }

    private void allmisscallofusers() {
        for (int i = 0; i < callAppModelArrayList.size(); i++) {
            System.out.println("The users miscall of : " + callAppModelArrayList.get(i).getName() + " | " + callAppModelArrayList.get(i).getMisscall());
        }
    }

    private void insertCalldetails() {
        final long number;
        final String name;
        final boolean pic;
        final String date;
        final int misscall;
        final int incoming;
        final int outcoming;

        System.out.println("Enter the number:");
        number = s.nextLong();
        System.out.println("Enter the name:");
        name = s.next();
        System.out.println("Lay the pic:");
        pic = s.nextBoolean();
        System.out.println("Enter the date:");
        date = s.next();
        System.out.println("Enter the misscall");
        misscall = s.nextInt();
        System.out.println("Enter the incoming");
        incoming = s.nextInt();
        System.out.println("Enter the outcoming");
        outcoming = s.nextInt();


        callAppModelArrayList.add(new CallAppModel(number, name, pic, date, misscall, incoming, outcoming));
        choice();

    }
}
