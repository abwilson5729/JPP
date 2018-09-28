import java.util.Date;

/**
 * By Andrew Wilson, code adapted from Oracle
 */

/**
 * abstract class product, implements item, contains all info about the products
 * who manufactured it, its serial number, when it was manufactured and the name of the item
 */
public abstract class Product implements Item {

  int serialNumber;
  String manufacturer;
  Date manufacturedOn;
  String name;

  static int currentProductNumber;

  /**
   * Gets the information for the product, name serial number and manufactured date
   * @param name
   */
  public Product (String name){
    this.name = name;
    serialNumber = currentProductNumber++;
    manufacturedOn = new Date();
  }

  /**
   * Sets the serial number of the product
   * @param productionNumber
   */
  public void setProductionNumber(int productionNumber){
    serialNumber = productionNumber;
  }

  /**
   * Sets the name of the product
   * @param name
   */
  public void setName(String name){
    this.name = name;
  }

  /**
   * Returns the product name
   * @return name
   */
  public String getName(){
    return name;
  }

  /**
   * Returns the date the product was manufactured
   * @return manufacturedOn
   */
  public Date getManufacturedDate(){
    return manufacturedOn;
  }

  /**
   * Returns the serial number of the product
   * @return serialNumber
   */
  public int getSerialNumber(){
    return serialNumber;
  }

  /**
   * Returns all information about the product to be printed
   * @return MANUFACTURER, serialNumber, manufacturedOn, and name
   */
  public String toString(){
    return "manufacturer  : " + MANUFACTURER + "\n"
        +  "Serial Number : " + serialNumber + "\n"
        +  "Date          : " + manufacturedOn + "\n"
        +  "Name          : " + name + "\n";
  }
}
