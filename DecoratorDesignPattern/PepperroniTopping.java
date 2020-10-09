public class PepperroniTopping extends ToppingDecorator{

  public PepperroniTopping(Pizza existingPizza) {
    super(existingPizza);
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public int cost() {
    // TODO Auto-generated method stub
    return existingPizza.cost() + 2;
  }

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return existingPizza.getDescription() + ", Pepperroni";
  }

}
