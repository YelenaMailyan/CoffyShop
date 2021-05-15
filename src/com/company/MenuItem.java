package com.company;

public class MenuItem {
    private String itemName;
    private int itemType;//whether a food -1 or a drink-2;
    private double itemPrice;

    public MenuItem() {
    }

    public MenuItem(String itemName, int type, double price) {
        setMenuItemName(itemName);
        setType(type);
        setPrice(price);
    }


    public String getMenuItemName() {
        return itemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.itemName = menuItemName;
    }

    public int getType() {
        return itemType;
    }

    public void setType(int type) {
        if (type == 1 || type == 2) {
            this.itemType = type;
        } else System.out.println("Wrong input for type");

    }

    public double getPrice() {
        return itemPrice;
    }

    public void setPrice(double price) {
        this.itemPrice = price;
    }


}
