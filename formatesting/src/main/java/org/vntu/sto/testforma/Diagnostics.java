package org.vntu.sto.testforma;

class Diagnostics implements IBaseService {
  private String id;
  private String serviceName;
  private String serviceCost;
  private String date;
  private String time;

  public String getID() {
    return id;
  }

  public void setID(String id) {
    this.id = id;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getServiceCost() {
    return serviceCost;
  }

  public void setServiceCost(String serviceCost) {
    this.serviceCost = serviceCost;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

}

