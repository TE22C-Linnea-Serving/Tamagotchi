import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    private int hunger;
    private int boredom;
    private boolean isAlive = true;
    public String name;
    private Random generator = new Random();

    ArrayList<String> words =new ArrayList<>();



    Tamagotchi(String name, int hunger, int boredom) {
        this.name = name;
        this.hunger = hunger;
        this.boredom = boredom;
        generator.nextInt(10);
        words.add("hej");
    }

    public void tick(){
        hunger++;
        boredom++;

        if(hunger<=10 && boredom<=10){
            isAlive = true;
        }else if(hunger>=10) {
            isAlive = false;
            System.out.println(name + " died from hunger!");
        }else{
            isAlive = false;
            System.out.println(name + " died from boredom!");
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

    public void reduceBoredom(){
        if(boredom<=0) {
            System.out.println(name + " is not bored");
        }else{
            boredom--;
        }
    }

    public void teach(String word){
        System.out.println("What word do you want to teach?");
        words.add(word);
        System.out.println(word);
    }

    public void speak(){

    }

    public int getBoredom() {
        return boredom;
    }

    public boolean getAlive() {
        return isAlive;
    }
}
