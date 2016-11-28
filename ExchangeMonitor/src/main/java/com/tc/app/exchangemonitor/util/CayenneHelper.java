package com.tc.app.exchangemonitor.util;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.configuration.server.ServerRuntimeBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CayenneHelper
{
	private static final Logger LOGGER = LogManager.getLogger(CayenneHelper.class);
	private static final ServerRuntime cayenneServerRuntime;
	private static final ObjectContext cayenneObjectContext;

	static
	{
		try
		{
			//final Instant startTime = Instant.now();
			final long startTime = System.currentTimeMillis();
			cayenneServerRuntime = ServerRuntimeBuilder.builder().addConfig("cayenne/cayenne-ExchangeMonitor.xml").build();
			cayenneObjectContext = cayenneServerRuntime.newContext();
			//final Instant endTime = Instant.now();
			final long endTime = System.currentTimeMillis();
			LOGGER.info("It took " + (endTime - startTime) + " millisecs to create Cayenne Server Runtime.");
		}
		catch(final Throwable exception)
		{
			// Log the exception.
			LOGGER.error("ServerRuntime Creation Failed.", exception);
			throw new ExceptionInInitializerError(exception);
		}
		finally
		{
			//LOGGER.info(Duration.between(startTime, endTime));
			//System.out.println("cayenneServerRuntime : " + cayenneServerRuntime);
		}
	}

	public static void initializeCayenneServerRuntime()
	{
	}

	public static ServerRuntime getCayenneServerRuntime()
	{
		return cayenneServerRuntime;
	}
}