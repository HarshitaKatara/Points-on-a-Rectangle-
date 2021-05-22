import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int u=0;u<q;u++) {
            int n = in.nextInt();
            boolean flag = false;
            int a[][] = new int[n][2];
            for(int i=0;i<n;i++) {
                a[i][0] = in.nextInt();
                a[i][1] = in.nextInt();
            }
            int minx = a[0][0];
            int miny = a[0][1];
            int maxx = a[0][0];
            int maxy = a[0][1];
            for(int i=0;i<n;i++) {
                if(minx > a[i][0])
                    minx = a[i][0];
                if(miny > a[i][1])
                    miny = a[i][1];
                if(maxx < a[i][0])
                    maxx = a[i][0];
                if(maxy < a[i][1])
                    maxy = a[i][1];
            }
            for(int i=0;i<n;i++) {
                if(a[i][0] == minx || a[i][0] == maxx) {
                    flag = true;
                }
                else if(a[i][1] == maxy || a[i][1] == miny) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
