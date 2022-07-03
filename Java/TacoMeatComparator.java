package code_design_patterns.java;
import java.util.Comparator;
//custom comparator natural order (using String property (Alphabetical))
public class TacoMeatComparator implements Comparator<Taco> {
  @Override
  public int compare(Taco taco1, Taco taco2) {
    return taco1.getMeat().compareTo(taco2.getMeat());
  }
}