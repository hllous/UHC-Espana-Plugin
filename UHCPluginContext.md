# UHC España Plugin - Project Context

## Project Overview
**Name**: UHC-Espana-Plugin  
**Author**: hllous  
**Version**: 1.0-SNAPSHOT  
**Minecraft Version**: 1.21.10 (Paper API)  
**Java Version**: 21  
**Dependencies**: Lombok 1.18.38

This is a Minecraft UHC (Ultra Hardcore) plugin built for Paper servers. The project has a well-structured foundation with command system and game logic classes, but most implementations are currently skeleton/placeholder code.

---

## Project Structure

### Configuration Files

#### [pom.xml](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/pom.xml)
- Maven project configuration
- Uses Paper API 1.21.10-R0.1-SNAPSHOT
- Includes Lombok for reducing boilerplate
- Maven Shade plugin for building fat JAR
- Compiler configured for Java 21

#### [plugin.yml](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/resources/plugin.yml)
- Basic Bukkit plugin metadata
- Main class: `me.hllous.uhcespanaplugin.UHCEspanaPlugin`
- API version: 1.21
- ⚠️ **Issue**: Has `bootstrapper` and `loader` references that shouldn't be in `plugin.yml`

#### [paper-plugin.yml](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/resources/paper-plugin.yml)
- Paper-specific plugin metadata
- API version: 1.21.10
- ⚠️ **Issue**: References non-existent `TestPluginBootstrap` and `TestPluginLoader` classes

---

## Core Plugin Class

### [UHCEspanaPlugin.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/UHCEspanaPlugin.java)
Main plugin class that extends `JavaPlugin` and implements `Listener`.

**Current Implementation**:
- ✅ Registers commands using Paper's modern lifecycle-based command system
- ✅ Registers the main `/uhc` command with alias `/uhcgame`
- ❌ No event listeners registered yet
- ❌ No game instance created or managed

---

## Command System Architecture

### Command Infrastructure

#### [CommandBasics.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/CommandBasics.java)
Interface defining the contract for all commands:
- `createCommand()`: Returns a `LiteralArgumentBuilder<CommandSourceStack>`
- `runCommand(CommandSourceStack)`: Executes the command logic

#### [CommandTree.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/CommandTree.java)
Builds the complete command hierarchy using Brigadier.

**Command Structure**:
```
/uhc (or /uhcgame)
├── start
├── stop
├── restart
├── teams
│   ├── createTeam
│   ├── joinTeam
│   └── leaveTeam
├── settings
│   ├── border
│   ├── timer
│   ├── pvp
│   ├── center
│   └── default
└── scoreboard
    ├── setTitle
    └── disable
```

### Command Implementations

All commands follow the same pattern: they implement `CommandBasics` interface but have **empty/placeholder logic**.

#### Game Control Commands

1. **[StartCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/StartCommand.java)** - `/uhc start`
   - ❌ Not implemented
   - Should: Start the UHC game

2. **[StopCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/StopCommand.java)** - `/uhc stop`
   - ❌ Not implemented
   - Should: Stop the current UHC game

3. **[RestartCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/RestartCommand.java)** - `/uhc restart`
   - ❌ Not implemented
   - Should: Restart the UHC game

#### Team Management Commands

4. **[CreateTeamCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/teams/CreateTeamCommand.java)** - `/uhc teams createTeam`
   - ❌ Not implemented
   - ❌ No arguments defined
   - Should: Create a new team with a name

5. **[JoinTeamCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/teams/JoinTeamCommand.java)** - `/uhc teams joinTeam`
   - ❌ Not implemented
   - ❌ No arguments defined
   - Should: Allow a player to join an existing team

6. **[LeaveTeamCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/teams/LeaveTeamCommand.java)** - `/uhc teams leaveTeam`
   - ❌ Not implemented
   - Should: Allow a player to leave their current team

#### Settings Commands

7. **[BorderCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/settings/BorderCommand.java)** - `/uhc settings border`
   - ❌ Not implemented
   - ❌ No arguments defined
   - Should: Configure world border size

8. **[TimerCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/settings/TimerCommand.java)** - `/uhc settings timer`
   - ❌ Not implemented
   - ❌ No arguments defined
   - Should: Set game timer duration

9. **[PvpCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/settings/PvpCommand.java)** - `/uhc settings pvp`
   - ❌ Not implemented
   - ❌ No arguments defined
   - Should: Configure when PvP is enabled

10. **[CenterCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/settings/CenterCommand.java)** - `/uhc settings center`
    - ❌ Not implemented
    - ❌ No arguments defined
    - Should: Set the center location for the game/border

11. **[DefaultSettingsCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/settings/DefaultSettingsCommand.java)** - `/uhc settings default`
    - ❌ Not implemented
    - Should: Reset settings to default values

#### Scoreboard Commands

12. **[ScoreboardTitleCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/scoreboard/ScoreboardTitleCommand.java)** - `/uhc scoreboard setTitle`
    - ❌ Not implemented
    - ❌ No arguments defined
    - Should: Set the scoreboard title

13. **[ScoreboardDisableCommand.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/commands/subcommands/scoreboard/ScoreboardDisableCommand.java)** - `/uhc scoreboard disable`
    - ❌ Not implemented
    - Should: Disable the scoreboard

---

## Game Logic Classes

### [Game.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/game/Game.java)
Main game state manager using Lombok `@Data` annotation.

**Properties**:
- `state`: Current game state (default: `WAITING`)
- `teams`: List of teams in the game
- `players`: List of UHC players
- `borderRadius`: World border size
- `timer`: Game timer
- `pvpTime`: Time when PvP is enabled
- `center`: Center location for the game

**Methods** (all not implemented):
- `runGame()` - Should start and manage the game loop
- `restartGame()` - Should reset the game to initial state
- `stop()` - Should stop the game

### [GameState.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/game/GameState.java)
Enum defining game states:
- `WAITING` - Waiting for players/preparation
- `RUNNING` - Game is active
- `ENDED` - Game has finished

### [PlayerState.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/game/PlayerState.java)
Enum defining player states:
- `ALIVE` - Player is alive and playing
- `DEAD` - Player has been eliminated
- `SPECTATOR` - Player is spectating

### [Team.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/game/Team.java)
Team data class using Lombok `@Data`.

**Properties**:
- `name`: Team name
- `members`: List of player UUIDs in the team
- `prefix`: Team prefix (not yet used)

### [UHCPlayer.java](file:///e:/Tools/MC-Projects/Plugins/TestingPlugins/src/main/java/me/hllous/uhcespanaplugin/game/UHCPlayer.java)
Player wrapper class using Lombok `@Data`.

**Properties**:
- `uuid`: Player's unique identifier
- `name`: Player's name
- `team`: Team the player belongs to
- `state`: Current player state (default: `ALIVE`)

---

## Current Implementation Status

### ✅ Completed
1. Project structure and build configuration
2. Command system architecture with Brigadier
3. All command class skeletons created
4. Game data models defined (Game, Team, UHCPlayer)
5. Enums for game and player states

### ❌ Not Implemented
1. **Game Logic**:
   - Game lifecycle management (start, stop, restart)
   - Timer system
   - World border management
   - PvP timing control
   - Player death handling
   - Win condition checks

2. **Command Logic**:
   - All 13 commands need implementation
   - Command arguments not defined
   - No validation or error handling
   - No permission checks

3. **Event Handlers**:
   - Player join/leave events
   - Player death events
   - Combat events
   - World border events

4. **Scoreboard System**:
   - No scoreboard implementation exists
   - Title and display logic needed

5. **Configuration**:
   - No config.yml for default settings
   - Invalid references in paper-plugin.yml

---

## Next Steps / Feature Priorities

Based on typical UHC plugin requirements, here are suggested priorities:

### Phase 1: Core Game Management
1. Fix configuration file issues
2. Implement Game singleton/instance management in main plugin class
3. Implement start/stop/restart commands
4. Create basic event listeners (player join, death)

### Phase 2: Team System
1. Implement team creation/join/leave commands
2. Add team chat functionality
3. Add friendly fire control

### Phase 3: Game Settings
1. Implement settings commands (border, timer, pvp, center)
2. Create config.yml for default values
3. Add settings persistence

### Phase 4: Scoreboard & Polish
1. Implement scoreboard system
2. Add game timer display
3. Add player/team statistics
4. Add win/loss tracking

### Phase 5: Advanced Features
1. Scenario system (customizable game modes)
2. Automatic world border shrinking
3. Health tracking and regeneration rules
4. Custom crafting recipes

---

## Technical Notes

- **Modern Paper API**: Uses Paper's lifecycle event system for command registration (not deprecated Bukkit commands)
- **Brigadier**: Leverages Mojang's Brigadier for command parsing
- **Lombok**: Reduces boilerplate with `@Data`, `@NoArgsConstructor` annotations
- **Java 21**: Can use modern Java features (records, pattern matching, etc.)

---

## Questions to Consider

1. **Game Mode**: Solo only, teams only, or both?
2. **World Management**: New world per game or reuse existing?
3. **Player Limits**: Max players per game?
4. **Scenarios**: What UHC scenarios should be supported? (e.g., cutclean, timebomb, etc.)
5. **Spectators**: How should spectators work after death?
6. **Permissions**: What permission levels for different commands?