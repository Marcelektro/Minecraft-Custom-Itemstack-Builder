package your.package;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class ItemBuilder {
    private final ItemStack item;
    private final List<String> lore = new ArrayList<>();
    private final ItemMeta meta;

    public ItemBuilder(Material mat, short subId, int amount) {
        this.item = new ItemStack(mat, amount, subId);
        this.meta = this.item.getItemMeta();
    }

    public ItemBuilder(ItemStack item) {
        this.item = item;
        this.meta = item.getItemMeta();
    }

    public ItemBuilder(Material mat, short subId) {
        this.item = new ItemStack(mat, 1, subId);
        this.meta = this.item.getItemMeta();
    }

    public ItemBuilder(Material mat, int amount) {
        this.item = new ItemStack(mat, amount, (short) 0);
        this.meta = this.item.getItemMeta();
    }

    public ItemBuilder(Material mat) {
        this.item = new ItemStack(mat, 1, (short) 0);
        this.meta = this.item.getItemMeta();
    }

    public ItemBuilder setAmount(int value) {
        this.item.setAmount(value);
        return this;
    }

    public ItemBuilder setNoName() {
        this.meta.setDisplayName(" ");
        return this;
    }

    public ItemBuilder setGlow() {
        this.meta.addEnchant(Enchantment.DURABILITY, 1, true);
        this.meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return this;
    }

    public ItemBuilder setData(short data) {
        this.item.setDurability(data);
        return this;
    }

    public ItemBuilder addLoreLine(String line) {
        this.lore.add(line);
        return this;
    }

    public ItemBuilder addLoreArray(String[] lines) {
        this.lore.addAll(Arrays.asList(lines));
        return this;
    }

    public ItemBuilder addLoreAll(List<String> lines) {
        this.lore.addAll(lines);
        return this;
    }

    public ItemBuilder setDisplayName(String name) {
        this.meta.setDisplayName(name);
        return this;
    }

    public ItemBuilder setSkullOwner(String owner) {
        ((SkullMeta) this.meta).setOwner(owner);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean value) {
        this.meta.spigot().setUnbreakable(value);
        return this;
    }

    public ItemBuilder addEnchantment(Enchantment enchantment, int lvl) {
        this.meta.addEnchant(enchantment, lvl, true);
        return this;
    }

    public ItemBuilder addItemFlag(ItemFlag flag) {
        this.meta.addItemFlags(flag);
        return this;
    }

    public ItemStack build() {
        if (!this.lore.isEmpty()) {
            this.meta.setLore(this.lore);
        }
        this.item.setItemMeta(this.meta);
        return this.item;
    }
}
