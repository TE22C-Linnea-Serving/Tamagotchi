import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    private int hunger = 0;
    private int boredome = 0;
    private boolean isAlive = true;
    private String name;
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

        isAlive = hunger < 10 && boredome < 10;
    }

    public void feed(){
        hunger--;
    }

    public void speak(){

    }
}
