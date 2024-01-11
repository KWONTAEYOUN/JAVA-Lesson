package object.day6;

import java.util.Arrays;

public class Exercise {
    private String name;
    private int age;
    private double tall;
    private String[] ability;

    public Exercise(String name, int age, double tall, String[] ability){
        this.name = name;
        this.age = age;
        this. tall = tall;
        this.ability = ability;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getTall() {
        return tall;
    }
    public String[] getAbility() {
        return ability;
    }
    public void setAbility(String[] ability) {
        this.ability = ability;
    }

    public String getData(){
        return String.format("%s\t %d\t %s\t %s", name, age, tall, Arrays.toString(ability));

    }

    







}
