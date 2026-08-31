package Lecture_23;

import java.util.HashMap;

public class FIndItineraryFromTickets {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String startingPt = getStart(tickets);
        System.out.print(startingPt);

        while (tickets.containsKey(startingPt)) {
            System.out.print(" -> " + tickets.get(startingPt));
            startingPt = tickets.get(startingPt);
        }
    }
}
