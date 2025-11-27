package me.hllous.uhcespanaplugin.game;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Location;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
    private GameState state = GameState.WAITING;
    private List<Team> teams = new ArrayList<>();
    private List<UHCPlayer> players = new ArrayList<>();
    
    // Settings
    private double borderRadius;
    private int timer;
    private int pvpTime;
    private Location center;

    public void runGame() {
        // Implementation pending
    }

    public void restartGame() {
        // Implementation pending
    }

    public void stop() {
        // Implementation pending
    }
}
