package org.vntu.sto.testforma;

class Parking extends Diagnostics {
  private String periodTime;

  public String getPeriodTime() {
    return " PeriodTime: " + periodTime;
  }

  public void setPeriodTime(String periodTime) {
    this.periodTime = periodTime;
  }
}

