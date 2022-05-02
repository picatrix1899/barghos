package org.barghos.math.model;

import org.barghos.math.api.model.EulerAngle3fC;
import org.barghos.math.api.model.EulerAngle3fR;
import org.barghos.math.util.Maths;

public class EulerAngle3f implements EulerAngle3fC
{
	private float pitch;
	private float yaw;
	private float roll;
	
	public EulerAngle3f() { }
	
	public EulerAngle3f(EulerAngle3fR ea)
	{
		set(ea);
	}
	
	public EulerAngle3f(float[] angles)
	{
		setArray(angles);
	}
	
	public EulerAngle3f(float pitch, float yaw, float roll)
	{
		set(pitch, yaw, roll);
	}
	
	public float getPitchDeg()
	{
		return this.pitch * Maths.RAD_TO_DEGf;
	}

	public float getPitch()
	{
		return this.pitch;
	}

	public float getYawDeg()
	{
		return this.yaw * Maths.RAD_TO_DEGf;
	}

	public float getYaw()
	{
		return this.yaw;
	}

	public float getRollDeg()
	{
		return this.roll * Maths.RAD_TO_DEGf;
	}

	public float getRoll()
	{
		return this.roll;
	}

	public EulerAngle3fC set(float pitch, float yaw, float roll)
	{
		return setPitch(pitch).setYaw(yaw).setRoll(roll);
	}

	public EulerAngle3fC setPitchDeg(float pitch)
	{
		this.pitch = pitch * Maths.DEG_TO_RADf;
		
		return this;
	}

	public EulerAngle3fC setPitch(float pitch)
	{
		this.pitch = pitch;
		
		return this;
	}

	public EulerAngle3fC setYawDeg(float yaw)
	{
		this.yaw = yaw * Maths.DEG_TO_RADf;
		
		return this;
	}

	public EulerAngle3fC setYaw(float yaw)
	{
		this.yaw = yaw;
		
		return this;
	}

	public EulerAngle3fC setRollDeg(float roll)
	{
		this.roll = roll * Maths.DEG_TO_RADf;
		
		return this;
	}

	public EulerAngle3fC setRoll(float roll)
	{
		this.roll = roll;
		
		return this;
	}

	public EulerAngle3fC clone()
	{
		return new EulerAngle3f(this);
	}

}
