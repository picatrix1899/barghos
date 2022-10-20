//package org.barghos.math.api.bounds;
//
//import org.barghos.core.api.tuple2.Tup2dR;
//
///**
// * This interface represents a 2-dimensional double bounding volume object.
// * These are used for intersections (i.e. collision detection).
// * 
// * @author picatrix1899
// */
//public interface BoundingVolume2d
//{
//	/**
//	 * Returns true if the given tuple lies inside the bounding volume including its surface.
//	 * 
//	 * @param t The tuple to test with.
//	 * 
//	 * @return True, if the tuple lies inside the volume.
//	 */
//	default boolean isInside(Tup2dR t)
//	{
//		return isInside(t.getX(), t.getY());
//	}
//	
//	/**
//	 * Returns true if the given tuple definded by the components lies inside the bounding volume including its surface.
//	 * 
//	 * @param x The value of the x component of the tuple to test with.
//	 * @param y The value of the y component of the tuple to test with.
//	 * 
//	 * @return True, if the tuple lies inside the volume.
//	 */
//	boolean isInside(double x, double y);
//}
