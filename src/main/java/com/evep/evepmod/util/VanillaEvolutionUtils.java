package com.evep.evepmod.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.minecraft.util.EnumFacing;

public final class VanillaEvolutionUtils {
	public static final EnumFacing[] SIDE_DIRS = new EnumFacing[] {EnumFacing.NORTH, EnumFacing.SOUTH, EnumFacing.WEST, EnumFacing.EAST};

	public static final Map<String, Class<?>> classesFound = new HashMap<>();

	private static final List<UUID> warnedFails = new ArrayList<>();
	
	public enum ResourceType
	{
		GUI("gui"),
		GUI_ELEMENT("gui/elements"),
		SOUND("sound"),
		RENDER("render"),
		TEXTURE_BLOCKS("textures/blocks"),
		TEXTURE_ITEMS("textures/items"),
		MODEL("models"),
		INFUSE("infuse");

		private String prefix;

		ResourceType(String s)
		{
			prefix = s;
		}

		public String getPrefix()
		{
			return prefix + "/";
		}
	}

}
