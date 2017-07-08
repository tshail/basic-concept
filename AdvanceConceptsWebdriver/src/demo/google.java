package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;

import bsh.ParseException;
      


public class google {
    WebDriver driver;
    
    public static String generateRandomDate(String Format,String startDate,String endDate) throws ParseException, java.text.ParseException
    {
     DateFormat formatter = new SimpleDateFormat(Format);
     Calendar cal=Calendar.getInstance();
     cal.setTime(formatter.parse(startDate));
     Long value1 = cal.getTimeInMillis();

     cal.setTime(formatter.parse(endDate));
     Long value2 = cal.getTimeInMillis();

     long value3 = (long)(value1 + Math.random()*(value2 - value1));
     cal.setTimeInMillis(value3);
     return formatter.format(cal.getTime());
       }
   
    
    
      public static void main(String args[]) throws ParseException, java.text.ParseException{
       
       System.out.println(google.generateRandomDate("dd MMM yyyy", "01 Aug 2016", "01 Sep 2017"));
       
       
      }
    
    
    
    

  }

