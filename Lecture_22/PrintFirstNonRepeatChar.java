package Lecture_22;

import java.util.*;

// Print all non repeating letter in a stream of characters.
// all letter are consider in lowercase

public class PrintFirstNonRepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Character> q = new LinkedList<>();
        int[] occurence = new int[26];

        System.out.println("Enter the letter stream");
        String letters = sc.nextLine();

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            
            if (occurence[letter - 'a'] == 0) {
                q.add(letter);
            }
            
            occurence[letter - 'a']++;
            
            if (q.isEmpty()) {
                    System.out.println("-1");
                } else {
                    while (!q.isEmpty() && occurence[q.peek()] > 1) {
                        q.remove();
                    }

                    if (q.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(q.peek());
                    }
                }
        }
    }
}
