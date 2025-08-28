class Solution {
    public boolean isAnagram(String s, String t) {
        int a=s.length();
        int b=t.length();
        if(a != b)
        {
            return false;
        }
        int[] arr=new int[26];
        for(int i=0;i<a;i++)
        {
            arr[t.charAt(i) - 'a']++;
            arr[s.charAt(i) - 'a']--;
        }
        for(int count:arr)
        {
            if(count != 0)
            {
                return false;
            }
        }
        return true;
    }
}
