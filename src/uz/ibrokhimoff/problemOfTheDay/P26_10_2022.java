package uz.ibrokhimoff.problemOfTheDay;

import java.util.Objects;

public class P26_10_2022 {
    public static void main(String[] args) {

    }
    static int minFind(int n, String a[]){
        int b=0,g=0,r=0;
        for (int i = 0; i < n; i++) {
            if (Objects.equals(a[i], "B")){
                b++;
            } else if (Objects.equals(a[i], "G")) {
                g++;
            }else {
                r++;
            }
        }
        for (int i = 0; i < n; i++) {

        }


        return n;
    }
}
