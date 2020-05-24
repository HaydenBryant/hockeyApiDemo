package com.hockey.api;

import java.net.MalformedURLException;

import static com.hockey.api.HttpCallOne.httpCallOne;
import static com.hockey.api.HttpCallTwo.httpCallTwo;
import static com.hockey.api.Parse.findPlayer;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        findPlayer("Patrice Bergeron");
//        httpCallOne("https://statsapi.web.nhl.com/api/v1/people/8476459");
//        httpCallTwo();
    }
}
