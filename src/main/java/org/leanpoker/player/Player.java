package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        System.out.println( request.toString());
        return 1000;

    }

    public static void showdown(JsonElement game) {

    }

    //Kommentar
}
