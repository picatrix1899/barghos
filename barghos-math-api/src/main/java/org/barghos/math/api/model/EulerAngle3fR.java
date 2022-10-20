//package org.barghos.math.api.model;
//
//import org.barghos.core.api.tuple3.Tup3fR;
//
///**
// * This interface grants readonly access to a semi-vector consisting of the three euler angles pitch, yaw and roll in radians.
// * 
// * @author picatrix1899
// */
//public interface EulerAngle3fR extends Tup3fR
//{
//	/** {@inheritDoc} */
//	@Override
//	default float getX()
//	{
//		return getPitch();
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default float getY()
//	{
//		return getYaw();
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default float getZ()
//	{
//		return getRoll();
//	}
//	
//	/**
//	 * Returns the pitch euler angle in degrees.
//	 * 
//	 * @return the pitch angle in degrees.
//	 */
//	float getPitchDeg();
//	
//	/**
//	 * Returns the pitch euler angle in radians.
//	 * 
//	 * @return the pitch angle in radians.
//	 */
//	float getPitch();
//	
//	/**
//	 * Returns the yaw euler angle in degrees.
//	 * 
//	 * @return the yaw angle in degrees.
//	 */
//	float getYawDeg();
//	
//	/**
//	 * Returns the yaw euler angle in radians.
//	 * 
//	 * @return the yaw angle in radians.
//	 */
//	float getYaw();
//	
//	/**
//	 * Returns the roll euler angle in degrees.
//	 * 
//	 * @return the roll angle in degrees.
//	 */
//	float getRollDeg();
//	
//	/**
//	 * Returns the roll euler angle in radians.
//	 * 
//	 * @return the roll angle in radians.
//	 */
//	float getRoll();
//}
