/**
 * Created by Administrator on 2016/5/16.
 */
public class containMostWater {


    public static void main(String args[])
    {
        int max;
        containMostWater water = new containMostWater();
        int arr[] ={1,2,3,9,8,6,5,1};

        max = water.maxArea(arr);
        System.out.print(max);
//        System.out.println(1);

    }
//
//    int maxArea(int[] height) {
//
//        int min;
//        int max = 0;
//        int tmp = 0;
//        int pre = 0 ;
//        int after = 1;
//        int length = height.length;
//
//        while(pre<length-1) {
//            while (after < length) {
////                System.out.println(after);
//                min= Math.min(height[pre],height[after]);
//                tmp = min*(after-pre);
//                if(tmp > max)
//                {
//                    max = tmp;
//                }
//                after++;
//            }
//            pre++;
//            after =1;
//        }
//
//        return  max;
//
//    }
    int maxArea(int[] height)
    {
        int pre = 0;
        int tmp= 0;
        int max = 0;
        int after = height.length-1;
        while(pre<after)
            {
                tmp = (after-pre)*Math.min(height[pre],height[after]);
                max = (tmp>max)? tmp:max;
                if(height[pre]<height[after])
                    {
                        pre++;
                    }else {
                    after--;
                }
            }
        return max;
    }
}
