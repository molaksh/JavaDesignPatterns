import java.util.Scanner;

class FactoryDesingPattern {
  public enum AnimalEnum {
    LION(1), FOX(2), SHEEP(3);

    private Integer animalReference;

    AnimalEnum(Integer reference) {
      this.animalReference = reference;
    }

    public Integer getAnimalReference(){
      return this.animalReference;
    }

    public static AnimalEnum getAnimal(Integer reference){
      if(reference == 1)return AnimalEnum.LION;
      else if(reference == 2) return AnimalEnum.FOX;
      else if(reference == 3) return AnimalEnum.SHEEP;
      else return null;
    }

  }

  public static void main(String[] args) {

    Scanner s1 = new Scanner(System.in);

    String cont = "y"; 

    while(cont.equalsIgnoreCase("y")){
    System.out.println("select which animal \n1. Lion\n2. Fox\n3. Sheep");
    String option = null;

    if (s1.hasNextLine()) {
      option = s1.nextLine();
    }

    

    Animal a = new AnimalFactory().getAnimal(AnimalEnum.getAnimal(Integer.parseInt(option)));
    a.feature();

    System.out.println("do you want to continue? Y/N : ");
    cont = s1.nextLine();

  }

    s1.close();
    

  }
}



class AnimalFactory {
  public Animal getAnimal(FactoryDesingPattern.AnimalEnum animal) {
    switch (animal) {
      case LION:
        return new Lion();
      case FOX:
        return new Fox();
      case SHEEP:
        return new Sheep();
      default:
        return null;

    }

  }
}

  class Lion implements Animal {
    @Override
    public void feature() {
      System.out.println("I am a Lion and I roar");

    }
  }

  class Fox implements Animal {
    @Override
    public void feature() {
      System.out.println("I am a Fox and I howl");
    }
  }

  class Sheep implements Animal {
    @Override
    public void feature() {
      System.out.println("I am a Sheep and I baaaaaa");
    }
  }

interface Animal{
  void feature();
}
