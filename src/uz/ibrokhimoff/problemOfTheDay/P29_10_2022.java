package uz.ibrokhimoff.problemOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P29_10_2022 {
    public static void main(String[] args) {

        System.out.println(displayContacts(10,new String[]{"abznehvggnuadsko"," abdnhtuydwvvh "," abqljekyiuvqajk "," abocnecsrlmnkp"," abhmtxfejjrhtldl"," abovqcafic"," abzqmnabyjprhuwqfnz"," abaclpshgwjnenlgdxtfa"," abpqjymhouwpswuelmntjy"," abpluvrsow"},"aboikd"));
    }


    //Solution 1 sal yemagan versiyasi kechga qarab chiqaman yana
    static ArrayList<ArrayList<String>> displayContacts(int n,
                                                        String contact[], String s) {
        ArrayList<ArrayList<String>> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int t = 0;
            ArrayList<String> b = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (s.substring(0, i).equals(contact[j].substring(0, i))) {
                    b.add(contact[j]);
                } else {
                    t++;
                }
            }
            if (t == n) {
                b.add("0");
            }
            a.add(b);
        }
        return a;
    }

    //Solution2 discussion evaziga paydo bulgan yechim
    static ArrayList<ArrayList<String>> displayContacts2(int n,String contact[], String s){

        Arrays.sort(contact);
        ArrayList<ArrayList<String>>a=new ArrayList<ArrayList<String>>();

        for(int i=1;i<=s.length();i++){

            ArrayList<String>aa=new ArrayList<String>();

            String p=s.substring(0,i);

            int v=0;

            for(String j: contact){

                if(j.contains(p) && !aa.contains(j)){

                    aa.add(j);

                    v=1;

                }
            }

            if(v==1){

                v=0;

                Collections.sort(aa);

                a.add(aa);

            }

            else{

                aa.add("0");

                a.add(aa);

            }

        }return a;}}
