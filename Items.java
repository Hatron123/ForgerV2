package Chi.Hatron;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items {
	
	
	public ItemStack IronBlade() {
		ItemStack ironBlade = new ItemStack(Material.IRON_INGOT);
		ItemMeta meta = ironBlade.getItemMeta();
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Chi Infused Iron Blade");
		ironBlade.setItemMeta(meta);
		return ironBlade;
	}
	
	
	public ItemStack ChiIron(int num) {
		ItemStack result = new ItemStack(Material.IRON_INGOT,num);
		ItemMeta meta = result.getItemMeta();
		meta.setDisplayName(ChatColor.LIGHT_PURPLE+"Chi Infused Iron");
		result.setItemMeta(meta);
		return result;
	}
	
	public ItemStack ChiDiamond(int num) {
		ItemStack result = new ItemStack(Material.DIAMOND,num);
		ItemMeta meta = result.getItemMeta();
		meta.setDisplayName(ChatColor.LIGHT_PURPLE+"Chi Infused Diamond");
		result.setItemMeta(meta);
		return result;
	}
	
	public ItemStack ChiGold(int num) {
		ItemStack result = new ItemStack(Material.GOLD_INGOT,num);
		ItemMeta meta = result.getItemMeta();
		meta.setDisplayName(ChatColor.LIGHT_PURPLE+"Chi Infused Gold");
		result.setItemMeta(meta);
		return result;
	}
	
	
	 public ItemStack BlastFurnace(){
		   ItemStack Blast = new ItemStack(Material.PAPER);
		   ItemMeta Blastmeta = Blast.getItemMeta();
		   ArrayList<String> BlastLore = new ArrayList<String>();
		   BlastLore.add("Right Click a Dispenser to create a Blast Furnace");
		   Blastmeta.setDisplayName("Blast Furnace Schematic");
		   Blastmeta.setLore(BlastLore);
		   Blast.setItemMeta(Blastmeta);
		return Blast;
	   }
	   
	   public ItemStack Forger() {
		   ItemStack Forge = new ItemStack(Material.PAPER);
		   ItemMeta ForgeMeta = Forge.getItemMeta();
		   ArrayList<String> ForgeLore = new ArrayList<String>();
		   ForgeLore.add("Right Click an Anvil to create a Forge");
		   ForgeMeta.setDisplayName("Forge Schematic");
		   ForgeMeta.setLore(ForgeLore);
		   Forge.setItemMeta(ForgeMeta);
		   return Forge;
	   }
	
	   public ItemStack Crafter() {
		   ItemStack craft = new ItemStack(Material.PAPER);
		   ItemMeta craftMeta = craft.getItemMeta();
		   ArrayList<String> craftLore = new ArrayList<String>();
		   craftLore.add("Right Click a Crafting Table to create a Crafter");
		   craftMeta.setDisplayName("Tier I Crafter Schematic");
		   craftMeta.setLore(craftLore);
		   craft.setItemMeta(craftMeta);
		   return craft;
	   }


	public ItemStack ChiIronPick(int i) {
		ItemStack ChiIronPick = new ItemStack(Material.IRON_PICKAXE,i);
		ItemMeta pickMeta = ChiIronPick.getItemMeta();
		pickMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Chi Infused Iron Pickaxe");
		ChiIronPick.setItemMeta(pickMeta);
		
		return ChiIronPick;
	}


	public ItemStack ChiIronSword(int i) {
		ItemStack ChiIronSword = new ItemStack(Material.IRON_SWORD,i);
		ItemMeta swordMeta = ChiIronSword.getItemMeta();
		swordMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Chi Infused Iron Sword");
		ChiIronSword.setItemMeta(swordMeta);
		return ChiIronSword;
	}
	

}
