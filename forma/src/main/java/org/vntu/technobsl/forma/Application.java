package org.vntu.technobsl.forma;

//import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class Application {

public static void main(String[] args) {

  Analitics analitics;
  String results;

  analitics = new Analitics();
  results = showInputDialog("Введіть ідентифікаційних номер:");
  analitics.setIDNumber(results);

  results = showInputDialog("Введіть дату замовлення:");
  analitics.setOrderDate(results);

  results = showInputDialog("Введіть час замовлення:");
  analitics.setOrderTime(results);

  results = showInputDialog("Введіть дату реалізації товару:");
  analitics.setCustomerDate(results);

  results = showInputDialog("Введіть час реалізації товару:");
  analitics.setCustomerTime(results);

  results = showInputDialog("Введіть адресу замовника:");
  analitics.setCustomerAddress(results);

  results = showInputDialog("Введіть адресу постачальника:");
  analitics.setProviderAddress(results);

  results = showInputDialog("Введіть ім'я постачальника:");
  analitics.setProviderName(results);

  results = showInputDialog("Введіть дату закупки товару:");
  analitics.setProviderDate(results);

  results = showInputDialog("Введіть час закупки товару:");
  analitics.setProviderTime(results);

  System.out.println("Report: " + analitics.toString());

  

  }
}

