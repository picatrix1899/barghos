package org.barghos.math.vector.floats;

import java.util.Random;

public class GenOpsRVec2F
{
	public static float[] random_rvec2f(Random[] random)
	{
		return new float[] {
			random[0].nextFloat(),
			random[1].nextFloat()
		};
	}
	
	public static float[] random_rvec2f(Random random)
	{
		return new float[] {
			random.nextFloat(),
			random.nextFloat()
		};
	}
	
	public static float[] random_rvec2f(Random randomX, Random randomY)
	{
		return new float[] {
			randomX.nextFloat(),
			randomY.nextFloat()
		};
	}
	
	public static float[] random_a_rvec2f(Random[] random, float[] bound)
	{
		return new float[] {
			random[0].nextFloat(bound[0]),
			random[1].nextFloat(bound[1])
		};
	}
	
	public static float[] random_s_rvec2f(Random[] random, float bound)
	{
		return new float[] {
			random[0].nextFloat(bound),
			random[1].nextFloat(bound)
		};
	}
	
	public static float[] random_c_rvec2f(Random[] random, float boundX, float boundY)
	{
		return new float[] {
			random[0].nextFloat(boundX),
			random[1].nextFloat(boundY)
		};
	}
	
	public static float[] random_a_rvec2f(Random random, float[] bound)
	{
		return new float[] {
			random.nextFloat(bound[0]),
			random.nextFloat(bound[1])
		};
	}
	
	public static float[] random_s_rvec2f(Random random, float bound)
	{
		return new float[] {
			random.nextFloat(bound),
			random.nextFloat(bound)
		};
	}
	
	public static float[] random_c_rvec2f(Random random, float boundX, float boundY)
	{
		return new float[] {
			random.nextFloat(boundX),
			random.nextFloat(boundY)
		};
	}
	
	public static float[] random_a_rvec2f(Random randomX, Random randomY, float[] bound)
	{
		return new float[] {
			randomX.nextFloat(bound[0]),
			randomY.nextFloat(bound[1])
		};
	}
	
	public static float[] random_s_rvec2f(Random randomX, Random randomY, float bound)
	{
		return new float[] {
			randomX.nextFloat(bound),
			randomY.nextFloat(bound)
		};
	}
	
	public static float[] random_c_rvec2f(Random randomX, Random randomY, float boundX, float boundY)
	{
		return new float[] {
			randomX.nextFloat(boundX),
			randomY.nextFloat(boundY)
		};
	}
	
	public static float[] random_aa_rvec2f(Random[] random, float[] origin, float[] bound)
	{
		return new float[] {
			random[0].nextFloat(origin[0], bound[0]),
			random[1].nextFloat(origin[1], bound[1])
		};
	}
	
	public static float[] random_as_rvec2f(Random[] random, float[] origin, float bound)
	{
		return new float[] {
			random[0].nextFloat(origin[0], bound),
			random[1].nextFloat(origin[1], bound)
		};
	}
	
	public static float[] random_ac_rvec2f(Random[] random, float[] origin, float boundX, float boundY)
	{
		return new float[] {
			random[0].nextFloat(origin[0], boundX),
			random[1].nextFloat(origin[1], boundY)
		};
	}
	
	public static float[] random_sa_rvec2f(Random[] random, float origin, float[] bound)
	{
		return new float[] {
			random[0].nextFloat(origin, bound[0]),
			random[1].nextFloat(origin, bound[1])
		};
	}
	
	public static float[] random_ss_rvec2f(Random[] random, float origin, float bound)
	{
		return new float[] {
			random[0].nextFloat(origin, bound),
			random[1].nextFloat(origin, bound)
		};
	}
	
	public static float[] random_sc_rvec2f(Random[] random, float origin, float boundX, float boundY)
	{
		return new float[] {
			random[0].nextFloat(origin, boundX),
			random[1].nextFloat(origin, boundY)
		};
	}
	
	public static float[] random_ca_rvec2f(Random[] random, float originX, float originY, float[] bound)
	{
		return new float[] {
			random[0].nextFloat(originX, bound[0]),
			random[1].nextFloat(originY, bound[1])
		};
	}
	
	public static float[] random_cs_rvec2f(Random[] random, float originX, float originY, float bound)
	{
		return new float[] {
			random[0].nextFloat(originX, bound),
			random[1].nextFloat(originY, bound)
		};
	}
	
	public static float[] random_cc_rvec2f(Random[] random, float originX, float originY, float boundX, float boundY)
	{
		return new float[] {
			random[0].nextFloat(originX, boundX),
			random[1].nextFloat(originY, boundY)
		};
	}
	
	public static float[] random_aa_rvec2f(Random random, float[] origin, float[] bound)
	{
		return new float[] {
			random.nextFloat(origin[0], bound[0]),
			random.nextFloat(origin[1], bound[1])
		};
	}
	
	public static float[] random_as_rvec2f(Random random, float[] origin, float bound)
	{
		return new float[] {
			random.nextFloat(origin[0], bound),
			random.nextFloat(origin[1], bound)
		};
	}
	
	public static float[] random_ac_rvec2f(Random random, float[] origin, float boundX, float boundY)
	{
		return new float[] {
			random.nextFloat(origin[0], boundX),
			random.nextFloat(origin[1], boundY)
		};
	}
	
	public static float[] random_sa_rvec2f(Random random, float origin, float[] bound)
	{
		return new float[] {
			random.nextFloat(origin, bound[0]),
			random.nextFloat(origin, bound[1])
		};
	}
	
	public static float[] random_ss_rvec2f(Random random, float origin, float bound)
	{
		return new float[] {
			random.nextFloat(origin, bound),
			random.nextFloat(origin, bound)
		};
	}
	
	public static float[] random_sc_rvec2f(Random random, float origin, float boundX, float boundY)
	{
		return new float[] {
			random.nextFloat(origin, boundX),
			random.nextFloat(origin, boundY)
		};
	}
	
	public static float[] random_ca_rvec2f(Random random, float originX, float originY, float[] bound)
	{
		return new float[] {
			random.nextFloat(originX, bound[0]),
			random.nextFloat(originY, bound[1])
		};
	}
	
	public static float[] random_cs_rvec2f(Random random, float originX, float originY, float bound)
	{
		return new float[] {
			random.nextFloat(originX, bound),
			random.nextFloat(originY, bound)
		};
	}
	
	public static float[] random_cc_rvec2f(Random random, float originX, float originY, float boundX, float boundY)
	{
		return new float[] {
			random.nextFloat(originX, boundX),
			random.nextFloat(originY, boundY)
		};
	}
	
	public static float[] random_aa_rvec2f(Random randomX, Random randomY, float[] origin, float[] bound)
	{
		return new float[] {
			randomX.nextFloat(origin[0], bound[0]),
			randomY.nextFloat(origin[1], bound[1])
		};
	}
	
	public static float[] random_as_rvec2f(Random randomX, Random randomY, float[] origin, float bound)
	{
		return new float[] {
			randomX.nextFloat(origin[0], bound),
			randomY.nextFloat(origin[1], bound)
		};
	}
	
	public static float[] random_ac_rvec2f(Random randomX, Random randomY, float[] origin, float boundX, float boundY)
	{
		return new float[] {
			randomX.nextFloat(origin[0], boundX),
			randomY.nextFloat(origin[1], boundY)
		};
	}
	
	public static float[] random_sa_rvec2f(Random randomX, Random randomY, float origin, float[] bound)
	{
		return new float[] {
			randomX.nextFloat(origin, bound[0]),
			randomY.nextFloat(origin, bound[1])
		};
	}
	
	public static float[] random_ss_rvec2f(Random randomX, Random randomY, float origin, float bound)
	{
		return new float[] {
			randomX.nextFloat(origin, bound),
			randomY.nextFloat(origin, bound)
		};
	}
	
	public static float[] random_sc_rvec2f(Random randomX, Random randomY, float origin, float boundX, float boundY)
	{
		return new float[] {
			randomX.nextFloat(origin, boundX),
			randomY.nextFloat(origin, boundY)
		};
	}
	
	public static float[] random_ca_rvec2f(Random randomX, Random randomY, float originX, float originY, float[] bound)
	{
		return new float[] {
			randomX.nextFloat(originX, bound[0]),
			randomY.nextFloat(originY, bound[1])
		};
	}
	
	public static float[] random_cs_rvec2f(Random randomX, Random randomY, float originX, float originY, float bound)
	{
		return new float[] {
			randomX.nextFloat(originX, bound),
			randomY.nextFloat(originY, bound)
		};
	}
	
	public static float[] random_cc_rvec2f(Random randomX, Random randomY, float originX, float originY, float boundX, float boundY)
	{
		return new float[] {
			randomX.nextFloat(originX, boundX),
			randomY.nextFloat(originY, boundY)
		};
	}
	
	public static float[] randomT_rvec2f(Random[] random)
	{
		return new float[] {
			random[0].nextFloat(),
			random[1].nextFloat()
		};
	}
	
	public static float[] randomT_rvec2f(Random random)
	{
		return new float[] {
			random.nextFloat(),
			random.nextFloat()
		};
	}
	
	public static float[] randomT_rvec2f(Random randomX, Random randomY)
	{
		return new float[] {
			randomX.nextFloat(),
			randomY.nextFloat()
		};
	}
	
	public static float[] randomT_a_rvec2f(Random[] random, float[] bound)
	{
		return new float[] {
			random[0].nextFloat(bound[0]),
			random[1].nextFloat(bound[1])
		};
	}
	
	public static float[] randomT_s_rvec2f(Random[] random, float bound)
	{
		return new float[] {
			random[0].nextFloat(bound),
			random[1].nextFloat(bound)
		};
	}
	
	public static float[] randomT_c_rvec2f(Random[] random, float boundX, float boundY)
	{
		return new float[] {
			random[0].nextFloat(boundX),
			random[1].nextFloat(boundY)
		};
	}
	
	public static float[] randomT_a_rvec2f(Random random, float[] bound)
	{
		return new float[] {
			random.nextFloat(bound[0]),
			random.nextFloat(bound[1])
		};
	}
	
	public static float[] randomT_s_rvec2f(Random random, float bound)
	{
		return new float[] {
			random.nextFloat(bound),
			random.nextFloat(bound)
		};
	}
	
	public static float[] randomT_c_rvec2f(Random random, float boundX, float boundY)
	{
		return new float[] {
			random.nextFloat(boundX),
			random.nextFloat(boundY)
		};
	}
	
	public static float[] randomT_a_rvec2f(Random randomX, Random randomY, float[] bound)
	{
		return new float[] {
			randomX.nextFloat(bound[0]),
			randomY.nextFloat(bound[1])
		};
	}
	
	public static float[] randomT_s_rvec2f(Random randomX, Random randomY, float bound)
	{
		return new float[] {
			randomX.nextFloat(bound),
			randomY.nextFloat(bound)
		};
	}
	
	public static float[] randomT_c_rvec2f(Random randomX, Random randomY, float boundX, float boundY)
	{
		return new float[] {
			randomX.nextFloat(boundX),
			randomY.nextFloat(boundY)
		};
	}
	
	public static float[] randomT_aa_rvec2f(Random[] random, float[] origin, float[] bound)
	{
		return new float[] {
			random[0].nextFloat(origin[0], bound[0]),
			random[1].nextFloat(origin[1], bound[1])
		};
	}
	
	public static float[] randomT_as_rvec2f(Random[] random, float[] origin, float bound)
	{
		return new float[] {
			random[0].nextFloat(origin[0], bound),
			random[1].nextFloat(origin[1], bound)
		};
	}
	
	public static float[] randomT_ac_rvec2f(Random[] random, float[] origin, float boundX, float boundY)
	{
		return new float[] {
			random[0].nextFloat(origin[0], boundX),
			random[1].nextFloat(origin[1], boundY)
		};
	}
	
	public static float[] randomT_sa_rvec2f(Random[] random, float origin, float[] bound)
	{
		return new float[] {
			random[0].nextFloat(origin, bound[0]),
			random[1].nextFloat(origin, bound[1])
		};
	}
	
	public static float[] randomT_ss_rvec2f(Random[] random, float origin, float bound)
	{
		return new float[] {
			random[0].nextFloat(origin, bound),
			random[1].nextFloat(origin, bound)
		};
	}
	
	public static float[] randomT_sc_rvec2f(Random[] random, float origin, float boundX, float boundY)
	{
		return new float[] {
			random[0].nextFloat(origin, boundX),
			random[1].nextFloat(origin, boundY)
		};
	}
	
	public static float[] randomT_ca_rvec2f(Random[] random, float originX, float originY, float[] bound)
	{
		return new float[] {
			random[0].nextFloat(originX, bound[0]),
			random[1].nextFloat(originY, bound[1])
		};
	}
	
	public static float[] randomT_cs_rvec2f(Random[] random, float originX, float originY, float bound)
	{
		return new float[] {
			random[0].nextFloat(originX, bound),
			random[1].nextFloat(originY, bound)
		};
	}
	
	public static float[] randomT_cc_rvec2f(Random[] random, float originX, float originY, float boundX, float boundY)
	{
		return new float[] {
			random[0].nextFloat(originX, boundX),
			random[1].nextFloat(originY, boundY)
		};
	}
	
	public static float[] randomT_aa_rvec2f(Random random, float[] origin, float[] bound)
	{
		return new float[] {
			random.nextFloat(origin[0], bound[0]),
			random.nextFloat(origin[1], bound[1])
		};
	}
	
	public static float[] randomT_as_rvec2f(Random random, float[] origin, float bound)
	{
		return new float[] {
			random.nextFloat(origin[0], bound),
			random.nextFloat(origin[1], bound)
		};
	}
	
	public static float[] randomT_ac_rvec2f(Random random, float[] origin, float boundX, float boundY)
	{
		return new float[] {
			random.nextFloat(origin[0], boundX),
			random.nextFloat(origin[1], boundY)
		};
	}
	
	public static float[] randomT_sa_rvec2f(Random random, float origin, float[] bound)
	{
		return new float[] {
			random.nextFloat(origin, bound[0]),
			random.nextFloat(origin, bound[1])
		};
	}
	
	public static float[] randomT_ss_rvec2f(Random random, float origin, float bound)
	{
		return new float[] {
			random.nextFloat(origin, bound),
			random.nextFloat(origin, bound)
		};
	}
	
	public static float[] randomT_sc_rvec2f(Random random, float origin, float boundX, float boundY)
	{
		return new float[] {
			random.nextFloat(origin, boundX),
			random.nextFloat(origin, boundY)
		};
	}
	
	public static float[] randomT_ca_rvec2f(Random random, float originX, float originY, float[] bound)
	{
		return new float[] {
			random.nextFloat(originX, bound[0]),
			random.nextFloat(originY, bound[1])
		};
	}
	
	public static float[] randomT_cs_rvec2f(Random random, float originX, float originY, float bound)
	{
		return new float[] {
			random.nextFloat(originX, bound),
			random.nextFloat(originY, bound)
		};
	}
	
	public static float[] randomT_cc_rvec2f(Random random, float originX, float originY, float boundX, float boundY)
	{
		return new float[] {
			random.nextFloat(originX, boundX),
			random.nextFloat(originY, boundY)
		};
	}
	
	public static float[] randomT_aa_rvec2f(Random randomX, Random randomY, float[] origin, float[] bound)
	{
		return new float[] {
			randomX.nextFloat(origin[0], bound[0]),
			randomY.nextFloat(origin[1], bound[1])
		};
	}
	
	public static float[] randomT_as_rvec2f(Random randomX, Random randomY, float[] origin, float bound)
	{
		return new float[] {
			randomX.nextFloat(origin[0], bound),
			randomY.nextFloat(origin[1], bound)
		};
	}
	
	public static float[] randomT_ac_rvec2f(Random randomX, Random randomY, float[] origin, float boundX, float boundY)
	{
		return new float[] {
			randomX.nextFloat(origin[0], boundX),
			randomY.nextFloat(origin[1], boundY)
		};
	}
	
	public static float[] randomT_sa_rvec2f(Random randomX, Random randomY, float origin, float[] bound)
	{
		return new float[] {
			randomX.nextFloat(origin, bound[0]),
			randomY.nextFloat(origin, bound[1])
		};
	}
	
	public static float[] randomT_ss_rvec2f(Random randomX, Random randomY, float origin, float bound)
	{
		return new float[] {
			randomX.nextFloat(origin, bound),
			randomY.nextFloat(origin, bound)
		};
	}
	
	public static float[] randomT_sc_rvec2f(Random randomX, Random randomY, float origin, float boundX, float boundY)
	{
		return new float[] {
			randomX.nextFloat(origin, boundX),
			randomY.nextFloat(origin, boundY)
		};
	}
	
	public static float[] randomT_ca_rvec2f(Random randomX, Random randomY, float originX, float originY, float[] bound)
	{
		return new float[] {
			randomX.nextFloat(originX, bound[0]),
			randomY.nextFloat(originY, bound[1])
		};
	}
	
	public static float[] randomT_cs_rvec2f(Random randomX, Random randomY, float originX, float originY, float bound)
	{
		return new float[] {
			randomX.nextFloat(originX, bound),
			randomY.nextFloat(originY, bound)
		};
	}
	
	public static float[] randomT_cc_rvec2f(Random randomX, Random randomY, float originX, float originY, float boundX, float boundY)
	{
		return new float[] {
			randomX.nextFloat(originX, boundX),
			randomY.nextFloat(originY, boundY)
		};
	}
	
}
