package oop;

public class Dog extends Animal implements Petable{

    public Dog(){
        System.out.println("Konstruktor zwierzęcia");
    }

    public Dog(String name){
        super(name);
    }

    @Override
    public String useVoice(){
        String voice = "Meeeeooowww";
        System.out.println(voice);
        return voice;
    }

    @Override
    public String toString(){
        return "Pies | nazwa=" + this.getName();
    }

    @Override
    public void move() {
        System.out.println("Biegam i patrzę jak w amoku");
    }

    @Override
    public void pet() {
        System.out.println("Rzucaj mi kijek, będę aportował. A później głaskaj");
    }
}
