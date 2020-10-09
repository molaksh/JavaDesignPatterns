public class AnchovyTopping extends ToppingDecorator{

  public AnchovyTopping(Pizza pizza) {
    super(pizza);
    // TODO Auto-generated constructor stub
  }

  @Override
  public String destription() {
    // TODO Auto-generated method stub
    return tempPizza.destription()+ ", Anchovies";
  }
  @Override
  public int cost(){
    return tempPizza.cost() + 1;
  }
  
}
