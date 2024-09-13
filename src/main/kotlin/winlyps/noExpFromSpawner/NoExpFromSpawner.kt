package winlyps.noExpFromSpawner

import org.bukkit.plugin.java.JavaPlugin

class NoExpFromSpawner : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(SpawnerBreakListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}