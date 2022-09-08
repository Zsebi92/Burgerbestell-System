import Model.Menu;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class OrderSystem {

    Map<Integer, Menu> menus = new HashMap<>();

    public OrderSystem(){
        super();
    }

    public Menu addMenu(Menu menu){
        menus.put(menu.getMenuNumber(), menu);
        return menu;
    }

    public Menu placeOrder(Integer number){
        Menu foundMenu = menus.get(number);
        System.out.println(foundMenu);
        return foundMenu;
    }









}
