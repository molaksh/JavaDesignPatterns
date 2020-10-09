abstract class ToppingDecorator implements Pizza{
  protected Pizza tempPizza;

  public ToppingDecorator(Pizza pizza){
    tempPizza = pizza;
  }

  public String description(){
    return tempPizza.destription();
  }

  public int cost(){
    return tempPizza.cost();
  }
}
