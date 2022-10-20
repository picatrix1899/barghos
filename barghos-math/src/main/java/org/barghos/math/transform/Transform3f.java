package org.barghos.math.transform;

import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.transform.Transform3fC;
import org.barghos.math.api.transform.Transform3fR;
import org.barghos.math.api.vector.QuatC;
import org.barghos.math.api.vector.QuatR;
import org.barghos.math.api.vector.Vec3fC;
import org.barghos.math.vector.Quatd;
import org.barghos.math.vector.Vec3f;

public class Transform3f implements Transform3fC
{
	private final Vec3fC pos = new Vec3f();
	private final QuatC rot = new Quatd();
	private final Vec3fC scale = new Vec3f();
	
	public Transform3f()
	{
		reset();
	}
	
	public Transform3f(Transform3fR tr)
	{
		set(tr);
	}
	
	public Transform3f(Tup3fR pos, QuatR rot, Tup3fR scale)
	{
		set(pos, rot, scale);
	}
	
	public <T extends Tup3fC> T getPos(T res)
	{
		res.set(this.pos);
		
		return res;
	}

	public <T extends QuatC> T getRot(T res)
	{
		res.set(this.rot);
		
		return res;
	}
	
	public <T extends Tup3fC> T getScale(T res)
	{
		res.set(this.scale);
		
		return res;
	}

	public Transform3fC reset()
	{
		this.pos.set(0.0f);
		this.rot.set(0.0f, 0.0f, 0.0f, 1.0f);
		this.scale.set(1.0f);
		
		return this;
	}
	
	public Transform3fC set(Transform3fR tr)
	{
		tr.getPos(this.pos);
		tr.getRot(this.rot);
		tr.getScale(this.scale);
		
		return this;
	}

	public Transform3fC set(Tup3fR pos, QuatR rot, Tup3fR scale)
	{
		this.pos.set(pos);
		this.rot.set(rot);
		this.scale.set(scale);
		
		return this;
	}

	public Transform3fC setPos(float x, float y, float z)
	{
		this.pos.set(x, y, z);
		
		return this;
	}

	public Transform3fC setRot(QuatR rot)
	{
		this.rot.set(rot);
		
		return this;
	}

	public Transform3fC setScale(float x, float y, float z)
	{
		this.scale.set(x, y, z);
		
		return this;
	}

	public Transform3fC clone()
	{
		return new Transform3f(this);
	}

	public Transform3fC move(float x, float y, float z)
	{
		this.pos.add(x, y, z);
		
		return this;
	}

	public Transform3fC rotate(QuatR rot)
	{
		this.rot.mul(rot);
		
		return this;
	}

	public Transform3fC scale(float x, float y, float z)
	{
		this.scale.mul(x, y, z);
		
		return this;
	}
}
