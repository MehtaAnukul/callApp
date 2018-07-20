package classobj;

/**
 * Created by Anukul-PC on 06-07-2018.
 */
public class ReturnTypeClassRun {

    public static void main(String[] args) {

        ReturnTypeClass returnTypeClass = new ReturnTypeClass();

        System.out.println(returnTypeClass.getString() instanceof String);
        System.out.println(returnTypeClass.getFloat() instanceof Float);
        System.out.println(returnTypeClass.getInstance() instanceof ReturnTypeClass);

        System.out.println(returnTypeClass.getInt());
        System.out.println(returnTypeClass.getFloat());


    }

}
