abstract class ToppingDecorator implements Pizza {
  protected Pizza existingPizza;

  @Override
  public int cost() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return null;
  }

  public ToppingDecorator(Pizza existingPizza) {
    this.existingPizza = existingPizza;
  }


}
