package usermodel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anukul-PC on 30-06-2018.
 */
public class UserModelArrayList {
    private Scanner s;
    private ArrayList<UserModel> userModelArrayList;

    UserModelArrayList() {
        s = new Scanner(System.in);
        userModelArrayList = new ArrayList<>();
        choice();
    }

    private void choice() {
        int choice;
        System.out.println("");
        System.out.println("1.Insert the User deteils");
        System.out.println("2.If you want see the all the users detelis");
        System.out.println("3.If you want see the perticular users details");
        System.out.println("4.Exit");
        System.out.println("choose your choice:");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                insertUserdeteils();
                choice();
                break;
            case 2:
                userDetails();
                choice();
                break;
            case 3:
                seePerticularUserDetails();
                choice();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Wrong choice");
                choice();
                break;
        }
    }

    private void seePerticularUserDetails() {
        int index;
        for (int i = 0; i < userModelArrayList.size(); i++) {
            System.out.println(i + "." + userModelArrayList.get(i).getName());
        }
        System.out.println("");
        System.out.println("Enter the index:");
        index = s.nextInt();
        System.out.println("");
        System.out.println("The details of"  + userModelArrayList.get(index).getName() +" "+ "is");
        System.out.println("Age:" + userModelArrayList.get(index).getAge() + " | "
                + "Birth_date:" + userModelArrayList.get(index).getBirthdate() + " | "
                + "Mobile_no:" + userModelArrayList.get(index).getMultipleMobileNo().size());

    }

    private void userDetails() {

        int choice;
        System.out.println("");
        System.out.println("1.See all user deteils");
        System.out.println("2.Updete user deteils");
        System.out.println("3.Exit");
        System.out.println("choose your choice:");
        choice = s.nextInt();

        switch (choice) {
            case 1:
                allUserDetails();
                choice();
                break;
            case 2:
                updeteUserDeteils();
                choice();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Wrong choice");
                choice();
                break;
        }


    }

    private void updeteUserDeteils() {
        int index;
        for (int i = 0; i < userModelArrayList.size(); i++) {
            System.out.println(i + "." + userModelArrayList.get(i).getName());
        }
        System.out.println("");
        System.out.println("choose your choice index which you want to updete:");
        index = s.nextInt();

        update(index);
        System.out.println("Update successfully");


        //userModelArrayList.set(index, new UserModel());

    }

    private void update(int i) {
        final String name;
        final int age;
        final String birth_date;
        final long mobile_no;

        System.out.println("");
        System.out.println("Enter your Name:");
        name = s.next();
        System.out.println("Enter your Age:");
        age = s.nextInt();
        System.out.println("Enter the Birth_Date:");
        birth_date = s.next();
        System.out.println("Enter the Mobile_no:");
        mobile_no = s.nextLong();

//        userModelArrayList.set(i, new UserModel(name, age, birth_date, mobile_no));
        choice();


    }

    private void allUserDetails() {
        System.out.println("");
        for (int i = 0; i < userModelArrayList.size(); i++) {
            System.out.println("Name:" + userModelArrayList.get(i).getName() + " | "
                    + "Age:" + userModelArrayList.get(i).getAge() + " | "
                    + "Birthdate:" + userModelArrayList.get(i).getBirthdate() + " | "
                    + "Mobile_no:" + userModelArrayList.get(i).getMultipleMobileNo().size());
        }
    }

    private void insertUserdeteils() {
        final String name;
        final int age;
        final String birthDate;
        final ArrayList<Long> multipleMobileNo = new ArrayList<>();
        System.out.println("");
        System.out.println("Enter your Name:");
        name = s.next();
        System.out.println("Enter your Age:");
        age = s.nextInt();
        System.out.println("Enter the BirthDate:");
        birthDate = s.next();

        UserModel userModel = new UserModel();

        userModel.setName(name);
        userModel.setAge(age);
        userModel.setBirthdate(birthDate);


        mobileno(multipleMobileNo, userModel);


    }

    private void mobileno(ArrayList<Long> m, UserModel userModel) {
        System.out.println("Enter Mobile Number");
        m.add(s.nextLong());
        addMoreNumber(m, userModel);
    }

    private void addMoreNumber(ArrayList<Long> m, UserModel userModel) {

        String choice;
        System.out.println("Press Y for Add or N for No");
        choice = s.next();

        if (choice.equals("Y")) {
            System.out.println("Enter Your Number");
            m.add(s.nextLong());
            addMoreNumber(m, userModel);
        } else {
            userModel.setMultipleMobileNo(m);
            userModelArrayList.add(userModel);
            choice();
        }

    }


}
