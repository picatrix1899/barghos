package org.barghos.util.collection;;


public class KeyValuePairF<K>
{
	private float value;
	private K key;
	
	public KeyValuePairF() { }
	
	public KeyValuePairF(float value, K key)
	{
		set(value, key);
	}
	
	public KeyValuePairF<K> set(float value, K key)
	{
		value(value);
		key(key);
		
		return this;
	}
	
	public KeyValuePairF<K> key(K key)
	{
		this.key = key;
		
		return this;
	}
	
	public KeyValuePairF<K> value(float value)
	{
		this.value = value;
		
		return this;
	}
	
	public K key()
	{
		return this.key;
	}
	
	public float value()
	{
		return this.value;
	}
}
