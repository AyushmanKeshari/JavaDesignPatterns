package StructuralDesignPatterns.ProxyPattern.Solution_SuperStoreInventory;

import java.util.ArrayList;

public class SuperStoreInventoryProxy implements Inventory {

    Inventory inventory;

    @Override
    public ArrayList<Item> getInventory() {
        if (inventory == null) {
            inventory = new SuperstoreInventory();
        }
        return  inventory.getInventory();
    }
}
