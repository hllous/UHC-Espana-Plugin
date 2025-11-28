package me.hllous.uhcespanaplugin.commands.subcommands.settings;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.hllous.uhcespanaplugin.commands.CommandBasics;

public class PvpCommand implements CommandBasics {

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> createCommand() {
        return Commands.literal("pvp")
            // Arguments would go here
            .executes(this::runCommand);
    }

    @Override
    public int runCommand(CommandContext<CommandSourceStack> ctx) {
        return 1;
    }
}
