package thursdayFive.task2;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<String>();

    //Constructor here


    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void setCoffeeMenu(ArrayList<String> coffeeMenu) {
        this.coffeeMenu = coffeeMenu;
    }

    @Override
    public String toString() {
        return "Coffee Menu:" + coffeeMenu;
    }

    public void loadMenuData() {
        try{
        File file = new File("coffees.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                coffeeMenu.add("\n" + scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }
}
