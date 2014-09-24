package org.rdgie.digitalarchive.controller.executor;

import org.rdgie.digitalarchive.controller.executor.CommandExecutor;

public interface CommandExecutorFactory
{
	CommandExecutor get(String commandName);
}