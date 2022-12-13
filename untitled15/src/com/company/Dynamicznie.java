package com.company;

public class Dynamicznie {

    public static void main(String[] args) {
        plecak();

    }
    // plecak dynamiczny//
    public static void plecak(){
        final int[] objetosci = {6, 2, 3, 2, 3, 1};
        final int[] wartosci = {6, 4, 5, 7, 10, 2};
        final int MAX = 10;
        final int przedmioty = objetosci.length;
        int[][] tab = new int[przedmioty][MAX+1];

        for (int i=0;i<przedmioty;i++) {
            for (int v = 0; v <=MAX; v++) {
                if (i==0 && objetosci[i]> v) tab[i][v]=0;
                else if (i==0 && objetosci[i]<= v) tab[i][v] = wartosci[i];
                else if (i>0 && objetosci[i]> v) tab[i][v] = tab[i-1][v];
                else if (i>0 && objetosci[i]<= v) tab[i][v] = Math.max(tab[i - 1][v], wartosci[i] + tab[i - 1][v - objetosci[i]]);
            }
        }
// siurak haha cycuszki mmmmmm
        System.out.println(tab[przedmioty-1][MAX]);
    }



}
