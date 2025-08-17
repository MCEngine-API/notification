package io.github.mcengine.api.notification.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Notification DLC module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate downloadable content related to notification.
 */
public interface IMCEngineNotificationDLC {
    /**
     * Called when the Notification DLC is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Notification DLC is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Notification DLC instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
