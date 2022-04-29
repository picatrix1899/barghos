package org.barghos.math.util;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.util.CoordSystem3f;
import org.barghos.math.api.vector.Vec3fC;
import org.barghos.math.api.vector.Vec3fUtil;
import org.barghos.math.matrix.Mat4f;
import org.barghos.math.vector.Vec3f;

public class CartesianCoordSystem3f implements CoordSystem3f
{
	private final Vec3fC right = new Vec3f();
	private final Vec3fC up = new Vec3f();
	private final Vec3fC forward = new Vec3f();
	
	private boolean isRightHanded;
	
	public CartesianCoordSystem3f(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		this.right.set(right);
		this.up.set(up);
		this.forward.set(forward);
		
		calculateHandedness();
	}
	
	private void calculateHandedness()
	{
		boolean rightHanded = true;
		
		Vec3f axisRight = Vec3fUtil.cross(this.up.getX(), this.up.getY(), this.up.getZ(), this.forward.getX(), this.forward.getY(), this.forward.getZ(), new Vec3f());
		Vec3f axisUp = Vec3fUtil.cross(this.forward.getX(), this.forward.getY(), this.forward.getZ(), this.right.getX(), this.right.getY(), this.right.getZ(), new Vec3f());
		Vec3f axisForward = Vec3fUtil.cross(this.right.getX(), this.right.getY(), this.right.getZ(), this.up.getX(), this.up.getY(), this.up.getZ(), new Vec3f());
		
		if(!this.right.equals(axisRight)) rightHanded = false;
		if(!this.up.equals(axisUp)) rightHanded = false;
		if(!this.forward.equals(axisForward)) rightHanded = false;
		
		this.isRightHanded = rightHanded;
	}
	
	public boolean isRightHanded()
	{
		return this.isRightHanded;
	}

	public Mat4fC toMatrix()
	{
		return Mat4f.baseChanging(this.right, this.up, this.forward);
	}
}
