package practice.hackerrank.basic.loops;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        calculateEOF();
    }

    private static void calculateEOF() {
        Scanner scanner = new Scanner(System.in);

        int lineNumber = 0;
        // Read input until the end of file is reached
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Increment the line number
            lineNumber++;
            // Print the line number and the line content
            System.out.println(lineNumber + " " + line);
        }

        scanner.close();
    }
}

