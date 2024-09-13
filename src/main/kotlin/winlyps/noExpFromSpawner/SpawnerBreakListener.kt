package winlyps.noExpFromSpawner

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

class SpawnerBreakListener(private val plugin: NoExpFromSpawner) : Listener {

    @EventHandler
    fun onSpawnerBreak(event: BlockBreakEvent) {
        val block = event.block

        // Check if the block is a spawner
        if (block.type == Material.SPAWNER) {
            // Set the experience drop to 0
            event.expToDrop = 0
        }
    }
}