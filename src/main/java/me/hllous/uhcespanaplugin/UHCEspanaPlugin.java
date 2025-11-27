package me.hllous.uhcespanaplugin;

import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import java.util.List;
import me.hllous.uhcespanaplugin.commands.CommandTree;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class UHCEspanaPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, event -> {
            event.registrar().register(
                new CommandTree().createCommandTree()
                    .build(),
                "The main UHC command",
                List.of("uhcgame")
            );
        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
