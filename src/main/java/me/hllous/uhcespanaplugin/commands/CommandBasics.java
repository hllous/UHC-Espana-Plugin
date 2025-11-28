package me.hllous.uhcespanaplugin.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

import io.papermc.paper.command.brigadier.CommandSourceStack;

public interface CommandBasics {
    LiteralArgumentBuilder<CommandSourceStack> createCommand();
    int runCommand(CommandContext<CommandSourceStack> ctx);
}
