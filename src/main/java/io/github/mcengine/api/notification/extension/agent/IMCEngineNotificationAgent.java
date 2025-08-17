package io.github.mcengine.api.notification.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Notification Agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate notification agents into the system.
 */
public interface IMCEngineNotificationAgent {
    /**
     * Called when the Notification Agent is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Notification Agent is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Notification Agent instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
