package org.example;

import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(
                    Paths.get("src/main/resources/test/testcase1.json")
            ));
            JSONObject jsonObject = new JSONObject(content);

            // Create an instance of ShamirSecretSharing and call the method
            ShamirSecretSharing sss = new ShamirSecretSharing();
            sss.findConstantTerm(jsonObject);

        } catch (IOException e) {
            System.err.println("Error reading the JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
