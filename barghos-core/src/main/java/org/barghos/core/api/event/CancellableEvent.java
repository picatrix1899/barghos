package org.barghos.core.api.event;

/**
 * This interface represents a cancellable event within the event system.
 * 
 * @author picatrix1899
 */
public interface CancellableEvent extends Event
{
	/**
	 * Sets the cancelleation status of this event.
	 * 
	 * @param isCancelled Setting this to true will mark the event as cancelled.
	 * Setting this to false on an already cancelled event might uncancel it.
	 * This depends on the implementation.
	 */
	public void setCancelled(boolean isCancelled);
	
	/**
	 * Returns the cancellation status of this event.
	 * 
	 * @return True if the event is marked as cancelled. Otherwise false.
	 */
	public boolean isCancelled();
}