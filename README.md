![Minecraft Version](https://img.shields.io/badge/Minecraft-1.21+-62B246?style=for-the-badge&logo=minecraft&logoColor=white)
![Loader](https://img.shields.io/badge/Loader-Fabric-f0d2b4?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge&logo=openjdk&logoColor=white)

# 🛡️ Auto Armor (Fabric)

Developed by **DizzyZ7**.

A smart utility mod for Minecraft Fabric that ensures you are never left unprotected. It automatically detects broken armor pieces and equips a replacement from your inventory.

## ✨ Features

* **🛡️ Seamless Protection:** Automatically detects when a helmet, chestplate, leggings, or boots break.
* **📦 Smart Search:** Scans the player's inventory for the correct item type and equips it instantly.
* **⚡ Performance Optimized:** Logic is throttled to run once per second (20 ticks), ensuring zero impact on server TPS.
* **🎮 Survival Friendly:** Does not trigger in Creative or Spectator modes to maintain game integrity.

## 🛠️ Technical Implementation

The mod demonstrates several key development concepts:
* **Background Processing:** Implements `ServerTickEvents.END_SERVER_TICK` for continuous state monitoring.
* **Type Safety:** Uses `instanceof ArmorItem` and `EquipmentSlot` enums to ensure items are placed in the correct slots.
* **Resource Management:** Optimized loop structures to minimize memory overhead during inventory scanning.

## 🚀 Installation

1. Ensure you have the **Fabric Loader** installed.
2. Drop the mod `.jar` file and **Fabric API** into your `mods` folder.
3. Enjoy automated protection!
