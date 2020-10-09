public class PizzaMaker {

  public static void main(String[] args) {
    Pizza bPizza1 = new MozzarellaTopping(new AnchovyTopping(new PepperoniTopping(new ThinCrustPizza())));

    System.out.println(bPizza1.destription());
    System.out.println(bPizza1.cost());

    Pizza bPizza2 = new MozzarellaTopping(new ThinCrustPizza());
    System.out.println(bPizza2.destription());
    System.out.println(bPizza2.cost());





  }
  

  
}
