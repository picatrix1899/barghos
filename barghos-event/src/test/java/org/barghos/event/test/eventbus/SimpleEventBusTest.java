package org.barghos.event.test.eventbus;
//package org.barghos.core.test.eventbus;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//
//import org.barghos.core.api.event.Event;
//import org.barghos.core.api.eventbus.EventBus;
//import org.barghos.core.api.eventbus.EventBusSubscriber;
//import org.barghos.core.api.eventbus.EventHandlerDelegate;
//import org.barghos.core.api.testing.ValueRelay;
//
//import org.barghos.core.eventbus.SimpleEventBus;
//
///**
// * This class provides component tests for the class {@link SimpleEventBus}
// * 
// * @author picatrix1899
// */
//class SimpleEventBusTest
//{
//	
//	/**
//	 * This method is called after each test in this class.
//	 */
//	@AfterEach
//	void cleanup()
//	{
//		ValueRelay.clear();
//	}
//	
//	/**
//	 * This test ensures, that the method {@link SimpleEventBus#subscribe(EventBusSubscriber)}
//	 * correctly calls the {@link EventBusSubscriber#registerDelegates(EventBus)} method with
//	 * the current event bus as parameter.
//	 */
//	@Test
//	void subscribe_EventBusSubscriberTest()
//	{
//		final SimpleEventBus originalBus = new SimpleEventBus();
//		
//		EventBusSubscriber subscriber = new EventBusSubscriber(){
//			public void registerDelegates(EventBus bus)
//			{
//				assertSame(originalBus, bus);
//				ValueRelay.relay("registerDelegates", false);
//			}
//		};
//		
//		originalBus.subscribe(subscriber);
//		
//		assertEquals(false, ValueRelay.get("registerDelegates"));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link SimpleEventBus#subscribe(Object)}
//	 * does not register any event handlers from a class which has not the {@link EventBus.Subscriber} annotation.
//	 */
//	@Test
//	void subscribe_ReflectionSubscriber_NoClassAnnotationTest()
//	{
//		SimpleEventBus originalBus = new SimpleEventBus();
//		
//		TestSubscriber subscriber = new TestSubscriber();
//		
//		originalBus.subscribe(subscriber);
//		
//		originalBus.raise(new TestEvent());
//		
//		assertEquals(false, ValueRelay.get("handlerWithoutAnnotation", false));
//		assertEquals(false, ValueRelay.get("handlerWithAnnotation", false));
//		assertEquals(false, ValueRelay.get("handlerWithInvalidParameter", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link SimpleEventBus#subscribe(Object)}
//	 * registers all event handlers from a class which has the {@link EventBus.Subscriber} annotation,
//	 * that have the {@link EventBus.EventHandler} annotation and a valid event type as parameter.
//	 */
//	@Test
//	void subscribe_ReflectionSubscriber_ClassAnnotationTest()
//	{
//		SimpleEventBus originalBus = new SimpleEventBus();
//		
//		TestSubscriber_WithAnnotation subscriber = new TestSubscriber_WithAnnotation();
//		
//		originalBus.subscribe(subscriber);
//		
//		originalBus.raise(new TestEvent());
//		
//		assertEquals(false, ValueRelay.get("handlerWithoutAnnotation", false));
//		assertEquals(true, ValueRelay.get("handlerWithAnnotation", false));
//		assertEquals(true, ValueRelay.get("handlerWithMultipleAnnotations", false));
//		assertEquals(false, ValueRelay.get("handlerWithInvalidParameterCountLess", false));
//		assertEquals(false, ValueRelay.get("handlerWithInvalidParameterCountMore", false));
//		assertEquals(false, ValueRelay.get("handlerWithInvalidParameter", false));
//		assertEquals(true, ValueRelay.get("handlerWithMultipleAnnotationsInvalidParameter", false));
//		assertEquals(false, ValueRelay.get("handlerWithMultipleAnnotationsInvalidParameterCountLess", false));
//		assertEquals(false, ValueRelay.get("handlerWithMultipleAnnotationsInvalidParameterCountMore", false));
//		
//		ValueRelay.clear();
//		
//		originalBus.raise(new Test2Event());
//		
//		assertEquals(false, ValueRelay.get("handlerWithoutAnnotation", false));
//		assertEquals(false, ValueRelay.get("handlerWithAnnotation", false));
//		assertEquals(true, ValueRelay.get("handlerWithMultipleAnnotations", false));
//		assertEquals(false, ValueRelay.get("handlerWithInvalidParameterCountLess", false));
//		assertEquals(false, ValueRelay.get("handlerWithInvalidParameterCountMore", false));
//		assertEquals(false, ValueRelay.get("handlerWithInvalidParameter", false));
//		assertEquals(false, ValueRelay.get("handlerWithMultipleAnnotationsInvalidParameter", false));
//		assertEquals(false, ValueRelay.get("handlerWithMultipleAnnotationsInvalidParameterCountLess", false));
//		assertEquals(false, ValueRelay.get("handlerWithMultipleAnnotationsInvalidParameterCountMore", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link SimpleEventBus#raise(Event)} calls the correct delegates.
//	 */
//	@Test
//	void raiseTest()
//	{
//		SimpleEventBus originalBus = new SimpleEventBus();
//		
//		originalBus.registerEventHandlerDelegate(TestEvent.class, new EventHandlerDelegate<>() {
//			public void call(TestEvent event)
//			{
//				ValueRelay.relayCall("delegateTestEvent");
//			}
//		});
//		
//		originalBus.raise(new TestEvent());
//		
//		assertEquals(true, ValueRelay.get("delegateTestEvent", false));
//		
//		ValueRelay.clear();
//		
//		originalBus.raise(new Test2Event());
//		
//		assertEquals(false, ValueRelay.get("delegateTestEvent", false));
//	}
//	
//	/**
//	 * This class represents an event bus subscriber without the {@link EventBus.Subscriber} annotation for testing.
//	 * Therefore none of the event handlers within will be registered to the event bus.
//	 * 
//	 * @author picatrix1899
//	 */
//	public static class TestSubscriber
//	{
//		/**
//		 * This test event handler has no {@link EventBus.EventHandler} annotation.
//		 * Therefore it wont be registered to the event bus.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		public void handlerWithoutAnnotation(Object event)
//		{
//			ValueRelay.relayCall("handlerWithoutAnnotation");
//		}
//		
//		/**
//		 * This test event handler has a valid parameter type and a valid {@link EventBus.EventHandler} annotation.
//		 * Therefore it would be registered to the event bus, but the class this event handler is in has
//		 * no {@link EventBus.Subscriber} annotation. Because of that no event handlers will be registered.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		public void handlerWithAnnotation(Object event)
//		{
//			ValueRelay.relayCall("handlerWithAnnotation");
//		}
//		
//		/**
//		 * This test event handler has a valid parameter type and multiple valid {@link EventBus.EventHandler} annotations.
//		 * Therefore it would be registered to the event bus, but the class this event handler is in has
//		 * no {@link EventBus.Subscriber} annotation. Because of that no event handlers will be registered.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		@EventBus.EventHandler(eventType = Test2Event.class)
//		public void handlerWithMultipleAnnotations(Object event)
//		{
//			ValueRelay.relayCall("handlerWithMultipleAnnotations");
//		}
//		
//		/**
//		 * This test event handler has an invalid number of parameters (no at all) and a
//		 * valid {@link EventBus.EventHandler} annotation.
//		 * Therefore it wont be registered to the event bus.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		public void handlerWithInvalidParameterCountLess()
//		{
//			ValueRelay.relayCall("handlerWithInvalidParameterCountLess");
//		}
//		
//		/**
//		 * This test event handler has an invalid number of parameters (> 1) and a
//		 * valid {@link EventBus.EventHandler} annotation.
//		 * Therefore it wont be registered to the event bus.
//		 * 
//		 * @param event The event this event handler will react to.
//		 * @param obj A random parameter that is too much.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		public void handlerWithInvalidParameterCountMore(Object event, Object obj)
//		{
//			ValueRelay.relayCall("handlerWithInvalidParameterCountMore");
//		}
//		
//		/**
//		 * This test event handler has an invalid parameter type and a valid {@link EventBus.EventHandler} annotation.
//		 * Therefore it wont be registered to the event bus.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		public void handlerWithInvalidParameter(String event)
//		{
//			ValueRelay.relayCall("handlerWithInvalidParameter");
//		}
//		
//		/**
//		 * This test event handler has an invalid parameter type for one of the annotations and
//		 * multiple valid {@link EventBus.EventHandler} annotations.
//		 * Therefore it would be registered to the event bus for only the valid annotations, but the class this event handler
//		 * is in has no {@link EventBus.Subscriber} annotation. Because of that no event handlers will be registered.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		@EventBus.EventHandler(eventType = Test2Event.class)
//		public void handlerWithMultipleAnnotationsInvalidParameter(TestEvent event)
//		{
//			ValueRelay.relayCall("handlerWithMultipleAnnotationsInvalidParameter");
//		}
//		
//		/**
//		 * This test event handler has an invalid number of parameters (no at all) and
//		 * multiple valid {@link EventBus.EventHandler} annotations.
//		 * Therefore it wont be registered to the event bus.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		@EventBus.EventHandler(eventType = Test2Event.class)
//		public void handlerWithMultipleAnnotationsInvalidParameterCountLess()
//		{
//			ValueRelay.relayCall("handlerWithMultipleAnnotationsInvalidParameterCountLess");
//		}
//		
//		/**
//		 * This test event handler has an invalid number of parameters (> 1) and
//		 * multiple valid {@link EventBus.EventHandler} annotations.
//		 * Therefore it wont be registered to the event bus.
//		 * 
//		 * @param event The event this event handler will react to.
//		 * @param obj A random parameter that is too much.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		@EventBus.EventHandler(eventType = Test2Event.class)
//		public void handlerWithMultipleAnnotationsInvalidParameterCountMore(Object event, Object obj)
//		{
//			ValueRelay.relayCall("handlerWithMultipleAnnotationsInvalidParameterCountMore");
//		}
//	}
//	
//	/**
//	 * This class represents an event bus subscriber with the {@link EventBus.Subscriber} annotation for testing.
//	 * 
//	 * @author picatrix1899
//	 */
//	@EventBus.Subscriber
//	public static class TestSubscriber_WithAnnotation
//	{
//		/**
//		 * This test event handler has no {@link EventBus.EventHandler} annotation.
//		 * Therefore it wont be registered to the event bus.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		public void handlerWithoutAnnotation(Object event)
//		{
//			ValueRelay.relayCall("handlerWithoutAnnotation");
//		}
//		
//		/**
//		 * This test event handler has a valid parameter type and a valid {@link EventBus.EventHandler} annotation.
//		 * Therefore it would be registered to the event bus, but the class this event handler is in has
//		 * no {@link EventBus.Subscriber} annotation. Because of that no event handlers will be registered.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		public void handlerWithAnnotation(Object event)
//		{
//			ValueRelay.relayCall("handlerWithAnnotation");
//		}
//
//		/**
//		 * This test event handler has a valid parameter type and multiple valid {@link EventBus.EventHandler} annotations.
//		 * Therefore it would be registered to the event bus, but the class this event handler is in has
//		 * no {@link EventBus.Subscriber} annotation. Because of that no event handlers will be registered.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		@EventBus.EventHandler(eventType = Test2Event.class)
//		public void handlerWithMultipleAnnotations(Object event)
//		{
//			ValueRelay.relayCall("handlerWithMultipleAnnotations");
//		}
//		
//		/**
//		 * This test event handler has an invalid number of parameters (no at all) and a
//		 * valid {@link EventBus.EventHandler} annotation.
//		 * Therefore it wont be registered to the event bus.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		public void handlerWithInvalidParameterCountLess()
//		{
//			ValueRelay.relayCall("handlerWithInvalidParameterCountLess");
//		}
//		
//		/**
//		 * This test event handler has an invalid number of parameters (> 1) and a
//		 * valid {@link EventBus.EventHandler} annotation.
//		 * Therefore it wont be registered to the event bus.
//		 * 
//		 * @param event The event this event handler will react to.
//		 * @param obj A random parameter that is too much.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		public void handlerWithInvalidParameterCountMore(Object event, Object obj)
//		{
//			ValueRelay.relayCall("handlerWithInvalidParameterCountMore");
//		}
//		
//		/**
//		 * This test event handler has an invalid parameter type and a valid {@link EventBus.EventHandler} annotation.
//		 * Therefore it wont be registered to the event bus.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		public void handlerWithInvalidParameter(String event)
//		{
//			ValueRelay.relayCall("handlerWithInvalidParameter");
//		}
//		
//		/**
//		 * This test event handler has an invalid parameter type for one of the annotations and
//		 * multiple valid {@link EventBus.EventHandler} annotations.
//		 * Therefore it would be registered to the event bus for only the valid annotations, but the class this event handler
//		 * is in has no {@link EventBus.Subscriber} annotation. Because of that no event handlers will be registered.
//		 * 
//		 * @param event The event this event handler will react to.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		@EventBus.EventHandler(eventType = Test2Event.class)
//		public void handlerWithMultipleAnnotationsInvalidParameter(TestEvent event)
//		{
//			ValueRelay.relayCall("handlerWithMultipleAnnotationsInvalidParameter");
//		}
//		
//		/**
//		 * This test event handler has an invalid number of parameters (no at all) and
//		 * multiple valid {@link EventBus.EventHandler} annotations.
//		 * Therefore it wont be registered to the event bus.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		@EventBus.EventHandler(eventType = Test2Event.class)
//		public void handlerWithMultipleAnnotationsInvalidParameterCountLess()
//		{
//			ValueRelay.relayCall("handlerWithMultipleAnnotationsInvalidParameterCountLess");
//		}
//		
//		/**
//		 * This test event handler has an invalid number of parameters (> 1) and
//		 * multiple valid {@link EventBus.EventHandler} annotations.
//		 * Therefore it wont be registered to the event bus.
//		 * 
//		 * @param event The event this event handler will react to.
//		 * @param obj A random parameter that is too much.
//		 */
//		@EventBus.EventHandler(eventType = TestEvent.class)
//		@EventBus.EventHandler(eventType = Test2Event.class)
//		public void handlerWithMultipleAnnotationsInvalidParameterCountMore(Object event, Object obj)
//		{
//			ValueRelay.relayCall("handlerWithMultipleAnnotationsInvalidParameterCountMore");
//		}
//	}
//	
//	/**
//	 * This class represents a test implementation for an event that can be raised over the event bus.
//	 * 
//	 * @author picatrix1899
//	 */
//	public static class TestEvent implements Event
//	{
//		/**
//		 * This member contains a test value;
//		 */
//		public String value;
//		
//		@Override
//		public TestEvent clone()
//		{
//			TestEvent event = new TestEvent();
//			event.value = value;
//			
//			return event;
//		}
//	}
//	
//	/**
//	 * This class represents a test implementation for an event that can be raised over the event bus.
//	 * 
//	 * @author picatrix1899
//	 */
//	public static class Test2Event implements Event
//	{
//		/**
//		 * This member contains a test value;
//		 */
//		public String value;
//		
//		@Override
//		public TestEvent clone()
//		{
//			TestEvent event = new TestEvent();
//			event.value = value;
//			
//			return event;
//		}
//	}
//}