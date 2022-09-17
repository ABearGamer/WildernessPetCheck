package com.WildernessPetCheck;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class WildernessPetCheckTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(WildernessPetCheckPlugin.class);
		RuneLite.main(args);
	}
}