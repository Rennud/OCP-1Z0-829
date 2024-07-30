package org.rennud.ocp.book_assessment_test_one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // -------------------------------------------------------
        // 1)
//        final int score1 = 8, score2 = 3;
//        char myScore = 7;
//
//        var goal = switch (myScore) {
//            // There is no yield when if is false
//            default -> {
//                if (10 > score1) yield "unknown";
//            }
//            case score1 -> "great";
//            case 2, 4, 6 -> "good";
//            // Yield is missing here, or code block can be deleted
//            case score2, 0 -> {
//                "bad";
//            }
//        };
//        System.out.println(goal);
        // -------------------------------------------------------
        // 2)
//        int moon = 9, star = 2 + 2 * 3; // 8
//        float sun = star > 10 ? 1 : 3; // 3
//        double jupiter = (sun + moon) - 1.0f; // 11
//        int mars = --moon <= 8 ? 2 : 3; // 2
//        System.out.println(sun + ", " + jupiter + ", " + mars);
        // -------------------------------------------------------
        // 3)
//        List<Integer> data = new ArrayList<>();
//        IntStream.range(0, 100).parallel().forEach(s -> data.add(s));
//        System.out.println(data.size());
        // -------------------------------------------------------
    }
}