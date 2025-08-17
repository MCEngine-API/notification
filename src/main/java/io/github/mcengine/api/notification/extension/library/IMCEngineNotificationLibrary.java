package io.github.mcengine.api.notification.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Notification Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide reusable notification utilities and services.
 */
public interface IMCEngineNotificationLibrary {
    /**
     * Called when the Notification Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Notification Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Notification Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
