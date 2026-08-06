class Solution {
    public int[] replaceElements(int[] arr) {
        int[] a=new int[arr.length];
        a[arr.length-1]=-1;
        int i=arr.length-2;
        int maxi=arr[arr.length-1];
        while(i>=0){
            a[i]=maxi;
            if(arr[i]>maxi){
                maxi=arr[i];
            }
            i--;
        }
        return a;
    }
}