package com.hockey.api;

import java.net.MalformedURLException;

import static com.hockey.api.GetPlayer.getPlayer;
import static com.hockey.api.HttpCallOne.httpCallOne;
import static com.hockey.api.HttpCallTwo.httpCallTwo;
import static com.hockey.api.Parse.*;

//Bruins team id is 6

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        String playerName = getPlayer();
        getTeamRosters(playerName);
//        httpCallOne("https://statsapi.web.nhl.com/api/v1/teams/8/roster");
//        httpCallOne("https://records.nhl.com/site/api/player/byTeam/34");
//        String teamIdData = httpCallOne("https://statsapi.web.nhl.com/api/v1/teams");
//        getTeamIds(teamIdData);
//        httpCallTwo();
    }
}
