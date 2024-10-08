import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    private int hunger = 0;
    private int boredome = 0;
    private boolean isAlive = true;
    public String name;
    private Random generator = new Random();

    ArrayList<Object> words =new ArrayList<>();


    Tamagotchi(String name, int hunger, int boredome) {
        this.name = name;
        this.hunger = hunger;
        this.boredome = boredome;
        generator.nextInt(10);
    }

    public void tick(){
        hunger++;
        boredome++;

        if(hunger<=10 && boredome<=10){
            isAlive = true;
        }else if(hunger>=10) {
            isAlive = false;
            System.out.println(name + " died from hunger!");
        }else if(boredome>=10){
            isAlive = false;
            System.out.println(name + " died from boredome!");
        }

    }

    public void feed(){
        System.out.println("You are feeding " + name);
        if(hunger<=0){
            System.out.println(name + " is not hungry");
        }else{
            hunger--;
        }
    }

    public void reduceBoredome(){
        if(boredome<=0) {
            System.out.println(name + " is not bored");
        }else{
            boredome--;
        }
    }

    public void speak(){

    }

    public boolean getAlive() {
        return isAlive;
    }
}
