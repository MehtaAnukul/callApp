package classobj;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 19-06-2018.
 */
public class SearchElementInArray {
    public static void main(String[] args) {
        int arraysize,i,tosearch,flag=0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        arraysize = s.nextInt();

        int a[] = new int[arraysize];

        System.out.println("Enter the element in array:");
        for(i=0;i<arraysize;i++){
            a[i] = s.nextInt();
        }

        System.out.println("Enter the element to serach:");
        tosearch = s.nextInt();

        for(i=0;i<arraysize;i++){
            if(a[i] == tosearch){
                flag = 1;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println("Element found in position:"+(i+1));
        }
        else{
            System.out.println("Element not found");
        }
    }

}
