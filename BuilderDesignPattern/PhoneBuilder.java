public class PhoneBuilder {
  private String brand;
  private String os;
  private String battery;
  private String camera;
  private String screenSize;
  private String chargingPinType;

 

  public PhoneBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  

  public PhoneBuilder setOs(String os) {
    this.os = os;
    return this;
  }



  public PhoneBuilder setBattery(String battery) {
    this.battery = battery;
    return this;
  }

 

  public PhoneBuilder setCamera(String camera) {
    this.camera = camera;
    return this;
  }

  

  public PhoneBuilder setScreenSize(String screenSize) {
    this.screenSize = screenSize;
    return this;
  }

  
  public PhoneBuilder setChargingPinType(String chargingPinType) {
    this.chargingPinType = chargingPinType;
    return this;
  }

  public Phone getPhone(){
    Phone phone = new Phone(brand, os, battery, camera, screenSize, chargingPinType);
    return phone;
  }

  
}