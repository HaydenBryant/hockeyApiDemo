package com.hockey.api;

import org.json.JSONArray;
import org.json.JSONObject;

public class Parse {
    public static String parse(String responseBody){
        JSONObject playerData = new JSONObject(responseBody);
        JSONArray player = new JSONArray(playerData.getString("people"));

        String playerName = playerData.getString("fullName");
//        for(int i = 0; i < player.length(); i++){
//            System.out.println();
//        }
        System.out.println(playerName);
        return null;
    }
}
