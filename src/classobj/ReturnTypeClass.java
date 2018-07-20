package classobj;

import java.util.ArrayList;

/**
 * Created by Anukul-PC on 06-07-2018.
 */
public class ReturnTypeClass {


    //    object return of class
    public ReturnTypeClass getInstance() {
        return new ReturnTypeClass();
    }

    //    integer value
    public int getInt() {
        return 1;
    }


    public int max()
    {
        int ans=1;
        return ans;
    }

    //    return boolean value
    public boolean getStatus() {
        return true;
    }

    //    return float value
    public Float getFloat() {
        return 3.14f;
    }

    //    return arraylist which type is string
    public ArrayList<String> stringArrayList() {
        return new ArrayList<>();
    }

    //    return nothing
    public void nothing() {

    }

    //   return string value
    public String getString() {
        return "hello";
    }

}
