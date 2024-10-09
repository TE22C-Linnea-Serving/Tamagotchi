import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tamagotchi!\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to name your Tamagotchi?");
        String name = scanner.nextLine();

        Tamagotchi tamagotchi = new Tamagotchi(name, 0, 0);


        while(tamagotchi.getAlive()){
            System.out.println("Actions:\n1. Teach word\n2. Greet " + name + "\n3. Feed\n4. Do nothing");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    System.out.println("What word do you want to teach " + name + "?:");
                    String teachWord = scanner.nextLine();
                    System.out.println();
                    tamagotchi.teach(teachWord);
                    break;
                case 2:
                    System.out.println("You greet " + name + "!");
                    System.out.print(name + ": ");
                    tamagotchi.speak();
                    break;
                case 3:
                    tamagotchi.feed();
                    break;
                case 4:
                    System.out.println("You did nothing!");
                    break;
            }
            System.out.println("Press ENTER to continue...");
            scanner.nextLine();
            tamagotchi.tick();
            tamagotchi.printStats();
        }
    }
}