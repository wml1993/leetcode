/**
 * Created by Administrator on 2016/5/26.
 */
import java.util.Stack;

public class Valid {
    public static void main(String args[]){

        String ss =new String("[");
        Valid vali = new Valid();
        System.out.print(vali.isValid(ss));

    }


    boolean isValid(String s){
        int i = 0;
        Stack st = new Stack();
        while(i<s.length()){
            if(st.empty()){
                st.push(s.charAt(i));
                i++;
                continue;
            }
            if((s.charAt(i)=='}')||(s.charAt(i)==']')||(s.charAt(i)==')'))
            {
                if(st.empty())
                    return false;
                if(((char)(st.peek())=='[')&&(s.charAt(i)==']'))
                {
                    st.pop();
                    i++;
                    continue;
                }
                if(((char)st.peek()=='(')&&(s.charAt(i)==')'))
                {
                    st.pop();
                    i++;
                    continue;
                }
                if(((char)st.peek()=='{')&&(s.charAt(i)=='}'))
                {
                    st.pop();
                    i++;
                    continue;
                }
                return false;
            }else{
                st.push(s.charAt(i));
                i++;
                continue;
            }
        }
        if(!st.empty())
            return false;
        return true;
    }
}
