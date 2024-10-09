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
        words.add("Hello!");
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
        for(int i = 0; i < 3; i++) {
            if (hunger > 0) {
                hunger--;
            }
        }
        System.out.println("You are feeding " + name);
        System.out.println();
    }

    public void reduceBoredom(){
        for(int i = 0; i < 3; i++) {            //Eftersom tick(); ökar boredom, måste man minsta den med 2, för att den faktiskt ska gå ner
            if (boredom > 0) {
                boredom--;
            }
        }
    }

    public void teach(String word){
        reduceBoredom();
        System.out.println(name + " learned: " + word);
        words.add(word);
        System.out.println();
    }

    public void speak(){
        reduceBoredom();
        System.out.println(words.get(generator.nextInt(words.size())));         //??
        System.out.println();
    }

    public void printStats(){
        System.out.println("Boredom: " + boredom);
        System.out.println("Hunger: " + hunger);
        if(isAlive) {
            System.out.println(name +" is alive");
        }
        System.out.println();
    }

    public boolean getAlive() {
        return isAlive;
    }
}
