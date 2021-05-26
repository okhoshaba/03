package org.vntu.sto.testforma;

class Diagnostics implements IBaseService {
  private String id;
  private String date;
  private String time;

  public String getID() {
    return " ID: " + id;
  }

  public void setID(String id) {
    this.id = id;
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

