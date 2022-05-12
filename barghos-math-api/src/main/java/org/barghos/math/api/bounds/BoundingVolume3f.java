package org.barghos.math.api.bounds;

import org.barghos.core.api.tuple3.Tup3fR;

/**
 * This interface represents a 3-dimensional float bounding volume object.
 * These are used for intersections (i.e. collision detection).
 * 
 * @author picatrix1899
 */
public interface BoundingVolume3f
{
	/**
	 * Returns true if the given tuple lies inside the bounding volume including its surface.
	 * 
	 * @param t The tuple to test with.
	 * 
	 * @return True, if the tuple lies inside the volume.
	 */
	default boolean isInside(Tup3fR t)
	{
		return isInside(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Returns true if the given tuple definded by the components lies inside the bounding volume including its surface.
	 * 
	 * @param x The value of the x component of the tuple to test with.
	 * @param y The value of the y component of the tuple to test with.
	 * @param z The value of the z component of the tuple to test with.
	 * 
	 * @return True, if the tuple lies inside the volume.
	 */
	boolean isInside(float x, float y, float z);
}
