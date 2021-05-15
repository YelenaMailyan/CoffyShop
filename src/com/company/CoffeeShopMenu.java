package com.company;

public class CoffeeShopMenu {
    MenuItem[] MenuItems;

    public CoffeeShopMenu(MenuItem[] menuItems) {
        MenuItems = menuItems;
    }


    public String menuItemsByType(MenuItem[] ourMenu, int type) {
        String result = "";
        for (int i = 0; i < ourMenu.length; i++) {
            if (ourMenu[i].getType() == type) {
                result = result + ourMenu[i].getMenuItemName() + ", ";
            }
        }
        return result.substring(0, result.length() - 2);
    }

    public String cheapestItemInMenu(MenuItem[] ourMenu, int type) {
        String result = "";
        MenuItem[] newMenuArray = new MenuItem[ourMenu.length];
        int k = 0;
        for (int i = 0; i < ourMenu.length; i++) {
            if (ourMenu[i].getType() == type || type == 0) {
                MenuItem menuItem = new MenuItem();
                menuItem.setMenuItemName(ourMenu[i].getMenuItemName());
                menuItem.setType(ourMenu[i].getType());
                menuItem.setPrice(ourMenu[i].getPrice());
                newMenuArray[k] = menuItem;
                k++;
            }
        }
        int t = 0;
        double cheapest = newMenuArray[0].getPrice();
        for (int i = 1; i < k; i++) {
            if (newMenuArray[i].getPrice() < cheapest) {
                cheapest = newMenuArray[i].getPrice();
                t = i;
            }
            result = newMenuArray[t].getMenuItemName();
        }
        return result;
    }


    public void printMenu() {
        System.out.println("----Our Menu-----");
        for (int i = 0; i < this.MenuItems.length; i++) {
            System.out.println((i+1)+". "+this.MenuItems[i].getMenuItemName() + "- " + this.MenuItems[i].getPrice() );
        }


    }
}
