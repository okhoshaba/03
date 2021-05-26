package org.vntu.sto.testforma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TestApp {

final static String idCorrect = "1112222333";
final static String idNotCorrect = "ID....";
final static String dateCorrect = "11/12/33";
final static String dateNotCorrect = "Date....";
final static String timeCorrect = "11:22";
final static String timeNotCorrect = "Time....";
final static String periodTimeCorrect = "123";
final static String periodTimeNotCorrect = "PeriodTime....";
  
public static boolean isValidNumericService(String str) {
  str = str.trim(); // trims the white spaces.
  
  if(str.length() == 0)
    return false;
  
  if (str.length() == 1 && !Character.isDigit(str.charAt(0)))
    return false;
  
  if (str.charAt(0) != '+' && str.charAt(0) != '-'
    && !Character.isDigit(str.charAt(0))
    && str.charAt(0) != '.')
  return false;

return true;
}

public static boolean isValidTimeService(String time) {
// For Time Service: 13:05
  String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
  Pattern p = Pattern.compile(regex);
  if (time == null) {
  return false;
  }
  Matcher m = p.matcher(time);
  return m.matches();
}

public static boolean isValidDateService(final String date) {
// For Service format /dd/mm/yyyy
  String regex = "^(1[0-2]|0[1-9])/(3[01]"
                       + "|[12][0-9]|0[1-9])/[0-9]{4}$";
  Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher((CharSequence)date);
  return matcher.matches();
}

  public static void main(String[] args) {
    Diagnostics diagnostics = new Diagnostics();  
    Parking parking = new Parking();

    diagnostics.setServiceName("Діагностика");
    diagnostics.setID(idCorrect);
    System.out.println("Тестування ID: ==> " + diagnostics.getServiceName() + " ==> " + diagnostics.getID());
    if (isValidNumericService(diagnostics.getID())) 
      System.out.println("Тестування пройдено +++ ");
    else
      System.out.println("Тестування НЕ пройдено !!!");

    diagnostics.setID(idNotCorrect);
    System.out.println("Тестування ID: ==> " + diagnostics.getServiceName() + " ==> " + diagnostics.getID());
//    if (isValidNumericServie(diagnostics.getID()))
    if (isValidNumericService(idNotCorrect))
      System.out.println("Тестування пройдено +++ ");
    else
      System.out.println("Тестування НЕ пройдено !!!");


    diagnostics.setDate(dateCorrect);
    System.out.println("Тестування ==> " + diagnostics.getServiceName() + " ==> " + diagnostics.getDate());

    diagnostics.setDate(dateNotCorrect);
    System.out.println("Тестування ==> " + diagnostics.getServiceName() + " ==> " + diagnostics.getDate());

    diagnostics.setTime(timeCorrect);
    System.out.println("Тестування ==> " + diagnostics.getServiceName() + " ==> " + diagnostics.getTime());

    diagnostics.setTime(timeNotCorrect);
    System.out.println("Тестування ==> " + diagnostics.getServiceName() + " ==> " + diagnostics.getTime());

    parking.setServiceName("Паркування");
    parking.setID(idCorrect);
    System.out.println("Тестування ==> " + parking.getServiceName() + " ==> " + parking.getID());

    parking.setID(idNotCorrect);
    System.out.println("Тестування ==> " + parking.getServiceName() + " ==> " + parking.getID());

    parking.setDate(dateCorrect);
    System.out.println("Тестування ==> " + parking.getServiceName() + " ==> " + parking.getDate());

    parking.setDate(dateNotCorrect);
    System.out.println("Тестування ==> " + parking.getServiceName() + " ==> " + parking.getDate());

    parking.setTime(timeCorrect);
    System.out.println("Тестування ==> " + parking.getServiceName() + " ==> " + parking.getTime());

    parking.setTime(timeNotCorrect);
    System.out.println("Тестування ==> " + parking.getServiceName() + " ==> " + parking.getTime());

    parking.setPeriodTime(periodTimeCorrect);
    System.out.println("Тестування ==> " + parking.getServiceName() + " ==> " + parking.getPeriodTime());

    parking.setPeriodTime(periodTimeNotCorrect);
    System.out.println("Тестування ==> " + parking.getServiceName() + " ==> " + parking.getPeriodTime());

  }
}

