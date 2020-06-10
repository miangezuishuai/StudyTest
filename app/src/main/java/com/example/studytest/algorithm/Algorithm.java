package com.example.studytest.algorithm;

import android.util.Log;

public class Algorithm {

    private static Algorithm algorithm;

    private Algorithm() {

    }

    public static Algorithm getInstance() {
        if (algorithm == null) {
            algorithm = new Algorithm();
        }
        return algorithm;
    }


    /****单例模式到此结束，以下是正文***/


    /**
     * 冒泡排序
     * 排序结果稳定，缺点是时间效率不高
     */
    public void bubbleSort() {
        int[] array = new int[]{63,4,24,1,3,13};
        Log.d("冒泡排序开始", "");
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                //2元素交换
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        Log.d("冒泡排序结束", ""+array[0]+","+array[1]+","+array[2]+","+array[3]+","+array[4]+","+array[5]);

    }

    /**
     * 二分查找
     * @param index 要查找的值
     * @param a 查找的数组
     *  优点，查找效率高,最多查找log(2)N次
     *  缺点，有序排列
     */
    public int binarySearch(int index,int a[]) {
        int left = 0;
        int right = a.length-1;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;
            if (index == a[mid]) {
                return mid;
            }
            if (index < a[mid]) {
                right = mid - 1;
            } else left = mid + 1;
        }
        return -1;
    }
}
