package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
	// write your code here
        MenuItem tacos1 = new MenuItem(1.99, "Tacos 1", "appetizer", true);
        ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
        menuItemList.add(tacos1);
        Date lastUpdated = new Date();
        Menu menu = new Menu(menuItemList, lastUpdated);
        //System.out.println(menu.menuItems.toString());
        MenuItem menuItem2 = new MenuItem(1.99, "Tacos", "appetizer", false);
        menu.addMenuItem(menuItem2);
        System.out.println(menu.menuItems.toString());
        System.out.println(menu.menuItems.get(0));

        System.out.println(menu.isNewItem(menuItem2));

        System.out.println(menu.getLastUpdated());
    }
}
