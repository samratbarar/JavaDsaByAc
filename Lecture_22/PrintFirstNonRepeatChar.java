package Lecture_22;

import java.util.*;

// Print all non repeating letter in a stream of characters.
// all letter are consider in lowercase

public class PrintFirstNonRepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Character> q = new LinkedList<>();

        System.out.println("Enter the letter stream");
        String letters = sc.nextLine();

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            boolean isNonRep = true;

            for (int j = 0; j < i; j++) {
                if (letters.charAt(j) == letter) {
                    isNonRep = false;
                    break;
                }
            }

            if (isNonRep) {
                q.add(letter);
            }

            if (q.isEmpty()) {
                System.out.println("-1");
                continue;
            } else {
                if (letter == q.peek()) {
                    q.remove();
                }

                if (q.isEmpty()) {
                    System.out.println("-1");
                    continue;
                } else {
                    for (int j = 0; j < i; j++) {
                        if (q.isEmpty()) {
                            break;
                        }

                        if (letters.charAt(j) == q.peek()) {
                            q.remove();
                            j = -1;
                        }
                    }
                }
            }

            if (q.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(q.peek());
            }
        }
    }
}
