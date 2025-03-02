package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) throws NoSuchAlgorithmException{
		SpringApplication.run(SslServerApplication.class, args);
		
	}

}