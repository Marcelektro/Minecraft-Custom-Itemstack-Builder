# Minecraft-Custom-Itemstack-Builder

This class allows you to build custom itemstacks for your Spigot server.
I use this on every gamemode on my server, so I decided to share it with you, as it might be helpful <3
Enjoy!

Usage:
I think it's pretty simple to know how to use it, so I don't need to explain stuff.

Examples of usages:

new ItemManager(Material.DIAMOND_SWORD).setDisplayName("§a§lEpico Sword").setAmount(37).build();
new ItemManager(Material.STICK).addEnchantment(Enchantment.KNOCKBACK, 1).addLoreLine("§7Your cool KB Stick!").setAmount(1).setDisplayName("§9§lStickie").build();
