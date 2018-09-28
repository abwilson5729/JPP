import java.util.Date;

public abstract class Product implements Item {

  int serialNumber;
  String manufacturer;
  Date manufacturedOn;
  String name;

  static int currentProductNumber;

  public Product (String name){
    this.name = name;
    serialNumber = currentProductNumber++;
    manufacturedOn = new Date();
  }

  public void setProductionNumber(int productionNumber){
    serialNumber = productionNumber;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public Date getManufacturedDate(){
    return manufacturedOn;
  }
  public int getSerialNumber(){
    return serialNumber;
  }
  public String toString(){
    return "manufacturer  : " + MANUFACTURER + "\n"
        +  "Serial Number : " + serialNumber + "\n"
        +  "Date          : " + manufacturedOn + "\n"
        +  "Name          : " + name + "\n";
  }
}
