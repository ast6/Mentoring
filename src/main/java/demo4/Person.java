package demo4;

import org.junit.Assert;

public class Person {

    String name = "name";
    String surname = "surname";
    String email = "email";

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            //valid
            this.email = email;
        } else {
            System.out.println("");//add text
        }
    }
}
