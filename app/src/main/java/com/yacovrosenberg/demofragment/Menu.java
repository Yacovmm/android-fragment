package com.yacovrosenberg.demofragment;

/**
 * Created by YacovR on 26-Sep-17.
 */

public class Menu {

    private String name;
    private String description;

    public static final Menu[] menus = {

            new Menu("Breakfast", "2 Whole eggs, \n\n Bread, \n Coffe"),
            new Menu("Lunch", "2 Whole eggs, \n\n Meat \n Coke"),
            new Menu("Dinner", "Rice, \n\n Potato \n Milk")
};

    private Menu(String name, String description){
        this.name=name;
        this.description=description;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }

}
