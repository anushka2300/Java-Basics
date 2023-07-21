import java.util.*;
public class primeRange {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void PrimeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
PrimeRange(n);
sc.close();
}
}