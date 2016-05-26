import java.util.ArrayList;

import java.lang.String;
/**
 * Created by Administrator on 2016/5/17.
 */
public class common_prefix {


    public static void main(String[] args) {

        common_prefix nn = new common_prefix();
        String[] str = new String[3];
        str[0] = "aas";
        str[1] = "adc";
        str[2] = "afaf";
//      String[] str = new String[0];
        System.out.print(nn.longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
//    public String longestCommonPrefix(String[] str)
//    {
//        if(str.length==0)
//            return "";
//        String prefix = str[0];
//        for(int i=1; i<str.length;++i)
//        {
//            while(str[i].indexOf(prefix) !=0 )             //使用不断的减少prefix的长度来收敛。str[i].substring(0,prefix.length()-1)

//            {
//                prefix = str[i].substring(0,prefix.length()-1);
//                if(prefix.isEmpty()) return "";
//            }
//        }
//        return prefix;
//    }

//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//        for (int i = 0; i < strs[0].length() ; i++){
//            char c = strs[0].charAt(i);   //当前的字符的内容,将str[0].chatAt[0]，str[1].chatAt[0],str[i].chatAt[0]中比较,相同的话向后
//            for (int j = 1; j < strs.length; j ++) {
//                if (i == strs[j].length() || strs[j].charAt(i) != c)
//                    return strs[0].substring(0, i);
//            }
//        }
//        return strs[0];
//    }

//    public String longestCommonPrefix(String[] str) {
//        char c;
//
//        if (str == null || str.length == 0) return "";
//            for (int i = 0; i < str[0].length(); i++) {
//                c = str[0].charAt(i);
//                for (int j = 1; j < str.length; j++) {
//                    if (str[j].charAt(i) != c || str[j].length()==i)
//                        return str[0].substring(0,i);
//                }
//            }
//        return str[0];
//    }
}



//    String longestCommonPrefix(String[] str) {
//        int count = 0;
//        int i = 0;
//        if(str.length==0)
//        {
//            return "";
//        }
//        while (count<str.length)
//        {if(str[count].length()==0)
//            {
//                return "";
//            }
//            count++;
//        }
//
//        count = 0;
//        String prefix = str[0];
//        char arr[] = prefix.toCharArray();                  //基础数组
//
//        char tmp[] = null;
//        for(count=1;count<str.length;count++)             //一般情况下都是 <length-1
//        {
//            for(i=0;i<Math.min(prefix.length(),str[count].toCharArray().length);i++)
//            {
//                if(arr[i]!=str[count].toCharArray()[i])
//                {
//                    if(i==0){
//                        return "";
//                    }
//                    arr = str[count].substring(0,i).toCharArray();
//                }
//                arr = str[count].substring(0,i).toCharArray();
//            }
//        }
//        return new String(arr);
//    }
//}

