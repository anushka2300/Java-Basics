import java.util.*;
public class reverseOfNo {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rev=0;
    int n=sc.nextInt();
    while(n>0){
        int a=n%10;
        rev=(rev*10)+a;
        n=n/10;
    }
    System.out.print(rev);

sc.close();
}
}
