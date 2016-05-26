import java.util.*;

/**
 * Created by Administrator on 2016/5/24.
 */
public class threeSum {

    public static void main(String args[]){
        threeSum nn =new threeSum();
        int[] sum ={0,0,1};
        System.out.print(nn.ThreeSum(sum));
    }
    public List<List<Integer>>ThreeSum(int[] sum){

        final int length = sum.length;
        int i,j,k,tmp;

        Arrays.sort(sum);

        List<List<Integer>> ThreeSumList = new ArrayList<List<Integer>>();
        if(length<3)
            return ThreeSumList;
        Hashtable<Integer,Integer> TwoSum= new Hashtable<Integer,Integer>();
        for(i=0;i<sum.length;i++)
        {
            tmp = 0-sum[i];
            TwoSum.clear();
            for(j=i+1;j<sum.length;j++)
                TwoSum.put(tmp-sum[j],j);
            k = i+2;
            while(k<sum.length){
                if(TwoSum.containsKey(sum[k])&&(TwoSum.get(sum[k])!=k))
                {
                    List <Integer> temp = new ArrayList<Integer>();
                    temp.add(sum[i]);
                    temp.add(sum[k]);
                    temp.add(sum[TwoSum.get(sum[k])]);
                    if(ThreeSumList.contains(temp))
                        break;
                    ThreeSumList.add(temp);
                }
                k++;
            }
        }
    return ThreeSumList;
    }

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        final int length = num.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, int[]> hashMap = new HashMap<Integer, int[]>();

        // if length is less than 3, return empty result set
        if (length < 3) return result;

        Arrays.sort(num);

        for (int i = 0; i < length - 2; i++) {
            if (num[i] > 0) break;
            hashMap.clear();

            if (i == 0 || num[i] > num[i - 1]) {
                for (int j = i + 1; j < length; j++) {
                    if (hashMap.containsKey(num[j])) { // found target
                        ArrayList<Integer> elem = new ArrayList<Integer>(3);

                        elem.add(hashMap.get(num[j])[0]);
                        elem.add(hashMap.get(num[j])[1]);
                        elem.add(num[j]);

                        result.add(elem);

                        // remove duplicated elements
                        while (j < (length - 1) && num[j] == num[j + 1]) j++;
                    } else {
                        int[] temp = new int[2];
                        temp[0] = num[i];
                        temp[1] = num[j];
                        hashMap.put(0 - (num[i] + num[j]), temp);
                    }
                }
            }
        }
        return result;
    }
}
