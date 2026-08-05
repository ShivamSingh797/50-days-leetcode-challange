import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.empty() && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            if(s.empty()){
                arr[i]=0;
            }else{
                arr[i]=s.peek()-i;
            }
            s.push(i);
        }
        return arr;
    }
}