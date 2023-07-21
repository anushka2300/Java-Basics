import java.util.*;
public class CheckEquality {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c,d;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
if(a==b && b==c && c==d){
    System.out.print("YES");
}
else{
    System.out.print("NO");
}

sc.close();
}
}