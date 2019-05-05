package Chi.Hatron;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class BlastFurnace implements Listener{
	private Plugin plugin = Main.getPlugin(Main.class);
	 Chi.Hatron.Items item = new Items();
	
	
	public void opened(Player player, Location loc) {

		Inventory i = plugin.getServer().createInventory(null, 9, ChatColor.BLACK + "Blast Furnace");
		player.openInventory(i);
		ItemStack filler = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
		ItemMeta meta = filler.getItemMeta();
		meta.setDisplayName(" ");
		filler.setItemMeta(meta);
		for(int j = 0;j<9;j++) {
			if(j != 4) {
			i.setItem(j, filler);
		}
		}
	}
	
	
	@EventHandler
	public void onInvClick(InventoryClickEvent e) {
		if(e.getCurrentItem().getItemMeta() != null) {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(" ")){
				e.setCancelled(true);
			}
		}
		
	}
	

	@EventHandler
	public void onClose(InventoryCloseEvent e) {
		if(e.getInventory().getName().equals("Blast Furnace")) {
			if(e.getInventory().getItem(4) != null) {
			ItemStack items = e.getInventory().getItem(4);
			int num = e.getInventory().getItem(4).getAmount();
				if(items.getType().equals((Material.IRON_ORE))) {
					Smelt(item.ChiIron(num),num,(Player) e.getPlayer());
				}if(items.getType().equals(Material.GOLD_ORE)) {
					Smelt(item.ChiGold(num),num,(Player) e.getPlayer());
					}if(items.getType().equals(Material.DIAMOND_ORE)) {
						Smelt(item.ChiDiamond(num),num,(Player) e.getPlayer());
					}
				
					
					
					
					
			}
				
			}
		}


	@SuppressWarnings("deprecation")
	private void Smelt(ItemStack result,int num,Player player) {
		Bukkit.getScheduler().scheduleAsyncDelayedTask(plugin, new Runnable() {

			@Override
			public void run() {
				player.getInventory().addItem(result);
				
			}
			
			
			
		},(num*50));
		
	}
	}
	
	


