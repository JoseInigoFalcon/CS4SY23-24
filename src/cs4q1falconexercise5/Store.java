/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1falconexercise5;
import java.util.*;

/**
 *
 * @author Jigs
 */
public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      this.name = name;
      this.earnings = 0;
      this.itemList = new ArrayList();
      storeList.add(this);
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      if(index < itemList.size() && index >= 0){
          earnings += itemList.get(index).getCost();
          System.out.println(itemList.get(index).getName() + " was sold for the price of " + itemList.get(index).getCost());
      } 
      else {
          System.out.println("Error. There are only " + itemList.size() + " items in the store.\n");
      }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
      boolean found = false;
        for(Item a : itemList){
            if(a.getName().equals(name)){
                found = true;
                System.out.println(a.getName() + " was sold for the price of " + a.getCost() + '.');
                System.out.println();
                earnings += a.getCost();
            break;
            }
        }
        if(!found){
            System.out.println("Item " + name + " is not part of this store!\n");
        }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
      if(itemList.contains(i)){
          System.out.println(i.getName() + " was sold for the price of " + i.getCost() + '.');
          System.out.println();
          earnings += i.getCost();
      }
      else {
          System.out.println("Item " + i.getName() + " is not part of this store!\n");
      }
      
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
      itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
      for(Item b : itemList){
          if(b.getType().equals(type)){
              System.out.printf("Name: %s, Cost %.2f, Type: %s%n", b.getName(), b.getCost(), b.getType());
          }
      }
      System.out.println();
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
      for(Item b : itemList){
          if(b.getCost()<= maxCost){
              System.out.printf("Name: %s%nType: %s%nCost:%.2f%n\n", b.getName(), b.getType(), b.getCost());
          }
      }
      System.out.println();
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
      for(Item b : itemList){
          if(b.getCost() >= minCost){
              System.out.printf("Name: %s%nType: %s%nCost:%.2f%n\n", b.getName(), b.getType(), b.getCost());
          }
      }
      System.out.println();
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
      for(Store c : storeList){
          System.out.printf("Name: %s, Earnings: %.2f%n", c.getName(), c.getEarnings());
      }
    // loop over storeList and print the name and the earnings'Store.java'
  }
}