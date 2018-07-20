package classobj;

/**
 * Created by Anukul-PC on 20-07-2018.
 */
public class loop {
    public static void main(String[] args) {
        int i, j;
        int countI = 0;
        int countJ = 0;

        for (i = 1; i <= 3; i++) {
            System.out.print(i+"-");
            countI++;
            for (j = 1; j <= 3; j++) {
                countJ++;
                System.out.print(countJ);
            }
            System.out.println("");
        }
        System.out.println("Count of I "+countI);
        System.out.println("Count of J "+countJ);
    }

}
