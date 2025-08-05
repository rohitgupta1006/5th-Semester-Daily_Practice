class Solution {
    public boolean squareIsWhite(String coordinates) {
        char n=coordinates.charAt(0);
        char a=coordinates.charAt(1);
        if(n=='a' || n=='c'||n=='e' ||n=='g')
        {
            if(a=='1'||a=='3'||a=='5'||a=='7')
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        if(n=='b' || n=='d'||n=='f' ||n=='h')
        {
            if(a=='1'||a=='3'||a=='5'||a=='7')
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}
