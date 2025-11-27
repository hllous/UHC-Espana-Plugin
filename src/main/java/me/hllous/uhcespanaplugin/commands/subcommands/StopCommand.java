package me.hllous.uhcespanaplugin.commands.subcommands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.hllous.uhcespanaplugin.commands.CommandBasics;

public class StopCommand implements CommandBasics {

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> createCommand() {
        return Commands.literal("stop")
            .executes(ctx -> {
                return runCommand(ctx.getSource());
            });
    }

    @Override
    public int runCommand(CommandSourceStack stack) {
        // Logic to stop game
        return 1;
    }
}
