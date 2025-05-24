package org.barghos.util.id;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorL
{
	private final AtomicLong counter = new AtomicLong(0);
	
	public long next()
	{
		return this.counter.incrementAndGet();
	}
}
