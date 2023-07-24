import java.util.*;
public class SumEvSumOdd {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sume=0,sumo=0;
    for(int i=1;i<=n;i++){
        if(i%2==0){
            sume+=i;
        }
        else{
            sumo+=i;
        }}
        System.out.print(sume+"\n"+sumo);
    
sc.close();
}
}