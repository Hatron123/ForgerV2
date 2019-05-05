package Chi.Hatron;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class Forger implements Listener {
	private Plugin plugin = Main.getPlugin(Main.class);
	 Chi.Hatron.Items item = new Items();

	
	
	
	
	
	@EventHandler
	public void onClose(InventoryCloseEvent e) {
		if(e.getInventory().getName().equals("Forger")) {
			if(e.getInventory().getItem(3) != null && e.getInventory().getItem(5) != null) {
				ItemStack item3 = e.getInventory().getItem(3);
				//item3.setAmount(item3.getAmount());
				ItemStack item5 = e.getInventory().getItem(5);
				if(item3.equals(item.ChiIron(item3.getAmount())) && item5.equals(item.ChiIron(item5.getAmount()))) {
					e.getPlayer().getInventory().addItem(item.IronBlade());
				}else {
					e.getPlayer().sendMessage("Wrong");
					e.getPlayer().getInventory().addItem(item3);
					e.getPlayer().getInventory().addItem(item5);
				}
			
			}}}
	
	
	
	
	
	public void opened(Player player, Location location) {
		Inventory i = plugin.getServer().createInventory(null, 9, ChatColor.BLACK + "Forger");
		player.openInventory(i);
		ItemStack filler = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
		ItemMeta meta = filler.getItemMeta();
		meta.setDisplayName(" ");
		filler.setItemMeta(meta);
		for(int j = 0;j<9;j++) {
			if(j == 3 || j== 5) {
			
		}else {
			i.setItem(j, filler);
		}
		}
		
	}

}
