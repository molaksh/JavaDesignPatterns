import java.util.Arrays;

public class PizzaMaker {
  public static void main(String[] args) {
    Pizza p1 = new PepperroniTopping(new BbqChickenTopping(new ThinCrustPizza()));

    Pizza p2 = new VegieLoverTopping(new ThinCrustPizza());

    Pizza p3 = new VegieLoverTopping(new HandTossedPizza());

    Pizza p4 = new BbqChickenTopping(new PepperroniTopping(new HandTossedPizza()));


    Arrays.asList(p1, p2, p3, p4).stream().forEach(p-> {
      System.out.println(p.getDescription());
      System.out.println(p.cost());
    });
    



  }
}
