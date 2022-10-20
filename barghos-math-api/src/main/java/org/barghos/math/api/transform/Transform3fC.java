package org.barghos.math.api.transform;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.vector.QuatR;

public interface Transform3fC extends Transform3fR
{
	Transform3fC set(Transform3fR tr);
	
	Transform3fC set(Tup3fR pos, QuatR rot, Tup3fR scale);
	
	default Transform3fC setPos(Tup3fR t)
	{
		return setPos(t.getX(), t.getY(), t.getZ());
	}
	
	default Transform3fC setPos(float value)
	{
		return setPos(value, value, value);
	}
	
	Transform3fC reset();
	
	Transform3fC setPos(float x, float y, float z);
	
	Transform3fC setRot(QuatR rot);
	
	default Transform3fC setScale(Tup3fR t)
	{
		return setScale(t.getX(), t.getY(), t.getZ());
	}
	
	default Transform3fC setScale(float value)
	{
		return setScale(value, value, value);
	}
	
	Transform3fC setScale(float x, float y, float z);
	
	Transform3fC clone();
	
	default Transform3fC move(Tup3fR t)
	{
		return move(t.getX(), t.getY(), t.getZ());
	}
	
	default Transform3fC move(float value)
	{
		return move(value);
	}
	
	Transform3fC move(float x, float y, float z);
	
	Transform3fC rotate(QuatR rot);
	
	
	default Transform3fC scale(Tup3fR t)
	{
		return scale(t.getX(), t.getY(), t.getZ());
	}
	
	default Transform3fC scale(float value)
	{
		return scale(value, value, value);
	}
	
	Transform3fC scale(float x, float y, float z);
}
