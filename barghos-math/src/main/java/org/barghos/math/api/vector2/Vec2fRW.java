package org.barghos.math.api.vector2;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fRW;

/**
 * This interface grants read and write access to any 2-dimensional float vector.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Vec2fRW extends Vec2fR, Vec2fW, Tup2fRW
{
	/** {@inheritDoc} */
	@Override
	Vec2fRW setX(float x);
	
	/** {@inheritDoc} */
	@Override
	Vec2fRW setY(float y);
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW set(Tup2fR t)
	{
		return (Vec2fRW)Vec2fW.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW set(float value)
	{
		return (Vec2fRW)Vec2fW.super.set(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW set(float x, float y)
	{
		return (Vec2fRW)Vec2fW.super.set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW setByIndex(int index, float value)
	{
		return (Vec2fRW)Vec2fW.super.setByIndex(index, value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW setArray(float... values)
	{
		return (Vec2fRW)Vec2fW.super.setArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW set(TupfR t)
	{
		return (Vec2fRW)Vec2fW.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW add(Tup2fR t)
	{
		return (Vec2fRW)Vec2fW.super.add(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW add(float value)
	{
		return (Vec2fRW)Vec2fW.super.add(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW add(float x, float y)
	{
		return addR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW sub(Tup2fR t)
	{
		return (Vec2fRW)Vec2fW.super.sub(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW sub(float value)
	{
		return (Vec2fRW)Vec2fW.super.sub(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW sub(float x, float y)
	{
		return subR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revSub(Tup2fR t)
	{
		return (Vec2fRW)Vec2fW.super.revSub(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revSub(float value)
	{
		return (Vec2fRW)Vec2fW.super.revSub(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revSub(float x, float y)
	{
		return revSubR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW mul(Tup2fR t)
	{
		return (Vec2fRW)Vec2fW.super.mul(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW mul(float value)
	{
		return (Vec2fRW)Vec2fW.super.mul(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW mul(float x, float y)
	{
		return mulR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW div(Tup2fR t)
	{
		return (Vec2fRW)Vec2fW.super.div(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW div(float value)
	{
		return (Vec2fRW)Vec2fW.super.div(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW div(float x, float y)
	{
		return divR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revDiv(Tup2fR t)
	{
		return (Vec2fRW)Vec2fW.super.revDiv(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revDiv(float value)
	{
		return (Vec2fRW)Vec2fW.super.revDiv(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revDiv(float x, float y)
	{
		return revDivR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW normal()
	{
		return normalR(this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW normalSafe()
	{
		return normalSafeR(this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW normalSafeWithMargin(float tolerance)
	{
		return normalSafeWithMarginR(tolerance, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW invert()
	{
		return invertR(this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW inverse()
	{
		return inverseR(this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW inverse(Tup2fR t)
	{
		return inverseR(t, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW inverse(float value)
	{
		return inverseR(value, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW inverse(float x, float y)
	{
		return inverseR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW getNewInstance(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW getNewInstance(float value)
	{
		return (Vec2fRW)Vec2fR.super.getNewInstance(value);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec2fRW getNewInstance(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW getNewInstanceFromArray(float... values)
	{
		return (Vec2fRW)Vec2fR.super.getNewInstanceFromArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW getNewInstance(TupfR t)
	{
		return (Vec2fRW)Vec2fR.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW addN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.addN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW addN(float value)
	{
		return (Vec2fRW)Vec2fR.super.addN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW addN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.addN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW subN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.subN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW subN(float value)
	{
		return (Vec2fRW)Vec2fR.super.subN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW subN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.subN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revSubN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.revSubN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revSubN(float value)
	{
		return (Vec2fRW)Vec2fR.super.revSubN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revSubN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.revSubN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW mulN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.mulN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW mulN(float value)
	{
		return (Vec2fRW)Vec2fR.super.mulN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW mulN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.mulN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW divN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.divN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW divN(float value)
	{
		return (Vec2fRW)Vec2fR.super.divN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW divN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.divN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revDivN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.revDivN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revDivN(float value)
	{
		return (Vec2fRW)Vec2fR.super.revDivN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW revDivN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.revDivN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW normalN()
	{
		return (Vec2fRW)Vec2fR.super.normalN();
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW normalSafeN()
	{
		return (Vec2fRW)Vec2fR.super.normalSafeN();
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW normalSafeWithMarginN(float tolerance)
	{
		return (Vec2fRW)Vec2fR.super.normalSafeWithMarginN(tolerance);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW invertN()
	{
		return (Vec2fRW)Vec2fR.super.invertN();
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW inverseN()
	{
		return (Vec2fRW)Vec2fR.super.inverseN();
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW inverseN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.inverseN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW inverseN(float value)
	{
		return (Vec2fRW)Vec2fR.super.inverseN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fRW inverseN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.inverseN(x, y);
	}
}
