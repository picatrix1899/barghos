package org.barghos.core.test.event;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;

import org.barghos.core.api.event.Event;
import org.barghos.core.api.event.EventReceiver;

import org.barghos.core.event.DefaultEventDelegate;

/**
 * This class provides component tests for the class {@link DefaultEventDelegate}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class DefaultEventDelegateTest
{
	/**
	 * This method is called after each test in this class.
	 */
	@AfterEach
	void cleanup()
	{
		ValueRelay.clear();
	}
	
	/**
	 * This test ensures, that the function {@link DefaultEventDelegate#registerReceiver(EventReceiver)}
	 * actually registers the receiver to the delegate and returns true,
	 * if the registering was successful.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void registerReceiverTest()
	{
		DefaultEventDelegate<TestEvent> delegate = new DefaultEventDelegate<>();
		
		EventReceiver<TestEvent> receiver = new EventReceiver<>() {
			public void raise(TestEvent original, TestEvent current)
			{
				ValueRelay.relayCall("raise");
			}
		};
		
		assertTrue(delegate.registerReceiver(receiver));
		assertFalse(delegate.registerReceiver(receiver)); // Receiver is already registered.
		
		delegate.raise(new TestEvent());
		
		assertEquals(true, ValueRelay.get("raise", false));
	}
	
	/**
	 * This test ensures, that the function {@link DefaultEventDelegate#unregisterReceiver(EventReceiver)}
	 * actually unregisters the receiver from the delegate and returns true,
	 * if the unregistering was successful.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void unregisterReceiverTest()
	{
		DefaultEventDelegate<TestEvent> delegate = new DefaultEventDelegate<>();
		
		EventReceiver<TestEvent> receiver = new EventReceiver<>() {
			public void raise(TestEvent original, TestEvent current)
			{
				ValueRelay.relayCall("raise");
			}
		};
		
		assertFalse(delegate.unregisterReceiver(receiver)); // Receiver was not registered.
		
		delegate.registerReceiver(receiver);
		
		delegate.raise(new TestEvent());
		
		assertEquals(true, ValueRelay.get("raise", false));

		ValueRelay.clear();
		
		assertTrue(delegate.unregisterReceiver(receiver));
		
		delegate.raise(new TestEvent());
		
		assertEquals(false, ValueRelay.get("raise", false));
	}
	
	/**
	 * This test ensures, that the function {@link DefaultEventDelegate#raise(Event)}
	 * actually broadcasts the event to all registered event receivers.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void raise_AllTest()
	{
		DefaultEventDelegate<TestEvent> delegate = new DefaultEventDelegate<>();
		
		EventReceiver<TestEvent> receiver1 = new EventReceiver<>() {
			public void raise(TestEvent original, TestEvent current)
			{
				ValueRelay.relayCall("raise1");
			}
		};
		EventReceiver<TestEvent> receiver2 = new EventReceiver<>() {
			public void raise(TestEvent original, TestEvent current)
			{
				ValueRelay.relayCall("raise2");
			}
		};
		EventReceiver<TestEvent> receiver3 = new EventReceiver<>() {
			public void raise(TestEvent original, TestEvent current)
			{
				ValueRelay.relayCall("raise3");
			}
		};
		
		delegate.registerReceiver(receiver1);
		delegate.registerReceiver(receiver2);
		delegate.registerReceiver(receiver3);
		
		delegate.raise(new TestEvent());
		
		assertEquals(true, ValueRelay.get("raise1", false));
		assertEquals(true, ValueRelay.get("raise2", false));
		assertEquals(true, ValueRelay.get("raise3", false));
	}
	
	/**
	 * This test ensures, that the function {@link DefaultEventDelegate#raise(Event)}
	 * sends a new clone of the original event per receiver and a shared clone of the original
	 * event to all receivers. The original instance must not be changed by any receiver.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void raise_EventCloneTest()
	{
		DefaultEventDelegate<TestEvent> delegate = new DefaultEventDelegate<>();
		
		final TestEvent event = new TestEvent();
		event.testValue = 10;
		
		EventReceiver<TestEvent> receiver1 = new EventReceiver<>() {
			@Override
			public void raise(TestEvent original, TestEvent current)
			{
				assertNotSame(event, original);
				assertNotSame(event, current);
				assertNotSame(original, current);
				assertEquals(10, original.testValue);
				assertEquals(10, current.testValue);
				
				original.testValue = 1;
				current.testValue = 1;
			}
		};
		
		EventReceiver<TestEvent> receiver2 = new EventReceiver<>() {
			@Override
			public void raise(TestEvent original, TestEvent current)
			{
				assertNotSame(event, original);
				assertNotSame(event, current);
				assertNotSame(original, current);
				assertEquals(10, original.testValue);
				assertEquals(1, current.testValue);
				
				original.testValue = 10;
				current.testValue = 2;
			}
		};
		
		EventReceiver<TestEvent> receiver3 = new EventReceiver<>() {
			@Override
			public void raise(TestEvent original, TestEvent current)
			{
				assertNotSame(event, original);
				assertNotSame(event, current);
				assertNotSame(original, current);
				assertEquals(10, original.testValue);
				assertEquals(2, current.testValue);
				
				original.testValue = 10;
				current.testValue = 3;
			}
		};
		
		delegate.registerReceiver(receiver1);
		delegate.registerReceiver(receiver2);
		delegate.registerReceiver(receiver3);
		
		TestEvent result = delegate.raise(event);
		
		assertEquals(10, event.testValue);
		assertEquals(3, result.testValue);
	}
	
	/**
	 * This class is a test implementation of {@link Event}.
	 * 
	 * @author picatrix1899
	 * 
	 * @since 1.0.0.0
	 */
	public static class TestEvent implements Event
	{	
		/**
		 * This is a test value of the event.
		 */
		public int testValue;
		
		/**
		 * Creates a new blank instance of the event.
		 * 
		 * @since 1.0.0.0
		 */
		public TestEvent() { }
		
		/**
		 * Creates a new instance of the event and adepts the values
		 * from the existing event.
		 * 
		 * @param event An existing event to adept the values from.
		 * 
		 * @since 1.0.0.0
		 */
		public TestEvent(TestEvent event)
		{
			this.testValue = event.testValue;
		}
		
		@Override
		public Event clone()
		{
			return new TestEvent(this);
		}
	}
}