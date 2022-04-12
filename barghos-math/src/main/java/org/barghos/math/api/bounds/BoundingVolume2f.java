package org.barghos.math.api.bounds;

import org.barghos.core.api.tuple2.Tup2fR;

/**
 * This interface represents a 2-dimensional float bounding volume object.
 * These are used for intersections (i.e. collision detection).
 * 
 * @author picatrix1899
 */
public interface BoundingVolume2f
{
	/**
	 * Returns true if the given tuple lies inside the bounding volume including its surface.
	 * 
	 * @param t The tuple to test with.
	 * 
	 * @return True, if the tuple lies inside the volume.
	 */
	boolean isInside(Tup2fR t);
	
	/**
	 * Returns true if the given tuple definded by the components lies inside the bounding volume including its surface.
	 * 
	 * @param x The value of the x component of the tuple to test with.
	 * @param y The value of the y component of the tuple to test with.
	 * 
	 * @return True, if the tuple lies inside the volume.
	 */
	boolean isInside(float x, float y);
}
