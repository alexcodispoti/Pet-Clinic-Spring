package guru.springframework.sfgpetclinic.model;

/**
 * Created by jt on 7/13/18.
 */

//Qui abbiamo esteso la classe BaseEntity nella quale serializziamo gli oggetti della classe associata
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
