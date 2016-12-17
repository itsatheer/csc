import java.util.*;
public class trip 
{
private static String customerName;
private static String mobileNo;
private static String day;
private static String date;
private static String time;
private static double distance;
private static String carType;
private static double charge;
private static String reservationCode;
public static int totalReservations = 0;

public static void Trip() {
customerName = "";
mobileNo ="";
day ="";
date ="";
time ="";
distance = 0.0;
carType = "";
charge = 0.0;
reservationCode = "";
totalReservations++;


}//end void trip
public static void Trip( String customerName, String mobileNo, String day, String date, String time, double distance, String carType) {


}//end parameters trip 




public String getCustomerName() { return customerName; }
public String getMobileNo(){ return mobileNo; }
public String getDay(){ return day;}
public String getDate(){ return date;}
public String getTime(){ return time;}
public double getDistance(){ return distance;}
public String getCarType() { return  carType;}


public void setCustomerName( String custName){customerName=custName; }
public void setMobileNo( String mobNo){mobileNo=mobNo; }
public void setDay( String DAY){day=DAY; }
public void setDate( String DATE){date=DATE; }
public void setTime( String TIME){time=TIME; }
public void setDistance( double dist){distance=dist; }
public void setCarType( String carTy){carType=carTy; }   


}//end class
