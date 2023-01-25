package com.quattage.createindtech.mixin;

import com.quattage.createindtech.CreateIndustrialTech;

import net.minecraft.client.Minecraft;

import net.minecraft.client.main.GameConfig;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class TestMixin {
	@Inject(method = "<init>", at = @At("TAIL"))
	private void example$init(GameConfig gameConfig, CallbackInfo ci) {
		CreateIndustrialTech.LOGGER.info("Hello from {}", CreateIndustrialTech.NAME);
	}
}
