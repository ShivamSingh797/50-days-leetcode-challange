class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int r=0;
        int l=0;
        int maxl=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        while(r<n){
            m.put(fruits[r],m.getOrDefault(fruits[r],0)+1);
            if(m.size()>2){
                if(m.getOrDefault(fruits[l],0)==1){
                    m.remove(fruits[l]);
                }else{
                    m.put(fruits[l], m.get(fruits[l]) - 1);
                }
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}