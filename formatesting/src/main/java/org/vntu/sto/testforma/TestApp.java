package org.vntu.sto.testforma;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

//import static javax.swing.JOptionPane.*;

class TestApp {

final static String idCorrect = "1112222333";
final static String idNotCorrect = "....ID....";
  
  public static void main(String[] args) {
    Diagnostics diagnostics = new Diagnostics();  

    diagnostics.setID(idCorrect);
    System.out.println("Output ID: " + diagnostics.getID());

    diagnostics.setID(idNotCorrect);
    System.out.println("Output ID: " + diagnostics.getID());
  }
}

