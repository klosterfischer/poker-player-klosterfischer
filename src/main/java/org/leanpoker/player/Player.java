package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        return current_buy_in - players[in_action][bet] + minimum_raise + 100;
    }

    public static void showdown(JsonElement game) {

    }

    //Kommentar
}
