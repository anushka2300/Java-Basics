import java.util.*;
public class DecToBin {
    public static void DeciToBin(int n){
        int deci=0,pow=0;
        while(n>0){
            int rem=n%2;
            deci=deci+(rem*(int)(Math.pow(10,pow)));
            pow++;
            n=n/2;
        }
        System.out.print("Decimal form is "+deci);
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
DeciToBin(n);
sc.close();
}
}
