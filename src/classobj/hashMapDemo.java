package classobj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anukul-PC on 22-07-2018.
 */
public class hashMapDemo {

    public static void main(String[] args) {
//        HashMap<String, String> stringStringHashMap = new HashMap<>();
//
//
//        stringStringHashMap.put("anukul", "Anukul Mehta");
//        stringStringHashMap.put("mimoh", "Mimoh Solanki");
//
//        System.out.println(stringStringHashMap.get("anukul"));
//        System.out.println(stringStringHashMap.keySet());
//
//        String name[] = {"Anukul", "Mimoh", "Kodeeshari", "Harsh"};
//
//        for (int i = 0; i < name.length; i++) {
//            String item = name[i].toUpperCase();
//        }
//
//        for (String item : name) {
//            System.out.println(item.toUpperCase());
//
//        }

        ArrayList<PersonModel> personModelArrayList = new ArrayList<>();

        personModelArrayList.add(new PersonModel("Mimoh", "solankimimoh@gmail.com"));
        personModelArrayList.add(new PersonModel("anukul", "anukulmehta@gmail.com"));
        personModelArrayList.add(new PersonModel("kodee", "kodeeshwari@gmail.com"));

        for (PersonModel personModel : personModelArrayList) {
            System.out.println(personModel.getEmail());
        }

    }


}
