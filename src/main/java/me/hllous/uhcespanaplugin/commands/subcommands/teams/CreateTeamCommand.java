package me.hllous.uhcespanaplugin.commands.subcommands.teams;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import me.hllous.uhcespanaplugin.commands.CommandBasics;

public class CreateTeamCommand implements CommandBasics {

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> createCommand() {
        return Commands.literal("createTeam")
            .then(Commands.argument("teamName", StringArgumentType.string())
                .executes(this::runCommand));
    }

    @Override
    public int runCommand(CommandContext<CommandSourceStack> ctx) {
        return 1;
    }
}
