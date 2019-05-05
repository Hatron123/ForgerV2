package Chi.Hatron;

import org.bukkit.Bukkit;
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

public class Crafter implements Listener {
	@SuppressWarnings("unused")
	private Plugin plugin = Main.getPlugin(Main.class);
	 Chi.Hatron.Items item = new Items();
	 
	 
	 @EventHandler
	 public void onExit(InventoryCloseEvent e) {
		 if(e.getInventory().getName().equals("Crafter")) {
			 Inventory inv = e.getInventory();
				if(inv.getItem(12).equals(item.ChiIron(1)) && inv.getItem(13).equals(item.ChiIron(1)) && inv.getItem(14).equals(item.ChiIron(1))) {
					if(inv.getItem(22).getType().equals(Material.STICK) && inv.getItem(31).getType().equals(Material.STICK)){
						e.getPlayer().getInventory().addItem(item.ChiIronPick(1));
					}
					
				}if(inv.getItem(13).equals(item.IronBlade()) && inv.getItem(22).equals(item.IronBlade())) {
					if(inv.getItem(31).getType().equals(Material.STICK)) {
						e.getPlayer().getInventory().addItem(item.ChiIronSword(1));
					}
				}
				}
	 }
	 
	 

	 
	 
	 
	public void opened(Player player, Location location) {
		
		 Inventory inv = Bukkit.createInventory(null, 45, ChatColor.BLACK + "Crafter");
		    player.openInventory(inv);
		    ItemStack filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		    ItemMeta meta = filler.getItemMeta();
		    meta.setDisplayName(" ");
		    filler.setItemMeta(meta);
		
		
		for(int i = 0;i<45;i++) {
			if(i != 12 && i != 13 && i != 14 && i != 21 && i!=22 && i!= 23 && i!=30 && i!=31 && i != 32) {
				inv.setItem(i, filler);
			}
		}
		
	}
	

}
