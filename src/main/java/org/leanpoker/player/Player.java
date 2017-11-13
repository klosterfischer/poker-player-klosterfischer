package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";
    private static JsonObject myRequest;

    public static int betRequest(JsonElement request) {
        JsonObject myRequest = request.getAsJasonObject();
        JsonElement potelement = myRequest.get("pot");
        int pot = potelement.getAsInt();

        if(pot >100) {
            return pot * 2;
        } else {
            return 0;
        }



    }

    public static void showdown(JsonElement game) {

    }

    //Kommentar
}
