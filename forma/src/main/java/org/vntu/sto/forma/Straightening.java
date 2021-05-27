package org.vntu.sto.forma;

class Straightening implements IExtendedService {
  private String id;
  private String serviceName;
  private String serviceCost;
  private String clientName;

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

  public String getClientName() {
    return " ClientName: " + clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

}

