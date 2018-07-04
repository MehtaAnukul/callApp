package usermodel;

import java.util.ArrayList;

/**
 * Created by Anukul-PC on 30-06-2018.
 */
public class UserModel {


    private String name;
    private int age;
    private String birthdate;
    private ArrayList<Long> multipleMobileNo;

    public UserModel(String name, int age, String birthdate, ArrayList<Long> multipleMobileNo) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
        this.multipleMobileNo = multipleMobileNo;
    }
    public UserModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public ArrayList<Long> getMultipleMobileNo() {
        return multipleMobileNo;
    }

    public void setMultipleMobileNo(ArrayList<Long> multipleMobileNo) {
        this.multipleMobileNo = multipleMobileNo;
    }
}
