package classobj;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 19-06-2018.
 */
public class InsertElementInArray {
    public static void main(String[] args) {
        int arraysize,arrayposition,insertelement;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of element you want in array:");
        arraysize = s.nextInt();

        int a[] = new int[arraysize + 1];
        System.out.println("Enter the element in array");
        for(int i=0;i<arraysize;i++){
            a[i] = s.nextInt();
        }

        System.out.println("Enter the position whare you want to insert element");
        arrayposition = s.nextInt();
        System.out.println("Enter the element you want to insert");
        insertelement = s.nextInt();

        for(int i=(arraysize-1); i >= (arrayposition-1); i--){
            a[i+1] = a[i];
        }
        a[arrayposition-1] = insertelement;

        System.out.println("After inserting:");
        for(int i=0;i<arraysize;i++){
            System.out.println(a[i]+",");
        }
        System.out.println(a[arraysize]);
    }

}
