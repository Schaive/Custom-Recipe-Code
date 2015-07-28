package me.Juan_Pablo.CustomRecipes;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Recipes extends JavaPlugin {
	
	public void onEnable(){
		recipe();
	}
	
	public void onDisable(){
		
	}
	
	  private void recipe() {
			ItemStack grass = new ItemStack(Material.GRASS, 1);
			ItemMeta meta = grass.getItemMeta();
			meta.setDisplayName("§bGrass Block");
			// Display Name
			meta.setLore(Arrays.asList("§nUsed To Kill"));
			// Setting Lore
			meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
			// Example of adding Enchantments to items
			grass.setItemMeta(meta);
		    
		    ShapedRecipe recipe = new ShapedRecipe(grass);
		    recipe.shape(new String[] {
		      " # ", 
		      "#%#", 
		      " # " });
		    // Crafting is like in the Crafting bench.
		    recipe.setIngredient('#', Material.TORCH);
		    recipe.setIngredient('%', Material.DIRT);
		    Bukkit.getServer().addRecipe(recipe);
		  }

}
