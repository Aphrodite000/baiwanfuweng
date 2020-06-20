public class Solution {
    public static void main(String[] args){
        //注意定义为long类型
        long sumRich=10*30;
        long sumStranger=0;
        for(int i=1;i<=30;i++){
            // sumRich+=10;
            sumStranger=sumStranger+(long)Math.pow(2,i-1);
        }
        System.out.print(sumRich+" "+sumStranger);
    }
}
