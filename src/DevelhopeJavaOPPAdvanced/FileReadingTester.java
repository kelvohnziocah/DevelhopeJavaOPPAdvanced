package DevelhopeJavaOPPAdvanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadingTester {
    public static void main(String[] args) {
        String fileName = "src/DevelhopeJavaOPPAdvanced/text.txt";

        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
