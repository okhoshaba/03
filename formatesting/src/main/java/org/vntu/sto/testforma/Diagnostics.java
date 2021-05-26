package org.vntu.sto.testforma;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

//import static javax.swing.JOptionPane.*;

class Diagnostics implements IService {
  private String id;

  public String getID() {
//    System.out.println("Output ID");
    return id;
  }

  public void setID(String id) {
//    System.out.println("Setting ID: " + id);
    this.id = id;
  }
}

