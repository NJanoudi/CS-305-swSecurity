package com.snhu.sslserver;

import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@RestController
class ServerController {

    @RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException {
        String firstName = "Nawras";
        String lastName = "Janoudi";
        String data = "Hello " + firstName + " " + lastName + "!";

        String hash = calculateSHA256Hash(data);

        return "<p>Data: " + data + "</p><p>SHA-256 Hash (Base64): " + hash + "</p>";
    }

    private String calculateSHA256Hash(String data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(data.getBytes());

        // Encode to Base64
        return Base64.getEncoder().encodeToString(hashBytes);

    }
}