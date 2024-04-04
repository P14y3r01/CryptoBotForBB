package com.example.cryptobotforbb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

@Component
@Configuration
public class KeyboardConfig {
    @Bean
    public ReplyKeyboardMarkup replyKeyboardMarkup() {
        return ReplyKeyboardMarkup.builder()
                .selective(true)
                .resizeKeyboard(true)
                .oneTimeKeyboard(false)
                .build();
    }

    @Bean
    public List<KeyboardRow> keyboardRows() {
        List<KeyboardRow> row = new ArrayList<>();
        row.add(new KeyboardRow(keyboardButtons()));
        return row;
    }

    @Bean
    public List<KeyboardButton> keyboardButtons() {
        List<KeyboardButton> buttons = new ArrayList<>();
        buttons.add(new KeyboardButton("profile"));
        buttons.add(new KeyboardButton("start"));
        return buttons;
    }
}
