package Chi.Hatron;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Builder {
	private Plugin plugin = Main.getPlugin(Main.class);

	public void east(Block block,Player player,String face,String type) {
			Location main = block.getLocation();
			int mainX = main.getBlockX();
			int mainY = main.getBlockY();
			int mainZ = main.getBlockZ() - 2;
			Location target = new Location(block.getWorld(),mainX,mainY,mainZ);
			for(int j = 0;j < 3;j++) {
			target.setZ(target.getZ() + 1);
			target.setX(mainX);
				for(int i = 0;i < 3;i++) {
					if(!(j ==1 && i == 0)) {
						target.setX(mainX - i);
						target.getBlock().setType(Material.STONE_BRICKS);
					}
					
					
				}
		
	}
			player.playSound(main, Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
			
			
			target =new Location(block.getWorld(),mainX,mainY + 1,mainZ);
			for(int j = 0;j<3;j++) {
				target.setZ(target.getZ() + 1);
				target.setX(mainX);
				for(int i = 0;i<3;i++) {
					if(j == 0 || j== 2) {
						if(i%2 == 0) {
						target.setX(mainX - i);
						target.getBlock().setType(Material.COBBLESTONE_WALL);
					}else {
						target.setX(mainX - i);
						target.getBlock().setType(Material.GLASS);
					}
	
					
				}else {
					
					if(i%2 == 0) {
						target.setX(mainX - i);
						target.getBlock().setType(Material.GLASS);
					
				}
			}
	
	
	}
	}
			
			target =new Location(block.getWorld(),mainX,mainY + 2,mainZ);
			for(int j = 0;j<3;j++) {
				target.setZ(target.getZ() + 1);
				target.setX(mainX);
				for(int i = 0;i<3;i++) {
					target.setX(mainX - i);
					target.getBlock().setType(Material.STONE_SLAB);
					

			
					}
					}

			FileConfiguration config = plugin.getConfig();
			config.set(type + main.toString(),true);
			plugin.saveConfig();
			

			
	}
	
	
}
