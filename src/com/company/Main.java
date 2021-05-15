package com.company;


public class Main {
    public static void main(String[] args) {
        String drinksOnly, foodsOnly;
        String cheapestItemInMenu, cheapestItemInDrinks, cheapestItemInFoods;

        MenuItem[] menu = new MenuItem[]
                {new MenuItem("Coffee", 1, 1.2),
                        new MenuItem("Iced Coffee", 1, 3.5),
                        new MenuItem("Hot Coffee", 1, 3.0),
                        new MenuItem("Coffee with milk", 1, 2.0),
                        new MenuItem("Americano", 1, 1.1),
                        new MenuItem("Club Sandwich", 2, 4.5),
                        new MenuItem("Salad", 2, 3.5),
                        new MenuItem("Hot Dog", 2, 2.2),
                        new MenuItem("Pizza", 2, 4.0),
                        new MenuItem("Pasta", 2, 2.3)};


        CoffeeShopMenu coffeeShopMenu = new CoffeeShopMenu(menu);
        coffeeShopMenu.printMenu();

        drinksOnly = coffeeShopMenu.menuItemsByType(menu, 1);
        System.out.println("Drinks are [" + drinksOnly + "]");

        foodsOnly = coffeeShopMenu.menuItemsByType(menu, 2);
        System.out.println("Foods are  [" + foodsOnly + "]");
        cheapestItemInMenu = coffeeShopMenu.cheapestItemInMenu(menu, 0);
        System.out.println("Cheapest item in menu is " + cheapestItemInMenu);

        cheapestItemInDrinks = coffeeShopMenu.cheapestItemInMenu(menu, 1);
        System.out.println("Cheapest item in drinks is " + cheapestItemInDrinks);

        cheapestItemInFoods = coffeeShopMenu.cheapestItemInMenu(menu, 2);
        System.out.println("Cheapest item in foods is " + cheapestItemInFoods);

// der chem verajacrell
        System.out.println("Please enter table number  than the number of item from menu list you want to order ");
// for example(Tbl-5, Order 1,5,7)
    }
}
