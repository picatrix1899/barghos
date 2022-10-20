//package org.barghos.math.api.bounds;
//
//import org.barghos.core.api.tuple3.Tup3dR;
//
///**
// * This interface represents a 3-dimensional double bounding volume object.
// * These are used for intersections (i.e. collision detection).
// * 
// * @author picatrix1899
// */
//public interface BoundingVolume3d
//{
//	/**
//	 * Returns true if the given tuple lies inside the bounding volume including its surface.
//	 * 
//	 * @param t The tuple to test with.
//	 * 
//	 * @return True, if the tuple lies inside the volume.
//	 */
//	default boolean isInside(Tup3dR t)
//	{
//		return isInside(t.getX(), t.getY(), t.getZ());
//	}
//	
//	/**
//	 * Returns true if the given tuple definded by the components lies inside the bounding volume including its surface.
//	 * 
//	 * @param x The value of the x component of the tuple to test with.
//	 * @param y The value of the y component of the tuple to test with.
//	 * @param z The value of the z component of the tuple to test with.
//	 * 
//	 * @return True, if the tuple lies inside the volume.
//	 */
//	boolean isInside(double x, double y, double z);
//}
