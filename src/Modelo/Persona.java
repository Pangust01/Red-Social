package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String name;
    private int age;
    private List<String> interest;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persona(String name, int age, List<String> interest) {
        this.name = name;
        this.age = age;
        this.interest = new ArrayList<>();
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

    public List<String> getInterest() {
        return interest;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest;
    }
    
    
    
}
