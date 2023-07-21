import java.util.*;
public class binomialCoefficient {
public static int fact(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f=f*i;
    }
    return f;}
    
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=sc.nextInt();
int nf=fact(n);
int rf=fact(r);
int di=fact((n-r));
System.out.print(nf/(rf*di));

sc.close();
}
}
