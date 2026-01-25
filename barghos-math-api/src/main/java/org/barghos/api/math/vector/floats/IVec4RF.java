package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-invasive (read only) functions and methods for float vectors with two
 * dimensions.
 */
public interface IVec4RF
{	
	
	/**
	 * Returns the x component of the vector.
	 * 
	 * @return The x component.
	 */
	float x();
	
	/**
	 * Returns the y component of the vector.
	 * 
	 * @return The y component.
	 */
	float y();
	
	/**
	 * Returns the z component of the vector.
	 * 
	 * @return The z component.
	 */
	float z();

	/**
	 * Returns the w component of the vector.
	 * 
	 * @return The w component.
	 */
	float w();
	
	float at(int index);
	
	float[] toArray();

	float[] toArray(@ExtractionParam float[] res);
	
}
