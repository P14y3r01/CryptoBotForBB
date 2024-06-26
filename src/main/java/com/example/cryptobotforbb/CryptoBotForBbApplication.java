package com.example.cryptobotforbb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptoBotForBbApplication {
   public static final Logger logger = LoggerFactory.getLogger(CryptoBotForBbApplication.class);
    public static void main(String[] args) {
        logger.info("Запуск приложения");
        SpringApplication.run(CryptoBotForBbApplication.class, args);
    }
}
