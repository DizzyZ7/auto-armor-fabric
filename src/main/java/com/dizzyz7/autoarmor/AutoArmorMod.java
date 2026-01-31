package com.dizzyz7.autoarmor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class AutoArmorMod implements ModInitializer {
    public static final String MOD_ID = "auto_armor";

    @Override
    public void onInitialize() {
        // Проверка инвентаря каждые 20 тиков (1 раз в секунду) для экономии ресурсов
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            server.getPlayerManager().getPlayerList().forEach(player -> {
                if (server.getTicks() % 20 == 0) {
                    ArmorLogic.checkAndReplaceArmor(player);
                }
            });
        });
    }
}
