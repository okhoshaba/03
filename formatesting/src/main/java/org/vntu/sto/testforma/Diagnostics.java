package org.vntu.sto.testforma;

class Diagnostics implements IBaseService {
  private String id;
  private String serviceName;
  private String serviceCost;
  private String date;
  private String time;

  public String getID() {
    return " ID: " + id;
  }

  public void setID(String id) {
    this.id = id;
  }

  public String getServiceName() {
    return serviceName;
//    return " ServiceName: " + serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getServiceCost() {
    return " ServiceCost: " + serviceCost;
  }

  public void setServiceCost(String serviceCost) {
    this.serviceCost = serviceCost;
  }

  public String getDate() {
    return " Date: " + date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return " Time: " + time;
  }

  public void setTime(String time) {
    this.time = time;
  }

}

