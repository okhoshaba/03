package org.vntu.sto.forma;

//import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class Application {

public static void main(String[] args) {

//  Analitics analitics;
  Diagnostics diagnostics;
  String results;

  diagnostics = new Diagnostics();

  results = showInputDialog("Введіть ідентифікаційний номер:");
  diagnostics.setID(results);

  results = showInputDialog("Введіть ім'я сервісу:");
  diagnostics.setServiceName(results);

  results = showInputDialog("Введіть вартість сервісу:");
  diagnostics.setServiceCost(results);

  results = showInputDialog("Введіть дату створення сервісу:");
  diagnostics.setDate(results);

  results = showInputDialog("Введіть час створення сервісу:");
  diagnostics.setTime(results);

//  System.out.println("Report: " + diagnostics.toString());

  }
}

