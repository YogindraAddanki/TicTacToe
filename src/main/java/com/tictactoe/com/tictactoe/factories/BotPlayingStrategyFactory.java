package com.tictactoe.com.tictactoe.factories;

import com.tictactoe.com.tictactoe.models.BotDifficultyLevel;
import com.tictactoe.com.tictactoe.strategy.botplayingstrategy.BotPlayingStrategy;
import com.tictactoe.com.tictactoe.strategy.botplayingstrategy.EasyBotPlayingStragtegy;
import com.tictactoe.com.tictactoe.strategy.botplayingstrategy.HardBotPlayingStrategy;
import com.tictactoe.com.tictactoe.strategy.botplayingstrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyFactory(BotDifficultyLevel botDifficultyLevel)
    {
        if(botDifficultyLevel==BotDifficultyLevel.EASY)
            return  new EasyBotPlayingStragtegy();
        else if(botDifficultyLevel==BotDifficultyLevel.MEDIUM)
            return  new MediumBotPlayingStrategy();
        else
            return new HardBotPlayingStrategy();
    }

}
