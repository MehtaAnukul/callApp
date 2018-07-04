package classobj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Anukul-PC on 21-06-2018.
 */
public class StringArrayOperationUsingSwitch {


    private ArrayList<Integer> integerArrayList;
    private Scanner getInputScanner;

    StringArrayOperationUsingSwitch() {
        integerArrayList = new ArrayList<>();
        getInputScanner = new Scanner(System.in);
        choice();
    }

    private void choice() {


        int choice;
        System.out.println("Choice");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Sorting");
        System.out.println("5. Display");
        System.out.println("Enter Your Choice");
        choice = getInputScanner.nextInt();

        switch (choice) {
            case 1:
                insertElement();
                break;
            case 2:
                deleteElement();
                break;
            case 3:
                serachElememt();
                break;
            case 4:
                Sorting();
            case 5:
                displayArrayList();
                break;
            default:
                System.out.println("Wrong Choice");
                choice();
        }

    }

    private void Sorting() {
        int choice;
        System.out.println("1.Ascending sort");
        System.out.println("2.Descending sort");
        choice = getInputScanner.nextInt();
        switch (choice) {
            case 1:
                Collections.sort(integerArrayList);
                displayArrayList();
                break;
            case 2:
                Collections.reverse(integerArrayList);
                displayArrayList();
                break;
            default:
                System.out.println("It's a not choice");
        }
    }

    private void serachElememt() {
        int toserach;
        int indexofElement;
        boolean a = true;
        int i;
        System.out.println("Enter the element you want to serach");
        toserach = getInputScanner.nextInt();

        indexofElement = integerArrayList.indexOf(toserach);
//
        for (i = 0; i < integerArrayList.size(); i++) {
          /*  if (integerArrayList.get(i) == toserach) {
                a = true;
                break;
                // System.out.println("your element serached in position:  " + (i + 1));
            } else {
                a = false;
            }
        }
        if (a) {
            System.out.println("your element serached in position:  " + (i + 1));
            choice();
        } else {
            System.out.println("Element not found");
            choice();
        }*/
            if (indexofElement == -1) {
                System.out.println("Element it's not available in the arraylist");
                choice();
            } else {
                System.out.println("position is :" + indexofElement);
                choice();
            }
        }
    }

    private void deleteElement() {

        int deleteElement;
        int indexOfElement;
        System.out.println("Select the element you want to delete");
        deleteElement = getInputScanner.nextInt();

        indexOfElement = integerArrayList.indexOf(deleteElement);
        if (indexOfElement == -1) {
            System.out.println("Delete Error ! Element not found ! Try again");
        } else {
            integerArrayList.remove(indexOfElement);
        }
        displayArrayList();
        choice();
    }

    private void insertElement() {
        int elementValue;
        System.out.println("Enter Your Element : ");
        elementValue = getInputScanner.nextInt();
        integerArrayList.add(elementValue);
        choice();
    }

    private void displayArrayList() {
        if (integerArrayList.size() <= 0) {
            System.out.println("no Element Available");
        } else {
            for (int i = 0; i < integerArrayList.size(); i++) {
                System.out.println("element : " + integerArrayList.get(i));
            }
        }
        choice();
    }


}

