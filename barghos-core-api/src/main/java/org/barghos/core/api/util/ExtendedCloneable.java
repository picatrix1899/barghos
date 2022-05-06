package org.barghos.core.api.util;


/**
 * This interface provides more flexibility for cloning operations like functions
 * for shallow or deep cloning.
 * 
 * @author picatrix1899
 */
public interface ExtendedCloneable extends Cloneable
{
	/**
	 * Returns true if the current object is cloneable in its current state.
	 * 
	 * @return True, if the current object is cloneable.
	 */
	default boolean isCloneable()
	{
		return true;
	}
	
	/**
	 * Returns true if the current object is deep cloneable in its current state.
	 * 
	 * @return True, if the current object is deep cloneable.
	 */
	default boolean isDeepCloneable()
	{
		return true;
	}
	
	/**
	 * Creates a shallow clone of the current object.
	 * Therefore any references to other objects will be copied
	 * and will continue to reference the same object instance.
	 * The clone operation may not be supported due to the state of the object.
	 * In that case a {@link CloneNotSupportedException} will be thrown.
	 * 
	 * @return A shallow clone of the current object.
	 */
	default Object shallowClone()
	{
		return clone();
	}
	
	/**
	 * Creates a deep clone of the current object.
	 * Therefore any referenced objects will be cloned aswell.
	 * The clone operation may not be supported due to the state of the object.
	 * In that case a {@link CloneNotSupportedException} will be thrown.
	 * 
	 * @return A deep clone of the current object.
	 */
	default Object deepClone()
	{
		return clone();
	}
	
	/**
	 * @return A new deep clone of the current object.
	 */
	Object clone();
}
