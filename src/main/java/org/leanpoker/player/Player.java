package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";
    private static JsonObject myRequest;

    public static int betRequest(JsonElement request) {
        for (Map.Entry<String, JsonElement> entry : request.getAsJsonObject().entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        return 1000;

    }

    public static void showdown(JsonElement game) {

    }

    //Kommentar
}
