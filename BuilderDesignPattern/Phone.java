class Phone{

  private String brand;
  private String os;
  private String battery;
  private String camera;
  private String screenSize;
  private String chargingPinType;

  @Override
  public String toString() {
    return "Phone [battery=" + battery + ", brand=" + brand + ", camera=" + camera + ", chargingPinType="
        + chargingPinType + ", os=" + os + ", screenSize=" + screenSize + "]";
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getBattery() {
    return battery;
  }

  public void setBattery(String battery) {
    this.battery = battery;
  }

  public String getCamera() {
    return camera;
  }

  public void setCamera(String camera) {
    this.camera = camera;
  }

  public String getScreenSize() {
    return screenSize;
  }

  public void setScreenSize(String screenSize) {
    this.screenSize = screenSize;
  }

  public String getChargingPinType() {
    return chargingPinType;
  }

  public void setChargingPinType(String chargingPinType) {
    this.chargingPinType = chargingPinType;
  }

  public Phone(String brand, String os, String battery, String camera, String screenSize, String chargingPinType) {
    this.brand = brand;
    this.os = os;
    this.battery = battery;
    this.camera = camera;
    this.screenSize = screenSize;
    this.chargingPinType = chargingPinType;
  }

}