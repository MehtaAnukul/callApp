package classobj;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 19-06-2018.
 */
public class ArrayOperationUsingSwitch {
    private int arraysize;
    private int selectopration;
    private int arrayposition;
    private int insertelement;
    private int deleteElement;
    private int tosearch;

    private int a[];

    public Scanner s;

    ArrayOperationUsingSwitch() {
        s = new Scanner(System.in);
        arrayoperation();
    }

    public void arrayoperation() {
        // int arraysize, selectopration;
        System.out.println("Enter the size of the array:");
        arraysize = s.nextInt();

        a = new int[arraysize+1];
        //  int a[] = new int[arraysize];
        System.out.println("Enter the element in array:");
        for (int i = 0; i < arraysize; i++) {
            a[i] = s.nextInt();
        }

        System.out.println(a.length);
        while (true) {
            System.out.println("Choice");
            System.out.println("1.Insert Operation");
            System.out.println("2.Delete Operation");
            System.out.println("3.Search Operation");
            System.out.println("4.Exit");
            System.out.println("");
            System.out.println("Select the operation you want to perform");
            selectopration = s.nextInt();

            switch (selectopration) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter no it's not a selectoperation");
                    break;
            }
        }
    }

    public void insert() {
        System.out.println("Enter the position whare you want to insert element");
        arrayposition = s.nextInt();
        System.out.println("Enter the element you want to insert");
        insertelement = s.nextInt();
        System.out.println(a.length);

        for (int i = (arraysize - 1); i >= (arrayposition - 1); i--) {
            a[i + 1] = a[i];
        }
        a[arrayposition - 1] = insertelement;

        System.out.println("After inserting:");
        for (int i = 0; i < arraysize; i++) {
            System.out.println(a[i] + ",");
        }
        System.out.println(a[arraysize]);
    }

    public void delete() {
        int flag = 1, loc = 0;
        System.out.println("Enter the element you want to delete:");
        deleteElement = s.nextInt();

        for (int i = 0; i < arraysize; i++) {
            if (a[i] == deleteElement) {
                flag = 1;
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            for (int i = loc + 1; i < arraysize; i++) {
                a[i - 1] = a[i];
            }
            System.out.println("After deleteing:");
            for (int i = 0; i <= arraysize - 2; i++) {
                System.out.println(a[i] + ",");
            }
        } else {
            System.out.println("Elememt not found");
        }
    }

    public void search() {
        int i, flag = 0;
        System.out.println("Enter the element to serach:");
        tosearch = s.nextInt();

        for (i = 0; i < arraysize; i++) {
            if (a[i] == tosearch) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("Element found in position:" + (i + 1));
        } else {
            System.out.println("Element not found");
        }
    }
}

