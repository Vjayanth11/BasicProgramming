package logicalproblems;
public class ReverseNumber {
    public static boolean isReversible(int num){
        String number = String.valueOf(num);
        String num1 = "";
        String num2  = "";
        for(int i=0; i<number.length(); i++){
            char ch = number.charAt(i);
            num1 = num1+ch;
        }
         for(int i=0; i<number.length(); i++){
            char ch = number.charAt(i);
            num2 = ch+num2;
        }
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum=number1+number2;
return (sum%2==1)?true:false;
    }
    public static void main(String[] args) {
        int num = 36;
        if(isReversible(num)){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
    
}
