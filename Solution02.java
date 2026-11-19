package src.ArrayBasics;

public class Solution02 {
    public static void main(String[] args) {
        long result=seriesSum(5);
        System.out.println(result);
    }
    public static long seriesSum(int n)
    {
        //use formula (n*n(n+1))/2
        long sum=((long)n*(n+1))/2;
        return sum;
    }
}
