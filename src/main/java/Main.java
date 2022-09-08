import Model.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a Menu number: ");

        int num = scan.nextInt();


        Menu superThin = new Menu(110, 10.5f, "Super-Thin-Model.Menu", "Small-Cheeseburger", "Small-fries", "Small-Coke");
        Menu tiny = new Menu(111, 12.5f, "Tiny-Model-Menu", "Cheeseburger", "Small-Fries", "Small-Coke");
        Menu normal = new Menu(112, 15.0f, "Normal-Model-Menu", "Cheeseburger", "Fries", "Coke");
        Menu bigGuy = new Menu(113, 17.5f, "Big-Guy-Model-Menu", "2x Cheeseburger", "Fries", "Large-Coke");
        Menu fatGuy = new Menu(114,20.00f,"Fat-Guy-Model-Menu","4x Cheeseburger", "2x Fries", "XXL-Coke");

        OrderSystem orderSystem = new OrderSystem();

        orderSystem.addMenu(superThin);
        orderSystem.addMenu(tiny);
        orderSystem.addMenu(normal);
        orderSystem.addMenu(bigGuy);
        orderSystem.addMenu(fatGuy);


        orderSystem.placeOrder(110);










        }


    }


