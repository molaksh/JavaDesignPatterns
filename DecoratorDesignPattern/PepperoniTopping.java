public class PepperoniTopping extends ToppingDecorator{

  public PepperoniTopping(Pizza pizza) {
    super(pizza);
    // TODO Auto-generated constructor stub
  }

  @Override
  public String destription() {
    // TODO Auto-generated method stub
    return tempPizza.destription() + ", Pepperoni";
  }

  @Override
  public int cost(){
    return tempPizza.cost() + 10;
  }
  
  
}
