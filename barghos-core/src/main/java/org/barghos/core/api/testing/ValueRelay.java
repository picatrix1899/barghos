package org.barghos.core.api.testing;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides a simple way for component tests to relay values or just the confirmation of a function call
 * from within an anonymous implementation to the test method itself. The relayed values should be cleared after
 * every test manually by calling {@link #clear()}.
 * 
 * @author picatrix1899
 */
public class ValueRelay
{
	/**
	 * This member stores the relayed values.
	 */
	private static Map<String,Object> values = new HashMap<>();
	
	/**
	 * Stores a value by a key to relay it to a different scope.
	 * 
	 * @param key The key that has to be used to retrieve the value later.
	 * @param value The value to relay.
	 */
	public static void relay(String key, Object value)
	{
		values.put(key, value);
	}
	
	/**
	 * Stores a function call confirmation as the boolean value "true" assigned to the key.
	 * 
	 * @param key The key that has to be used to retrieve the value later.
	 */
	public static void relayCall(String key)
	{
		values.put(key, true);
	}
	
	/**
	 * Stores a counter increase as a integer value auto increased by one every call assigned to the key.
	 * So every time this is called with the same key, the value assigned to the key get incremented by one.
	 * 
	 * @param key The key that has to be used to retrieve the value later.
	 */
	public static void relayCounterIncrease(String key)
	{
		int i = 0;
		
		if(values.containsKey(key)) i = (int)values.get(key);
		
		i++;
		
		values.put(key, i);
	}
	
	/**
	 * This retrieves a relayed value by its key.
	 * 
	 * @param key The key the desired value was assigned to.
	 * 
	 * @return The relayed value.
	 */
	public static Object get(String key)
	{
		return values.get(key);
	}
	
	/**
	 * This retrieves a relayed value by its key or if it is not present the given default value.
	 * 
	 * @param key The key the desired value was assigned to.
	 * @param defaultValue The default value that should be returned if the desired relayed value wasn't found.
	 * 
	 * @return The relayed value.
	 */
	public static Object get(String key, Object defaultValue)
	{
		if(!values.containsKey(key)) return defaultValue;
		return values.get(key);
	}
	
	/**
	 * This clears all relayed values.
	 */
	public static void clear()
	{
		values.clear();
	}
}