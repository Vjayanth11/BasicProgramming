package logicalproblems;
import java.util.HashSet;

public class StringPattern {

    public static String isStringpattern(String s){
        HashSet<Character> hs = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(hs.contains(ch)){
                break;
            }else{
                hs.add(ch);
            }
        }
        String res = s.substring(0, hs.size());
        return res;
    }
    public static void main(String[] args) {
        String rs = "abcabcabcd";
        String result = isStringpattern(rs);
        System.out.println(result);
    }
    
}
