package org.barghos.math.vector;

import java.util.Arrays;

import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorOperators;
import jdk.incubator.vector.VectorSpecies;

public class SimdVec3f
{
	public static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_PREFERRED;
	
	private float x;
	private float y;
	private float z;
	
	private transient FloatVector simdVector;
	private transient boolean requiresUpload;
	private transient boolean requiresDownload;
	
	public SimdVec3f()
	{
//		markRequiresUpload();
	}
	
	public SimdVec3f(float x, float y, float z)
	{
//		markRequiresUpload();
	}
	
	public SimdVec3f(SimdVec3f vector)
	{
		this.x = vector.getX();
		this.y = vector.getY();
		this.z = vector.getZ();
		
//		markRequiresUpload();
	}
	
	public float getX()
	{
//		download();
		
		return this.x;
	}
	
	public float getY()
	{
//		download();
		
		return this.y;
	}
	
	public float getZ()
	{	
//		download();
		
		return this.z;
	}
	
	public SimdVec3f setX(float x)
	{
		this.x = x;
		this.requiresUpload = true;
		
//		markRequiresUpload();
		
		return this;
	}
	
	public SimdVec3f setY(float y)
	{
		this.y = y;
		this.requiresUpload = true;
		
//		markRequiresUpload();
		
		return this;
	}
	
	public SimdVec3f setZ(float z)
	{
		this.z = z;
		this.requiresUpload = true;
		
//		markRequiresUpload();
		
		return this;
	}
	
	private void upload()
	{
		if(!this.requiresUpload) return;
			
		float[] values = new float[SPECIES.length()];

		values[0] = x;
		values[1] = y;
		values[2] = z;
		
		this.simdVector = FloatVector.fromArray(SPECIES, values, 0);

		this.requiresUpload = false;
	}
	
	private void download()
	{
		if(!this.requiresDownload) return;
		
		float[] values = new float[SPECIES.length()];
		
		this.simdVector.intoArray(values, 0);
		
		this.x = values[0];
		this.y = values[1];
		this.z = values[2];
		
		this.requiresDownload = false;
	}
	
	private void markRequiresUpload()
	{
		this.requiresUpload = true;
	}
	
	private void markRequiresDownload()
	{
		this.requiresDownload = true;
	}
	
	public FloatVector getSimdVector()
	{
//		upload();
		
		return this.simdVector;
	}
	
	public SimdVec3f add(SimdVec3f v)
	{
//		upload();
		
		this.simdVector = this.simdVector.lanewise(VectorOperators.ADD, v.getSimdVector());
		
//		markRequiresDownload();
		
		return this;
	}
	
	public SimdVec3f add(float value)
	{
//		upload();
		
		this.simdVector = this.simdVector.lanewise(VectorOperators.ADD, this.simdVector.broadcast(value));
		
//		markRequiresDownload();
		
		return this;
	}
	
	private float[] bufferIn = new float[4];
	private float[] bufferOut = new float[4];
	public SimdVec3f add(float x, float y, float z)
	{
//		VectorSpecies<Float> species = FloatVector.SPECIES_128;
//		
//		if(this.requiresUpload)
//		{
//			this.requiresUpload = false;
//			
//			float[] own = new float[species.length()];
//			own[0] = this.x;
//			own[1] = this.y;
//			own[2] = this.z;
//			own[3] = 1.0f;
//			
//			this.simdVector = FloatVector.fromArray(species, own, 0);
//		}
//		
//		bufferIn[0] = x;
//		bufferIn[1] = y;
//		bufferIn[2] = z;
//		bufferIn[3] = 1.0f;
//		
//		FloatVector v2 = FloatVector.fromArray(species, bufferIn, 0);
//
//		this.simdVector = this.simdVector.add(v2);
//		
//		this.simdVector.intoArray(bufferOut, 0);
//		
//		this.x = bufferOut[0];
//		this.y = bufferOut[1];
//		this.z = bufferOut[2];

		float[] res = Vec3fSIMDUtil.addBatch(new float[] {this.x, this.y, this.z, 0.0f}, new float[] {x, y, z, 0.0f}, new float[4]);
		this.x = res[0];
		this.y = res[1];
		this.z = res[2];
		
		return this;
	}
	
	public String toString()
	{
		return "simdVec3f(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
}
