package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.regex.Pattern;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonObject myRequest = request.getAsJsonObject();
        JsonElement potelement = myRequest.get("pot");
        int pot = potelement.getAsInt();

        JsonElement listElement = myRequest.get("players");

        JsonArray myPlayers = listElement.getAsJsonArray();

        JsonElement inedxelement = myRequest.get("in_action");


        JsonArray myHand = myPlayers.get(inedxelement.getAsInt()).getAsJsonObject().get("hole_cards").getAsJsonArray();



        if(myHand.get(0).getAsJsonObject().get("rank").getAsString().equals(myHand.get(1).getAsJsonObject().get("rank").getAsString())  ) {
            return 1000;
        } else {
            int erste = 0;
            try {
                erste = Integer.getInteger(myHand.get(0).getAsJsonObject().get("rank").getAsString());
            } catch (Exception e) {
                e.printStackTrace();
            }

            int zweite = 0;
            try {
                zweite = Integer.getInteger(myHand.get(1).getAsJsonObject().get("rank").getAsString());
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(erste == 0 || zweite == 0) {
                return 50;
            }

        }

/**
 if(pot > 7) {
 return 500;
 } else {
 return 0;
 }
 */


    }

    public static void showdown(JsonElement game) {

    }

    //Kommentar
}
