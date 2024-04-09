package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //MenuItem tacos = new MenuItem(1.99, "Three tacos with your choice of protein.", "appetizer", false);
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> currentMenuItems, Date lastUpdated) {
        this.menuItems = currentMenuItems;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getCurrentMenuItems() {
        return menuItems;
    }

    public void setCurrentMenuItems(ArrayList<MenuItem> currentMenuItems) {
        this.menuItems = currentMenuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
