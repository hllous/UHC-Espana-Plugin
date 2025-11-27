package me.hllous.uhcespanaplugin.game;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class Team {
    private String name;
    private List<UUID> members;
    private String prefix;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }
}
