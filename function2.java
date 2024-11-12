import java.util.*;
public class function2 {
    public static float  calculatePro(float a,float b){
        float mul=a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();

        float mul=calculatePro(a, b);
        System.out.println(mul);

    }
}
