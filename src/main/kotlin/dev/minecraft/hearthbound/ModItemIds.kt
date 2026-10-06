package dev.minecraft.hearthbound

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item

object ModItemIds {
    fun create(name: String): ResourceKey<Item> {
        return ResourceKey.create(
            Registries.ITEM,
            HearthboundColonies.id(name)
        )
    }
}