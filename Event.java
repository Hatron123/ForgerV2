package Chi.Hatron;



import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;


import net.minecraft.server.v1_13_R2.PacketPlayOutTitle;
import net.minecraft.server.v1_13_R2.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_13_R2.PacketPlayOutTitle.EnumTitleAction;

public class Event implements Listener{
	 Chi.Hatron.Items item = new Items();
	private Plugin plugin = Main.getPlugin(Main.class);
	 FileConfiguration config = plugin.getConfig();
	 Builder b = new Builder();
	 
	 
	 
	 ItemStack Blast = new ItemStack(Material.PAPER);
	 ItemMeta meta = Blast.getItemMeta();
	 ArrayList<String> HardPickLore = new ArrayList<String>();

	 
	  
	 @EventHandler
	 public void onJoin(PlayerRespawnEvent e) {
		 Player player = e.getPlayer();
		 
		 
		 PacketPlayOutTitle title = new	PacketPlayOutTitle(EnumTitleAction.ACTIONBAR, ChatSerializer.a("{\"text\":\"Welcome To The Land Of The Living\"}"),40,20,20);
		 
		 ((CraftPlayer) player).getHandle().playerConnection.sendPacket(title);

		 player.getInventory().addItem(item.BlastFurnace());
		 player.getInventory().addItem(item.Forger());
		 player.getInventory().addItem(item.Crafter());
		 
	 }
	 
	 @EventHandler
	 public void onInventory(InventoryOpenEvent e) {
		 if(e.getInventory().getLocation() != null) {
		 if(config.contains("BlastFurnace." + e.getInventory().getLocation().toString())) {
			 Chi.Hatron.BlastFurnace f = new BlastFurnace();
			e.setCancelled(true);
			 f.opened((Player) e.getPlayer(),e.getInventory().getLocation());
		 }if(config.contains("Forger." + e.getInventory().getLocation().toString())) {
			 Chi.Hatron.Forger f = new Forger();
			 e.setCancelled(true);
			 f.opened((Player) e.getPlayer(),e.getInventory().getLocation());
		 }
		 }
	 }
	 
	 @EventHandler
	 public void onInteract(PlayerInteractEvent e) {
		 Player player = (Player) e.getPlayer();
		 if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
		 if(e.getClickedBlock() != null){
			 if(e.getClickedBlock().getType().equals(Material.DISPENSER)){

			 
				 if(player.getInventory().getItemInMainHand().equals(item.BlastFurnace())) {
					 String type = "BlastFurnace.";
			 e.setCancelled(true);
			 player.getInventory().getItemInMainHand().setAmount(0);

			 String face = e.getBlockFace().toString();
			 if(face == "EAST") {
				 b.east(e.getClickedBlock(),player,face,type);
			 }
			 
		 }
	 }if(e.getClickedBlock().getType().equals(Material.ANVIL)) {
		 if(player.getInventory().getItemInMainHand().equals(item.Forger())) {
			 String type = "Forger.";
			 e.setCancelled(true);
			 player.getInventory().getItemInMainHand().setAmount(0);
			 String face = e.getBlockFace().toString();
			 if(face == "EAST") {
				 b.east(e.getClickedBlock(), player, face, type);
			 }
					
		 }
	 }if(e.getClickedBlock().getType().equals(Material.CRAFTING_TABLE)) {
		 if(player.getInventory().getItemInMainHand().equals(item.Crafter())) {
			 String type = "Crafter.";
			 e.setCancelled(true);
			 player.getInventory().getItemInMainHand().setAmount(0);
			 String face = e.getBlockFace().toString();
			 if(face == "EAST") {
				 b.east(e.getClickedBlock(), player, face, type);
			 }
		 }if(config.contains("Crafter." + e.getClickedBlock().getLocation())) {
			 Chi.Hatron.Crafter f = new Crafter();
			 e.setCancelled(true);
			 f.opened((Player) e.getPlayer(),e.getClickedBlock().getLocation());
		 }
	 }
	 }
	 
	 }
	 }
	 
}
