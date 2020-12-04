# Minecraft-Custom-Itemstack-Builder

This class allows you to build custom itemstacks for your Spigot server.

Examples of usages:
new ItemManager(Material.DIAMOND_SWORD).setDisplayName("§a§lEpico Sword").setAmount(37).build();
new ItemManager(Material.STICK).addEnchantment(Enchantment.KNOCKBACK, 1).addLoreLine("§7Your cool KB Stick!").setAmount(1).setDisplayName("§9§lStickie").build();
