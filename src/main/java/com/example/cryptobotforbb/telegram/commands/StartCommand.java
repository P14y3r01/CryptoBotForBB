package com.example.cryptobotforbb.telegram.commands;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

import static com.example.cryptobotforbb.utils.DefaultStrings.START_MESSAGE;

/**
 * Ответ присылаемый на /start
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class StartCommand implements Command {

    @Override
    public SendMessage apply(Update update) {
        return SendMessage.builder()
                .chatId(update.getMessage().getChatId())
                .text(START_MESSAGE)
                .build();
    }

}
