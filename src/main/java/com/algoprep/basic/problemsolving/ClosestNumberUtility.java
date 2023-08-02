package com.algoprep.basic.problemsolving;

public class ClosestNumberUtility {

    public static int findClosestNumber(int n, int m) {
        int closenumber = 0,biggestnumber, smallestnumber;
        if (n < m) {
            biggestnumber = m;
            smallestnumber = n;
        }
        else {
            biggestnumber = n;
            smallestnumber = m;

        }
            for (int i = 1; i < smallestnumber; i++) {
                if ((n * i) < biggestnumber) {
                    closenumber = n * i;
                }
            }
        return closenumber;
    }
}

