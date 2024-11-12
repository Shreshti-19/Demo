import java.util.*;
public class function {
    public static int giveSumTwoNum(int a,int b){//6 the function is called
        int sum=a+b;//6
        return sum;//7
    }
    public static void main(String[] args) {//1 the main function is called first
        Scanner sc=new Scanner(System.in);//2
        int a =sc.nextInt();//3
        int b=sc.nextInt();//4
        
        int sum=giveSumTwoNum(a, b);//5 calls the function... therefore the sum is returned in it's variable name after line //7
        System.out.println(sum);//7 prints it
        
    }
}
