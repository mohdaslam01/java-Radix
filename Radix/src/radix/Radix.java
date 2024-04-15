package radix;
import java.util.*;

public class Radix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String num = sc.nextLine();
//        int num1 = Integer.parseInt(num);
//        if(num.matches("[10]*"))
//            System.out.println("binary");
//        else if(num.matches("[0-7]*"))
//            System.out.println("octal");
//        else if(num.matches("[0-9]*"))
//            System.out.println("decimal");
//        else if(num.matches("[0-9A-F]*"))
//            System.out.println("hexa");
//        else
//            System.out.println("invalid");
//        num = sc.nextLine();
//        int yr = Integer.parseInt(num);
//        if(yr%4==0&&yr%400==0&&yr%100==0||yr%4==0&&yr%100!=0)System.out.println(yr+"\tis a leap year");
//        else System.out.println(yr+"\tis not a leap year");
//        num1 = num1%7;
//        switch(num1){
//            
//            case(0) -> {System.out.println("Sunday");}
//            case(1) -> {System.out.println("Monday");}
//            case(2) -> {System.out.println("Tuesday");}
//            case(3) -> {System.out.println("Wednesday");}
//            case(4) -> {System.out.println("Thursday");}
//            case(5) -> {System.out.println("Friday");}
//            case(6) -> {System.out.println("Saturday");}
//            
//            
//        }
//        int num2=sc.nextInt();
//        switch(num2){
//            case 1 -> { System.out.println("JANUARY"); break;}
//            case 2 -> { System.out.println("FEBUARARY"); break;}
//            case 3 -> { System.out.println("MARCH"); break;}
//            case 4 -> { System.out.println("APRIL"); break;}
//            case 5 -> { System.out.println("MAY"); break;}
//            case 6 -> { System.out.println("JUNE"); break;}
//            case 7 -> { System.out.println("JULY"); break;}
//            case 8 -> { System.out.println("AUGUST"); break;}
//            case 9 -> { System.out.println("SEPTEMBER"); break;}
//            case 10 -> { System.out.println("OCTOBER"); break;}
//            case 11 -> { System.out.println("NOVEMBER"); break;}
//            case 12 -> { System.out.println("DECEMBER"); break;}
//            default -> { System.out.println("INVALID"); break;}
//        }
          int index =num.lastIndexOf("." , num.length());
          int index1 =num.indexOf(":");
          System.out.println("Protocol used is: \t"+num.substring(0, index1));
          System.out.println("Type of website is:\t"+num.substring(index));
          num= num.substring(index, num.length());
          switch(num){
          case(".com") -> {System.out.println("Commercial website"); break;}
          case(".gov") -> {System.out.println("Govt. website"); break;}
          case(".local") -> {System.out.println("Local website"); break;}
          case(".org") -> {System.out.println("Organization website"); break;}
          case(".net") -> {System.out.println("Network website"); break;}
          }
                
          
          
    }}
    

