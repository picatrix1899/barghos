package org.barghos.math.transform;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.transform.SystemOrientation3fC;
import org.barghos.math.api.transform.SystemOrientation3fR;
import org.barghos.math.api.vector.Vec3fR;
import org.barghos.math.matrix.Mat4f;
import org.barghos.math.vector.Vec3f;

// MISSING_DOC
public class SystemOrientation3f implements SystemOrientation3fC
{
	// MISSING_DOC
	private float rX;
	
	// MISSING_DOC
	private float rY;
	
	// MISSING_DOC
	private float rZ;
	
	// MISSING_DOC
	private float uX;
	
	// MISSING_DOC
	private float uY;
	
	// MISSING_DOC
	private float uZ;
	
	// MISSING_DOC
	private float fX;
	
	// MISSING_DOC
	private float fY;
	
	// MISSING_DOC
	private float fZ;
	
	// MISSING_DOC
	public SystemOrientation3f()
	{
		set(1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(SystemOrientation3fR system)
	{
		set(system);
	}

	// MISSING_DOC
	public SystemOrientation3f(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		set(right, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(Tup3fR right, Tup3fR up, float[] forward)
	{
		set(right, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		set(right, up, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(Tup3fR right, float[] up, Tup3fR forward)
	{
		set(right, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		set(right, uX, uY, uZ, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(float[] right, Tup3fR up, Tup3fR forward)
	{
		set(right, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		set(rX, rY, rZ, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(Tup3fR right, float[] up, float[] forward)
	{
		set(right, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(float[] right, Tup3fR up, float[] forward)
	{
		set(right, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		set(rX, rY, rZ, up, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(float[] right, float[] up, Tup3fR forward)
	{
		set(right, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		set(rX, rY, rZ, uX, uY, uZ, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		set(right, uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(float[] right, float[] up, float[] forward)
	{
		set(right, up, forward);
	}
	
	// MISSING_DOC
	public SystemOrientation3f(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		set(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public Vec3fR getRight()
	{
		return new Vec3f(this.rX, this.rY, this.rZ);
	}

	// MISSING_DOC
	public <T extends Tup3fC> T getRight(@ExtractParam T res)
	{
		res.set(this.rX, this.rY, this.rZ);
		
		return res;
	}

	// MISSING_DOC
	public float[] getRight(@ExtractParam float[] res)
	{
		res[COMP_X] = this.rX;
		res[COMP_Y] = this.rY;
		res[COMP_Z] = this.rZ;
		
		return res;
	}

	// MISSING_DOC
	public Vec3fR getLeft()
	{
		return new Vec3f(-this.rX, -this.rY, -this.rZ);
	}

	// MISSING_DOC
	public <T extends Tup3fC> T getLeft(@ExtractParam T res)
	{
		res.set(-this.rX, -this.rY, -this.rZ);
		
		return res;
	}

	// MISSING_DOC
	public float[] getLeft(@ExtractParam float[] res)
	{
		res[COMP_X] = -this.rX;
		res[COMP_Y] = -this.rY;
		res[COMP_Z] = -this.rZ;
		
		return res;
	}

	// MISSING_DOC
	public Vec3fR getUp()
	{
		return new Vec3f(this.uX, this.uY, this.uZ);
	}

	// MISSING_DOC
	public <T extends Tup3fC> T getUp(@ExtractParam T res)
	{
		res.set(this.uX, this.uY, this.uZ);
		
		return res;
	}

	// MISSING_DOC
	public float[] getUp(@ExtractParam float[] res)
	{
		res[COMP_X] = this.uX;
		res[COMP_Y] = this.uY;
		res[COMP_Z] = this.uZ;
		
		return res;
	}

	// MISSING_DOC
	public Vec3fR getDown()
	{
		return new Vec3f(-this.uX, -this.uY, -this.uZ);
	}

	// MISSING_DOC
	public <T extends Tup3fC> T getDown(@ExtractParam T res)
	{
		res.set(-this.uX, -this.uY, -this.uZ);
		
		return res;
	}

	// MISSING_DOC
	public float[] getDown(@ExtractParam float[] res)
	{
		res[COMP_X] = -this.uX;
		res[COMP_Y] = -this.uY;
		res[COMP_Z] = -this.uZ;
		
		return res;
	}

	// MISSING_DOC
	public Vec3fR getForward()
	{
		return new Vec3f(this.fX, this.fY, this.fZ);
	}

	// MISSING_DOC
	public <T extends Tup3fC> T getForward(@ExtractParam T res)
	{
		res.set(this.fX, this.fY, this.fZ);
		
		return res;
	}

	// MISSING_DOC
	public float[] getForward(@ExtractParam float[] res)
	{
		res[COMP_X] = this.fX;
		res[COMP_Y] = this.fY;
		res[COMP_Z] = this.fZ;
		
		return res;
	}

	// MISSING_DOC
	public Vec3fR getBack()
	{
		return new Vec3f(-this.fX, -this.fY, -this.fZ);
	}

	// MISSING_DOC
	public <T extends Tup3fC> T getBack(@ExtractParam T res)
	{
		res.set(-this.fX, -this.fY, -this.fZ);
		
		return res;
	}

	// MISSING_DOC
	public float[] getBack(@ExtractParam float[] res)
	{
		res[COMP_X] = -this.fX;
		res[COMP_Y] = -this.fY;
		res[COMP_Z] = -this.fZ;
		
		return res;
	}

	// MISSING_DOC
	public Mat4fC toMatrix()
	{
		return toMatrix(new Mat4f());
	}

	// MISSING_DOC
	public <T extends Mat4fC> T toMatrix(@ExtractParam T res)
	{
		res.initBaseChange(this.rX, this.rY, this.rZ, this.uX, this.uY, this.uZ, this.fX, this.fY, this.fZ);
		
		return res;
	}

	// MISSING_DOC
	public Mat4fC toMatrix(boolean rightHanded)
	{
		return toMatrix(rightHanded, new Mat4f());
	}

	// MISSING_DOC
	public <T extends Mat4fC> T toMatrix(boolean rightHanded, @ExtractParam T res)
	{
		res.initBaseChange(this, rightHanded);
		
		return res;
	}

	// MISSING_DOC
	public Mat4fC toMatrixRH()
	{
		return toMatrixRH(new Mat4f());
	}

	// MISSING_DOC
	public <T extends Mat4fC> T toMatrixRH(T res)
	{
		res.initBaseChangeRH(this);
		
		return res;
	}

	// MISSING_DOC
	public Mat4fC toMatrixLH()
	{
		return toMatrixLH(new Mat4f());
	}

	// MISSING_DOC
	public <T extends Mat4fC> T toMatrixLH(T res)
	{
		res.initBaseChangeLH(this);
		
		return res;
	}
	
	// MISSING_DOC
	public SystemOrientation3fC set(SystemOrientation3fR system)
	{
		float[] v  = new float[3];
		
		return setRight(system.getRight(v)).setUp(system.getUp(v)).setForward(system.getForward(v));
	}
	
	// MISSING_DOC
	public SystemOrientation3fC set(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return setRight(rX, rY, rZ).setUp(uX, uY, uZ).setForward(fX, fY, fZ);
	}

	// MISSING_DOC
	public SystemOrientation3fC setRight(float x, float y, float z)
	{
		this.rX = x;
		this.rY = y;
		this.rZ = z;
		
		return this;
	}

	// MISSING_DOC
	public SystemOrientation3fC setUp(float x, float y, float z)
	{
		this.uX = x;
		this.uY = y;
		this.uZ = z;
		
		return this;
	}

	// MISSING_DOC
	public SystemOrientation3fC setForward(float x, float y, float z)
	{
		this.fX = x;
		this.fY = y;
		this.fZ = z;
		
		return this;
	}

	// MISSING_DOC
	public SystemOrientation3fC transform(Mat4fR m)
	{
		float[] v = new float[3];
		setRight(m.transform(this.rX, this.rY, this.rZ, false, v));
		setUp(m.transform(this.uX, this.uY, this.uZ, false, v));
		setForward(m.transform(this.fX, this.fY, this.fZ, false, v));

		return this;
	}

	// MISSING_DOC
	public SystemOrientation3fC clone()
	{
		return new SystemOrientation3f(this);
	}
}
