package com.hockey.api;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import static com.hockey.api.HttpCallOne.httpCallOne;

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

    public static int findPlayer(String playersName) throws MalformedURLException {

        for(int i = 1; i <= 31; i++){
//            JSONObject team = new JSONObject("https://statsapi.web.nhl.com/api/v1/teams/" + i + "/roster");
//            System.out.println(team);
            httpCallOne("https://statsapi.web.nhl.com/api/v1/teams/" + i + "/roster");
        }
        httpCallOne("https://statsapi.web.nhl.com/api/v1/teams/52/roster");
        httpCallOne("https://statsapi.web.nhl.com/api/v1/teams/53/roster");
        httpCallOne("https://statsapi.web.nhl.com/api/v1/teams/54/roster");

        return 1;
    }

//    public static List getTeamIds(String responseBody) throws MalformedURLException {
//        List<Integer> teamIds = new ArrayList<>();
//        httpCallOne("https://statsapi.web.nhl.com/api/v1/teams");
//
//
//
//        return teamIds;
//    }
}
