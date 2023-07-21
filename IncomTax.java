import java.util.*;
public class IncomTax {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enetr income in lakhs:");
    int income=sc.nextInt();
    if(income<5){
        System.out.print("TAX="+0);
    }
    else if(income>=5 && income<10){
        System.out.print("TAX="+income*0.20);
    }
    else{
        System.out.print("Tax="+income*0.30);
    }
    sc.close();
    }
    }

