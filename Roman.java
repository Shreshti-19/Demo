public class Roman {
    public int romantoInt(String S){
        int result=0;
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        result=0;
        for(int i=0;i<values.length;i++){
            while(S.indexOf(symbols[i])==0){
                result+=values[i];
                S=S.substring(symbols[i].length());

            }

        }
        return result;
    }
    public static void main(String[] args) {
        Roman roman = new Roman();
        System.out.println(roman.romantoInt("III"));  
        System.out.println(roman.romantoInt("LVIII")); 
        System.out.println(roman.romantoInt("MCMXCIV")); 
    }
}
