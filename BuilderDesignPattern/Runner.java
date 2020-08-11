public class Runner {
  public static void main(String[] args){

     Phone p1 = new Phone("windows", "windowsOS", null, "carl zeiss", null, "usb-c");

     System.out.println(p1);

     Phone p2 = new PhoneBuilder().setBrand("Apple").setOs("iOS").setChargingPinType("Apple Pin").getPhone();

     System.out.println(p2);

  }
}