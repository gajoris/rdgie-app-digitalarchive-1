package org.rdgie.digitalarchive.controller.executor;

import org.rdgie.digitalarchive.controller.executor.CommandExecutionContext;

public interface CommandExecutor
{
	void execute(CommandExecutionContext commandExecutionContext) throws Exception;
}
