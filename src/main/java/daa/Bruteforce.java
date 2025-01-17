package daa;

public class Bruteforce {
    private int brutefroce(String pat, String str) {

        for (int pos = 0; pos <= str.length() - pat.length(); pos++) {
            String cand = str.substring(pos, pos + pat.length()); // Try to match this...

            if (pat.equals(cand)) {
                System.out.println("Found pattern at posistion: " + pos); // Found
                return pos;
            }
        }
        return -1;
    }

    static long matchStringTime(String pattern, String text) {

        long startTime = System.nanoTime();
		long index = new Bruteforce().brutefroce(pattern, text);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("Bruteforce (ns): " + totalTime);
		System.out.println("Found at " + index);
        return totalTime;
    }
}
