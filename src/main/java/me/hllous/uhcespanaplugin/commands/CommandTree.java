package me.hllous.uhcespanaplugin.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.hllous.uhcespanaplugin.commands.subcommands.*;
import me.hllous.uhcespanaplugin.commands.subcommands.teams.*;
import me.hllous.uhcespanaplugin.commands.subcommands.scoreboard.*;
import me.hllous.uhcespanaplugin.commands.subcommands.settings.*;

public class CommandTree {

    public LiteralArgumentBuilder<CommandSourceStack> createCommandTree(){
        LiteralArgumentBuilder<CommandSourceStack> commandTree = Commands.literal("uhc")
            .then(Commands.literal("teams")
                .then(new CreateTeamCommand().createCommand())
                .then(new JoinTeamCommand().createCommand())
                .then(new LeaveTeamCommand().createCommand()))
                
            .then(new StartCommand().createCommand())
            .then(new StopCommand().createCommand())
            .then(new RestartCommand().createCommand())

            .then(Commands.literal("settings")
                .then(new BorderCommand().createCommand())
                .then(new TimerCommand().createCommand())
                .then(new PvpCommand().createCommand())
                .then(new CenterCommand().createCommand())
                .then(new DefaultSettingsCommand().createCommand()))

            .then(Commands.literal("scoreboard")
                .then(new ScoreboardTitleCommand().createCommand())
                .then(new ScoreboardDisableCommand().createCommand()))
                
            .executes(ctx -> {
                // Help message or default action
                return 1;
            });
        
        return commandTree;
    }
    
}