import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }
        if(rowIndex==1){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            return list;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        while(rowIndex>1){
            int i=0;
            int j=1;
            ArrayList<Integer> a=new ArrayList<>();
            while(j<arr.size()){
                a.add(arr.get(i)+arr.get(j));
                i++;
                j++;
            }
            for(int k=0;k<a.size();k++){
                arr.set(k+1,a.get(k));
            }
            arr.add(1);
            rowIndex--;
        }
        return arr;
    }
}