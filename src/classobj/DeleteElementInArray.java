package classobj;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 19-06-2018.
 */
public class DeleteElementInArray {
    public static void main(String[] args) {

        int arraysize,deleteElement,flag = 1,loc = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        arraysize = s.nextInt();

        int a[] = new int[arraysize];
        System.out.println("Enter the element in array");
        for(int i=0;i<arraysize;i++){
            a[i] = s.nextInt();
        }

        System.out.println("Enter the element you want to delete:");
        deleteElement = s.nextInt();

        for(int i=0;i<arraysize;i++){
            if(a[i] == deleteElement){
                flag = 1;
                loc = i;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 1){
            for(int i=loc+1;i<arraysize;i++){
                a[i-1] = a[i];
            }
            System.out.println("After deleteing:");
            for(int i=0;i<=arraysize-2;i++){
                System.out.println(a[i]+",");
            }
        }
        else{
            System.out.println("Elememt not found");
        }
    }
}
