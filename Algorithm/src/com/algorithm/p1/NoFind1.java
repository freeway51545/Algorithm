package com.algorithm.p1;

import java.util.ArrayList;
import java.util.List;

/**
 * 最长公共子序列
 */
public class NoFind1 {
    public static void main(String args[]){
        int[] arr1 = {1,5,7,8,9};
        int[] arr2 = {7,8,9,1,5};
        NoFind1 nf = new NoFind1();
        nf.printLst(nf.findLongestSqe(arr1,arr2));
    }

    public List<List> findLongestSqe(int[] arr1,int[] arr2){
        int longestlen = 0;
        List lst =new ArrayList();
        int tep = -1;
        for (int i = 0; i < arr1.length; i++) {
            List tmp =new ArrayList();
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    if (tep == -1){
                        tep = i;
                    }
                    tmp.add(arr1[i]);
                    i++;
                    if (i == arr1.length){

                        break;
                    }

                }
            }
            if (tep != -1) {
                i = tep;
                tep = -1;
            }
            lst.add(tmp);
        }
        return lst;
    }

    private  void printLst(List<List> lst){
        for (List fir: lst) {
            for (Object tt:fir) {
                System.out.print(tt);
            }
            System.out.println();
        }
    }
}
