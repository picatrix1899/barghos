package org.barghos.impl.math.bounds;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.function.floats.IFunc6F;
import org.barghos.api.core.math.MathUtils;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.math.bounds.AabbUtils3F;
import org.barghos.api.math.bounds.IAabb3RF;
import org.barghos.api.math.bounds.IAabb3WF;

public class Aabb3F implements IAabb3WF
{
	public static final IFunc6F<Aabb3F> CTOR = Aabb3F::new;
	
	private final float[] aabb = new float[6];
	
	public Aabb3F()
	{
		set(0, 0, 0, 1, 1, 1);
	}
	
	public Aabb3F(IAabb3RF aabb)
	{
		set(aabb);
	}
	
	public Aabb3F(float[] aabb)
	{
		set(aabb);
	}
	
	public Aabb3F(ITup3RF min, ITup3RF max)
	{
		set(min, max);
	}
	
	public Aabb3F(ITup3RF min, float[] max)
	{
		set(min, max);
	}
	
	public Aabb3F(ITup3RF min, float maxX, float maxY, float maxZ)
	{
		set(min, maxX, maxY, maxZ);
	}
	
	public Aabb3F(float[] min, ITup3RF max)
	{
		set(min, max);
	}
	
	public Aabb3F(float[] min, float[] max)
	{
		set(min, max);
	}
	
	public Aabb3F(float[] min, float maxX, float maxY, float maxZ)
	{
		set(min, maxX, maxY, maxZ);
	}
	
	public Aabb3F(float minX, float minY, float minZ, ITup3RF max)
	{
		set(minX, minY, minZ, max);
	}
	public Aabb3F(float minX, float minY, float minZ, float[] max)
	{
		set(minX, minY, minZ, max);
	}
	
	public Aabb3F(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		set(minX, minY, minZ, maxX, maxY, maxZ);
	}
	
	@Override
	public float minX()
	{
		return this.aabb[0];
	}
	
	@Override
	public float minY()
	{
		return this.aabb[1];
	}
	
	@Override
	public float minZ()
	{
		return this.aabb[2];
	}
	
	@Override
	public <T extends ITup3WF> T getMin(T res)
	{
		res.set(this.aabb[0], this.aabb[1], this.aabb[2]);
		
		return res;
	}
	
	@Override
	public float[] getMin(float[] res)
	{
		res[0] = this.aabb[0];
		res[1] = this.aabb[1];
		res[2] = this.aabb[2];
		
		return res;
	}
	
	@Override
	public float maxX()
	{
		return this.aabb[3];
	}
	
	@Override
	public float maxY()
	{
		return this.aabb[4];
	}
	
	@Override
	public float maxZ()
	{
		return this.aabb[5];
	}
	
	@Override
	public <T extends ITup3WF> T getMax(T res)
	{
		res.set(this.aabb[3], this.aabb[4], this.aabb[5]);
		
		return res;
	}
	
	@Override
	public float[] getMax(float[] res)
	{
		res[0] = this.aabb[3];
		res[1] = this.aabb[4];
		res[2] = this.aabb[5];
		
		return res;
	}
	
	@Override
	public <T extends ITup3WF> T size(T res)
	{
		res.set(sizeX(), sizeY(), sizeZ());
		
		return res;
	}
	
	@Override
	public float[] size(float[] res)
	{
		res[0] = sizeX();
		res[1] = sizeY();
		res[2] = sizeZ();
		
		return res;
	}
	
	@Override
	public float sizeX()
	{
		return this.aabb[3] - this.aabb[0];
	}
	
	@Override
	public float sizeY()
	{
		return this.aabb[4] - this.aabb[1];
	}
	
	@Override
	public float sizeZ()
	{
		return this.aabb[5] - this.aabb[2];
	}
	
	@Override
	public <T extends ITup3WF> T center(T res)
	{
		res.set(centerX(), centerY(), centerZ());
		
		return res;
	}
	
	@Override
	public float[] center(float[] res)
	{
		res[0] = centerX();
		res[1] = centerY();
		res[2] = centerZ();
		
		return res;
	}
	
	@Override
	public float centerX()
	{
		return (this.aabb[0] + this.aabb[3]) * 0.5f;
	}
	
	@Override
	public float centerY()
	{
		return (this.aabb[1] + this.aabb[4] * 0.5f);
	}
	
	@Override
	public float centerZ()
	{
		return (this.aabb[2] + this.aabb[5] * 0.5f);
	}
	
	@Override
	public Aabb3F set(IAabb3RF aabb)
	{
		return set(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	@Override
	public Aabb3F set(float[] aabb)
	{
		return set(aabb[0], aabb[1], aabb[2], aabb[3], aabb[4], aabb[5]);
	}
	
	@Override
	public Aabb3F set(ITup3RF min, ITup3RF max)
	{
		return set(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	@Override
	public Aabb3F set(ITup3RF min, float[] max)
	{
		return set(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	@Override
	public Aabb3F set(ITup3RF min, float maxX, float maxY, float maxZ)
	{
		return set(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	@Override
	public Aabb3F set(float[] min, ITup3RF max)
	{
		return set(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}

	@Override
	public Aabb3F set(float[] min, float[] max)
	{
		return set(min[0], min[1], min[2], max[0], max[1], max[2]);
	}

	@Override
	public Aabb3F set(float[] min, float maxX, float maxY, float maxZ)
	{
		return set(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	@Override
	public Aabb3F set(float minX, float minY, float minZ, ITup3RF max)
	{
		return set(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	@Override
	public Aabb3F set(float minX, float minY, float minZ, float[] max)
	{
		return set(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	@Override
	public Aabb3F set(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		this.aabb[0] = MathUtils.min(minX, maxX);
		this.aabb[1] = MathUtils.min(minY, maxY);
		this.aabb[2] = MathUtils.min(minZ, maxZ);
		this.aabb[3] = MathUtils.max(minX, maxX);
		this.aabb[4] = MathUtils.max(minY, maxY);
		this.aabb[5] = MathUtils.max(minZ, maxZ);
		
		return this;
	}
	
	@Override
	public Aabb3F setMin(ITup3RF min)
	{
		float minX = min.v0();
		float minY = min.v1();
		float minZ = min.v2();
		
		this.aabb[0] = MathUtils.min(this.aabb[3], minX);
		this.aabb[1] = MathUtils.min(this.aabb[4], minY);
		this.aabb[2] = MathUtils.min(this.aabb[5], minZ);
		
		this.aabb[3] = MathUtils.max(this.aabb[3], minX);
		this.aabb[4] = MathUtils.max(this.aabb[4], minY);
		this.aabb[5] = MathUtils.max(this.aabb[5], minZ);
		
		return this;
	}

	@Override
	public Aabb3F setMin(float[] min)
	{
		float minX = min[0];
		float minY = min[1];
		float minZ = min[2];
		
		this.aabb[0] = MathUtils.min(this.aabb[3], minX);
		this.aabb[1] = MathUtils.min(this.aabb[4], minY);
		this.aabb[2] = MathUtils.min(this.aabb[5], minZ);
		
		this.aabb[3] = MathUtils.max(this.aabb[3], minX);
		this.aabb[4] = MathUtils.max(this.aabb[4], minY);
		this.aabb[5] = MathUtils.max(this.aabb[5], minZ);
		
		return this;
	}

	@Override
	public Aabb3F setMin(float x, float y, float z)
	{
		this.aabb[0] = MathUtils.min(this.aabb[3], x);
		this.aabb[1] = MathUtils.min(this.aabb[4], y);
		this.aabb[2] = MathUtils.min(this.aabb[5], z);
		
		this.aabb[3] = MathUtils.max(this.aabb[3], x);
		this.aabb[4] = MathUtils.max(this.aabb[4], y);
		this.aabb[5] = MathUtils.max(this.aabb[5], z);
		
		return this;
	}

	@Override
	public Aabb3F minX(float x)
	{
		this.aabb[0] = MathUtils.min(this.aabb[3], x);
		this.aabb[3] = MathUtils.max(this.aabb[3], x);
		
		return this;
	}

	@Override
	public Aabb3F minY(float y)
	{
		this.aabb[1] = MathUtils.min(this.aabb[4], y);
		this.aabb[4] = MathUtils.max(this.aabb[4], y);
		
		return this;
	}

	@Override
	public Aabb3F minZ(float z)
	{
		this.aabb[2] = MathUtils.min(this.aabb[5], z);
		this.aabb[5] = MathUtils.max(this.aabb[5], z);
		
		return this;
	}

	@Override
	public Aabb3F setMax(ITup3RF max)
	{
		float maxX = max.v0();
		float maxY = max.v1();
		float maxZ = max.v2();
		
		this.aabb[3] = MathUtils.max(this.aabb[0], maxX);
		this.aabb[4] = MathUtils.max(this.aabb[1], maxY);
		this.aabb[5] = MathUtils.max(this.aabb[2], maxZ);
		
		this.aabb[0] = MathUtils.min(this.aabb[0], maxX);
		this.aabb[1] = MathUtils.min(this.aabb[1], maxY);
		this.aabb[2] = MathUtils.min(this.aabb[2], maxZ);
		
		return this;
	}

	@Override
	public Aabb3F setMax(float[] max)
	{
		float maxX = max[0];
		float maxY = max[1];
		float maxZ = max[2];
		
		this.aabb[3] = MathUtils.max(this.aabb[0], maxX);
		this.aabb[4] = MathUtils.max(this.aabb[1], maxY);
		this.aabb[5] = MathUtils.max(this.aabb[2], maxZ);
		
		this.aabb[0] = MathUtils.min(this.aabb[0], maxX);
		this.aabb[1] = MathUtils.min(this.aabb[1], maxY);
		this.aabb[2] = MathUtils.min(this.aabb[2], maxZ);
		
		return this;
	}

	@Override
	public Aabb3F setMax(float x, float y, float z)
	{
		this.aabb[3] = MathUtils.max(this.aabb[0], x);
		this.aabb[4] = MathUtils.max(this.aabb[1], y);
		this.aabb[5] = MathUtils.max(this.aabb[2], z);
		
		this.aabb[0] = MathUtils.min(this.aabb[0], x);
		this.aabb[1] = MathUtils.min(this.aabb[1], y);
		this.aabb[2] = MathUtils.min(this.aabb[2], z);
		
		return this;
	}

	@Override
	public Aabb3F maxX(float x)
	{
		this.aabb[3] = MathUtils.max(this.aabb[0], x);
		this.aabb[0] = MathUtils.min(this.aabb[0], x);
		
		return this;
	}

	@Override
	public Aabb3F maxY(float y)
	{
		this.aabb[4] = MathUtils.max(this.aabb[1], y);
		this.aabb[1] = MathUtils.min(this.aabb[1], y);
		
		return this;
	}

	@Override
	public Aabb3F maxZ(float z)
	{
		this.aabb[5] = MathUtils.max(this.aabb[2], z);
		this.aabb[2] = MathUtils.min(this.aabb[2], z);
		
		return this;
	}

	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.aabb, 6);
	}
	
	@Override
	public float[] toArray(@ExtractionParam float[] res)
	{
		System.arraycopy(this.aabb, 0, res, 0, 6);
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "aabb3f(min=(" + this.aabb[0] + ", " + this.aabb[1] + ", " + this.aabb[2] + "), max=(" + this.aabb[3] + ", " + this.aabb[4] + ", " + this.aabb[5] +  "))";
	}
	
	@Override
	public Aabb3F scale(ITup3RF t)
	{
		AabbUtils3F.scale(this.aabb, t, this.aabb);
		
		return this;
	}
	
	@Override
	public IAabb3WF scale(float[] t)
	{
		AabbUtils3F.scale(this.aabb, t, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F scale(float value)
	{
		AabbUtils3F.scale(this.aabb, value, value, value, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F scale(float x, float y, float z)
	{
		AabbUtils3F.scale(this.aabb, x, y, z, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F scaleN(ITup3RF t)
	{
		AabbUtils3F.scaleFunc(this.aabb, t, CTOR);
		
		return this;
	}
	
	@Override
	public Aabb3F scaleN(float[] t)
	{
		AabbUtils3F.scaleFunc(this.aabb, t, CTOR);
		
		return this;
	}
	
	@Override
	public Aabb3F scaleN(float value)
	{
		AabbUtils3F.scaleFunc(this.aabb, value, value, value, CTOR);
		
		return this;
	}
	
	@Override
	public Aabb3F scaleN(float x, float y, float z)
	{
		AabbUtils3F.scaleFunc(this.aabb, x, y, z, CTOR);
		
		return this;
	}
	
	@Override
	public <T extends IAabb3WF> T scaleT(ITup3RF t, @ExtractionParam T res)
	{
		return AabbUtils3F.scale(this.aabb, t, res);
	}
	
	@Override
	public <T extends IAabb3WF> T scaleT(float[] t, T res)
	{
		return AabbUtils3F.scale(this.aabb, t, res);
	}
	
	@Override
	public <T extends IAabb3WF> T scaleT(float value, @ExtractionParam T res)
	{
		return AabbUtils3F.scale(this.aabb, value, value, value, res);
	}
	
	@Override
	public <T extends IAabb3WF> T scaleT(float x, float y, float z, @ExtractionParam T res)
	{
		return AabbUtils3F.scale(this.aabb, x, y, z, res);
	}
	
	@Override
	public float[] scaleT(ITup3RF t, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scale(this.aabb, t, res);
	}
	
	@Override
	public float[] scaleT(float[] t, float[] res)
	{
		return AabbUtils3F.scale(this.aabb, t, res);
	}
	
	@Override
	public float[] scaleT(float value, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scale(this.aabb, value, value, value, res);
	}
	
	@Override
	public float[] scaleT(float x, float y, float z, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scale(this.aabb, x, y, z, res);
	}
	
	@Override
	public Aabb3F scaleFromPivot(ITup3RF pivot, ITup3RF scale)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivot(ITup3RF pivot, float[] scale)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivot(ITup3RF pivot, float scaleX, float scaleY, float scaleZ)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivot, scaleX, scaleY, scaleZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivot(float[] pivot, ITup3RF scale)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivot(float[] pivot, float[] scale)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivot(float[] pivot, float scaleX, float scaleY, float scaleZ)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivot, scaleX, scaleY, scaleZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivot(float pivotX, float pivotY, float pivotZ, ITup3RF scale)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivot(float pivotX, float pivotY, float pivotZ, float[] scale)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivot(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ)
	{
		AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scaleX, scaleY, scaleZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(ITup3RF pivot, ITup3RF scale)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivot, scale, this.aabb, CTOR);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(ITup3RF pivot, float[] scale)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivot, scale, this.aabb, CTOR);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(ITup3RF pivot, float scaleX, float scaleY, float scaleZ)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivot, scaleX, scaleY, scaleZ, this.aabb, CTOR);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(float[] pivot, ITup3RF scale)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivot, scale, this.aabb, CTOR);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(float[] pivot, float[] scale)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivot, scale, this.aabb, CTOR);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(float[] pivot, float scaleX, float scaleY, float scaleZ)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivot, scaleX, scaleY, scaleZ, this.aabb, CTOR);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(float pivotX, float pivotY, float pivotZ, ITup3RF scale)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivotX, pivotY, pivotZ, scale, this.aabb, CTOR);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(float pivotX, float pivotY, float pivotZ, float[] scale)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivotX, pivotY, pivotZ, scale, this.aabb, CTOR);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromPivotN(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ)
	{
		AabbUtils3F.scaleFromPivotFunc(this.aabb, pivotX, pivotY, pivotZ, scaleX, scaleY, scaleZ, this.aabb, CTOR);
		
		return this;
	}
	
	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(ITup3RF pivot, ITup3RF scale, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(ITup3RF pivot, float[] scale, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(ITup3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scaleX, scaleY, scaleZ, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(float[] pivot, ITup3RF scale, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(float[] pivot, float[] scale, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scaleX, scaleY, scaleZ, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(float pivotX, float pivotY, float pivotZ, ITup3RF scale, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromPivotT(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scaleX, scaleY, scaleZ, res);
	}

	@Override
	public float[] scaleFromPivotT(ITup3RF pivot, ITup3RF scale, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, res);
	}

	@Override
	public float[] scaleFromPivotT(ITup3RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, res);
	}

	@Override
	public float[] scaleFromPivotT(ITup3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scaleX, scaleY, scaleZ, res);
	}

	@Override
	public float[] scaleFromPivotT(float[] pivot, ITup3RF scale, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, res);
	}

	@Override
	public float[] scaleFromPivotT(float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scale, res);
	}

	@Override
	public float[] scaleFromPivotT(float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivot, scaleX, scaleY, scaleZ, res);
	}

	@Override
	public float[] scaleFromPivotT(float pivotX, float pivotY, float pivotZ, ITup3RF scale, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scale, res);
	}

	@Override
	public float[] scaleFromPivotT(float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scale, res);
	}

	@Override
	public float[] scaleFromPivotT(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		return AabbUtils3F.scaleFromPivot(this.aabb, pivotX, pivotY, pivotZ, scaleX, scaleY, scaleZ, res);
	}
	
	@Override
	public Aabb3F scaleFromMin(ITup3RF scale)
	{
		AabbUtils3F.scaleFromMin(this.aabb, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromMin(float[] scale)
	{
		AabbUtils3F.scaleFromMin(this.aabb, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromMin(float scaleX, float scaleY, float scaleZ)
	{
		AabbUtils3F.scaleFromMin(this.aabb, scaleX, scaleY, scaleZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromMinN(ITup3RF scale)
	{
		return AabbUtils3F.scaleFromMinFunc(this.aabb, scale, CTOR);
	}

	@Override
	public Aabb3F scaleFromMinN(float[] scale)
	{
		return AabbUtils3F.scaleFromMinFunc(this.aabb, scale, CTOR);
	}

	@Override
	public Aabb3F scaleFromMinN(float scaleX, float scaleY, float scaleZ)
	{
		return AabbUtils3F.scaleFromMinFunc(this.aabb, scaleX, scaleY, scaleZ, CTOR);
	}
	
	@Override
	public <T extends IAabb3WF> T scaleFromMinT(ITup3RF scale, T res)
	{
		return AabbUtils3F.scaleFromMin(this.aabb, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromMinT(float[] scale, T res)
	{
		return AabbUtils3F.scaleFromMin(this.aabb, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromMinT(float scaleX, float scaleY, float scaleZ, T res)
	{
		return AabbUtils3F.scaleFromMin(this.aabb, scaleX, scaleY, scaleZ, res);
	}

	@Override
	public float[] scaleFromMinT(ITup3RF scale, float[] res)
	{
		return AabbUtils3F.scaleFromMin(this.aabb, scale, res);
	}

	@Override
	public float[] scaleFromMinT(float[] scale, float[] res)
	{
		return AabbUtils3F.scaleFromMin(this.aabb, scale, res);
	}

	@Override
	public float[] scaleFromMinT(float scaleX, float scaleY, float scaleZ, float[] res)
	{
		return AabbUtils3F.scaleFromMin(this.aabb, scaleX, scaleY, scaleZ, res);
	}
	
	@Override
	public Aabb3F scaleFromMax(ITup3RF scale)
	{
		AabbUtils3F.scaleFromMax(this.aabb, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromMax(float[] scale)
	{
		AabbUtils3F.scaleFromMax(this.aabb, scale, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromMax(float scaleX, float scaleY, float scaleZ)
	{
		AabbUtils3F.scaleFromMax(this.aabb, scaleX, scaleY, scaleZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F scaleFromMaxN(ITup3RF scale)
	{
		return AabbUtils3F.scaleFromMaxFunc(this.aabb, scale, CTOR);
	}

	@Override
	public Aabb3F scaleFromMaxN(float[] scale)
	{
		return AabbUtils3F.scaleFromMaxFunc(this.aabb, scale, CTOR);
	}

	@Override
	public Aabb3F scaleFromMaxN(float scaleX, float scaleY, float scaleZ)
	{
		return AabbUtils3F.scaleFromMaxFunc(this.aabb, scaleX, scaleY, scaleZ, CTOR);
	}
	
	@Override
	public <T extends IAabb3WF> T scaleFromMaxT(ITup3RF scale, T res)
	{
		return AabbUtils3F.scaleFromMax(this.aabb, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromMaxT(float[] scale, T res)
	{
		return AabbUtils3F.scaleFromMax(this.aabb, scale, res);
	}

	@Override
	public <T extends IAabb3WF> T scaleFromMaxT(float scaleX, float scaleY, float scaleZ, T res)
	{
		return AabbUtils3F.scaleFromMax(this.aabb, scaleX, scaleY, scaleZ, res);
	}

	@Override
	public float[] scaleFromMaxT(ITup3RF scale, float[] res)
	{
		return AabbUtils3F.scaleFromMax(this.aabb, scale, res);
	}

	@Override
	public float[] scaleFromMaxT(float[] scale, float[] res)
	{
		return AabbUtils3F.scaleFromMax(this.aabb, scale, res);
	}

	@Override
	public float[] scaleFromMaxT(float scaleX, float scaleY, float scaleZ, float[] res)
	{
		return AabbUtils3F.scaleFromMax(this.aabb, scaleX, scaleY, scaleZ, res);
	}
	
	@Override
	public Aabb3F merge(IAabb3RF aabb)
	{
		AabbUtils3F.mergeAabbAabb(this.aabb, aabb, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F merge(float[] aabb)
	{
		AabbUtils3F.mergeAabbAabb(this.aabb, aabb, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F merge(ITup3RF min, ITup3RF max)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, min, max, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F merge(ITup3RF min, float[] max)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, min, max, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F merge(ITup3RF min, float maxX, float maxY, float maxZ)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, min, maxX, maxY, maxZ, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F merge(float[] min, ITup3RF max)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, min, max, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F merge(float[] min, float[] max)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, min, max, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F merge(float[] min, float maxX, float maxY, float maxZ)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, min, maxX, maxY, maxZ, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F merge(float minX, float minY, float minZ, ITup3RF max)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, max, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F merge(float minX, float minY, float minZ, float[] max)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, max, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F merge(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, maxX, maxY, maxZ, this.aabb);
		
		return this;
	}
	
	@Override
	public Aabb3F mergeN(IAabb3RF aabb)
	{
		return AabbUtils3F.mergeAabbAabbFunc(this.aabb, aabb, CTOR);
	}
	
	@Override
	public Aabb3F mergeN(float[] aabb)
	{
		return AabbUtils3F.mergeAabbAabbFunc(this.aabb, aabb, CTOR);
	}
	
	@Override
	public Aabb3F mergeN(ITup3RF min, ITup3RF max)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, min, max, CTOR);
	}
	
	@Override
	public Aabb3F mergeN(ITup3RF min, float[] max)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, min, max, CTOR);
	}
	
	@Override
	public Aabb3F mergeN(ITup3RF min, float maxX, float maxY, float maxZ)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, min, maxX, maxY, maxZ, CTOR);
	}
	
	@Override
	public Aabb3F mergeN(float[] min, ITup3RF max)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, min, max, CTOR);
	}

	@Override
	public Aabb3F mergeN(float[] min, float[] max)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, min, max, CTOR);
	}

	@Override
	public Aabb3F mergeN(float[] min, float maxX, float maxY, float maxZ)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, min, maxX, maxY, maxZ, CTOR);
	}
	
	@Override
	public Aabb3F mergeN(float minX, float minY, float minZ, ITup3RF max)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, minX, minY, minZ, max, CTOR);
	}
	
	@Override
	public Aabb3F mergeN(float minX, float minY, float minZ, float[] max)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, minX, minY, minZ, max, CTOR);
	}
	
	@Override
	public Aabb3F mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		return AabbUtils3F.mergeAabbVecFunc(this.aabb, minX, minY, minZ, maxX, maxY, maxZ, CTOR);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(IAabb3RF aabb, T res)
	{
		return AabbUtils3F.mergeAabbAabb(this.aabb, aabb, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float[] aabb, T res)
	{
		return AabbUtils3F.mergeAabbAabb(this.aabb, aabb, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(ITup3RF min, ITup3RF max, @ExtractionParam T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, max, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(ITup3RF min, float[] max, T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, max, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(ITup3RF min, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, maxX, maxY, maxZ, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float[] min, ITup3RF max, T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, max, res);
	}

	@Override
	public <T extends IAabb3WF> T mergeT(float[] min, float[] max, T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, max, res);
	}

	@Override
	public <T extends IAabb3WF> T mergeT(float[] min, float maxX, float maxY, float maxZ, T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, maxX, maxY, maxZ, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, ITup3RF max, @ExtractionParam T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, max, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, float[] max, T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, max, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, maxX, maxY, maxZ, res);
	}
	
	@Override
	public float[] mergeT(IAabb3RF aabb, float[] res)
	{
		return AabbUtils3F.mergeAabbAabb(this.aabb, aabb, res);
	}
	
	@Override
	public float[] mergeT(float[] aabb, float[] res)
	{
		return AabbUtils3F.mergeAabbAabb(this.aabb, aabb, res);
	}
	
	@Override
	public float[] mergeT(ITup3RF min, ITup3RF max, @ExtractionParam float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, max, res);
	}
	
	@Override
	public float[] mergeT(ITup3RF min, float[] max, float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, max, res);
	}
	
	@Override
	public float[] mergeT(ITup3RF min, float maxX, float maxY, float maxZ, @ExtractionParam float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, maxX, maxY, maxZ, res);
	}
	
	@Override
	public float[] mergeT(float[] min, ITup3RF max, float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, max, res);
	}

	@Override
	public float[] mergeT(float[] min, float[] max, float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, max, res);
	}

	@Override
	public float[] mergeT(float[] min, float maxX, float maxY, float maxZ, float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, min, maxX, maxY, maxZ, res);
	}
	
	@Override
	public float[] mergeT(float minX, float minY, float minZ, ITup3RF max, @ExtractionParam float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, max, res);
	}
	
	@Override
	public float[] mergeT(float minX, float minY, float minZ, float[] max, float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, max, res);
	}
	
	@Override
	public float[] mergeT(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam float[] res)
	{
		return AabbUtils3F.mergeAabbVec(this.aabb, minX, minY, minZ, maxX, maxY, maxZ, res);
	}
	
	@Override
	public Aabb3F translate(ITup3RF t)
	{
		AabbUtils3F.translate(this.aabb, t, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translate(float[] t)
	{
		AabbUtils3F.translate(this.aabb, t, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translate(float tX, float tY, float tZ)
	{
		AabbUtils3F.translate(this.aabb, tX, tY, tZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translateN(ITup3RF t)
	{
		return AabbUtils3F.translateFunc(this.aabb, t, CTOR);
	}

	@Override
	public Aabb3F translateN(float[] t)
	{
		return AabbUtils3F.translateFunc(this.aabb, t, CTOR);
	}

	@Override
	public Aabb3F translateN(float tX, float tY, float tZ)
	{
		return AabbUtils3F.translateFunc(this.aabb, tX, tY, tZ, CTOR);
	}
	
	@Override
	public <T extends IAabb3WF> T translateT(ITup3RF t, T res)
	{
		return AabbUtils3F.translate(this.aabb, t, res);
	}

	@Override
	public <T extends IAabb3WF> T translateT(float[] t, T res)
	{
		return AabbUtils3F.translate(this.aabb, t, res);
	}

	@Override
	public <T extends IAabb3WF> T translateT(float tX, float tY, float tZ, T res)
	{
		return AabbUtils3F.translate(this.aabb, tX, tY, tZ, res);
	}

	@Override
	public float[] translateT(ITup3RF t, float[] res)
	{
		return AabbUtils3F.translate(this.aabb, t, res);
	}

	@Override
	public float[] translateT(float[] t, float[] res)
	{
		return AabbUtils3F.translate(this.aabb, t, res);
	}

	@Override
	public float[] translateT(float tX, float tY, float tZ, float[] res)
	{
		return AabbUtils3F.translate(this.aabb, tX, tY, tZ, res);
	}

	@Override
	public Aabb3F translateMin(ITup3RF t)
	{
		AabbUtils3F.translateMin(this.aabb, t, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translateMin(float[] t)
	{
		AabbUtils3F.translateMin(this.aabb, t, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translateMin(float tX, float tY, float tZ)
	{
		AabbUtils3F.translateMin(this.aabb, tX, tY, tZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translateMinN(ITup3RF t)
	{
		return AabbUtils3F.translateMinFunc(this.aabb, t, CTOR);
	}

	@Override
	public Aabb3F translateMinN(float[] t)
	{
		return AabbUtils3F.translateMinFunc(this.aabb, t, CTOR);
	}

	@Override
	public Aabb3F translateMinN(float tX, float tY, float tZ)
	{
		return AabbUtils3F.translateMinFunc(this.aabb, tX, tY, tZ, CTOR);
	}
	
	@Override
	public <T extends IAabb3WF> T translateMinT(ITup3RF t, T res)
	{
		return AabbUtils3F.translateMin(this.aabb, t, res);
	}

	@Override
	public <T extends IAabb3WF> T translateMinT(float[] t, T res)
	{
		return AabbUtils3F.translateMin(this.aabb, t, res);
	}

	@Override
	public <T extends IAabb3WF> T translateMinT(float tX, float tY, float tZ, T res)
	{
		return AabbUtils3F.translateMin(this.aabb, tX, tY, tZ, res);
	}

	@Override
	public float[] translateMinT(ITup3RF t, float[] res)
	{
		return AabbUtils3F.translateMin(this.aabb, t, res);
	}

	@Override
	public float[] translateMinT(float[] t, float[] res)
	{
		return AabbUtils3F.translateMin(this.aabb, t, res);
	}

	@Override
	public float[] translateMinT(float tX, float tY, float tZ, float[] res)
	{
		return AabbUtils3F.translateMin(this.aabb, tX, tY, tZ, res);
	}

	@Override
	public Aabb3F translateMax(ITup3RF t)
	{
		AabbUtils3F.translateMax(this.aabb, t, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translateMax(float[] t)
	{
		AabbUtils3F.translateMax(this.aabb, t, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translateMax(float tX, float tY, float tZ)
	{
		AabbUtils3F.translateMax(this.aabb, tX, tY, tZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F translateMaxN(ITup3RF t)
	{
		return AabbUtils3F.translateMaxFunc(this.aabb, t, CTOR);
	}

	@Override
	public Aabb3F translateMaxN(float[] t)
	{
		return AabbUtils3F.translateMaxFunc(this.aabb, t, CTOR);
	}

	@Override
	public Aabb3F translateMaxN(float tX, float tY, float tZ)
	{
		return AabbUtils3F.translateMaxFunc(this.aabb, tX, tY, tZ, CTOR);
	}
	
	@Override
	public <T extends IAabb3WF> T translateMaxT(ITup3RF t, T res)
	{
		return AabbUtils3F.translateMax(this.aabb, t, res);
	}

	@Override
	public <T extends IAabb3WF> T translateMaxT(float[] t, T res)
	{
		return AabbUtils3F.translateMax(this.aabb, t, res);
	}

	@Override
	public <T extends IAabb3WF> T translateMaxT(float tX, float tY, float tZ, T res)
	{
		return AabbUtils3F.translateMax(this.aabb, tX, tY, tZ, res);
	}

	@Override
	public float[] translateMaxT(ITup3RF t, float[] res)
	{
		return AabbUtils3F.translateMax(this.aabb, t, res);
	}

	@Override
	public float[] translateMaxT(float[] t, float[] res)
	{
		return AabbUtils3F.translateMax(this.aabb, t, res);
	}

	@Override
	public float[] translateMaxT(float tX, float tY, float tZ, float[] res)
	{
		return AabbUtils3F.translateMax(this.aabb, tX, tY, tZ, res);
	}
	
	@Override
	public Aabb3F grow(ITup3RF e)
	{
		AabbUtils3F.grow(this.aabb, e, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F grow(float[] e)
	{
		AabbUtils3F.grow(this.aabb, e, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F grow(float eX, float eY, float eZ)
	{
		AabbUtils3F.grow(this.aabb, eX, eY, eZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F growN(ITup3RF e)
	{
		return AabbUtils3F.growFunc(this.aabb, e, CTOR);
	}

	@Override
	public Aabb3F growN(float[] e)
	{
		return AabbUtils3F.growFunc(this.aabb, e, CTOR);
	}

	@Override
	public Aabb3F growN(float eX, float eY, float eZ)
	{
		return AabbUtils3F.growFunc(this.aabb, eX, eY, eZ, CTOR);
	}
	
	@Override
	public <T extends IAabb3WF> T growT(ITup3RF e, T res)
	{
		return AabbUtils3F.grow(this.aabb, e, res);
	}

	@Override
	public <T extends IAabb3WF> T growT(float[] e, T res)
	{
		return AabbUtils3F.grow(this.aabb, e, res);
	}

	@Override
	public <T extends IAabb3WF> T growT(float eX, float eY, float eZ, T res)
	{
		return AabbUtils3F.grow(this.aabb, eX, eY, eZ, res);
	}

	@Override
	public float[] growT(ITup3RF e, float[] res)
	{
		return AabbUtils3F.grow(this.aabb, e, res);
	}

	@Override
	public float[] growT(float[] e, float[] res)
	{
		return AabbUtils3F.grow(this.aabb, e, res);
	}

	@Override
	public float[] growT(float eX, float eY, float eZ, float[] res)
	{
		return AabbUtils3F.grow(this.aabb, eX, eY, eZ, res);
	}

	@Override
	public Aabb3F expand(float[] e)
	{
		AabbUtils3F.expand(this.aabb, e, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F expand(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ)
	{
		AabbUtils3F.expand(this.aabb, eMinX, eMinY, eMinZ, eMaxX, eMaxY, eMaxZ, this.aabb);
		
		return this;
	}

	@Override
	public Aabb3F expandN(float[] e)
	{
		return AabbUtils3F.expandFunc(this.aabb, e, CTOR);
	}

	@Override
	public Aabb3F expandN(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ)
	{
		return AabbUtils3F.expandFunc(this.aabb, eMinX, eMinY, eMinZ, eMaxX, eMaxY, eMaxZ, CTOR);
	}
	
	@Override
	public <T extends IAabb3WF> T expandT(float[] e, T res)
	{
		return AabbUtils3F.expand(this.aabb, e, res);
	}

	@Override
	public <T extends IAabb3WF> T expandT(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ, T res)
	{
		return AabbUtils3F.expand(this.aabb, eMinX, eMinY, eMinZ, eMaxX, eMaxY, eMaxZ, res);
	}

	@Override
	public float[] expandT(float[] e, float[] res)
	{
		return AabbUtils3F.expand(this.aabb, e, res);
	}

	@Override
	public float[] expandT(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ, float[] res)
	{
		return AabbUtils3F.expand(this.aabb, eMinX, eMinY, eMinZ, eMaxX, eMaxY, eMaxZ, res);
	}
	
//	public boolean isInsideInclusive(Tup3fR t)
//	{
//		return isInsideInclusive(t.getX(), t.getY(), t.getZ());
//	}
//	
//	public boolean isInsideInclusive(float x, float y, float z)
//	{
//		if(this.maxX < x || x < this.minX) return false;
//		if(this.maxY < y || y < this.minY) return false;
//		if(this.maxZ < z || z < this.minZ) return false;
//		
//		return true;
//	}
//	
//	public boolean isInsideExclusive(Tup3fR t)
//	{
//		return isInsideExclusive(t.getX(), t.getY(), t.getZ());
//	}
//	
//	public boolean isInsideExclusive(float x, float y, float z)
//	{
//		if(this.maxX <= x || x <= this.minX) return false;
//		if(this.maxY <= y || y <= this.minY) return false;
//		if(this.maxZ <= z || z <= this.minZ) return false;
//		
//		return true;
//	}
//	
//	public boolean isOnSurface(Tup3fR t)
//	{
//		return isOnSurface(t.getX(), t.getY(), t.getZ());
//	}
//	
//	public boolean isOnSurface(float x, float y, float z)
//	{
//		if(maxX < x || x < minX) return false;
//		if(maxY < y || y < minY) return false;
//		if(maxZ < z || z < minZ) return false;
//		
//		if(x == minX || x == maxX) return true;
//		if(y == minY || y == maxY) return true;
//		if(z == minZ || z == maxZ) return true;
//		
//		return false;
//	}
	
}
