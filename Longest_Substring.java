/**
 * Created by Administrator on 2016/5/9.
 */
public class Longest_Substring {
    String str = new String();
    public static void main(String args[]){
        String S = new String();
        Longest_Substring ss = new Longest_Substring();
        String s = "abbccc";
        S = ss.longestPalindrome(s);
        System.out.print(S);
    }

//    public String longestPalindrome(String s) {
//        int start = 0, end = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int len1 = expandAroundCenter(s, i, i);  //针对于 aba类型的字符串
//            int len2 = expandAroundCenter(s, i, i + 1); //针对于 abba类型的字符串
//
//            int len = Math.max(len1, len2);
//            if (len > end - start) {
//
//                start = i - (len - 1) / 2;
//                end = i + len / 2;
//            }
//        }
//        return s.substring(start, end + 1);
//    }
//
//    private int expandAroundCenter(String s, int left, int right) {
//        int L = left, R = right;  //中心算法，直接找中心点的对称来解决问题
//        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
//            L--;
//            R++;
//        }
//        return R - L - 1;
//    }

    String longestPalindrome(String s) {

        String S =Reverse(s);
        int i= 0;
        int j = 0;
        int tmp = 0;
        int local = 0;
        int count = 0;
        int temp = 0 ;
        String max = new String();
        int length = s.length();
        char arr[] = s.toCharArray();
        char arr1[] = S.toCharArray();
        while(i<length)
        {
            local =i;
            while(j<length)
            {
                tmp = j;
                temp = 0;
                while((i<length)&&(j<length)&&arr[i]==arr1[j]) //arr[i]==arr1[j]的判断放在前面的话，i,j会越界
                {
                    i++;
                    j++;
                    temp++;
                }
                if(temp>count)
                {
                    count = temp;
                    max = S.substring(tmp,j);
                }
                i = local;
                j = tmp;
                j++;
            }
            j = 0;      // 内循环结束，需要进行初始化
            i = local;
            i++;
        }

        System.out.println(count);
        return max;
    }

    String Reverse(String s){

        char arr[] = s.toCharArray();

        int j = arr.length;
        for( int i=0;i<j;j--,i++)
        {
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-i-1] = temp;
        }
        return new String(arr);    // 这里必须要用 new String(arr),不能用toString

    }

}


