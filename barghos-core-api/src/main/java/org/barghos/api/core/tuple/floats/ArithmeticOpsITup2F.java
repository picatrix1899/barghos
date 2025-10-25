package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;

public class ArithmeticOpsITup2F
{
	private ArithmeticOpsITup2F() { }
	
	public static float[] tup_add_2f(float[] v1, ITup2RF v2)
	{
		v1[0] += v2.v0();
		v1[1] += v2.v1();
		
		return v1;
	}
	
	public static float[] tup_add_2f(float[] v1, ITupRF v2)
	{
		v1[0] += v2.at(0);
		v1[1] += v2.at(1);
		
		return v1;
	}
	
	public static float[] tup_addN_2f(ITup2RF v1, ITup2RF v2)
	{
		return new float[] {
			v1.v0() + v2.v0(),
			v1.v1() + v2.v1()
		};
	}
	
	public static float[] tup_addN_2f(ITup2RF v1, ITupRF v2)
	{
		return new float[] {
			v1.v0() + v2.at(0),
			v1.v1() + v2.at(1)
		};
	}
	
	public static float[] tup_addN_2f(ITup2RF v1, float[] v2)
	{
		return new float[] {
			v1.v0() + v2[0],
			v1.v1() + v2[1]
		};
	}
	
	public static float[] tup_addN_2f(ITup2RF v1, float value)
	{
		return new float[] {
			v1.v0() + value,
			v1.v1() + value
		};
	}
	
	public static float[] tup_addN_2f(ITup2RF v1, float v2V0, float v2V1)
	{
		return new float[] {
			v1.v0() + v2V0,
			v1.v1() + v2V1
		};
	}
	
	public static float[] tup_addN_2f(ITupRF v1, ITup2RF v2)
	{
		return new float[] {
			v1.at(0) + v2.v0(),
			v1.at(1) + v2.v1()
		};
	}
	
	public static float[] tup_addN_2f(ITupRF v1, ITupRF v2)
	{
		return new float[] {
			v1.at(0) + v2.at(0),
			v1.at(1) + v2.at(1)
		};
	}
	
	public static float[] tup_addN_2f(ITupRF v1, float[] v2)
	{
		return new float[] {
			v1.at(0) + v2[0],
			v1.at(1) + v2[1]
		};
	}
	
	public static float[] tup_addN_2f(ITupRF v1, float value)
	{
		return new float[] {
			v1.at(0) + value,
			v1.at(1) + value
		};
	}
	
	public static float[] tup_addN_2f(ITupRF v1, float v2V0, float v2V1)
	{
		return new float[] {
			v1.at(0) + v2V0,
			v1.at(1) + v2V1
		};
	}
	
	public static float[] tup_addN_2f(float[] v1, ITup2RF v2)
	{
		return new float[] {
			v1[0] + v2.v0(),
			v1[1] + v2.v1()
		};
	}
	
	public static float[] tup_addN_2f(float[] v1, ITupRF v2)
	{
		return new float[] {
			v1[0] + v2.at(0),
			v1[1] + v2.at(1)
		};
	}
	
	public static float[] tup_addN_2f(float v1V0, float v1V1, ITup2RF v2)
	{
		return new float[] {
			v1V0 + v2.v0(),
			v1V1 + v2.v1()
		};
	}
	
	public static float[] tup_addN_2f(float v1V0, float v1V1, ITupRF v2)
	{
		return new float[] {
			v1V0 + v2.at(0),
			v1V1 + v2.at(1)
		};
	}
	
	public static float[] tup_addT_2f(ITup2RF v1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() + v2.v0();
		res[1] = v1.v1() + v2.v1();
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITup2RF v1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() + v2.at(0);
		res[1] = v1.v1() + v2.at(1);
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITup2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() + v2[0];
		res[1] = v1.v1() + v2[1];
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITup2RF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() + value;
		res[1] = v1.v1() + value;
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITup2RF v1, float v2V0, float v2V1, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() + v2V0;
		res[1] = v1.v1() + v2V1;
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITupRF v1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) + v2.v0();
		res[1] = v1.at(1) + v2.v1();
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITupRF v1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) + v2.at(0);
		res[1] = v1.at(1) + v2.at(1);
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITupRF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) + v2[0];
		res[1] = v1.at(1) + v2[1];
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITupRF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) + value;
		res[1] = v1.at(1) + value;
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITupRF v1, float v2V0, float v2V1, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) + v2V0;
		res[1] = v1.at(1) + v2V1;
		
		return res;
	}
	
	public static float[] tup_addT_2f(float[] v1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2.v0();
		res[1] = v1[1] + v2.v1();
		
		return res;
	}
	
	public static float[] tup_addT_2f(float[] v1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2.at(0);
		res[1] = v1[1] + v2.at(1);
		
		return res;
	}
	
	public static float[] tup_addT_2f(float v1V0, float v1V1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1V0 + v2.v0();
		res[1] = v1V1 + v2.v1();
		
		return res;
	}
	
	public static float[] tup_addT_2f(float v1V0, float v1V1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1V0 + v2.at(0);
		res[1] = v1V1 + v2.at(1);
		
		return res;
	}
	
	public static float[] tup_sub_2f(float[] v1, ITup2RF v2)
	{
		v1[0] -= v2.v0();
		v1[1] -= v2.v1();
		
		return v1;
	}
	
	public static float[] tup_sub_2f(float[] v1, ITupRF v2)
	{
		v1[0] -= v2.at(0);
		v1[1] -= v2.at(1);
		
		return v1;
	}
	
	public static float[] tup_subN_2f(ITup2RF v1, ITup2RF v2)
	{
		return new float[] {
			v1.v0() - v2.v0(),
			v1.v1() - v2.v1()
		};
	}
	
	public static float[] tup_subN_2f(ITup2RF v1, ITupRF v2)
	{
		return new float[] {
			v1.v0() - v2.at(0),
			v1.v1() - v2.at(1)
		};
	}
	
	public static float[] tup_subN_2f(ITup2RF v1, float[] v2)
	{
		return new float[] {
			v1.v0() - v2[0],
			v1.v1() - v2[1]
		};
	}
	
	public static float[] tup_subN_2f(ITup2RF v1, float value)
	{
		return new float[] {
			v1.v0() - value,
			v1.v1() - value
		};
	}
	
	public static float[] tup_subN_2f(ITup2RF v1, float v2V0, float v2V1)
	{
		return new float[] {
			v1.v0() - v2V0,
			v1.v1() - v2V1
		};
	}
	
	public static float[] tup_subN_2f(ITupRF v1, ITup2RF v2)
	{
		return new float[] {
			v1.at(0) - v2.v0(),
			v1.at(1) - v2.v1()
		};
	}
	
	public static float[] tup_subN_2f(ITupRF v1, ITupRF v2)
	{
		return new float[] {
			v1.at(0) - v2.at(0),
			v1.at(1) - v2.at(1)
		};
	}
	
	public static float[] tup_subN_2f(ITupRF v1, float[] v2)
	{
		return new float[] {
			v1.at(0) - v2[0],
			v1.at(1) - v2[1]
		};
	}
	
	public static float[] tup_subN_2f(ITupRF v1, float value)
	{
		return new float[] {
			v1.at(0) - value,
			v1.at(1) - value
		};
	}
	
	public static float[] tup_subN_2f(ITupRF v1, float v2V0, float v2V1)
	{
		return new float[] {
			v1.at(0) - v2V0,
			v1.at(1) - v2V1
		};
	}
	
	public static float[] tup_subN_2f(float[] v1, ITup2RF v2)
	{
		return new float[] {
			v1[0] - v2.v0(),
			v1[1] - v2.v1()
		};
	}
	
	public static float[] tup_subN_2f(float[] v1, ITupRF v2)
	{
		return new float[] {
			v1[0] - v2.at(0),
			v1[1] - v2.at(1)
		};
	}
	
	public static float[] tup_subN_2f(float v1V0, float v1V1, ITup2RF v2)
	{
		return new float[] {
			v1V0 - v2.v0(),
			v1V1 - v2.v1()
		};
	}
	
	public static float[] tup_subN_2f(float v1V0, float v1V1, ITupRF v2)
	{
		return new float[] {
			v1V0 - v2.at(0),
			v1V1 - v2.at(1)
		};
	}
	
	public static float[] tup_subT_2f(ITup2RF v1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() - v2.v0();
		res[1] = v1.v1() - v2.v1();
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITup2RF v1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() - v2.at(0);
		res[1] = v1.v1() - v2.at(1);
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITup2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() - v2[0];
		res[1] = v1.v1() - v2[1];
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITup2RF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() - value;
		res[1] = v1.v1() - value;
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITup2RF v1, float v2V0, float v2V1, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() - v2V0;
		res[1] = v1.v1() - v2V1;
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITupRF v1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) - v2.v0();
		res[1] = v1.at(1) - v2.v1();
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITupRF v1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) - v2.at(0);
		res[1] = v1.at(1) - v2.at(1);
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITupRF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) - v2[0];
		res[1] = v1.at(1) - v2[1];
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITupRF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) - value;
		res[1] = v1.at(1) - value;
		
		return res;
	}
	
	public static float[] tup_subT_2f(ITupRF v1, float v2V0, float v2V1, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) - v2V0;
		res[1] = v1.at(1) - v2V1;
		
		return res;
	}
	
	public static float[] tup_subT_2f(float[] v1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2.v0();
		res[1] = v1[1] - v2.v1();
		
		return res;
	}
	
	public static float[] tup_subT_2f(float[] v1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2.at(0);
		res[1] = v1[1] - v2.at(1);
		
		return res;
	}
	
	public static float[] tup_subT_2f(float v1V0, float v1V1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1V0 - v2.v0();
		res[1] = v1V1 - v2.v1();
		
		return res;
	}
	
	public static float[] tup_subT_2f(float v1V0, float v1V1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1V0 - v2.at(0);
		res[1] = v1V1 - v2.at(1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_add_itup2f(T v1, ITup2RF v2)
	{
		v1.set(
			v1.v0() + v2.v0(),
			v1.v1() + v2.v1()
		);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_add_itup2f(T v1, ITupRF v2)
	{
		v1.set(
			v1.v0() + v2.at(0),
			v1.v1() + v2.at(1)
		);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_add_itup2f(T v1, float[] v2)
	{
		v1.set(
			v1.v0() + v2[0],
			v1.v1() + v2[1]
		);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_add_itup2f(T v1, float value)
	{
		v1.set(
			v1.v0() + value,
			v1.v1() + value
		);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_add_itup2f(T v1, float v2V0, float v2V1)
	{
		v1.set(
			v1.v0() + v2V0,
			v1.v1() + v2V1
		);
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_add_itup2f(T v1, ITup2RF v2)
	{
		v1.at(0, v1.at(0) + v2.v0());
		v1.at(1, v1.at(1) + v2.v1());
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_add_itup2f(T v1, ITupRF v2)
	{
		v1.at(0, v1.at(0) + v2.at(0));
		v1.at(1, v1.at(1) + v2.at(1));
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_add_itup2f(T v1, float[] v2)
	{
		v1.at(0, v1.at(0) + v2[0]);
		v1.at(1, v1.at(1) + v2[1]);
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_add_itup2f(T v1, float value)
	{
		v1.at(0, v1.at(0) + value);
		v1.at(1, v1.at(1) + value);
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_add_itup2f(T v1, float v2V0, float v2V1)
	{
		v1.at(0, v1.at(0) + v2V0);
		v1.at(1, v1.at(1) + v2V1);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITup2RF v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.v0() + v2.v0(),
			v1.v1() + v2.v1()
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITup2RF v1, ITupRF v2, @ExtractionParam T res)
	{
		res.set(
			v1.v0() + v2.at(0),
			v1.v1() + v2.at(1)
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITup2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.v0() + v2[0],
			v1.v1() + v2[1]
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITup2RF v1, float value, @ExtractionParam T res)
	{
		res.set(
			v1.v0() + value,
			v1.v1() + value
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITup2RF v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.set(
			v1.v0() + v2V0,
			v1.v1() + v2V1
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITupRF v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) + v2.v0(),
			v1.at(1) + v2.v1()
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITupRF v1, ITupRF v2, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) + v2.at(0),
			v1.at(1) + v2.at(1)
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITupRF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) + v2[0],
			v1.at(1) + v2[1]
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITupRF v1, float value, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) + value,
			v1.at(1) + value
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(ITupRF v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) + v2V0,
			v1.at(1) + v2V1
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float[] v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2.v0(),
			v1[1] + v2.v1()
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float[] v1, ITupRF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2.at(0),
			v1[1] + v2.at(1)
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2[0],
			v1[1] + v2[1]
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float[] v1, float value, @ExtractionParam T res)
	{
		res.set(
			v1[0] + value,
			v1[1] + value
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float[] v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2V0,
			v1[1] + v2V1
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float v1V0, float v1V1, ITup2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1V0 + v2.v0(),
			v1V1 + v2.v1()
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float v1V0, float v1V1, ITupRF v2, @ExtractionParam T res)
	{
		res.set(
			v1V0 + v2.at(0),
			v1V1 + v2.at(1)
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float v1V0, float v1V1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1V0 + v2[0],
			v1V1 + v2[1]
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float v1V0, float v1V1, float value, @ExtractionParam T res)
	{
		res.set(
			v1V0 + value,
			v1V1 + value
		);		
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_addT_itup2f(float v1V0, float v1V1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.set(
			v1V0 + v2V0,
			v1V1 + v2V1
		);		
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITup2RF v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.at(0, v1.v0() + v2.v0());
		res.at(1, v1.v1() + v2.v1());
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITup2RF v1, ITupRF v2, @ExtractionParam T res)
	{
		res.at(0, v1.v0() + v2.at(0));
		res.at(1, v1.v1() + v2.at(1));
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITup2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.at(0, v1.v0() + v2[0]);
		res.at(1, v1.v1() + v2[1]);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITup2RF v1, float value, @ExtractionParam T res)
	{
		res.at(0, v1.v0() + value);
		res.at(1, v1.v1() + value);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITup2RF v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.at(0, v1.v0() + v2V0);
		res.at(1, v1.v1() + v2V1);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITupRF v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) + v2.v0());
		res.at(1, v1.at(1) + v2.v1());
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITupRF v1, ITupRF v2, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) + v2.at(0));
		res.at(1, v1.at(1) + v2.at(1));
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITupRF v1, float[] v2, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) + v2[0]);
		res.at(1, v1.at(1) + v2[1]);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITupRF v1, float value, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) + value);
		res.at(1, v1.at(1) + value);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(ITupRF v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) + v2V0);
		res.at(1, v1.at(1) + v2V1);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float[] v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.at(0, v1[0] + v2.v0());
		res.at(1, v1[1] + v2.v1());
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float[] v1, ITupRF v2, @ExtractionParam T res)
	{
		res.at(0, v1[0] + v2.at(0));
		res.at(1, v1[1] + v2.at(1));
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.at(0, v1[0] + v2[0]);
		res.at(1, v1[1] + v2[1]);
		
		return res;
	}

	public static <T extends ITupWF> T tup_addT_itup2f(float[] v1, float value, @ExtractionParam T res)
	{
		res.at(0, v1[0] + value);
		res.at(1, v1[1] + value);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float[] v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.at(0, v1[0] + v2V0);
		res.at(1, v1[1] + v2V1);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float v1V0, float v1V1, ITup2RF v2, @ExtractionParam T res)
	{
		res.at(0, v1V0 + v2.v0());
		res.at(1, v1V1 + v2.v1());
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float v1V0, float v1V1, ITupRF v2, @ExtractionParam T res)
	{
		res.at(0, v1V0 + v2.at(0));
		res.at(1, v1V1 + v2.at(1));
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float v1V0, float v1V1, float[] v2, @ExtractionParam T res)
	{
		res.at(0, v1V0 + v2[0]);
		res.at(1, v1V1 + v2[1]);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float v1V0, float v1V1, float value, @ExtractionParam T res)
	{
		res.at(0, v1V0 + value);
		res.at(1, v1V1 + value);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_addT_itup2f(float v1V0, float v1V1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.at(0, v1V0 + v2V0);
		res.at(1, v1V1 + v2V1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_sub_itup2f(T v1, ITup2RF v2)
	{
		v1.set(
			v1.v0() - v2.v0(),
			v1.v1() - v2.v1()
		);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_sub_itup2f(T v1, ITupRF v2)
	{
		v1.set(
			v1.v0() - v2.at(0),
			v1.v1() - v2.at(1)
		);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_sub_itup2f(T v1, float[] v2)
	{
		v1.set(
			v1.v0() - v2[0],
			v1.v1() - v2[1]
		);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_sub_itup2f(T v1, float value)
	{
		v1.set(
			v1.v0() - value,
			v1.v1() - value
		);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_sub_itup2f(T v1, float v2V0, float v2V1)
	{
		v1.set(
			v1.v0() - v2V0,
			v1.v1() - v2V1
		);
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_sub_itup2f(T v1, ITup2RF v2)
	{
		v1.at(0, v1.at(0) - v2.v0());
		v1.at(1, v1.at(1) - v2.v1());
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_sub_itup2f(T v1, ITupRF v2)
	{
		v1.at(0, v1.at(0) - v2.at(0));
		v1.at(1, v1.at(1) - v2.at(1));
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_sub_itup2f(T v1, float[] v2)
	{
		v1.at(0, v1.at(0) - v2[0]);
		v1.at(1, v1.at(1) - v2[1]);
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_sub_itup2f(T v1, float value)
	{
		v1.at(0, v1.at(0) - value);
		v1.at(1, v1.at(1) - value);
		
		return v1;
	}
	
	public static <T extends ITupWF> T tup_sub_itup2f(T v1, float v2V0, float v2V1)
	{
		v1.at(0, v1.at(0) - v2V0);
		v1.at(1, v1.at(1) - v2V1);
		
		return v1;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITup2RF v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.v0() - v2.v0(),
			v1.v1() - v2.v1()
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITup2RF v1, ITupRF v2, @ExtractionParam T res)
	{
		res.set(
			v1.v0() - v2.at(0),
			v1.v1() - v2.at(1)
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITup2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.v0() - v2[0],
			v1.v1() - v2[1]
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITup2RF v1, float value, @ExtractionParam T res)
	{
		res.set(
			v1.v0() - value,
			v1.v1() - value
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITup2RF v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.set(
			v1.v0() - v2V0,
			v1.v1() - v2V1
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITupRF v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) - v2.v0(),
			v1.at(1) - v2.v1()
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITupRF v1, ITupRF v2, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) - v2.at(0),
			v1.at(1) - v2.at(1)
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITupRF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) - v2[0],
			v1.at(1) - v2[1]
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITupRF v1, float value, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) - value,
			v1.at(1) - value
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(ITupRF v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.set(
			v1.at(0) - v2V0,
			v1.at(1) - v2V1
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float[] v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2.v0(),
			v1[1] - v2.v1()
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float[] v1, ITupRF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2.at(0),
			v1[1] - v2.at(1)
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2[0],
			v1[1] - v2[1]
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float[] v1, float value, @ExtractionParam T res)
	{
		res.set(
			v1[0] - value,
			v1[1] - value
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float[] v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2V0,
			v1[1] - v2V1
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float v1V0, float v1V1, ITup2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1V0 - v2.v0(),
			v1V1 - v2.v1()
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float v1V0, float v1V1, ITupRF v2, @ExtractionParam T res)
	{
		res.set(
			v1V0 - v2.at(0),
			v1V1 - v2.at(1)
		);
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float v1V0, float v1V1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1V0 - v2[0],
			v1V1 - v2[1]
		);
		
		return res;
	}

	public static <T extends ITup2WF> T tup_subT_itup2f(float v1V0, float v1V1, float value, @ExtractionParam T res)
	{
		res.set(
			v1V0 - value,
			v1V1 - value
		);		
		
		return res;
	}
	
	public static <T extends ITup2WF> T tup_subT_itup2f(float v1V0, float v1V1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.set(
			v1V0 - v2V0,
			v1V1 - v2V1
		);		
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITup2RF v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.at(0, v1.v0() - v2.v0());
		res.at(1, v1.v1() - v2.v1());
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITup2RF v1, ITupRF v2, @ExtractionParam T res)
	{
		res.at(0, v1.v0() - v2.at(0));
		res.at(1, v1.v1() - v2.at(1));
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITup2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.at(0, v1.v0() - v2[0]);
		res.at(1, v1.v1() - v2[1]);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITup2RF v1, float value, @ExtractionParam T res)
	{
		res.at(0, v1.v0() - value);
		res.at(1, v1.v1() - value);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITup2RF v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.at(0, v1.v0() - v2V0);
		res.at(1, v1.v1() - v2V1);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITupRF v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) - v2.v0());
		res.at(1, v1.at(1) - v2.v1());
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITupRF v1, ITupRF v2, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) - v2.at(0));
		res.at(1, v1.at(1) - v2.at(1));
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITupRF v1, float[] v2, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) - v2[0]);
		res.at(1, v1.at(1) - v2[1]);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITupRF v1, float value, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) - value);
		res.at(1, v1.at(1) - value);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(ITupRF v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.at(0, v1.at(0) - v2V0);
		res.at(1, v1.at(1) - v2V1);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float[] v1, ITup2RF v2, @ExtractionParam T res)
	{
		res.at(0, v1[0] - v2.v0());
		res.at(1, v1[1] - v2.v1());
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float[] v1, ITupRF v2, @ExtractionParam T res)
	{
		res.at(0, v1[0] - v2.at(0));
		res.at(1, v1[1] - v2.at(1));
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.at(0, v1[0] - v2[0]);
		res.at(1, v1[1] - v2[1]);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float[] v1, float value, @ExtractionParam T res)
	{
		res.at(0, v1[0] - value);
		res.at(1, v1[1] - value);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float[] v1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.at(0, v1[0] - v2V0);
		res.at(1, v1[1] - v2V1);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float v1V0, float v1V1, ITup2RF v2, @ExtractionParam T res)
	{
		res.at(0, v1V0 - v2.v0());
		res.at(1, v1V1 - v2.v1());
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float v1V0, float v1V1, ITupRF v2, @ExtractionParam T res)
	{
		res.at(0, v1V0 - v2.at(0));
		res.at(1, v1V1 - v2.at(1));
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float v1V0, float v1V1, float[] v2, @ExtractionParam T res)
	{
		res.at(0, v1V0 - v2[0]);
		res.at(1, v1V1 - v2[1]);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float v1V0, float v1V1, float value, @ExtractionParam T res)
	{
		res.at(0, v1V0 - value);
		res.at(1, v1V1 - value);
		
		return res;
	}
	
	public static <T extends ITupWF> T tup_subT_itup2f(float v1V0, float v1V1, float v2V0, float v2V1, @ExtractionParam T res)
	{
		res.at(0, v1V0 - v2V0);
		res.at(1, v1V1 - v2V1);
		
		return res;
	}
	
}
