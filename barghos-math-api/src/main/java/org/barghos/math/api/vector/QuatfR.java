package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple4.Tup4fR;
import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.util.Maths;

// MISSING_DOC
public interface QuatfR extends Tup4fR
{
	// MISSING_DOC
	default float length()
	{
		return (float)Maths.sqrt(squaredLength());
	}
	
	// MISSING_DOC
	default float squaredLength()
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		float w = getW();
		
		return Math.fma(x, x, Math.fma(y, y, Math.fma(z, z, w * w)));
	}
	
	// MISSING_DOC
	default float reciprocalLength()
	{
		return 1.0f / length();
	}
	
	// MISSING_DOC
	default <T extends Tup3fC> T transform(Tup3fR v, @ExtractParam T res)
	{
		return transform(v.getX(), v.getY(), v.getZ(), res);
	}
	
	// MISSING_DOC
	default float[] transform(Tup3fR v, @ExtractParam float[] res)
	{
		return transform(v.getX(), v.getY(), v.getZ(), res);
	}
	
	// MISSING_DOC
	default <T extends Tup3fC> T transform(float[] v, @ExtractParam T res)
	{
		return transform(v[COMP_X], v[COMP_Y], v[COMP_Z], res);
	}
	
	// MISSING_DOC
	default float[] transform(float[] v, @ExtractParam float[] res)
	{
		return transform(v[COMP_X], v[COMP_Y], v[COMP_Z], res);
	}
	
	// MISSING_DOC
	<T extends Tup3fC> T transform(float x, float y, float z, @ExtractParam T res);
	
	// MISSING_DOC
	float[] transform(float x, float y, float z, @ExtractParam float[] res);
}
