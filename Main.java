package Chi.Hatron;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		getLogger().info("Absorbing Chi");
		loadConfig();
		getServer().getPluginManager().registerEvents(new Event(), this);
		getServer().getPluginManager().registerEvents(new BlastFurnace(), this);
		getServer().getPluginManager().registerEvents(new Forger(), this);
		getServer().getPluginManager().registerEvents(new Crafter(), this);

		
		
	}
	
	private void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}


	public void onDisable() {
		getLogger().info("Dissipating Chi");
		
	}
	
	 
	
}
