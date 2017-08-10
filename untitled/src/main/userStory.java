package main;

public class userStory {
  protected String surname;
  protected String streetName;
  protected String houseNumber;
  protected String postCode;
  protected String NIN;
  protected String bankName;
  protected int sortCode;
  protected int startingSalary;
  protected int employeeNumber;


  String forename;
  public userStory(String forename, String surname, String streetName, String houseNumber, String postCode,
                    String nIN, String bankName, int sortCode, int startingSalary, int employeeNumber) {
    super();
    this.forename = forename;
    this.surname = surname;
    this.streetName = streetName;
    this.houseNumber = houseNumber;
    this.postCode = postCode;
    NIN = nIN;
    this.bankName = bankName;
    this.sortCode = sortCode;
    this.startingSalary = startingSalary;
    this.employeeNumber = employeeNumber;
  }
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }
  public String getHouseNumber() {
    return houseNumber;
  }
  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }
  public String getPostCode() {
    return postCode;
  }
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }
  public String getNIN() {
    return NIN;
  }
  public void setNIN(String nIN) {
    NIN = nIN;
  }
  public String getBankName() {
    return bankName;
  }
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }
  public int getSortCode() {
    return sortCode;
  }
  public void setSortCode(int sortCode) {
    this.sortCode = sortCode;
  }
  public int getStartingSalary() {
    return startingSalary;
  }
  public void setStartingSalary(int startingSalary) {
    this.startingSalary = startingSalary;
  }
  public int getEmployeeNumber() {
    return employeeNumber;
  }
  public void setEmployeeNumber(int employeeNumber) {
    this.employeeNumber = employeeNumber;
  }
  public String getForename() {
    return forename;
  }
  public void setForename(String forename) {
    this.forename = forename;
  }
}
