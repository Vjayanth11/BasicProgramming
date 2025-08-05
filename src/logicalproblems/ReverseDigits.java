package logicalproblems;
public class ReverseDigits {
    public static String isReverse(String s){
        String rs = "";
        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                rs += ch;
            } else {
                rs += Character.toLowerCase(ch);
            }
        }
        return rs;
    }
    public static void main(String[] args) {
        String s = "a1b2c3d4";
        String result = isReverse(s);
        System.out.println(result);
    }
    
}
