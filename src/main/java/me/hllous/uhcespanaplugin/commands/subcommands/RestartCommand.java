package me.hllous.uhcespanaplugin.commands.subcommands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.hllous.uhcespanaplugin.commands.CommandBasics;

public class RestartCommand implements CommandBasics {

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> createCommand() {
        return Commands.literal("restart")
            .executes(this::runCommand);
    }

    @Override
    public int runCommand(CommandContext<CommandSourceStack> ctx) {
        // Logic to restart game
        return 1;
    }
}
