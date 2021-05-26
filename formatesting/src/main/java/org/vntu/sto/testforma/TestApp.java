package org.vntu.sto.testforma;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

class TestApp {

final static String idCorrect = "1112222333";
final static String idNotCorrect = "....ID....";
final static String dateCorrect = "11/12/33";
final static String dateNotCorrect = "....Date....";
final static String timeCorrect = "11:22";
final static String timeNotCorrect = "....Time....";
final static String periodTimeCorrect = "123";
final static String periodTimeNotCorrect = "....PeriodTime....";
  
  public static void main(String[] args) {
    Diagnostics diagnostics = new Diagnostics();  
    Parking parking = new Parking();

    diagnostics.setServiceName("Діагностика");
    diagnostics.setID(idCorrect);
    System.out.println("Тестування ==> " + diagnostics.getServiceName() + " ==> " + diagnostics.getID());

    diagnostics.setID(idNotCorrect);
    System.out.println("Тестування ==> " + diagnostics.getServiceName() + " ==> " + diagnostics.getID());

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

