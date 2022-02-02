package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dRW;

/**
 * This interface grants read and write access to any 2-dimensional double vector.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Vec2dRW extends Vec2dR, Vec2dW, Tup2dRW
{
	/** {@inheritDoc} */
	@Override
	Vec2dRW setX(double x);
	
	/** {@inheritDoc} */
	@Override
	Vec2dRW setY(double y);
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW set(Tup2dR t)
	{
		return (Vec2dRW)Vec2dW.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW set(double value)
	{
		return (Vec2dRW)Vec2dW.super.set(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW set(double x, double y)
	{
		return (Vec2dRW)Vec2dW.super.set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW setByIndex(int index, double value)
	{
		return (Vec2dRW)Vec2dW.super.setByIndex(index, value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW setArray(double... values)
	{
		return (Vec2dRW)Vec2dW.super.setArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW set(TupdR t)
	{
		return (Vec2dRW)Vec2dW.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW add(Tup2dR t)
	{
		return (Vec2dRW)Vec2dW.super.add(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW add(double value)
	{
		return (Vec2dRW)Vec2dW.super.add(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW add(double x, double y)
	{
		return addR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW sub(Tup2dR t)
	{
		return (Vec2dRW)Vec2dW.super.sub(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW sub(double value)
	{
		return (Vec2dRW)Vec2dW.super.sub(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW sub(double x, double y)
	{
		return subR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revSub(Tup2dR t)
	{
		return (Vec2dRW)Vec2dW.super.revSub(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revSub(double value)
	{
		return (Vec2dRW)Vec2dW.super.revSub(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revSub(double x, double y)
	{
		return revSubR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW mul(Tup2dR t)
	{
		return (Vec2dRW)Vec2dW.super.mul(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW mul(double value)
	{
		return (Vec2dRW)Vec2dW.super.mul(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW mul(double x, double y)
	{
		return mulR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW div(Tup2dR t)
	{
		return (Vec2dRW)Vec2dW.super.div(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW div(double value)
	{
		return (Vec2dRW)Vec2dW.super.div(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW div(double x, double y)
	{
		return divR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revDiv(Tup2dR t)
	{
		return (Vec2dRW)Vec2dW.super.revDiv(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revDiv(double value)
	{
		return (Vec2dRW)Vec2dW.super.revDiv(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revDiv(double x, double y)
	{
		return revDivR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW normal()
	{
		return normalR(this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW normalSafe()
	{
		return normalSafeR(this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW normalSafeWithMargin(double tolerance)
	{
		return normalSafeWithMarginR(tolerance, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW invert()
	{
		return invertR(this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW inverse()
	{
		return inverseR(this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW inverse(Tup2dR t)
	{
		return inverseR(t, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW inverse(double value)
	{
		return inverseR(value, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW inverse(double x, double y)
	{
		return inverseR(x, y, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW getNewInstance(Tup2dR t)
	{
		return (Vec2dRW)Vec2dR.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW getNewInstance(double value)
	{
		return (Vec2dRW)Vec2dR.super.getNewInstance(value);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec2dRW getNewInstance(double x, double y);
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW getNewInstanceFromArray(double... values)
	{
		return (Vec2dRW)Vec2dR.super.getNewInstanceFromArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW getNewInstance(TupdR t)
	{
		return (Vec2dRW)Vec2dR.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW addN(Tup2dR t)
	{
		return (Vec2dRW)Vec2dR.super.addN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW addN(double value)
	{
		return (Vec2dRW)Vec2dR.super.addN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW addN(double x, double y)
	{
		return (Vec2dRW)Vec2dR.super.addN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW subN(Tup2dR t)
	{
		return (Vec2dRW)Vec2dR.super.subN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW subN(double value)
	{
		return (Vec2dRW)Vec2dR.super.subN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW subN(double x, double y)
	{
		return (Vec2dRW)Vec2dR.super.subN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revSubN(Tup2dR t)
	{
		return (Vec2dRW)Vec2dR.super.revSubN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revSubN(double value)
	{
		return (Vec2dRW)Vec2dR.super.revSubN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revSubN(double x, double y)
	{
		return (Vec2dRW)Vec2dR.super.revSubN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW mulN(Tup2dR t)
	{
		return (Vec2dRW)Vec2dR.super.mulN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW mulN(double value)
	{
		return (Vec2dRW)Vec2dR.super.mulN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW mulN(double x, double y)
	{
		return (Vec2dRW)Vec2dR.super.mulN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW divN(Tup2dR t)
	{
		return (Vec2dRW)Vec2dR.super.divN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW divN(double value)
	{
		return (Vec2dRW)Vec2dR.super.divN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW divN(double x, double y)
	{
		return (Vec2dRW)Vec2dR.super.divN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revDivN(Tup2dR t)
	{
		return (Vec2dRW)Vec2dR.super.revDivN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revDivN(double value)
	{
		return (Vec2dRW)Vec2dR.super.revDivN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW revDivN(double x, double y)
	{
		return (Vec2dRW)Vec2dR.super.revDivN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW normalN()
	{
		return (Vec2dRW)Vec2dR.super.normalN();
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW normalSafeN()
	{
		return (Vec2dRW)Vec2dR.super.normalSafeN();
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW normalSafeWithMarginN(double tolerance)
	{
		return (Vec2dRW)Vec2dR.super.normalSafeWithMarginN(tolerance);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW invertN()
	{
		return (Vec2dRW)Vec2dR.super.invertN();
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW inverseN()
	{
		return (Vec2dRW)Vec2dR.super.inverseN();
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW inverseN(Tup2dR t)
	{
		return (Vec2dRW)Vec2dR.super.inverseN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW inverseN(double value)
	{
		return (Vec2dRW)Vec2dR.super.inverseN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dRW inverseN(double x, double y)
	{
		return (Vec2dRW)Vec2dR.super.inverseN(x, y);
	}
}
