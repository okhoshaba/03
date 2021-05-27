package org.vntu.sto.forma;

class Repairs extends Straightening {
  private String workCost;

  public String getWorkCost() {
    return " WorkCost: " + workCost;
  }

  public void setWorkCost(String workCost) {
    this.workCost = workCost;
  }
}

