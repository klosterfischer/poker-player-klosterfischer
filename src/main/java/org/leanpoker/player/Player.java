package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
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

        int value = 0;


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
                value = 100;
            } else {
                JsonArray myCommunity = myRequest.get("community_cards").getAsJsonArray();
                String c1 = myCommunity.get(0).getAsJsonObject().get("rank").getAsString();
                String c2 = myCommunity.get(1).getAsJsonObject().get("rank").getAsString();
                String c3 = myCommunity.get(2).getAsJsonObject().get("rank").getAsString();

                List<String> commy = new ArrayList<>();
                commy.add(c1);
                commy.add(c2);
                commy.add(c3);

                String my1 = myHand.get(0).getAsJsonObject().get("rank").getAsString();
                String my2 = myHand.get(1).getAsJsonObject().get("rank").getAsString();

                for(int i=0; i < commy.size(); i++) {
                    if (commy.get(i).equals(my1) || commy.get(i).equals(my2)) {
                        value = 1000;
                    }
                }

            }

        }


    return  value;
    }

    public static void showdown(JsonElement game) {

    }

    //Kommentar
}
