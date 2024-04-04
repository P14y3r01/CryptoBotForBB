package com.example.cryptobotforbb.telegram.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Базовый интерфейс для работы с чатом бота
 * Update - сообщение полученное от пользователя.
 *      Может быть в виде:
 *          текста,
 *          команды(начинается с /..),
 *          нажатия на клавишу интерактивной клавиатуры
 *
 * SendMessage класс, который представляет собой ответ бота на сообщение пользователя
 *      Каждый SendMessage должен иметь chatId(стягивается из приходящего update), в противном случае невалиндо
 */
public interface Command {

    SendMessage apply(Update update);

}
