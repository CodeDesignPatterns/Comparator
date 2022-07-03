package code_design_patterns.java;
import java.util.Comparator;
//custom comparator class that always sorts "Chicken" meat as highest priority
public class TacoChickenComparator implements Comparator<Taco> {
  @Override
  public int compare(Taco taco1, Taco taco2) {
    if (taco1.getMeat().equals("chicken")) {
      return -1;
    } else if (taco2.getMeat().equals("chicken")) {
      return 1;
    } else {
      return 0;
    }
  }
}

