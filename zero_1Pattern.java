import java.util.*;
public class zero_1Pattern {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int j=0;j<n;j++){
    for(int i=0;i<j;i++){
        if((i+j)%2==0){
             System.out.print("0 ");
        }
        else{
            System.out.print("1 ");
        }
    }
    System.out.println();
}

sc.close();
}
}