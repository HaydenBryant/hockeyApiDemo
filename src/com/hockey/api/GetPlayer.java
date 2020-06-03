package com.hockey.api;

import java.util.Scanner;

public class GetPlayer {
    public static String getPlayer(){
        System.out.println("What player are you looking for: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        return s;
    }
}
