package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonObject myRequest = request.getAsJsonObject();
        JsonElement potelement = myRequest.get("pot");
        int pot = potelement.getAsInt();

        //JsonElement listElement = myRequest.get("players");

        //Array myPlayers = listElement.
/**
        if(pot > 7) {
            return 500;
        } else {
            return 0;
        }
*/
    return 354;

    }

    public static void showdown(JsonElement game) {

    }

    //Kommentar
}
