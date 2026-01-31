package com.dizzyz7.autoarmor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class ArmorLogic {

    public static void checkAndReplaceArmor(PlayerEntity player) {
        if (player.isSpectator() || player.isCreative()) return;

        // Перебор слотов: HEAD, CHEST, LEGS, FEET
        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (slot.getType() == EquipmentSlot.Type.ARMOR) {
                if (player.getEquippedStack(slot).isEmpty()) {
                    tryEquipFromInventory(player, slot);
                }
            }
        }
    }

    private static void tryEquipFromInventory(PlayerEntity player, EquipmentSlot slot) {
        for (int i = 0; i < player.getInventory().size(); i++) {
            ItemStack stack = player.getInventory().getStack(i);

            if (!stack.isEmpty() && stack.getItem() instanceof ArmorItem armor) {
                // Если тип брони (шлем/нагрудник) совпадает с пустым слотом
                if (armor.getSlotType() == slot) {
                    player.equipStack(slot, stack.copy());
                    stack.setCount(0); // Удаляем из инвентаря
                    return;
                }
            }
        }
    }
}
