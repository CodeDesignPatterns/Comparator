package code_design_patterns.java;

public class Taco {

  private String meat;


  public Taco(String meat) {
    this.meat = meat;

  }

  public String getMeat() {
    return meat;
  }

  

  @Override
  public String toString() {
    return "Taco{" +
        "meat='" + meat + '\'' +
        '}';
  }

}
