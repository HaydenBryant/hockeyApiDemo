package com.hockey.api;

import java.net.MalformedURLException;

import static com.hockey.api.HttpCallOne.httpCallOne;
import static com.hockey.api.HttpCallTwo.httpCallTwo;
import static com.hockey.api.Parse.findPlayer;
import static com.hockey.api.Parse.getTeamIds;

//Bruins team id is 6

public class Main {

    public static void main(String[] args) throws MalformedURLException {
//        findPlayer("Patrice Bergeron");
//        httpCallOne("https://statsapi.web.nhl.com/api/v1/teams/28/roster");
//        httpCallOne("https://records.nhl.com/site/api/player/byTeam/34");
        String teamIdData = httpCallOne("https://statsapi.web.nhl.com/api/v1/teams");
        getTeamIds(teamIdData);
//        httpCallTwo();
    }
}
