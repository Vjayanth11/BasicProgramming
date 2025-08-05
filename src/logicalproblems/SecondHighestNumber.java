package logicalproblems;
public class SecondHighestNumber {
    public static int isHighest(int [] ar){
        int max=0;
        int secMax=0;
        for(int i=0; i<ar.length; i++){
            if(ar[i]>max){
                secMax=max;
                max=ar[i];
            }
            if(ar[i]<max&&ar[i]>secMax){
                secMax = ar[i];
            }
        }
return secMax;
    }
    public static void main(String[] args) {
        int [] res = {1,2,4,5,6,7};
        int result = isHighest(res);
        System.out.println(result);
    }
    
}
