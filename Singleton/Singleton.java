class Singleton {
    private static Singleton obj1 = null;
    private Singleton(){}

    public static Singleton getInstance(){
      if(obj1 == null){
          obj1 = new Singleton();
          return obj1;
      }
      return obj1;
    }
}