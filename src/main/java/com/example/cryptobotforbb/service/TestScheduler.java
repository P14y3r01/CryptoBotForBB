package com.example.cryptobotforbb.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

import static com.example.cryptobotforbb.CryptoBotForBbApplication.logger;

@Component
@Service
@RequiredArgsConstructor
@Slf4j
@EnableScheduling
public class TestScheduler {
    @Scheduled(fixedRateString = "PT02S")
    public void testDeployFunction() {
        logger.info("Current time is " + OffsetDateTime.now());
    }
}
