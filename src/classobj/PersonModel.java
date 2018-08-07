package classobj;

/**
 * Created by Anukul-PC on 22-07-2018.
 */
public class PersonModel {

    private String name;
    private String email;

    public PersonModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}