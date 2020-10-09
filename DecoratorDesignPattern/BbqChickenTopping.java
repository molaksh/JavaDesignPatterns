public class BbqChickenTopping extends ToppingDecorator {

  public BbqChickenTopping(Pizza existingPizza) {
    super(existingPizza);
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public int cost() {
    // TODO Auto-generated method stub
    return existingPizza.cost() + 3;
  }

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return existingPizza.getDescription() + ", bbq chicken";
  }


}
