package net.pocketbukkit;

import java.io.File;
import java.io.IOException;

public interface PluginLoader{
	public boolean acceptsPlugin(File file) throws IOException;
	public PocketPlugin loadPlugin(File file) throws IOException;
}