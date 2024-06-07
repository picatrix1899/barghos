package org.barghos.math.vector;

import org.barghos.util.collection.FloatIndexValuePair;
import org.barghos.util.math.BarghosMath;
import org.barghos.util.math.FloatRoundMethod;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;
import org.barghos.util.tuple.floats.TupRF;

/**
 * This class represents a two dimensional float vector.
 * 
 * @author picatrix1899
 */
public class Vec2F implements Vec2WF
{
	/**
	 * The x component.
	 */
	public float x;
	
	/**
	 * The x component.
	 */
	public float y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Vec2F()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link SimpleVec2fR} and adopts the values.
	 * 
	 * @param v An existing implementation of {@link SimpleVec2fR} to adopt the values from.
	 */
	public Vec2F(Tup2RF v)
	{
		set(v);
	}
	
	public Vec2F(TupRF v)
	{
		set(v);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Vec2F(float value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Vec2F(float... v)
	{
		set(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the vector.
	 * @param y The initial y value of the vector.
	 */
	public Vec2F(float x, float y)
	{
		set(x, y);
	}

	/** {@inheritDoc} */
	@Override
	public float length()
	{
		return VecUtils2F.length(this);
	}
	/** {@inheritDoc} */
	@Override
	public float length(float tolerance)
	{
		return VecUtils2F.length(this, tolerance);
	}

	/** {@inheritDoc} */
	@Override
	public float inverseLength()
	{
		return VecUtils2F.inverseLength(this);
	}

	/** {@inheritDoc} */
	@Override
	public float distanceTo(Tup2RF v2)
	{
		return VecUtils2F.distanceTo(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float distanceTo(Tup2RF v2, float tolerance)
	{
		return VecUtils2F.distanceTo(this, v2, tolerance);
	}

	/** {@inheritDoc} */
	@Override
	public float distanceTo(float[] v2)
	{
		return VecUtils2F.distanceTo(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float distanceTo(float[] v2, float tolerance)
	{
		return VecUtils2F.distanceTo(this, v2, tolerance);
	}

	/** {@inheritDoc} */
	@Override
	public float distanceTo(float v2x, float v2y)
	{
		return VecUtils2F.distanceTo(this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public float distanceTo(float v2x, float v2y, float tolerance)
	{
		return VecUtils2F.distanceTo(this, v2x, v2y, tolerance);
	}

	/** {@inheritDoc} */
	@Override
	public float inverseDistanceTo(Tup2RF v2)
	{
		return VecUtils2F.inverseDistanceTo(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float inverseDistanceTo(float[] v2)
	{
		return VecUtils2F.inverseDistanceTo(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float inverseDistanceTo(float v2x, float v2y)
	{
		return VecUtils2F.inverseDistanceTo(this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public float squaredLength()
	{
		return VecUtils2F.squaredLength(this);
	}

	/** {@inheritDoc} */
	@Override
	public float squaredDistanceTo(Tup2RF v2)
	{
		return VecUtils2F.squaredDistanceTo(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float squaredDistanceTo(float[] v2)
	{
		return VecUtils2F.squaredDistanceTo(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float squaredDistanceTo(float v2x, float v2y)
	{
		return VecUtils2F.squaredDistanceTo(this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(Tup2RF v2)
	{
		return VecUtils2F.dot(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float[] v2)
	{
		return VecUtils2F.dot(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float v2x, float v2y)
	{
		return VecUtils2F.dot(this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public FloatIndexValuePair min()
	{
		return VecUtils2F.min(this, new FloatIndexValuePair());
	}

	/** {@inheritDoc} */
	@Override
	public FloatIndexValuePair min(FloatIndexValuePair res)
	{
		return VecUtils2F.min(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float minValue()
	{
		return VecUtils2F.minValue(this);
	}

	/** {@inheritDoc} */
	@Override
	public int minComponent()
	{
		return VecUtils2F.minComponent(this);
	}

	/** {@inheritDoc} */
	@Override
	public FloatIndexValuePair max()
	{
		return VecUtils2F.max(this, new FloatIndexValuePair());
	}

	/** {@inheritDoc} */
	@Override
	public FloatIndexValuePair max(FloatIndexValuePair res)
	{
		return VecUtils2F.max(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float maxValue()
	{
		return VecUtils2F.maxValue(this);
	}

	/** {@inheritDoc} */
	@Override
	public int maxComponent()
	{
		return VecUtils2F.maxComponent(this);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T addR(Tup2RF v2, T res)
	{
		return VecUtils2F.add(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.add(this, v2,  res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T addR(float[] v2, T res)
	{
		return VecUtils2F.add(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addR(float[] v2, float[] res)
	{
		return VecUtils2F.add(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T addR(float value, T res)
	{
		return VecUtils2F.add(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addR(float value, float[] res)
	{
		return VecUtils2F.add(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T addR(float v2x, float v2y, T res)
	{
		return VecUtils2F.add(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.add(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T subR(Tup2RF v2, T res)
	{
		return VecUtils2F.sub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.sub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T subR(float[] v2, T res)
	{
		return VecUtils2F.sub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subR(float[] v2, float[] res)
	{
		return VecUtils2F.sub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T subR(float value, T res)
	{
		return VecUtils2F.sub(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subR(float value, float[] res)
	{
		return VecUtils2F.sub(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T subR(float v2x, float v2y, T res)
	{
		return VecUtils2F.sub(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.sub(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revSubR(Tup2RF v2, T res)
	{
		return VecUtils2F.revSub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revSubR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.revSub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revSubR(float[] v2, T res)
	{
		return VecUtils2F.revSub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revSubR(float[] v2, float[] res)
	{
		return VecUtils2F.revSub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revSubR(float value, T res)
	{
		return VecUtils2F.revSub(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revSubR(float value, float[] res)
	{
		return VecUtils2F.revSub(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revSubR(float v2x, float v2y, T res)
	{
		return VecUtils2F.revSub(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revSubR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.revSub(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T mulR(Tup2RF v2, T res)
	{
		return VecUtils2F.mul(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.mul(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T mulR(float[] v2, T res)
	{
		return VecUtils2F.mul(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulR(float[] v2, float[] res)
	{
		return VecUtils2F.mul(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T mulR(float value, T res)
	{
		return VecUtils2F.mul(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulR(float value, float[] res)
	{
		return VecUtils2F.mul(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T mulR(float v2x, float v2y, T res)
	{
		return VecUtils2F.mul(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.mul(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T divR(Tup2RF v2, T res)
	{
		return VecUtils2F.div(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] divR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.div(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T divR(float[] v2, T res)
	{
		return VecUtils2F.div(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] divR(float[] v2, float[] res)
	{
		return VecUtils2F.div(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T divR(float value, T res)
	{	
		return VecUtils2F.div(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] divR(float value, float[] res)
	{
		return VecUtils2F.div(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T divR(float v2x, float v2y, T res)
	{
		return VecUtils2F.div(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] divR(float v2x, float v2y, float[] res)
	{	
		return VecUtils2F.div(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revDivR(Tup2RF v2, T res)
	{
		return VecUtils2F.revDiv(this,  v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revDivR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.revDiv(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revDivR(float[] v2, T res)
	{
		return VecUtils2F.revDiv(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revDivR(float[] v2, float[] res)
	{
		return VecUtils2F.revDiv(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revDivR(float value, T res)
	{
		return VecUtils2F.revDiv(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revDivR(float value, float[] res)
	{
		return VecUtils2F.revDiv(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revDivR(float v2x, float v2y, T res)
	{
		return VecUtils2F.revDiv(this, v2x,  v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revDivR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.revDiv(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfVectorToR(Tup2RF v2, T res)
	{
		return VecUtils2F.halfVectorTo(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfVectorToR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.halfVectorTo(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfVectorToR(float[] v2, T res)
	{
		return VecUtils2F.halfVectorTo(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfVectorToR(float[] v2, float[] res)
	{
		return VecUtils2F.halfVectorTo(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfVectorToR(float v2x, float v2y, T res)
	{
		return VecUtils2F.halfVectorTo(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfVectorToR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.halfVectorTo(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfPointBetweenR(Tup2RF v2, T res)
	{
		return VecUtils2F.halfPointBetween(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfPointBetweenR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.halfPointBetween(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfPointBetweenR(float[] v2, T res)
	{
		return VecUtils2F.halfPointBetween(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfPointBetweenR(float[] v2, float[] res)
	{
		return VecUtils2F.halfPointBetween(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfPointBetweenR(float v2x, float v2y, T res)
	{
		return VecUtils2F.halfPointBetween(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfPointBetweenR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.halfPointBetween(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T negateR(T res)
	{
		return VecUtils2F.negate(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] negateR(float[] res)
	{
		return VecUtils2F.negate(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T inverseR(T res)
	{
		return VecUtils2F.inverse(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] inverseR(float[] res)
	{
		return VecUtils2F.inverse(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T normalizeR(T res)
	{
		return VecUtils2F.normalize(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] normalizeR(float[] res)
	{
		return VecUtils2F.normalize(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T minVectorR(Tup2RF v2, T res)
	{
		return VecUtils2F.minVector(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] minVectorR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.minVector(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T minVectorR(float[] v2, T res)
	{
		return VecUtils2F.minVector(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] minVectorR(float[] v2, float[] res)
	{
		return VecUtils2F.minVector(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T minVectorR(float v2x, float v2y, T res)
	{
		return VecUtils2F.minVector(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] minVectorR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.minVector(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T maxVectorR(Tup2RF v2, T res)
	{
		return VecUtils2F.maxVector(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxVectorR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.maxVector(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T maxVectorR(float[] v2, T res)
	{
		return VecUtils2F.maxVector(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxVectorR(float[] v2, float[] res)
	{
		return VecUtils2F.maxVector(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T maxVectorR(float v2x, float v2y, T res)
	{
		return VecUtils2F.maxVector(this, v2x,  v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxVectorR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.maxVector(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T rotateRadR(float angle, T res)
	{
		return VecUtils2F.rotateRad(this, angle, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rotateRadR(float angle, float[] res)
	{
		return VecUtils2F.rotateRad(this, angle, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T rotateDegR(float angle, T res)
	{
		return VecUtils2F.rotateDeg(this, angle, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rotateDegR(float angle, float[] res)
	{
		return VecUtils2F.rotateDeg(this, angle, res);
	}

	@Override
	public <T extends Tup2WF> T projectR(Tup2RF t, T res)
	{
		return VecUtils2F.project(this, t, res);
	}

	@Override
	public <T extends Tup2WF> T projectR(float[] t, T res)
	{
		return VecUtils2F.project(this, t, res);
	}

	@Override
	public <T extends Tup2WF> T projectR(float tX, float tY, T res)
	{
		return VecUtils2F.project(this, tX, tY, res);
	}

	@Override
	public float[] projectR(Tup2RF t, float[] res)
	{
		return VecUtils2F.project(this, t, res);
	}

	@Override
	public float[] projectR(float[] t, float[] res)
	{
		return VecUtils2F.project(this, t, res);
	}

	@Override
	public float[] projectR(float tX, float tY, float[] res)
	{
		return VecUtils2F.project(this, tX, tY, res);
	}

	@Override
	public <T extends Tup2WF> T reflectR(Tup2RF n, T res)
	{
		return VecUtils2F.reflect(this, n, res);
	}

	@Override
	public <T extends Tup2WF> T reflectR(float[] n, T res)
	{
		return VecUtils2F.reflect(this, n, res);
	}

	@Override
	public <T extends Tup2WF> T reflectR(float nX, float nY, T res)
	{
		return VecUtils2F.reflect(this, nX, nY, res);
	}

	@Override
	public float[] reflectR(Tup2RF n, float[] res)
	{
		return VecUtils2F.reflect(this, n, res);
	}

	@Override
	public float[] reflectR(float[] n, float[] res)
	{
		return VecUtils2F.reflect(this, n, res);
	}

	@Override
	public float[] reflectR(float nX, float nY, float[] res)
	{
		return VecUtils2F.reflect(this, nX, nY, res);
	}

	@Override
	public <T extends Tup2WF> T ceilR(T res)
	{
		return VecUtils2F.ceil(this, res);
	}

	@Override
	public float[] ceilR(float[] res)
	{
		return VecUtils2F.ceil(this, res);
	}

	@Override
	public <T extends Tup2WF> T floorR(T res)
	{
		return VecUtils2F.floor(this, res);
	}

	@Override
	public float[] floorR(float[] res)
	{
		return VecUtils2F.floor(this, res);
	}

	@Override
	public <T extends Tup2WF> T roundR(T res)
	{
		return VecUtils2F.round(this, res);
	}

	@Override
	public float[] roundR(float[] res)
	{	
		return VecUtils2F.round(this, res);
	}

	@Override
	public <T extends Tup2WF> T truncR(T res)
	{
		return VecUtils2F.trunc(this, res);
	}

	@Override
	public float[] truncR(float[] res)
	{
		return VecUtils2F.trunc(this, res);
	}

	@Override
	public <T extends Tup2WF> T roundR(FloatRoundMethod method, T res)
	{
		return VecUtils2F.round(this, method, res);
	}

	@Override
	public float[] roundR(FloatRoundMethod method, float[] res)
	{
		return VecUtils2F.round(this, method, res);
	}

	@Override
	public <T extends Tup2WF> T absR(T res)
	{
		return VecUtils2F.abs(this, res);
	}

	@Override
	public float[] absR(float[] res)
	{
		return VecUtils2F.abs(this, res);
	}

	@Override
	public <T extends Tup2WF> T signumR(T res)
	{
		return VecUtils2F.signum(this, res);
	}

	@Override
	public float[] signumR(float[] res)
	{
		return VecUtils2F.signum(this, res);
	}

	@Override
	public <T extends Tup2WF> T integrateLinearR(Tup2RF v2, float alpha, T res)
	{
		return VecErpUtils2F.integrateLinear(this, v2, alpha, res);
	}

	@Override
	public <T extends Tup2WF> T integrateLinearR(float[] v2, float alpha, T res)
	{
		return VecErpUtils2F.integrateLinear(this, v2, alpha, res);
	}

	@Override
	public <T extends Tup2WF> T integrateLinearR(float v2x, float v2y, float alpha, T res)
	{
		return VecErpUtils2F.integrateLinear(this, v2x, v2y, alpha, res);
	}

	@Override
	public float[] integrateLinearR(Tup2RF v2, float alpha, float[] res)
	{
		return VecErpUtils2F.integrateLinear(this, v2, alpha, res);
	}

	@Override
	public float[] integrateLinearR(float[] v2, float alpha, float[] res)
	{
		return VecErpUtils2F.integrateLinear(this, v2, alpha, res);
	}

	@Override
	public float[] integrateLinearR(float v2x, float v2y, float alpha, float[] res)
	{
		return VecErpUtils2F.integrateLinear(this, v2x, v2y, alpha, res);
	}

	@Override
	public float x()
	{
		return this.x;
	}

	@Override
	public float y()
	{
		return this.y;
	}

	@Override
	public float v0()
	{
		
		return this.x;
	}

	@Override
	public float v1()
	{
		
		return this.y;
	}

	@Override
	public float getAt(int index)
	{
		switch(index)
		{
			case 0:
				return this.x;
			case 1:
				return this.y;
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public float[] toArray()
	{
		return new float[] {this.x, this.y};
	}

	@Override
	public float[] toArray(float[] res)
	{
		res[0] = this.x;
		res[1] = this.y;
		
		return res;
	}

	@Override
	public boolean isFiniteAt(int index)
	{
		switch(index)
		{
			case 0:
				return isFiniteAtV0();
			case 1:
				return isFiniteAtV1();
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return Float.isFinite(this.x);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return Float.isFinite(this.y);
	}

	@Override
	public boolean isZeroAt(int index)
	{
		switch(index)
		{
			case 0:
				return isZeroAtV0();
			case 1:
				return isZeroAtV1();
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		switch(index)
		{
			case 0:
				return isZeroAtV0(tolerance);
			case 1:
				return isZeroAtV1(tolerance);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public boolean isZeroAtV0()
	{
		return BarghosMath.isZero(this.x);
	}

	@Override
	public boolean isZeroAtV1()
	{
		return BarghosMath.isZero(this.y);
	}

	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return BarghosMath.isZero(tolerance, this.x);
	}

	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return BarghosMath.isZero(tolerance, this.y);
	}

	@Override
	public boolean equals(Tup2RF t)
	{
		return false;
	}

	@Override
	public boolean equals(TupRF t)
	{
		return false;
	}

	@Override
	public boolean equals(float... t)
	{
		return false;
	}

	@Override
	public boolean equals(float v0, float v1)
	{
		
		return false;
	}

	@Override
	public boolean equals(float tolerance, Tup2RF t)
	{
		
		return false;
	}

	@Override
	public boolean equals(float tolerance, TupRF t)
	{
		
		return false;
	}

	@Override
	public boolean equals(float tolerance, float... t)
	{
		
		return false;
	}

	@Override
	public boolean equals(float tolerance, float v0, float v1)
	{
		
		return false;
	}

	@Override
	public boolean equalsAt(int index, TupRF t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAt(int index, float... t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		
		return false;
	}

	@Override
	public boolean equalsAt(float tolerance, int index, TupRF t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float... t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV0(TupRF t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV0(float... t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV1(TupRF t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV1(float... t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV0(float tolerance, Tup2RF t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV0(float tolerance, TupRF t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV0(float tolerance, float... t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV1(float tolerance, Tup2RF t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV1(float tolerance, TupRF t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV1(float tolerance, float... t)
	{
		
		return false;
	}

	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		
		return false;
	}

	@Override
	public int compareAt(int index, TupRF t)
	{
		
		return 0;
	}

	@Override
	public int compareAt(int index, float... t)
	{
		
		return 0;
	}

	@Override
	public int compareAt(int index, float value)
	{
		
		return 0;
	}

	@Override
	public int compareAt(float tolerance, int index, TupRF t)
	{
		
		return 0;
	}

	@Override
	public int compareAt(float tolerance, int index, float... t)
	{
		
		return 0;
	}

	@Override
	public int compareAt(float tolerance, int index, float value)
	{
		
		return 0;
	}

	@Override
	public int compareAtV0(Tup2RF t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV0(TupRF t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV0(float... t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV0(float value)
	{
		
		return 0;
	}

	@Override
	public int compareAtV1(Tup2RF t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV1(TupRF t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV1(float... t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV1(float value)
	{
		
		return 0;
	}

	@Override
	public int compareAtV0(float tolerance, Tup2RF t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV0(float tolerance, TupRF t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV0(float tolerance, float... t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV0(float tolerance, float value)
	{
		
		return 0;
	}

	@Override
	public int compareAtV1(float tolerance, Tup2RF t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV1(float tolerance, TupRF t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV1(float tolerance, float... t)
	{
		
		return 0;
	}

	@Override
	public int compareAtV1(float tolerance, float value)
	{
		
		return 0;
	}

	@Override
	public boolean isFinite()
	{
		
		return false;
	}

	@Override
	public boolean isZero()
	{
		
		return false;
	}

	@Override
	public boolean isZero(float tolerance)
	{
		
		return false;
	}

	@Override
	public Vec2WF createNew()
	{
		
		return null;
	}

	@Override
	public Vec2WF createNew(Tup2RF v)
	{
		
		return null;
	}

	@Override
	public Vec2WF createNew(float... v)
	{
		
		return null;
	}

	@Override
	public Vec2WF createNew(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF createNew(float x, float y)
	{
		
		return null;
	}

	@Override
	public Vec2WF copy()
	{
		
		return null;
	}

	@Override
	public Vec2WF x(float x)
	{
		
		return null;
	}

	@Override
	public Vec2WF y(float y)
	{
		
		return null;
	}

	@Override
	public Vec2WF set(Tup2RF t)
	{
		
		return null;
	}

	@Override
	public Vec2WF set(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF set(float x, float y)
	{
		
		return null;
	}

	@Override
	public Vec2WF set(TupRF t)
	{
		
		return null;
	}

	@Override
	public Vec2WF setAt(int index, float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF set(float... values)
	{
		
		return null;
	}

	@Override
	public Vec2WF add(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF add(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF add(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF add(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF sub(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF sub(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF sub(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF sub(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF revSub(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF revSub(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF revSub(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF revSub(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF mul(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF mul(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF mul(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF mul(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF div(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF div(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF div(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF div(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF revDiv(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF revDiv(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF revDiv(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF revDiv(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfVectorTo(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfVectorTo(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfVectorTo(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfPointBetween(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfPointBetween(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfPointBetween(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF negate()
	{
		
		return null;
	}

	@Override
	public Vec2WF inverse()
	{
		
		return null;
	}

	@Override
	public Vec2WF normalize()
	{
		
		return null;
	}

	@Override
	public Vec2WF minVector(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF minVector(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF minVector(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF maxVector(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF maxVector(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF maxVector(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF rotateRad(float angle)
	{
		
		return null;
	}

	@Override
	public Vec2WF rotateDeg(float angle)
	{
		
		return null;
	}

	@Override
	public Vec2WF project(Tup2RF t)
	{
		
		return null;
	}

	@Override
	public Vec2WF project(float[] t)
	{
		
		return null;
	}

	@Override
	public Vec2WF project(float tX, float tY)
	{
		
		return null;
	}

	@Override
	public Vec2WF reflect(Tup2RF n)
	{
		
		return null;
	}

	@Override
	public Vec2WF reflect(float[] n)
	{
		
		return null;
	}

	@Override
	public Vec2WF reflect(float nX, float nY)
	{
		
		return null;
	}

	@Override
	public Vec2WF ceil()
	{
		
		return null;
	}

	@Override
	public Vec2WF floor()
	{
		
		return null;
	}

	@Override
	public Vec2WF round()
	{
		
		return null;
	}

	@Override
	public Vec2WF trunc()
	{
		
		return null;
	}

	@Override
	public Vec2WF round(FloatRoundMethod method)
	{
		
		return null;
	}

	@Override
	public Vec2WF abs()
	{
		
		return null;
	}

	@Override
	public Vec2WF signum()
	{
		
		return null;
	}

	@Override
	public Vec2WF integrateLinear(Tup2RF v2, float alpha)
	{
		
		return null;
	}

	@Override
	public Vec2WF integrateLinear(float[] v2, float alpha)
	{
		
		return null;
	}

	@Override
	public Vec2WF integrateLinear(float v2x, float v2y, float alpha)
	{
		
		return null;
	}

	@Override
	public Vec2WF addN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF addN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF addN(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF addN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF subN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF subN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF subN(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF subN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF revSubN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF revSubN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF revSubN(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF revSubN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF mulN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF mulN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF mulN(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF mulN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF divN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF divN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF divN(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF divN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF revDivN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF revDivN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF revDivN(float value)
	{
		
		return null;
	}

	@Override
	public Vec2WF revDivN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfVectorToN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfVectorToN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfVectorToN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfPointBetweenN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfPointBetweenN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF halfPointBetweenN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF negateN()
	{
		
		return null;
	}

	@Override
	public Vec2WF inverseN()
	{
		
		return null;
	}

	@Override
	public Vec2WF normalizeN()
	{
		
		return null;
	}

	@Override
	public Vec2WF minVectorN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF minVectorN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF minVectorN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF maxVectorN(Tup2RF v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF maxVectorN(float[] v2)
	{
		
		return null;
	}

	@Override
	public Vec2WF maxVectorN(float v2x, float v2y)
	{
		
		return null;
	}

	@Override
	public Vec2WF rotateRadN(float angle)
	{
		
		return VecUtils2F.rotateRad(this, angle, new Vec2F());
	}

	@Override
	public Vec2WF rotateDegN(float angle)
	{
		return VecUtils2F.rotateDeg(this, angle, new Vec2F());
	}
	@Override
	public Vec2WF projectN(Tup2RF t)
	{
		return VecUtils2F.project(this, t, new Vec2F());
	}

	@Override
	public Vec2WF projectN(float[] t)
	{
		return VecUtils2F.project(this, t, new Vec2F());
	}

	@Override
	public Vec2WF projectN(float tX, float tY)
	{
		return VecUtils2F.project(this, tX, tY, new Vec2F());
	}

	@Override
	public Vec2WF reflectN(Tup2RF n)
	{
		return VecUtils2F.reflect(this, n, new Vec2F());
	}

	@Override
	public Vec2WF reflectN(float[] n)
	{
		return VecUtils2F.reflect(this, n, new Vec2F());
	}

	@Override
	public Vec2WF reflectN(float nX, float nY)
	{
		return VecUtils2F.reflect(this, nX, nY, new Vec2F());
	}

	@Override
	public Vec2WF ceilN()
	{
		return VecUtils2F.ceil(this, new Vec2F());
	}

	@Override
	public Vec2WF floorN()
	{
		return VecUtils2F.floor(this, new Vec2F());
	}

	@Override
	public Vec2WF roundN()
	{
		return VecUtils2F.round(this, new Vec2F());
	}

	@Override
	public Vec2WF truncN()
	{
		return VecUtils2F.trunc(this, new Vec2F());
	}

	@Override
	public Vec2WF roundN(FloatRoundMethod method)
	{
		return VecUtils2F.round(this, method, new Vec2F());
	}

	@Override
	public Vec2WF absN()
	{
		return VecUtils2F.abs(this, new Vec2F());
	}

	@Override
	public Vec2WF signumN()
	{
		return VecUtils2F.signum(this, new Vec2F());
	}

	@Override
	public Vec2WF integrateLinearN(Tup2RF v2, float alpha)
	{
		return VecErpUtils2F.integrateLinear(this, v2, alpha, new Vec2F());
	}

	@Override
	public Vec2WF integrateLinearN(float[] v2, float alpha)
	{
		return VecErpUtils2F.integrateLinear(this, v2, alpha, new Vec2F());
	}

	@Override
	public Vec2WF integrateLinearN(float v2x, float v2y, float alpha)
	{
		return VecErpUtils2F.integrateLinear(this, v2x, v2y, alpha, new Vec2F());
	}

	@Override
	public boolean isFiniteAtX()
	{
		return Float.isFinite(this.x);
	}

	@Override
	public boolean finiteAtY()
	{
		return Float.isFinite(this.y);
	}

	@Override
	public boolean zeroAtX()
	{
		return BarghosMath.isZero(this.x);
	}

	@Override
	public boolean zeroAtY()
	{
		return BarghosMath.isZero(this.y);
	}

	@Override
	public boolean zeroAtX(float tolerance)
	{
		return BarghosMath.isZero(tolerance, this.x);
	}

	@Override
	public boolean zeroAtY(float tolerance)
	{
		return BarghosMath.isZero(tolerance, this.y);
	}

	@Override
	public boolean equalsAtX(TupRF t)
	{
		return BarghosMath.equals(this.x, t.getAt(0));
	}

	@Override
	public boolean equalsAtX(float... t)
	{
		return BarghosMath.equals(this.x, t[0]);
	}

	@Override
	public boolean equalsAtX(float value)
	{
		return BarghosMath.equals(this.x, value);
	}

	@Override
	public boolean equalsAtY(TupRF t)
	{
		return BarghosMath.equals(this.y, t.getAt(1));
	}

	@Override
	public boolean equalsAtY(float... t)
	{
		return BarghosMath.equals(this.y, t[1]);
	}

	@Override
	public boolean equalsAtY(float value)
	{
		return BarghosMath.equals(this.y, value);
	}

	@Override
	public boolean equalsAtX(float tolerance, Tup2RF t)
	{
		return BarghosMath.equals(tolerance, this.x, t.v0());
	}

	@Override
	public boolean equalsAtX(float tolerance, TupRF t)
	{
		return BarghosMath.equals(tolerance, this.x, t.getAt(0));
	}

	@Override
	public boolean equalsAtX(float tolerance, float... t)
	{
		return BarghosMath.equals(tolerance, this.x, t[0]);
	}

	@Override
	public boolean equalsAtX(float tolerance, float value)
	{
		return BarghosMath.equals(tolerance, this.x, value);
	}

	@Override
	public boolean equalsAtY(float tolerance, Tup2RF t)
	{
		return BarghosMath.equals(tolerance, this.y, t.v1());
	}

	@Override
	public boolean equalsAtY(float tolerance, TupRF t)
	{
		return BarghosMath.equals(tolerance, this.y, t.getAt(1));
	}

	@Override
	public boolean equalsAtY(float tolerance, float... t)
	{
		return BarghosMath.equals(tolerance, this.y, t[1]);
	}

	@Override
	public boolean equalsAtY(float tolerance, float value)
	{
		return BarghosMath.equals(tolerance, this.y, value);
	}

	@Override
	public int compareAtX(Tup2RF t)
	{
		return BarghosMath.compare(this.x, t.v0());
	}

	@Override
	public int compareAtX(TupRF t)
	{
		return BarghosMath.compare(this.x, t.getAt(0));
	}

	@Override
	public int compareAtX(float... t)
	{
		return BarghosMath.compare(this.x, t[0]);
	}

	@Override
	public int compareAtX(float value)
	{
		return BarghosMath.compare(this.x, value);
	}

	@Override
	public int compareAtY(Tup2RF t)
	{
		return BarghosMath.compare(this.y, t.v1());
	}

	@Override
	public int compareAtY(TupRF t)
	{
		return BarghosMath.compare(this.y, t.getAt(1));
	}

	@Override
	public int compareAtY(float... t)
	{
		return BarghosMath.compare(this.y, t[1]);
	}

	@Override
	public int compareAtY(float value)
	{
		return BarghosMath.compare(this.y, value);
	}

	@Override
	public int compareAtX(float tolerance, Tup2RF t)
	{
		return BarghosMath.compare(tolerance, t.v0());
	}

	@Override
	public int compareAtX(float tolerance, TupRF t)
	{
		return BarghosMath.compare(tolerance, this.x, t.getAt(0));
	}

	@Override
	public int compareAtX(float tolerance, float... t)
	{
		return BarghosMath.compare(tolerance, this.x, t[0]);
	}

	@Override
	public int compareAtX(float tolerance, float value)
	{
		return BarghosMath.compare(tolerance, this.x, value);
	}

	@Override
	public int compareAtY(float tolerance, Tup2RF t)
	{
		return BarghosMath.compare(tolerance, this.y, t.v1());
	}

	@Override
	public int compareAtY(float tolerance, TupRF t)
	{
		return BarghosMath.compare(tolerance, this.y, t.getAt(1));
	}

	@Override
	public int compareAtY(float tolerance, float... t)
	{
		return BarghosMath.compare(tolerance, this.y, t[1]);
	}

	@Override
	public int compareAtY(float tolerance, float value)
	{
		return BarghosMath.compare(tolerance, this.y, value);
	}

	@Override
	public boolean equalsAt(int index, Tup2RF t)
	{
		switch(index)
		{
			case 0:
				return equalsAtV0(t);
			case 1:
				return equalsAtV1(t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public boolean equalsAt(float tolerance, int index, Tup2RF t)
	{
		switch(index)
		{
			case 0:
				return equalsAtV0(tolerance, t);
			case 1:
				return equalsAtV1(tolerance, t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public boolean equalsAtV0(Tup2RF t)
	{
		return BarghosMath.equals(this.x, t.v0());
	}

	@Override
	public boolean equalsAtV1(Tup2RF t)
	{
		return BarghosMath.equals(this.y, t.v1());
	}

	@Override
	public int compareAt(int index, Tup2RF t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(t);
			case 1:
				return compareAtV1(t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public int compareAt(float tolerance, int index, Tup2RF t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(tolerance, t);
			case 1:
				return compareAtV1(tolerance, t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public VecBase2WF swizzleXYN()
	{
		return new Vec2F(this.y, this.x);
	}

	@Override
	public VecBase2WF swizzleXY()
	{
		float temp = this.x;
		
		this.x = this.y;
		this.y = temp;
		
		return this;
	}

	@Override
	public VecBase2WF createNew(TupRF t)
	{
		return new Vec2F(t);
	}

	@Override
	public VecBase2WF v0(float v0)
	{
		this.x = v0;
		
		return this;
	}

	@Override
	public VecBase2WF v1(float v1)
	{
		this.y = v1;
		
		return this;
	}

	@Override
	public VecBase2WF swizzleN(int indexA, int indexB)
	{
		return new Vec2F(getAt(indexA), getAt(indexB));
	}

	@Override
	public VecBase2WF swizzleV0V1N()
	{
		return new Vec2F(this.y, this.x);
	}

	@Override
	public VecBase2WF arrangeN(int... indices)
	{
		return new Vec2F(getAt(indices[0]), getAt(indices[1]));
	}

	@Override
	public VecBase2WF arrangeN(int i0, int i1)
	{
		return new Vec2F(getAt(i0), getAt(i1));
	}

	@Override
	public VecBase2WF arrange(int iV0, int iV1)
	{
		set(getAt(iV0), getAt(iV1));
		
		return this;
	}

	@Override
	public VecBase2WF arrange(int... indices)
	{
		set(getAt(indices[0]), getAt(indices[1]));

		return this;
	}

	@Override
	public VecBase2WF swizzle(int indexA, int indexB)
	{
		set(getAt(indexA), getAt(indexB));
		
		return this;
	}

	@Override
	public VecBase2WF swizzleV0V1()
	{
		float temp = this.x;
		
		this.x = this.y;
		this.y = temp;
		
		return this;
	}

	@Override
	public boolean isFiniteAtX()
	{
		return false;
	}

	@Override
	public boolean isFiniteAtY()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAtX()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAtY()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAtX(float tolerance)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAtY(float tolerance)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtX(Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtY(Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}
}
