package code_design_patterns.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Taco taco = new Taco("beef");
       

    Taco taco2 = new Taco("chicken");
        

    Taco taco3 = new Taco("lamb");
  

    // Add Taco in reverse order for intitial setup
    List<Taco> list = new ArrayList<Taco>();
    list.add(taco3);
    list.add(taco2);
    list.add(taco);

    // This stream calls sorted twice passing two different comparator classes.
    // First it will sort naturally by meat name, then prioritise
    // any Chicken meat to the front of the list
    List<Taco> newList = list.stream()
        .sorted(new TacoMeatComparator())
        .sorted(new TacoChickenComparator())
        .collect(Collectors.toList());

    for (Taco finishedTaco : newList) {
      System.out.println(finishedTaco);
    }
  }
}
