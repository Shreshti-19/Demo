import java.util.Scanner;
public class factorial {
    public static int calculateFactorial(int n){
        if(n<0){
            return 0;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
    int fact=calculateFactorial(n);
    System.out.println(fact);
    }
}
