// print the sum of first n natural number
import java.util.*;
public class loop_practise {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        int mul=1;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number till u want ur sum");
        int n=sc.nextInt();
        // for(int i=0;i<=n;i++){
        //     sum=sum+i;
            
        // }
        // System.out.println(sum);
        // while(i <= n){
        //     sum=sum+i;
        //     System.out.println(sum);
        //     i++;
        // }
        // do { 
        //     sum=sum+i;
        //     System.out.println(sum);
        //     i++;
        // } while (i<=n);
        for(i=1;i<=10;i++){
            mul = n*i;
            System.out.println(n + "*"+ i +"=" +mul);
        }
        
    }
}
