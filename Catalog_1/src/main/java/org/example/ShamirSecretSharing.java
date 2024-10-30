package org.example;

import org.json.JSONObject;

public class ShamirSecretSharing {

    // Method to find and print the constant term from the JSON
    public void findConstantTerm(JSONObject jsonObject) {
        if (!jsonObject.has("keys")) {
            System.err.println("Error: 'keys' not found in the JSON object.");
            return;
        }

        // Extract "n" and "k" from the "keys" object
        JSONObject keys = jsonObject.getJSONObject("keys");
        int n = keys.getInt("n");
        int k = keys.getInt("k");

        System.out.println("n = " + n + ", k = " + k);

        // Process other entries in the JSON
        for (String key : jsonObject.keySet()) {
            if (!key.equals("keys")) {
                JSONObject entry = jsonObject.getJSONObject(key);
                String base = entry.getString("base");
                String value = entry.getString("value");

                System.out.printf("Entry %s: base = %s, value = %s%n", key, base, value);
            }
        }
    }
}
