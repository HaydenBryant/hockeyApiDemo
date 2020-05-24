package com.hockey.api;

import org.json.JSONArray;
import org.json.JSONObject;

public class Parse {
    public static String parsePlayer(String responseBody){
        JSONObject playerData = new JSONObject(responseBody);
//        JSONArray player = playerData.getJSONArray("people");
        JSONObject playersData = playerData.getJSONArray("people").getJSONObject(0);


//        String playerName = playersData.getString("fullName");
//        for(int i = 0; i < player.length(); i++){
//            System.out.println();
//        }
        System.out.println(playersData.getString("fullName"));
        return null;
    }

    public static int findPlayer(String playersName){

        for(int i = 1; i <= 31; i++){
            JSONObject team = new JSONObject("https://statsapi.web.nhl.com/api/v1/teams/" + i);
            System.out.println(team);
        }

        return 1;
    }
}
