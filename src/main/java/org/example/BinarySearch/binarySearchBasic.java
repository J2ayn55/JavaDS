package org.example.BinarySearch;

/**
 * 二分查找
 */
public class binarySearchBasic {


    /**
     * basic
     * @param a
     * @param target
     * @return
     */
    public static int binarySearch(int[] a,int target){
        int i=0,j=a.length-1;
        //问题：元素在最左边要比较L次 ，元素在最右边要比较2L次
        while (i<=j){
            int m=(i+j)>>>1;
            if(target<a[m])
                j=m-1;
            else if (a[m]<target)
                i=m+1;
            else
                return m;

        }
        return -1;
    }

    /**
     * 改进比较次数
     * @param args
     */
    public static int binarySearch2(int[] a,int target){
        int i=0,j=a.length;
        while (1<j-i){
            int m=(i+j)>>>1;
            if(target< a[m])
                j=m;
            else
                i=m;
        }
        if(a[i]==target)
            return i;
        else
            return -1;

    }




    public static void main(String[] args) {
        int[] a={1,5,7,8,12};
        int i1 = binarySearch(a, 5);
        System.out.println(i1);
        int i2 = binarySearch2(a, 5);
        System.out.println(i2);
    }

}
