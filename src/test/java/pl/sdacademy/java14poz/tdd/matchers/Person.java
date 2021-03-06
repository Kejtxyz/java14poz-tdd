package pl.sdacademy.java14poz.tdd.matchers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Person
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 19:57
 **/
public class Person {

    String name;
    int age;

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public void setBirthdayDate(String birthdayDateString) {

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date birthdayDate = formatter.parse(birthdayDateString);
            setBirthdayDate(birthdayDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    Date birthdayDate;

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}