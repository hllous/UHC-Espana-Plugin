package me.hllous.uhcespanaplugin.commands.subcommands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.hllous.uhcespanaplugin.commands.CommandBasics;

public class StartCommand implements CommandBasics {

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> createCommand() {
        return Commands.literal("start")
            .executes(ctx -> {
                return runCommand(ctx.getSource());
            });
    }

    @Override
    public int runCommand(CommandSourceStack stack) {
        // Logic to start game
        return 1;
    }
}
