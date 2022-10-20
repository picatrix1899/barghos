package org.barghos.math.api.vector;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.math.BarghosMath;
import org.barghos.core.api.nio.buffer.BufferableDoubleR;
import org.barghos.core.api.nio.buffer.BufferableFloatR;

/**
 * This interface grants readonly access to any quaternion.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface QuatR extends BufferableDoubleR, BufferableFloatR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	double getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	double getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	double getZ();
	
	/**
	 * Returns the w value from the tuple.
	 * 
	 * @return The w value from the tuple.
	 */
	double getW();
	
	/**
	 * Returns the number of dimensions of the tuple.
	 * That is the count of components in this tuple.
	 * 
	 * @return The number of dimensions.
	 */
	default int getDimensions()
	{
		return 4;
	}
	
	/**
	 * Returns the value of the component at the specified index from the tuple.
	 * 
	 * @param index The index of the value to return
	 * 
	 * @return The value at the specified index from the tuple.
	 */
	default double getByIndex(int index)
	{
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
			case 2: return getZ();
			case 3: return getW();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/**
	 * Returns all components of the tuple as a new array.
	 * Any modifications to the result array will not alter the values in the tuple.
	 * 
	 * @return The result array with all components in it.
	 */
	default double[] toArray()
	{
		return toArray(new double[getDimensions()]);
	}
	
	/**
	 * Returns all components of the tuple as the given array.
	 * The array has to consist of as many entries as this tuple has dimensions.
	 * Any modifications to the result array will not alter the values in the tuple.
	 * 
	 * @param res The result array.
	 * 
	 * @return The result array with all components in it.
	 */
	default double[] toArray(@ExtractionParam double[] res)
	{
		res[0] = getX();
		res[1] = getY();
		res[2] = getZ();
		res[3] = getW();
		
		return res;
	}
	
	/**
	 * Puts the components of the tuple into the given buffer.
	 * 
	 * @param buffer The buffer to put the components into.
	 * 
	 * @return The buffer.
	 */
	default DoubleBuffer toBuffer(DoubleBuffer buffer)
	{
		buffer.put(getX());
		buffer.put(getY());
		buffer.put(getZ());
		buffer.put(getW());
		
		return buffer;
	}
	
	/**
	 * Puts the components of the tuple into the given buffer.
	 * 
	 * @param buffer The buffer to put the components into.
	 * 
	 * @return The buffer.
	 */
	default FloatBuffer toBuffer(FloatBuffer buffer)
	{
		buffer.put((float)getX());
		buffer.put((float)getY());
		buffer.put((float)getZ());
		buffer.put((float)getW());
		
		return buffer;
	}
	
	/**
	 * @return A new instance of the current quaternion with the same component values.
	 */
	QuatR clone();
	
	/**
	 * Calculates the inverse length (magnitude, norm) of the quaternion and returns it as double.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |Q|}
	 * 
	 * @return The inverse length.
	 */
	default double inverseLength()
	{
		return BarghosMath.invSqrt(squaredLength());
	}
	
	/**
	 * Calculates the inverse length (magnitude, norm) of the quaternion and returns it as float.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |Q|}
	 * 
	 * @return The inverse length.
	 */
	default float inverseLengthf()
	{
		return (float)inverseLength();
	}
	
	/**
	 * Calculates the length (magnitude, norm) of the quaternion and returns it as double.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |Q|}
	 * 
	 * @return The length.
	 */
	default double length()
	{
		return BarghosMath.sqrt(squaredLength());
	}
	
	/**
	 * Calculates the length (magnitude, norm) of the quaternion and returns it as float.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |Q|}
	 * 
	 * @return The length.
	 */
	default float lengthf()
	{
		return (float)length();
	}
	
	/**
	 * Calculates the squared length (magnitude, norm) of the quaternion and returns it as double.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |Q|^2}
	 * 
	 * @return The squared length.
	 */
	default double squaredLength()
	{
		double x = getX();
		double y = getY();
		double z = getZ();
		double w = getW();
		
		return x * x + y * y + z * z + w * w;
	}

	/**
	 * Calculates the squared length (magnitude, norm) of the quaternion and returns it as float.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |Q|^2}
	 * 
	 * @return The squared length.
	 */
	default float squaredLengthf()
	{
		return (float)squaredLength();
	}
	
	/**
	 * Calculates the dot (scalar) product between this quaternionen and the given quaternion {@code (q)} and returns it as double.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q . q}
	 * 
	 * @param q The other quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	default double dot(QuatR q)
	{
		return getX() * q.getX() + getY() * q.getY() + getZ() * q.getZ() + getW() * q.getW();
	}
	
	/**
	 * Calculates the dot (scalar) product between this quaternionen and the given quaternion {@code (q)} and returns it as float.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q . q}
	 * 
	 * @param q The other quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	default float dotf(QuatR q)
	{
		return (float)dot(q);
	}
	
	/**
	 * Extracts the half angle of the rotation around the rotation axis and returns it as double.
	 * 
	 * @return The half angle of the rotation.
	 */
	default double getHalfAngle()
	{
		return Math.acos(getW());
	}
	
	/**
	 * Extracts the half angle of the rotation around the rotation axis and returns it as float.
	 * 
	 * @return The half angle of the rotation.
	 */
	default float getHalfAnglef()
	{
		return (float)getHalfAngle();
	}
	
	/**
	 * Extracts the angle of the rotation around the rotation axis and returns it as double.
	 * 
	 * @return The angle of the rotation.
	 */
	default double getAngle()
	{
		return 2.0 * BarghosMath.acos(getW());
	}
	
	/**
	 * Extracts the angle of the rotation around the rotation axis and returns it as float.
	 * 
	 * @return The angle of the rotation.
	 */
	default float getAnglef()
	{
		return (float)getAngle();
	}
	
	/**
	 * Extracts the rotation axis as float vector and saves the result in the given result vector.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param res The result vector.
	 * 
	 * @return The result vector with the rotation axis.
	 */
	default <T extends Vec3fC> T getAxisf(T res)
	{
		double halfAngle = BarghosMath.acos(getW());
		double invSinHalfAngle = BarghosMath.invSqrt(1.0 - halfAngle * halfAngle);
		
		double aX = getX() * invSinHalfAngle;
		double aY = getY() * invSinHalfAngle;
		double aZ = getZ() * invSinHalfAngle;
		
		double invLength = BarghosMath.invSqrt(aX * aX + aY * aY + aZ * aZ); 

		res.set((float)(aX * invLength), (float)(aY * invLength), (float)(aZ * invLength));
		
		return res;
	}
	
	/**
	 * Multiplies this quaternion with the given quaternion {@code (q)} and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q * q}
	 * 
	 * @param q The other quaternion.
	 * 
	 * @return The new quaternion.
	 */
	default QuatR mulN(QuatR q)
	{
		return mulN(q.getX(), q.getY(), q.getZ(), q.getW());
	}
	
	/**
	 * Multiplies this quaternion with the given quaternion {@code (q[3]; (q[0], q[1], q[2]))} and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q * (q[3]; (q[0], q[1], q[2]))}
	 * 
	 * @param q The other quaternion.
	 * 
	 * @return The new quaternion.
	 */
	default QuatR mulN(double[] q)
	{
		return mulN(q[0], q[1], q[2], q[3]);
	}
	
	/**
	 * Multiplies this quaternion with the given quaternion {@code (q[3]; (q[0], q[1], q[2]))} and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q * (q[3]; (q[0], q[1], q[2]))}
	 * 
	 * @param q The other quaternion.
	 * 
	 * @return The new quaternion.
	 */
	default QuatR mulN(float[] q)
	{
		return mulN(q[0], q[1], q[2], q[3]);
	}
	
	/**
	 * Multiplies this quaternion with the given quaternion {@code (w; (x, y, z))} and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q * (w; (x, y, z))}
	 * 
	 * @param x The value of the x component of the other quaternion.
	 * @param y The value of the y component of the other quaternion.
	 * @param z The value of the z component of the other quaternion.
	 * @param w The value of the w component of the other quaternion.
	 * 
	 * @return The new quaternion.
	 */
	QuatR mulN(double x, double y, double z, double w);
	
	/**
	 * Multiplies the given quaternion {@code (q)} with this quaternion and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q * Q}
	 * 
	 * @param q The other quaternion.
	 * 
	 * @return The new quaternion.
	 */
	default QuatR revMulN(QuatR q)
	{
		return revMulN(q.getX(), q.getY(), q.getZ(), q.getW());
	}
	
	/**
	 * Multiplies the given quaternion {@code (q[3]; (q[0], q[1], q[2]))} with this quaternion and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[3]; (q[0], q[1], q[2])) * Q}
	 * 
	 * @param q The other quaternion.
	 * 
	 * @return The new quaternion.
	 */
	default QuatR revMulN(double[] q)
	{
		return revMulN(q[0], q[1], q[2], q[3]);
	}
	
	/**
	 * Multiplies the given quaternion {@code (q[3]; (q[0], q[1], q[2]))} with this quaternion and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[3]; (q[0], q[1], q[2])) * Q}
	 * 
	 * @param q The other quaternion.
	 * 
	 * @return The new quaternion.
	 */
	default QuatR revMulN(float[] q)
	{
		return revMulN(q[0], q[1], q[2], q[3]);
	}
	
	/**
	 * Multiplies the given quaternion {@code (w; (x, y, z))} this quaternion and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; (x, y, z)) * Q}
	 * 
	 * @param x The value of the x component of the other quaternion.
	 * @param y The value of the y component of the other quaternion.
	 * @param z The value of the z component of the other quaternion.
	 * @param w The value of the w component of the other quaternion.
	 * 
	 * @return The new quaternion.
	 */
	QuatR revMulN(double x, double y, double z, double w);
	
	/**
	 * Normalizes the quaternion and saves the result in a new quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @return The new quaternion.
	 */
	QuatR normalizeN();
	
	// MISSING_DOC
	QuatR inverseN();
	
	// MISSING_DOC
	QuatR conjugateN();
	
	// MISSING_DOC
	default QuatR rotateN(Vec3fR axis, double angle)
	{
		return rotateN(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	QuatR rotateN(double x, double y, double z, double angle);
	
	// MISSING_DOC
	default QuatR rotateDegN(Vec3fR axis, double angle)
	{
		return rotateN(axis.getX(), axis.getY(), axis.getZ(), angle * BarghosMath.DEG_TO_RAD);
	}
	
	// MISSING_DOC
	default QuatR rotateDegN(double x, double y, double z, double angle)
	{
		return rotateN(x, y, z, angle * BarghosMath.DEG_TO_RAD);
	}
	
	// MISSING_DOC
	default QuatR rotateGlobalN(Vec3fR axis, double angle)
	{
		return rotateGlobalN(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	QuatR rotateGlobalN(double x, double y, double z, double angle);
	
	// MISSING_DOC
	default QuatR rotateGlobalDegN(Vec3fR axis, double angle)
	{
		return rotateGlobalN(axis.getX(), axis.getY(), axis.getZ(), angle * BarghosMath.DEG_TO_RAD);
	}
	
	// MISSING_DOC
	default QuatR rotateGlobalDegN(double x, double y, double z, double angle)
	{
		return rotateGlobalN(x,y,z, angle * BarghosMath.DEG_TO_RAD);
	}
	
	// MISSING_DOC
	QuatR scaleN(double factor);
	
	// MISSING_DOC
	default QuatR integrateN(Vec3fR av, double dt)
	{
		return integrateN(av.getX(), av.getY(), av.getZ(), dt);
	}
	
	// MISSING_DOC
	QuatR integrateN(double avX, double avY, double avZ, double dt);
	
	/**
	 * Multiplies this quaternion with the given quaternion {@code (q)} and saves the result in the result quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q * q}
	 * 
	 * @param <T> The type of the result quaternion.
	 * 
	 * @param q The other quaternion.
	 * @param res The result quaternion.
	 * 
	 * @return The result quaternion with the result.
	 */
	default <T extends QuatC> T mulR(QuatR q, T res)
	{
		return mulR(q.getX(), q.getY(), q.getZ(), q.getW(), res);
	}
	
	/**
	 * Multiplies this quaternion with the given quaternion {@code (q[3]; (q[0], q[1], q[2]))} and saves the result in the result quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q * (q[3]; (q[0], q[1], q[2]))}
	 * 
	 * @param <T> The type of the result quaternion.
	 * 
	 * @param q The other quaternion.
	 * @param res The result quaternion.
	 * 
	 * @return The result quaternion with the result.
	 */
	default <T extends QuatC> T mulR(double[] q, @ExtractionParam T res)
	{
		return mulR(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Multiplies this quaternion with the given quaternion {@code (q[3]; (q[0], q[1], q[2]))} and saves the result in the result quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q * (q[3]; (q[0], q[1], q[2]))}
	 * 
	 * @param <T> The type of the result quaternion.
	 * 
	 * @param q The other quaternion.
	 * @param res The result quaternion.
	 * 
	 * @return The result quaternion with the result.
	 */
	default <T extends QuatC> T mulR(float[] q, @ExtractionParam T res)
	{
		return mulR(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Multiplies this quaternion with the given quaternion {@code (w; (x, y, z))} and saves the result in the result quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q * (w; (x, y, z))}
	 * 
	 * @param <T> The type of the result quaternion.
	 * 
	 * @param x The value of the x component of the other quaternion.
	 * @param y The value of the y component of the other quaternion.
	 * @param z The value of the z component of the other quaternion.
	 * @param w The value of the w component of the other quaternion.
	 * @param res The result quaternion.
	 * 
	 * @return The result quaternion with the result.
	 */
	default <T extends QuatC> T mulR(double x, double y, double z, double w, @ExtractionParam T res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		double qX = getX();
		double qY = getY();
		double qZ = getZ();
		double qW = getW();
		
		double x_ = qW * x + w * qX + qY * z - qZ * y; // s * v'.x + s' * v.x + (V x V').x
		double y_ = qW * y + w * qY + qZ * x - qX * z; // s * v'.y + s' * v.y + (V x V').y
		double z_ = qW * z + w * qZ + qX * y - qY * x; // s * v'.z + s' * v.z + (V x V').z

		double w_ = qW * w - qX * x - qY * y - qZ * z; // w * w' - v * v'
		
		double invLength = BarghosMath.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		res.set(x_ * invLength, y_ * invLength, z_ * invLength, w_ * invLength);

		return res;
	}
	
	/**
	 * Multiplies the given quaternion {@code (q)} with this quaternion and saves the result in the result quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q * Q}
	 * 
	 * @param <T> The type of the result quaternion.
	 * 
	 * @param q The other quaternion.
	 * 
	 * @param res The result quaternion.
	 * 
	 * @return The result quaternion with the result.
	 */
	default <T extends QuatC> T revMulR(QuatR q, @ExtractionParam T res)
	{
		return revMulR(q.getX(), q.getY(), q.getZ(), q.getW(), res);
	}
	
	/**
	 * Multiplies the given quaternion {@code (q[3]; (q[0], q[1], q[2]))} with this quaternion and saves result in the result quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[3]; (q[0], q[1], q[2])) * Q}
	 * 
	 * @param <T> The type of the result quaternion.
	 * 
	 * @param q The other quaternion.
	 * @param res The result quaternion.
	 * 
	 * @return The result quaternion with the result.
	 */
	default <T extends QuatC> T revMulR(double[] q, @ExtractionParam T res)
	{
		return revMulR(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Multiplies the given quaternion {@code (q[3]; (q[0], q[1], q[2]))} with this quaternion and saves result in the result quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[3]; (q[0], q[1], q[2])) * Q}
	 * 
	 * @param <T> The type of the result quaternion.
	 * 
	 * @param q The other quaternion.
	 * @param res The result quaternion.
	 * 
	 * @return The result quaternion with the result.
	 */
	default <T extends QuatC> T revMulR(float[] q, @ExtractionParam T res)
	{
		return revMulR(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Multiplies the given quaternion {@code (w; (x, y, z))} this quaternion and saves the result in the result quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; (x, y, z)) * Q}
	 * 
	 * @param <T> The type of the result quaternion.
	 * 
	 * @param x The value of the x component of the other quaternion.
	 * @param y The value of the y component of the other quaternion.
	 * @param z The value of the z component of the other quaternion.
	 * @param w The value of the w component of the other quaternion.
	 * 
	 * @param res The result quaternion.
	 * 
	 * @return The result quaternion with the result.
	 */
	default <T extends QuatC> T revMulR(double x, double y, double z, double w, @ExtractionParam T res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 - v1 * v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		double qX = getX();
		double qY = getY();
		double qZ = getZ();
		double qW = getW();
		
		double x_ = w * qX + qW * x + y * qZ - z * qY; // w * v'.x + w' * v.x + (V x V').x
		double y_ = w * qY + qW * y + z * qX - x * qZ; // w * v'.y + w' * v.y + (V x V').y
		double z_ = w * qZ + qW * z + x * qY - y * qX; // w * v'.z + w' * v.z + (V x V').z
		
		double w_ = w * qW - x * qX - y * qY - z * qZ; // w * w' + (-v) . v'
		
		double invLength = BarghosMath.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		res.set(x_ * invLength, y_ * invLength, z_ * invLength, w_ * invLength);
		
		return res;
	}
	
	// MISSING_DOC
	default <T extends QuatC> T normalizeR(@ExtractionParam T res)
	{
		double invLength = inverseLength();
		
		res.set(getX() * invLength, getY() * invLength, getZ() * invLength, getW() * invLength);

		return res;
	}
	
	// MISSING_DOC
	default <T extends QuatC> T inverseR(@ExtractionParam T res)
	{
		double invSquaredLength = 1.0 / squaredLength();
		
		res.set(-getX() * invSquaredLength, -getY() * invSquaredLength, -getZ() * invSquaredLength, getW() * invSquaredLength);
		
		return res;
	}
	
	// MISSING_DOC
	default <T extends QuatC> T conjugateR(@ExtractionParam T res)
	{
		res.set(-getX(), -getY(), -getZ(), getW());

		return res;
	}
	
	// MISSING_DOC
	default <T extends QuatC> T rotateR(Vec3fR axis, double angle, @ExtractionParam T res)
	{
		return rotateR(axis.getX(), axis.getY(), axis.getZ(), angle, res);
	}
	
	// MISSING_DOC
	<T extends QuatC> T rotateR(double x, double y, double z, double angle, @ExtractionParam T res);
	
	// MISSING_DOC
	default <T extends QuatC> T rotateDegR(Vec3fR axis, double angle, @ExtractionParam T res)
	{
		return rotateR(axis.getX(), axis.getY(), axis.getZ(), angle * BarghosMath.DEG_TO_RAD, res);
	}
	
	// MISSING_DOC
	default <T extends QuatC> T rotateDegR(double x, double y, double z, double angle, @ExtractionParam T res)
	{
		return rotateR(x, y, z, angle * BarghosMath.DEG_TO_RAD, res);
	}
	
	// MISSING_DOC
	default <T extends QuatC> T rotateGlobalR(Vec3fR axis, double angle, @ExtractionParam T res)
	{
		return rotateGlobalR(axis.getX(), axis.getY(), axis.getZ(), angle, res);
	}
	
	// MISSING_DOC
	<T extends QuatC> T rotateGlobalR(double x, double y, double z, double angle, @ExtractionParam T res);
	
	// MISSING_DOC
	default <T extends QuatC> T rotateGlobalDegR(Vec3fR axis, double angle, @ExtractionParam T res)
	{
		return rotateGlobalR(axis.getX(), axis.getY(), axis.getZ(), angle * BarghosMath.DEG_TO_RAD, res);
	}
	
	// MISSING_DOC
	default <T extends QuatC> T rotateGlobalDegR(double x, double y, double z, double angle, @ExtractionParam T res)
	{
		return rotateGlobalR(x, y, z, angle * BarghosMath.DEG_TO_RAD, res);
	}
	
	// MISSING_DOC
	default <T extends QuatC> T scaleR(double factor, @ExtractionParam T res)
	{
		double angle = 2 * BarghosMath.acos(getW());
		double newAngle = angle * factor;
		
		double sinScale = BarghosMath.sin(newAngle * 0.5) / BarghosMath.sin(angle * 0.5);
		
		res.set(getX() * sinScale, getY() * sinScale, getZ() * sinScale, getW() * BarghosMath.cos(newAngle));
		
		return res;
	}
	
	// MISSING_DOC
	default  <T extends QuatC> T integrateR(Vec3fR av, double dt, @ExtractionParam T res)
	{
		return integrateR(av.getX(), av.getY(), av.getZ(), dt, res);
	}
	
	// MISSING_DOC
	default <T extends QuatC> T integrateR(double avX, double avY, double avZ, double dt, @ExtractionParam T res)
	{
		double halfDt = dt * 0.5;
		
		double thetaX = avX * halfDt;
		double thetaY = avY * halfDt;
		double thetaZ = avZ * halfDt;
		
		double length = BarghosMath.sqrt(thetaX * thetaX + thetaY * thetaY + thetaZ * thetaZ);
		
		if(length == 0.0) return res;
		
		double s = BarghosMath.sin(length) / length;

		double x_ = thetaX * s;
		double y_ = thetaY * s;
		double z_ = thetaZ * s;
		double w_ = BarghosMath.cos(length);
		
		double invLength = BarghosMath.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		res.revMul(x_ * invLength, y_ * invLength, z_ * invLength, w_ * invLength);
		
		return res;
	}
	
	// MISSING_DOC
	default <T extends Vec3fC> T transform(Vec3fR t, @ExtractionParam T res)
	{
		QuatR r = mulN(t.getX(), t.getY(), t.getZ(), 0.0);
		QuatR c = conjugateN();
		QuatR re = r.mulN(c);
		
		res.set((float)re.getX(), (float)re.getY(), (float)re.getZ());

		return res;
	}
	
	// MISSING_DOC
	default double normErrorSquared()
	{
		return 1.0 - squaredLength();
	}
	
	// MISSING_DOC
	default float normErrorSquaredf()
	{
		return (float)(normErrorSquared());
	}
	
	// MISSING_DOC
	default double normError()
	{
		double error = BarghosMath.abs(1.0 - squaredLength());
		
		if(error == 0.0) return 0.0;
		
		return BarghosMath.sqrt(error);
	}
	
	// MISSING_DOC
	default float normErrorf()
	{
		return (float)normError();
	}
}
