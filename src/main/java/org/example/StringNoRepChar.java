package org.example;

import java.util.Scanner;

public class StringNoRepChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        boolean isUnique = true;
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < s.length(); j++){
                if(i!=j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        isUnique = false;
                    }
                }
            }
        }
        if(isUnique) {
            System.out.println("is unique");
        } else {
            System.out.println("not unique");
        }
    }

}
