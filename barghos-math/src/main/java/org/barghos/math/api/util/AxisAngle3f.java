package org.barghos.math.api.util;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.vector.Quatf;
import org.barghos.math.api.vector.QuatfR;
import org.barghos.math.matrix.Mat4f;
import org.barghos.math.vector.Vec3f;

public class AxisAngle3f
{
	private final Vec3f axis = new Vec3f();
	private float angle;
	
	public AxisAngle3f(Tup3fR axis, float angle)
	{
		set(axis, angle);
	}
	
	public AxisAngle3f(float aX, float aY, float aZ, float angle)
	{
		set(aX, aY, aZ, angle);
	}
	
	public AxisAngle3f set(Tup3fR axis, float angle)
	{
		return set(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	public AxisAngle3f set(float aX, float aY, float aZ, float angle)
	{
		this.axis.set(aX, aY, aZ);
		this.angle = angle;
		
		return this;
	}
	
	public AxisAngle3f setAxis(Tup3fR axis)
	{
		return setAxis(axis.getX(), axis.getY(), axis.getZ());
	}
	
	public AxisAngle3f setAxis(float x, float y, float z)
	{
		this.axis.set(x, y, z);
		
		return this;
	}
	
	public AxisAngle3f setAngle(float angle)
	{
		this.angle = angle;
		
		return this;
	}
	
	public Vec3f getAxis()
	{
		return this.axis.clone();
	}
	
	public float getAngle()
	{
		return this.angle;
	}
	
	public QuatfR toQuaternion()
	{
		return Quatf.getFromAxis(this.axis, this.angle);
	}
	
	public Mat4fC toMatrix4f()
	{
		return Mat4f.rotation(this.axis, this.angle);
	}
	
	public AxisAngle3f clone()
	{
		return new AxisAngle3f(this.axis, this.angle);
	}
}
