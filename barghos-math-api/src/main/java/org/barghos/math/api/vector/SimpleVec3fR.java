package org.barghos.math.api.vector;

import org.barghos.core.api.tuple3.Tup3fR;

public interface SimpleVec3fR extends Tup3fR
{
	/**
	 * Creates a new instance of the current class with the same component valuess.
	 * 
	 * @return A new instance.
	 */
	SimpleVec3fR copy();
}
