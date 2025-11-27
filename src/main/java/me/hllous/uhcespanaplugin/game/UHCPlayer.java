package me.hllous.uhcespanaplugin.game;

import java.util.UUID;
import lombok.Data;

@Data
public class UHCPlayer {
    private UUID uuid;
    private String name;
    private Team team;
    private PlayerState state;

    public UHCPlayer(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
        this.state = PlayerState.ALIVE;
    }
}
