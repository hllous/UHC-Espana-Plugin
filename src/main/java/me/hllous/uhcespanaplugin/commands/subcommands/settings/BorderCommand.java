package me.hllous.uhcespanaplugin.commands.subcommands.settings;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.hllous.uhcespanaplugin.commands.CommandBasics;

public class BorderCommand implements CommandBasics {

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> createCommand() {
        return Commands.literal("border")
            // Arguments would go here
            .executes(ctx -> {
                return runCommand(ctx.getSource());
            });
    }

    @Override
    public int runCommand(CommandSourceStack stack) {
        return 1;
    }
}
