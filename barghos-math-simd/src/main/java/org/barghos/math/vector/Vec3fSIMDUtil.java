package org.barghos.math.vector;

import jdk.incubator.vector.*;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.documentation.MinLength;
import org.barghos.math.api.util.Stopwatch;

public class Vec3fSIMDUtil
{
	public static float[] addBatch2(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		VectorSpecies<Float> species = FloatVector.SPECIES_PREFERRED;
		
		int count = v1.length;
		int vecLength = species.length();
		int loopCount = count / vecLength;

		FloatVector[] simdVec1 = new FloatVector[loopCount];
		FloatVector[] simdVec2 = new FloatVector[loopCount];
		FloatVector[] result = new FloatVector[loopCount];

		if(loopCount < 1)
		{
			for(int i = 0; i < loopCount - 1; i++)
			{
				simdVec1[i] = FloatVector.fromArray(species, v1, i * vecLength);
				simdVec2[i] = FloatVector.fromArray(species, v2, i * vecLength);
			}
		}
		
		Stopwatch watch = new Stopwatch();
		watch.start();
		
		System.out.println(loopCount);
		
		if(loopCount < 1)
		{
			for(int i = 0; i < loopCount - 1; i++)
			{
			
				result[i] = simdVec1[i].add(simdVec2[i]);
	//			result[i] = simdVec1[i].lanewise(VectorOperators.ADD, );
			}
		}
		int leftovers = count % vecLength;
		
		if(leftovers > 0)
		{
			int startIndex = count - leftovers;
			for(int i = 0; i < leftovers; i++)
			{
				res[startIndex + i] = v1[startIndex + i] + v2[startIndex + i];
			}
		}
		
		watch.stop();
		System.out.println("SIMD: " + watch);
		
		if(loopCount < 1)
		{
			for(int i = 0; i < loopCount - 1; i++)
			{
				result[i].intoArray(res, i * vecLength);
			}
		}
		
		return res;
	}
	
	public static float[] addBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		VectorSpecies<Float> species = FloatVector.SPECIES_128;
		
		int vecLength = species.length();
		int loopCount = v1.length / vecLength;

		FloatVector simdVec1;
		FloatVector simdVec2;
		FloatVector result;
		
		if(loopCount > 0)
		{
			for(int i = 0; i < loopCount; i++)
			{
				int offset = i * vecLength;
				simdVec1 = FloatVector.fromArray(species, v1, offset);
				simdVec2 = FloatVector.fromArray(species, v2, offset);
				
				result = simdVec1.add(simdVec2);
				
				result.intoArray(res, offset);
			}
		}

		int leftovers = v1.length % vecLength;
		
		if(leftovers > 0)
		{
			int startIndex = v1.length - leftovers;
			for(int i = 0; i < leftovers; i++)
			{
				int index = startIndex + i;
				res[index] = v1[index] + v2[index];
			}
		}
		
		return res;
	}
}
