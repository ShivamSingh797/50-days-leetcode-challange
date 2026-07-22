public class solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int half=num/2;
        for(int i=1;i<=half;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            return true;
        }
        return false;
    }
}
