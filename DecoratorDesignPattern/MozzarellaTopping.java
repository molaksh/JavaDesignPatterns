public class MozzarellaTopping extends ToppingDecorator{

  

  public MozzarellaTopping(Pizza pizza) {
    super(pizza);
    // TODO Auto-generated constructor stub
  }

  @Override
  public String destription() {
    // TODO Auto-generated method stub
    return tempPizza.destription() + ", Mozzarella";
  }

  @Override
  public int cost() {
    // TODO Auto-generated method stub
    return tempPizza.cost() + 1;
  }
  
}
