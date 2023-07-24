import java.util.*;
public class sumofNaturalNo {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int j=1;
while(j<=n){
    sum+=j;
    j++;
}
System.out.print(sum);
sc.close();
}
}
