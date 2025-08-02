class Solution {
    public boolean isHappy(int n) {
        int div=0;
        while(n>9)
        {
            int num=n;
            div=0;
            while(num>=0)
            {
                int mod=num%10;
                div=div+mod*mod;
                num=num/10;
            }
            n=div;
        }
        if(div==1 || n==1 || n==7){
            return true;
        }
        else{
            return false;
        }
    }
}
