package org.barghos.core.test.api.event;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.event.CancellableEvent;
import org.barghos.core.api.event.Event;

/**
 * This class provides component tests for the class {@link org.barghos.core.api.event.CancellableEvent}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class CancellableEventTest
{
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.event.CancellableEvent#setCancelled(boolean)}
	 * sets the cancellation status for the event correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCancelledTest()
	{
		CancellableEvent event = new CancellableEvent() {
			public Event clone()
			{
				return null;
			}
		};
		
		assertFalse(event.isCancelled());
		
		event.setCancelled(true);
		assertTrue(event.isCancelled());
		
		event.setCancelled(false);
		assertFalse(event.isCancelled());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.event.CancellableEvent#isCancelled()}
	 * returns the correct cancellation status of the event.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void isCancelledTest()
	{
		CancellableEvent event = new CancellableEvent() {
			public Event clone()
			{
				return null;
			}
		};
		
		assertFalse(event.isCancelled());
		
		event.setCancelled(true);
		assertTrue(event.isCancelled());
		
		event.setCancelled(false);
		assertFalse(event.isCancelled());
	}
}