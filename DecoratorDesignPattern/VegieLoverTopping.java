public class VegieLoverTopping extends ToppingDecorator{

  public VegieLoverTopping(Pizza existingPizza) {
    super(existingPizza);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int cost() {
    // TODO Auto-generated method stub
    return existingPizza.cost() + 10;
  }

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return existingPizza.getDescription() + ", all the frikking vegetables";
  }

  
}
