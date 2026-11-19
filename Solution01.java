package src.ArrayBasics;

import java.util.HashSet;

public class Solution01 {
    
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3};
       int result=unionAll(arr1,arr2);
       System.out.println(result);
    }
    public static int unionAll(int arr1[],int arr2[])
    {
        // HashSet stores only distinct elements 
        HashSet<Integer> hs = new HashSet<>();

        //Add elements of first array
        for(int a: arr1)
        {
            hs.add(a);
        }
        for(int b: arr2)
        {
            hs.add(b);
        }
        return hs.size();
    }

}
