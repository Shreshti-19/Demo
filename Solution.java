import java.util.Scanner;
class Solution {
    public int reverse(int x) {
        if(x==0){
            return 0;
        }
        int result=x.length();
        for(int i=result;i>=0;i--){
            int rev=[i];
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        rev=reverse(x);
        System.out.println(x);
    }
}
