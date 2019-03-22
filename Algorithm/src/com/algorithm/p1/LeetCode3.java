package com.algorithm.p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int maxlength = 0;
        ArrayList<Character> ret = new ArrayList();
        int size = 0;
        Character[] tmp=new Character[arr.length];
        for(int i=0;i<arr.length;i++){
            int index=getIndex(tmp,arr[i]);
            if (index<0 ) {
                size ++;
            }
            if (index>=0 || i == arr.length-1){

                if (size >maxlength){
                    maxlength =size;
                }
                size = i - index;
                initPartArray(tmp,index);
            }

            tmp[i] = arr[i];

        }
        return maxlength;

    }

    private void printChar(Character[]  crs){
        for (int i =0 ;i<crs.length ;i++) {
            if (crs[i]!=null) {
                System.out.print(crs[i]);
            }
        }
        System.out.println();
    }
    private void initPartArray(Character[] arr,int index){
        for (int i = 0; i < index+1; i++) {
            arr[i] = null;
        }
    }
    private int getIndex(Character[] crs,char cr){
        for (int i = 0; i < crs.length; i++) {
            if ( crs[i] != null && cr == crs[i]){
                return i;
            }
        }
        return -1;
    }
}
