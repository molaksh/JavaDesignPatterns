class Prototype {
  public static void main(String[] args) throws CloneNotSupportedException {

    BasicCar BMWConcept = new BMW();
    BMWConcept.setModelName("BMW Q5");
    BMWConcept.setMakeYear("2020");
    BMWConcept.setVinNumber("DefaultVinNumber");

    BasicCar BMW1 = ((BMW) BMWConcept).clone();
    BMW1.setVinNumber("A1");

    BasicCar BMW2 = ((BMW) BMWConcept).clone();
    BMW2.setVinNumber("A2");

    System.out.println(BMWConcept);
    System.out.println(BMW1);
    System.out.println(BMW2);

    // HASHCODES
    System.out.println(BMWConcept.hashCode());
    System.out.println(BMW1.hashCode());
    System.out.println(BMW2.hashCode());

  }
}

class BMW extends BasicCar {

  @Override
  protected BasicCar clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return (BasicCar) super.clone();
  }

}

class Audi extends BasicCar {

  @Override
  protected BasicCar clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return (BasicCar) super.clone();
  }

}

class BasicCar implements Cloneable {

  private String modelName;
  private int price;
  private String makeYear;
  private String VinNumber;

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getMakeYear() {
    return makeYear;
  }

  public void setMakeYear(String makeYear) {
    this.makeYear = makeYear;
  }

  public String getVinNumber() {
    return VinNumber;
  }

  public void setVinNumber(String vinNumber) {
    VinNumber = vinNumber;
  }

  @Override
  public String toString() {
    return "BasicCar [VinNumber=" + VinNumber + ", makeYear=" + makeYear + ", modelName=" + modelName + ", price="
        + price + "]";
  }

}