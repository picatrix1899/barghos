package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.core.math.MathUtils;

public class BaseVecOpsI2F
{
	private BaseVecOpsI2F() { }
	
	public static float[] add(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2.x();
		res[1] = v1.y() + v2.y();
		
		return res;
	}
	
	public static float[] add(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2[0];
		res[1] = v1.y() + v2[1];
		
		return res;
	}
	
	public static float[] add(IVec2RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2;
		res[1] = v1.y() + v2;
		
		return res;
	}
	
	public static float[] add(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2X;
		res[1] = v1.y() + v2Y;
		
		return res;
	}
	
	public static float[] add(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2.x();
		res[1] = v1[1] + v2.y();
		
		return res;
	}
	
	public static float[] add(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2.x();
		res[1] = v1Y + v2.y();
		
		return res;
	}
	
	public static float[] addAsssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] += v2.x();
		v1[1] += v2.y();
		
		return v1;
	}
	
	public static <T extends IVec2WF> T add(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2.x(),
			v1.y() + v2.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2[0],
			v1.y() + v2[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2,
			v1.y() + v2
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2X,
			v1.y() + v2Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2.x(),
			v1[1] + v2.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2[0],
			v1[1] + v2[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2,
			v1[1] + v2
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2X,
			v1[1] + v2Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X + v2.x(),
			v1Y + v2.y()
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X + v2[0],
			v1Y + v2[1]
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T add(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1X + v2X,
			v1Y + v2Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T addAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			v1.x() + v2.x(),
			v1.y() + v2.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T addAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() + v2[0],
			v1.y() + v2[1]
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T addAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() + v2,
			v1.y() + v2
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T addAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			v1.x() + v2X,
			v1.y() + v2Y
		);
		
		return v1;
	}
	
	public static float[] sub(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2.x();
		res[1] = v1.y() - v2.y();
		
		return res;
	}
	
	public static float[] sub(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2[0];
		res[1] = v1.y() - v2[1];
		
		return res;
	}
	
	public static float[] sub(IVec2RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2;
		res[1] = v1.y() - v2;
		
		return res;
	}
	
	public static float[] sub(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2X;
		res[1] = v1.y() - v2Y;
		
		return res;
	}
	
	public static float[] sub(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2.x();
		res[1] = v1[1] - v2.y();
		
		return res;
	}
	
	public static float[] sub(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2.x();
		res[1] = v1Y - v2.y();
		
		return res;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] -= v2.x();
		v1[1] -= v2.y();
		
		return v1;
	}
	
	public static <T extends IVec2WF> T sub(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2.x(),
			v1.y() - v2.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2[0],
			v1.y() - v2[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2,
			v1.y() - v2
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2X,
			v1.y() - v2Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2.x(),
			v1[1] - v2.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2[0],
			v1[1] - v2[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2,
			v1[1] - v2
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2X,
			v1[1] - v2Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X - v2.x(),
			v1Y - v2.y()
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X - v2[0],
			v1Y - v2[1]
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T sub(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1X - v2X,
			v1Y - v2Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T subAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			v1.x() - v2.x(),
			v1.y() - v2.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T subAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() - v2[0],
			v1.y() - v2[1]
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T subAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() - v2,
			v1.y() - v2
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T subAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			v1.x() - v2X,
			v1.y() - v2Y
		);
		
		return v1;
	}
	
	public static float[] revSub(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1.x();
		res[1] = v2.y() - v1.y();
		
		return res;
	}
	
	public static float[] revSub(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1.x();
		res[1] = v2[1] - v1.y();
		
		return res;
	}
	
	public static float[] revSub(IVec2RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 - v1.x();
		res[1] = v2 - v1.y();
		
		return res;
	}
	
	public static float[] revSub(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1.x();
		res[1] = v2Y - v1.y();
		
		return res;
	}
	
	public static float[] revSub(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1[0];
		res[1] = v2.y() - v1[1];
		
		return res;
	}
	
	public static float[] revSub(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1X;
		res[1] = v2.y() - v1Y;
		
		return res;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] = v2.x() - v1[0];
		v1[1] = v2.y() - v1[1];
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revSub(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1.x(),
			v2.y() - v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1.x(),
			v2[1] - v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 - v1.x(),
			v2 - v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v2X - v1.x(),
			v2Y - v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1[0],
			v2.y() - v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1[0],
			v2[1] - v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 - v1[0],
			v2 - v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v2X - v1[0],
			v2Y - v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1X,
			v2.y() - v1Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1X,
			v2[1] - v1Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSub(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v2X - v1X,
			v2Y - v1Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T revSubAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			v2.x() - v1.x(),
			v2.y() - v1.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revSubAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v2[0] - v1.x(),
			v2[1] - v1.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revSubAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v2 - v1.x(),
			v2 - v1.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revSubAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			v2X - v1.x(),
			v2Y - v1.y()
		);
		
		return v1;
	}
	
	public static float[] mul(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2.x();
		res[1] = v1.y() * v2.y();
		
		return res;
	}
	
	public static float[] mul(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2[0];
		res[1] = v1.y() * v2[1];
		
		return res;
	}
	
	public static float[] mul(IVec2RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2;
		res[1] = v1.y() * v2;
		
		return res;
	}
	
	public static float[] mul(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2X;
		res[1] = v1.y() * v2Y;
		
		return res;
	}
	
	public static float[] mul(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2.x();
		res[1] = v1[1] * v2.y();
		
		return res;
	}
	
	public static float[] mul(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X * v2.x();
		res[1] = v1Y * v2.y();
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] *= v2.x();
		v1[1] *= v2.y();
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mul(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2.x(),
			v1.y() * v2.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2[0],
			v1.y() * v2[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2,
			v1.y() * v2
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2X,
			v1.y() * v2Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2.x(),
			v1[1] * v2.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2[0],
			v1[1] * v2[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2,
			v1[1] * v2
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2X,
			v1[1] * v2Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X * v2.x(),
			v1Y * v2.y()
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X * v2[0],
			v1Y * v2[1]
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T mul(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1X * v2X,
			v1Y * v2Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			v1.x() * v2.x(),
			v1.y() * v2.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() * v2[0],
			v1.y() * v2[1]
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() * v2,
			v1.y() * v2
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			v1.x() * v2X,
			v1.y() * v2Y
		);
		
		return v1;
	}
	
	public static float[] div(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2.x();
		res[1] = v1.y() / v2.y();
		
		return res;
	}
	
	public static float[] div(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2[0];
		res[1] = v1.y() / v2[1];
		
		return res;
	}
	
	public static float[] div(IVec2RF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / value;
		res[1] = v1.y() / value;
		
		return res;
	}
	
	public static float[] div(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2X;
		res[1] = v1.y() / v2Y;
		
		return res;
	}
	
	public static float[] div(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2.x();
		res[1] = v1[1] / v2.y();
		
		return res;
	}
	
	public static float[] div(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X / v2.x();
		res[1] = v1Y / v2.y();
		
		return res;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] /= v2.x();
		v1[1] /= v2.y();
		
		return v1;
	}
	
	public static <T extends IVec2WF> T div(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2.x(),
			v1.y() / v2.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2[0],
			v1.y() / v2[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2,
			v1.y() / v2
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2X,
			v1.y() / v2Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2.x(),
			v1[1] / v2.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2[0],
			v1[1] / v2[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2,
			v1[1] / v2
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2X,
			v1[1] / v2Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X / v2.x(),
			v1Y / v2.y()
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X / v2[0],
			v1Y / v2[1]
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T div(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v1X / v2X,
			v1Y / v2Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T divAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			v1.x() / v2.x(),
			v1.y() / v2.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T divAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() / v2[0],
			v1.y() / v2[1]
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T divAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() / v2,
			v1.y() / v2
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T divAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			v1.x() / v2X,
			v1.y() / v2Y
		);
		
		return v1;
	}
	
	public static float[] revDiv(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1.x();
		res[1] = v2.y() / v1.y();
		
		return res;
	}
	
	public static float[] revDiv(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] / v1.x();
		res[1] = v2[1] / v1.y();
		
		return res;
	}
	
	public static float[] revDiv(IVec2RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 / v1.x();
		res[1] = v2 / v1.y();
		
		return res;
	}
	
	public static float[] revDiv(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X / v1.x();
		res[1] = v2Y / v1.y();
		
		return res;
	}
	
	public static float[] revDiv(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1[0];
		res[1] = v2.y() / v1[1];
		
		return res;
	}
	
	public static float[] revDiv(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1X;
		res[1] = v2.y() / v1Y;
		
		return res;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] = v2.x() / v1[0];
		v1[1] = v2.y() / v1[1];
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revDiv(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1.x(),
			v2.y() / v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1.x(),
			v2[1] / v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 / v1.x(),
			v2 / v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v2X / v1.x(),
			v2Y / v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1[0],
			v2.y() / v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1[0],
			v2[1] / v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 / v1[0],
			v2 / v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v2X / v1[0],
			v2Y / v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1X,
			v2.y() / v1Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1X,
			v2[1] / v1Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDiv(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			v2X / v1X,
			v2Y / v1Y
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T revDivAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			v2.x() / v1.x(),
			v2.y() / v1.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revDivAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v2[0] / v1.x(),
			v2[1] / v1.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revDivAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v2 / v1.x(),
			v2 / v1.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revDivAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			v2X / v1.x(),
			v2Y / v1.y()
		);
		
		return v1;
	}
	
	public static float[] mulAdd(IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2.x(), v3.x());
		res[1] = Math.fma(v1.y(), v2.y(), v3.y());		
		
		return res;
	}
	
	public static float[] mulAdd(IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2.x(), v3[0]);
		res[1] = Math.fma(v1.y(), v2.y(), v3[1]);		
		
		return res;
	}
	
	public static float[] mulAdd(IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2.x(), v3X);
		res[1] = Math.fma(v1.y(), v2.y(), v3Y);		
		
		return res;
	}
	
	public static float[] mulAdd(IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2[0], v3.x());
		res[1] = Math.fma(v1.y(), v2[1], v3.y());		
		
		return res;
	}
	
	public static float[] mulAdd(IVec2RF v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2[0], v3[0]);
		res[1] = Math.fma(v1.y(), v2[1], v3[1]);		
		
		return res;
	}
	
	public static float[] mulAdd(IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2[0], v3X);
		res[1] = Math.fma(v1.y(), v2[1], v3Y);		
		
		return res;
	}
	
	public static float[] mulAdd(IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2X, v3.x());
		res[1] = Math.fma(v1.y(), v2Y, v3.y());		
		
		return res;
	}
	
	public static float[] mulAdd(IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2X, v3[0]);
		res[1] = Math.fma(v1.y(), v2Y, v3[1]);		
		
		return res;
	}
	
	public static float[] mulAdd(IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2X, v3X);
		res[1] = Math.fma(v1.y(), v2Y, v3Y);		
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2.x(), v3.x());
		res[1] = Math.fma(v1[1], v2.y(), v3.y());		
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2.x(), v3[0]);
		res[1] = Math.fma(v1[1], v2.y(), v3[1]);		
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2.x(), v3X);
		res[1] = Math.fma(v1[1], v2.y(), v3Y);		
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2[0], v3.x());
		res[1] = Math.fma(v1[1], v2[1], v3.y());		
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2X, v3.x());
		res[1] = Math.fma(v1[1], v2Y, v3.y());		
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2.x(), v3.x());
		res[1] = Math.fma(v1Y, v2.y(), v3.y());		
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2.x(), v3[0]);
		res[1] = Math.fma(v1Y, v2.y(), v3[1]);		
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2.x(), v3X);
		res[1] = Math.fma(v1Y, v2.y(), v3Y);		
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2[0], v3.x());
		res[1] = Math.fma(v1Y, v2[1], v3.y());		
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2X, v3.x());
		res[1] = Math.fma(v1Y, v2Y, v3.y());		
		
		return res;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, IVec2RF v2, IVec2RF v3)
	{
		v1[0] = Math.fma(v1[0], v2.x(), v3.x());
		v1[1] = Math.fma(v1[1], v2.y(), v3.y());		
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, IVec2RF v2, float[] v3)
	{
		v1[0] = Math.fma(v1[0], v2.x(), v3[0]);
		v1[1] = Math.fma(v1[1], v2.y(), v3[1]);		
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, IVec2RF v2, float v3X, float v3Y)
	{
		v1[0] = Math.fma(v1[0], v2.x(), v3X);
		v1[1] = Math.fma(v1[1], v2.y(), v3Y);		
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float[] v2, IVec2RF v3)
	{
		v1[0] = Math.fma(v1[0], v2[0], v3.x());
		v1[1] = Math.fma(v1[1], v2[1], v3.y());		
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, IVec2RF v3)
	{
		v1[0] = Math.fma(v1[0], v2X, v3.x());
		v1[1] = Math.fma(v1[1], v2Y, v3.y());		
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2.x(), v3.x()),
			Math.fma(v1.y(), v2.y(), v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2.x(), v3[0]),
			Math.fma(v1.y(), v2.y(), v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2.x(), v3X),
			Math.fma(v1.y(), v2.y(), v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2[0], v3.x()),
			Math.fma(v1.y(), v2[1], v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2[0], v3[0]),
			Math.fma(v1.y(), v2[1], v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2[0], v3X),
			Math.fma(v1.y(), v2[1], v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2X, v3.x()),
			Math.fma(v1.y(), v2Y, v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2X, v3[0]),
			Math.fma(v1.y(), v2Y, v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2X, v3X),
			Math.fma(v1.y(), v2Y, v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2.x(), v3.x()),
			Math.fma(v1[1], v2.y(), v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2.x(), v3[0]),
			Math.fma(v1[1], v2.y(), v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2.x(), v3X),
			Math.fma(v1[1], v2.y(), v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2[0], v3.x()),
			Math.fma(v1[1], v2[1], v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2[0], v3[0]),
			Math.fma(v1[1], v2[1], v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2[0], v3X),
			Math.fma(v1[1], v2[1], v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2X, v3.x()),
			Math.fma(v1[1], v2Y, v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2X, v3[0]),
			Math.fma(v1[1], v2Y, v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2X, v3X),
			Math.fma(v1[1], v2Y, v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2.x(), v3.x()),
			Math.fma(v1Y, v2.y(), v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2.x(), v3[0]),
			Math.fma(v1Y, v2.y(), v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2.x(), v3X),
			Math.fma(v1Y, v2.y(), v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2[0], v3.x()),
			Math.fma(v1Y, v2[1], v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2[0], v3[0]),
			Math.fma(v1Y, v2[1], v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2[0], v3X),
			Math.fma(v1Y, v2[1], v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2X, v3.x()),
			Math.fma(v1Y, v2Y, v3.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2X, v3[0]),
			Math.fma(v1Y, v2Y, v3[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAdd(float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2X, v3X),
			Math.fma(v1Y, v2Y, v3Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, IVec2RF v2, IVec2RF v3)
	{
		v1.set(
			Math.fma(v1.x(), v2.x(), v3.x()),
			Math.fma(v1.y(), v2.y(), v3.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, IVec2RF v2, float[] v3)
	{
		v1.set(
			Math.fma(v1.x(), v2.x(), v3[0]),
			Math.fma(v1.y(), v2.y(), v3[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, IVec2RF v2, float v3X, float v3Y)
	{
		v1.set(
			Math.fma(v1.x(), v2.x(), v3X),
			Math.fma(v1.y(), v2.y(), v3Y)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, float[] v2, IVec2RF v3)
	{
		v1.set(
			Math.fma(v1.x(), v2[0], v3.x()),
			Math.fma(v1.y(), v2[1], v3.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, float[] v2, float[] v3)
	{
		v1.set(
			Math.fma(v1.x(), v2[0], v3[0]),
			Math.fma(v1.y(), v2[1], v3[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, float[] v2, float v3X, float v3Y)
	{
		v1.set(
			Math.fma(v1.x(), v2[0], v3X),
			Math.fma(v1.y(), v2[1], v3Y)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, IVec2RF v3)
	{
		v1.set(
			Math.fma(v1.x(), v2X, v3.x()),
			Math.fma(v1.y(), v2Y, v3.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float[] v3)
	{
		v1.set(
			Math.fma(v1.x(), v2X, v3[0]),
			Math.fma(v1.y(), v2Y, v3[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T mulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		v1.set(
			Math.fma(v1.x(), v2X, v3X),
			Math.fma(v1.y(), v2Y, v3Y)
		);
		
		return v1;
	}
	
	public static float[] revMulAdd(IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3.x(), v1.x());
		res[1] = Math.fma(v2.y(), v3.y(), v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3[0], v1.x());
		res[1] = Math.fma(v2.y(), v3[1], v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3X, v1.x());
		res[1] = Math.fma(v2.y(), v3Y, v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3.x(), v1.x());
		res[1] = Math.fma(v2[1], v3.y(), v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec2RF v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3[0], v1.x());
		res[1] = Math.fma(v2[1], v3[1], v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3X, v1.x());
		res[1] = Math.fma(v2[1], v3Y, v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3.x(), v1.x());
		res[1] = Math.fma(v2Y, v3.y(), v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3[0], v1.x());
		res[1] = Math.fma(v2Y, v3[1], v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3X, v1.x());
		res[1] = Math.fma(v2Y, v3Y, v1.y());
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3.x(), v1[0]);
		res[1] = Math.fma(v2.y(), v3.y(), v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3[0], v1[0]);
		res[1] = Math.fma(v2.y(), v3[1], v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3X, v1[0]);
		res[1] = Math.fma(v2.y(), v3Y, v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3.x(), v1[0]);
		res[1] = Math.fma(v2[1], v3.y(), v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3.x(), v1[0]);
		res[1] = Math.fma(v2Y, v3.y(), v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3.x(), v1X);
		res[1] = Math.fma(v2.y(), v3.y(), v1Y);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3[0], v1X);
		res[1] = Math.fma(v2.y(), v3[1], v1Y);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), v3X, v1X);
		res[1] = Math.fma(v2.y(), v3Y, v1Y);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3.x(), v1X);
		res[1] = Math.fma(v2[1], v3.y(), v1Y);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3.x(), v1X);
		res[1] = Math.fma(v2Y, v3.y(), v1Y);
		
		return res;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, IVec2RF v2, IVec2RF v3)
	{
		v1[0] = Math.fma(v2.x(), v3.x(), v1[0]);
		v1[1] = Math.fma(v2.y(), v3.y(), v1[1]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, IVec2RF v2, float[] v3)
	{
		v1[0] = Math.fma(v2.x(), v3[0], v1[0]);
		v1[1] = Math.fma(v2.y(), v3[1], v1[1]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, IVec2RF v2, float v3X, float v3Y)
	{
		v1[0] = Math.fma(v2.x(), v3X, v1[0]);
		v1[1] = Math.fma(v2.y(), v3Y, v1[1]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float[] v2, IVec2RF v3)
	{
		v1[0] = Math.fma(v2[0], v3.x(), v1[0]);
		v1[1] = Math.fma(v2[1], v3.y(), v1[1]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, IVec2RF v3)
	{
		v1[0] = Math.fma(v2X, v3.x(), v1[0]);
		v1[1] = Math.fma(v2Y, v3.y(), v1[1]);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3.x(), v1.x()),
			Math.fma(v2.y(), v3.y(), v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3[0], v1.x()),
			Math.fma(v2.y(), v3[1], v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3X, v1.x()),
			Math.fma(v2.y(), v3Y, v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3.x(), v1.x()),
			Math.fma(v2[1], v3.y(), v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3[0], v1.x()),
			Math.fma(v2[1], v3[1], v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3X, v1.x()),
			Math.fma(v2[1], v3Y, v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3.x(), v1.x()),
			Math.fma(v2Y, v3.y(), v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3[0], v1.x()),
			Math.fma(v2Y, v3[1], v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3X, v1.x()),
			Math.fma(v2Y, v3Y, v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3.x(), v1[0]),
			Math.fma(v2.y(), v3.y(), v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3[0], v1[0]),
			Math.fma(v2.y(), v3[1], v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3X, v1[0]),
			Math.fma(v2.y(), v3Y, v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3.x(), v1[0]),
			Math.fma(v2[1], v3.y(), v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3[0], v1[0]),
			Math.fma(v2[1], v3[1], v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3X, v1[0]),
			Math.fma(v2[1], v3Y, v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3.x(), v1[0]),
			Math.fma(v2Y, v3.y(), v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3[0], v1[0]),
			Math.fma(v2Y, v3[1], v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3X, v1[0]),
			Math.fma(v2Y, v3Y, v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3.x(), v1X),
			Math.fma(v2.y(), v3.y(), v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3[0], v1X),
			Math.fma(v2.y(), v3[1], v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), v3X, v1X),
			Math.fma(v2.y(), v3Y, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3.x(), v1X),
			Math.fma(v2[1], v3.y(), v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3[0], v1X),
			Math.fma(v2[1], v3[1], v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], v3X, v1X),
			Math.fma(v2[1], v3Y, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3.x(), v1X),
			Math.fma(v2Y, v3.y(), v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3[0], v1X),
			Math.fma(v2Y, v3[1], v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAdd(float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, v3X, v1X),
			Math.fma(v2Y, v3Y, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, IVec2RF v2, IVec2RF v3)
	{
		v1.set(
			Math.fma(v2.x(), v3.x(), v1.x()),
			Math.fma(v2.y(), v3.y(), v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, IVec2RF v2, float[] v3)
	{
		v1.set(
			Math.fma(v2.x(), v3[0], v1.x()),
			Math.fma(v2.y(), v3[1], v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, IVec2RF v2, float v3X, float v3Y)
	{
		v1.set(
			Math.fma(v2.x(), v3X, v1.x()),
			Math.fma(v2.y(), v3Y, v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, float[] v2, IVec2RF v3)
	{
		v1.set(
			Math.fma(v2[0], v3.x(), v1.x()),
			Math.fma(v2[1], v3.y(), v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, float[] v2, float[] v3)
	{
		v1.set(
			Math.fma(v2[0], v3[0], v1.x()),
			Math.fma(v2[1], v3[1], v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, float[] v2, float v3X, float v3Y)
	{
		v1.set(
			Math.fma(v2[0], v3X, v1.x()),
			Math.fma(v2[1], v3Y, v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, IVec2RF v3)
	{
		v1.set(
			Math.fma(v2X, v3.x(), v1.x()),
			Math.fma(v2Y, v3.y(), v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float[] v3)
	{
		v1.set(
			Math.fma(v2X, v3[0], v1.x()),
			Math.fma(v2Y, v3[1], v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revMulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		v1.set(
			Math.fma(v2X, v3X, v1.x()),
			Math.fma(v2Y, v3Y, v1.y())
		);
		
		return v1;
	}
	
	public static float[] pow(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2.x());
		res[1] = MathUtils.pow(v1.y(), v2.y());
		
		return res;
	}
	
	public static float[] pow(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2[0]);
		res[1] = MathUtils.pow(v1.y(), v2[1]);
		
		return res;
	}
	
	public static float[] pow(IVec2RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2);
		res[1] = MathUtils.pow(v1.y(), v2);
		
		return res;
	}
	
	public static float[] pow(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2X);
		res[1] = MathUtils.pow(v1.y(), v2Y);
		
		return res;
	}
	
	public static float[] pow(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2.x());
		res[1] = MathUtils.pow(v1[1], v2.y());
		
		return res;
	}
	
	public static float[] pow(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1X, v2.x());
		res[1] = MathUtils.pow(v1Y, v2.y());
		
		return res;
	}

	public static float[] powAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] = MathUtils.pow(v1[0], v2.x());
		v1[1] = MathUtils.pow(v1[1], v2.y());
		
		return v1;
	}
	
	public static <T extends IVec2WF> T pow(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2.x()),
			MathUtils.pow(v1.y(), v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2[0]),
			MathUtils.pow(v1.y(), v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2),
			MathUtils.pow(v1.y(), v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2X),
			MathUtils.pow(v1.y(), v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2.x()),
			MathUtils.pow(v1[1], v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2[0]),
			MathUtils.pow(v1[1], v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2),
			MathUtils.pow(v1[1], v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2X),
			MathUtils.pow(v1[1], v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2.x()),
			MathUtils.pow(v1Y, v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2[0]),
			MathUtils.pow(v1Y, v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T pow(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2X),
			MathUtils.pow(v1Y, v2Y)
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T powAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2.x()),
			MathUtils.pow(v1.y(), v2.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T powAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2[0]),
			MathUtils.pow(v1.y(), v2[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T powAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2),
			MathUtils.pow(v1.y(), v2)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T powAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2X),
			MathUtils.pow(v1.y(), v2Y)
		);
		
		return v1;
	}
	
	public static float[] revPow(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1.x());
		res[1] = MathUtils.pow(v2.y(), v1.y());
		
		return res;
	}
	
	public static float[] revPow(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2[0], v1.x());
		res[1] = MathUtils.pow(v2[1], v1.y());
		
		return res;
	}
	
	public static float[] revPow(IVec2RF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(value, v1.x());
		res[1] = MathUtils.pow(value, v1.y());
		
		return res;
	}
	
	public static float[] revPow(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2X, v1.x());
		res[1] = MathUtils.pow(v2Y, v1.y());
		
		return res;
	}
	
	public static float[] revPow(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1[0]);
		res[1] = MathUtils.pow(v2.y(), v1[1]);
		
		return res;
	}
	
	public static float[] revPow(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1X);
		res[1] = MathUtils.pow(v2.y(), v1Y);
		
		return res;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] = MathUtils.pow(v2.x(), v1[0]);
		v1[1] = MathUtils.pow(v2.y(), v1[1]);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revPow(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1.x()),
			MathUtils.pow(v2.y(), v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1.x()),
			MathUtils.pow(v2[1], v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2, v1.x()),
			MathUtils.pow(v2, v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1.x()),
			MathUtils.pow(v2Y, v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1[0]),
			MathUtils.pow(v2.y(), v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1[0]),
			MathUtils.pow(v2[1], v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2, v1[0]),
			MathUtils.pow(v2, v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1[0]),
			MathUtils.pow(v2Y, v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1X),
			MathUtils.pow(v2.y(), v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1X),
			MathUtils.pow(v2[1], v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPow(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1X),
			MathUtils.pow(v2Y, v1Y)
		);		
		
		return res;
	}
	
	public static <T extends IVec2WF> T revPowAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			MathUtils.pow(v2.x(), v1.at(0)),
			MathUtils.pow(v2.y(), v1.at(1))
		);	
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revPowAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			MathUtils.pow(v2[0], v1.at(0)),
			MathUtils.pow(v2[1], v1.at(1))
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revPowAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			MathUtils.pow(v2, v1.at(0)),
			MathUtils.pow(v2, v1.at(1))
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T revPowAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			MathUtils.pow(v2X, v1.at(0)),
			MathUtils.pow(v2Y, v1.at(1))
		);
		
		return v1;
	}
	
	public static float[] sqrt(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(v1.x());
		res[1] = MathUtils.sqrt(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T sqrt(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1.x()),
			MathUtils.sqrt(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sqrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1[0]),
			MathUtils.sqrt(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sqrt(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1X),
			MathUtils.sqrt(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sqrtAssign(T v1)
	{
		v1.set(
			MathUtils.sqrt(v1.x()),
			MathUtils.sqrt(v1.y())
		);
		
		return v1;
	}
	
	public static float[] invSqrt(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invSqrt(v1.x());
		res[1] = MathUtils.invSqrt(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T invSqrt(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1.x()),
			MathUtils.invSqrt(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T invSqrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1[0]),
			MathUtils.invSqrt(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T invSqrt(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1X),
			MathUtils.invSqrt(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T invSqrtAssign(T v1)
	{
		v1.set(
			MathUtils.invSqrt(v1.x()),
			MathUtils.invSqrt(v1.y())
		);
		
		return v1;
	}
	
	public static float[] cbrt(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(v1.x());
		res[1] = MathUtils.cbrt(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T cbrt(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1.x()),
			MathUtils.cbrt(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T cbrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1[0]),
			MathUtils.cbrt(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T cbrt(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1X),
			MathUtils.cbrt(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T cbrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cbrt(v1.x()),
			MathUtils.cbrt(v1.y())
		);
		
		return v1;
	}
	
	public static float[] invCbrt(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invCbrt(v1.x());
		res[1] = MathUtils.invCbrt(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T invCbrt(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1.x()),
			MathUtils.invCbrt(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T invCbrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1[0]),
			MathUtils.invCbrt(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T invCbrt(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1X),
			MathUtils.invCbrt(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T invCbrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.invCbrt(v1.x()),
			MathUtils.invCbrt(v1.y())
		);
		
		return v1;
	}
	
	public static float[] abs(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(v1.x());
		res[1] = Math.abs(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T abs(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1.x()),
			Math.abs(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T abs(float[] v1, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1[0]),
			Math.abs(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T abs(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1X),
			Math.abs(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T absAssign(@ExtractionParam T v1)
	{
		v1.set(
			Math.abs(v1.x()),
			Math.abs(v1.y())
		);
		
		return v1;
	}
	
	public static float[] reciprocal(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v1.x();
		res[1] = 1.0f / v1.y();
		
		return res;
	}
	
	public static <T extends IVec2WF> T reciprocal(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1.x(),
			1.0f / v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reciprocal(float[] v1, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1[0],
			1.0f / v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reciprocal(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1X,
			1.0f / v1Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reciprocalAssign(@ExtractionParam T v1)
	{
		v1.set(
			1.0f / v1.x(),
			1.0f / v1.y()
		);
		
		return v1;
	}
	
	public static float[] negate(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = -v1.x();
		res[1] = -v1.y();
		
		return res;
	}
	
	public static <T extends IVec2WF> T negate(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			-v1.x(),
			-v1.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T negate(float[] v1, @ExtractionParam T res)
	{
		res.set(
			-v1[0],
			-v1[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T negate(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			-v1X,
			-v1Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T negateAssign(@ExtractionParam T v1)
	{
		v1.set(
			-v1.x(),
			-v1.y()
		);
		
		return v1;
	}
	
	public static float[] squared(IVec2RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res[0] = v1X * v1X;
		res[1] = v1Y * v1Y;
		
		return res;
	}
	
	public static <T extends IVec2WF> T squared(IVec2RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			v1X * v1X,
			v1Y * v1Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T squared(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res.set(
			v1X * v1X,
			v1Y * v1Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T squared(float v1X, float v1Y, @ExtractionParam T res)
	{	
		res.set(
			v1X * v1X,
			v1Y * v1Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T squaredAssign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			v1X * v1X,
			v1Y * v1Y
		);
		
		return v1;
	}
	
	public static float[] sin(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sin(v1.x());
		res[1] = MathUtils.sin(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T sin(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1.x()),
			MathUtils.sin(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sin(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1[0]),
			MathUtils.sin(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sin(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1X),
			MathUtils.sin(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sinAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sin(v1.x()),
			MathUtils.sin(v1.y())
		);
		
		return v1;
	}
	
	public static float[] asin(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.asin(v1.x());
		res[1] = MathUtils.asin(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T asin(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1.x()),
			MathUtils.asin(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T asin(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1[0]),
			MathUtils.asin(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T asin(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1X),
			MathUtils.asin(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T asinAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.asin(v1.x()),
			MathUtils.asin(v1.y())
		);
		
		return v1;
	}
	
	public static float[] sinh(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sinh(v1.x());
		res[1] = MathUtils.sinh(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T sinh(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1.x()),
			MathUtils.sinh(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sinh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1[0]),
			MathUtils.sinh(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sinh(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1X),
			MathUtils.sinh(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T sinhAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sinh(v1.x()),
			MathUtils.sinh(v1.y())
		);
		
		return v1;
	}
	
	public static float[] cos(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cos(v1.x());
		res[1] = MathUtils.cos(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T cos(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1.x()),
			MathUtils.cos(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T cos(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1[0]),
			MathUtils.cos(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T cos(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1X),
			MathUtils.cos(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T cosAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cos(v1.x()),
			MathUtils.cos(v1.y())
		);
		
		return v1;
	}
	
	public static float[] acos(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.acos(v1.x());
		res[1] = MathUtils.acos(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T acos(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1.x()),
			MathUtils.acos(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T acos(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1[0]),
			MathUtils.acos(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T acos(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1X),
			MathUtils.acos(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T acosAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.acos(v1.x()),
			MathUtils.acos(v1.y())
		);
		
		return v1;
	}
	
	public static float[] cosh(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cosh(v1.x());
		res[1] = MathUtils.cosh(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T cosh(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1.x()),
			MathUtils.cosh(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T cosh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1[0]),
			MathUtils.cosh(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T cosh(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1X),
			MathUtils.cosh(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T coshAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cosh(v1.x()),
			MathUtils.cosh(v1.y())
		);
		
		return v1;
	}
	
	public static float[] tan(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tan(v1.x());
		res[1] = MathUtils.tan(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T tan(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1.x()),
			MathUtils.tan(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tan(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1[0]),
			MathUtils.tan(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tan(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1X),
			MathUtils.tan(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tanAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.tan(v1.x()),
			MathUtils.tan(v1.y())
		);
		
		return v1;
	}
	
	public static float[] atan(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.atan(v1.x());
		res[1] = MathUtils.atan(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T atan(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1.x()),
			MathUtils.atan(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T atan(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1[0]),
			MathUtils.atan(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T atan(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1X),
			MathUtils.atan(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T atanAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.atan(v1.x()),
			MathUtils.atan(v1.y())
		);
		
		return v1;
	}
	
	public static float[] tanh(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tanh(v1.x());
		res[1] = MathUtils.tanh(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T tanh(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1.x()),
			MathUtils.tanh(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tanh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1[0]),
			MathUtils.tanh(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tanh(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1X),
			MathUtils.tanh(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tanhAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.tanh(v1.x()),
			MathUtils.tanh(v1.y())
		);
		
		return v1;
	}
	
	public static float minValue(IVec2RF v1)
	{
		return Math.min(v1.x(), v1.y());
	}
	
	public static int minComponent(IVec2RF v1)
	{
		float value = v1.x();
		int index = 0;

		float v1Y = v1.y();

		if (v1Y < value)
		{
			index = 1;
		}
		
		return index;
	}
	
	public static IndexValuePairF min(IVec2RF v1)
	{
		float value = v1.x();
		int index = 0;

		float v1Y = v1.y();

		if (v1Y < value)
		{
			value = v1Y;
			index = 1;
		}

		return new IndexValuePairF(value, index);
	}
	
	public static IndexValuePairF min(IVec2RF v1, @ExtractionParam IndexValuePairF res)
	{
		float value = v1.x();
		int index = 0;

		float v1Y = v1.y();

		if (v1Y < value)
		{
			value = v1Y;
			index = 1;
		}

		res.set(value, index);

		return res;
	}
	
	public static float[] min(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1.x(), v2.x());
		res[1] = Math.min(v1.y(), v2.y());
		
		return res;
	}
	
	public static float[] min(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1.x(), v2[0]);
		res[1] = Math.min(v1.y(), v2[1]);
		
		return res;
	}
	
	public static float[] min(IVec2RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1.x(), v2);
		res[1] = Math.min(v1.y(), v2);
		
		return res;
	}
	
	public static float[] min(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1.x(), v2X);
		res[1] = Math.min(v1.y(), v2Y);
		
		return res;
	}
	
	public static float[] min(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1[0], v2.x());
		res[1] = Math.min(v1[1], v2.y());
		
		return res;
	}
	
	public static float[] min(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1X, v2.x());
		res[1] = Math.min(v1Y, v2.y());
		
		return res;
	}
	
	public static float[] minAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] = Math.min(v1[0], v2.x());
		v1[1] = Math.min(v1[1], v2.y());
		
		return v1;
	}
	
	public static <T extends IVec2WF> T min(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1.x(), v2.x()),
			Math.min(v1.y(), v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1.x(), v2[0]),
			Math.min(v1.y(), v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1.x(), v2),
			Math.min(v1.y(), v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1.x(), v2X),
			Math.min(v1.y(), v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1[0], v2.x()),
			Math.min(v1[1], v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1[0], v2[0]),
			Math.min(v1[1], v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1[0], v2),
			Math.min(v1[1], v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1[0], v2X),
			Math.min(v1[1], v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1X, v2.x()),
			Math.min(v1Y, v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1X, v2[0]),
			Math.min(v1Y, v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T min(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			Math.min(v1X, v2X),
			Math.min(v1Y, v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T minAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			Math.min(v1.x(), v2.x()),
			Math.min(v1.y(), v2.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T minAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			Math.min(v1.x(), v2[0]),
			Math.min(v1.y(), v2[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T minAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			Math.min(v1.x(), v2),
			Math.min(v1.y(), v2)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T minAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			Math.min(v1.x(), v2X),
			Math.min(v1.y(), v2Y)
		);
		
		return v1;
	}
	
	public static float maxValue(IVec2RF v1)
	{
		return Math.max(v1.x(), v1.y());
	}
	
	public static int maxComponent(IVec2RF v1)
	{
		float value = v1.x();
		int index = 0;

		float v1Y = v1.y();

		if (v1Y > value)
		{
			index = 1;
		}
		
		return index;
	}
	
	public static IndexValuePairF max(IVec2RF v1)
	{
		float value = v1.x();
		int index = 0;

		float v1Y = v1.y();

		if (v1Y > value)
		{
			value = v1Y;
			index = 1;
		}

		return new IndexValuePairF(value, index);
	}
	
	public static IndexValuePairF max(IVec2RF v1, @ExtractionParam IndexValuePairF res)
	{
		float value = v1.x();
		int index = 0;

		float v1Y = v1.y();

		if (v1Y < value)
		{
			value = v1Y;
			index = 1;
		}

		res.set(value, index);

		return res;
	}
	
	public static float[] max(IVec2RF v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1.x(), v2.x());
		res[1] = Math.max(v1.y(), v2.y());
		
		return res;
	}
	
	public static float[] max(IVec2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1.x(), v2[0]);
		res[1] = Math.max(v1.y(), v2[1]);
		
		return res;
	}
	
	public static float[] max(IVec2RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1.x(), v2);
		res[1] = Math.max(v1.y(), v2);
		
		return res;
	}
	
	public static float[] max(IVec2RF v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1.x(), v2X);
		res[1] = Math.max(v1.y(), v2Y);
		
		return res;
	}
	
	public static float[] max(float[] v1, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1[0], v2.x());
		res[1] = Math.max(v1[1], v2.y());
		
		return res;
	}
	
	public static float[] max(float v1X, float v1Y, IVec2RF v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1X, v2.x());
		res[1] = Math.max(v1Y, v2.y());
		
		return res;
	}
	
	public static float[] maxAssign(@ExtractionParam float[] v1, IVec2RF v2)
	{
		v1[0] = Math.max(v1[0], v2.x());
		v1[1] = Math.max(v1[1], v2.y());
		
		return v1;
	}
	
	public static <T extends IVec2WF> T max(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1.x(), v2.x()),
			Math.max(v1.y(), v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1.x(), v2[0]),
			Math.max(v1.y(), v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1.x(), v2),
			Math.max(v1.y(), v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1.x(), v2X),
			Math.max(v1.y(), v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1[0], v2.x()),
			Math.max(v1[1], v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1[0], v2[0]),
			Math.max(v1[1], v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1[0], v2),
			Math.max(v1[1], v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1[0], v2X),
			Math.max(v1[1], v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1X, v2.x()),
			Math.max(v1Y, v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1X, v2[0]),
			Math.max(v1Y, v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T max(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			Math.max(v1X, v2X),
			Math.max(v1Y, v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T maxAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			Math.max(v1.x(), v2.x()),
			Math.max(v1.y(), v2.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T maxAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			Math.max(v1.x(), v2[0]),
			Math.max(v1.y(), v2[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T maxAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			Math.max(v1.x(), v2),
			Math.max(v1.y(), v2)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T maxAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			Math.max(v1.x(), v2X),
			Math.max(v1.y(), v2Y)
		);
		
		return v1;
	}
	
	public static float[] signum(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = Math.signum(v1.x());
		res[1] = Math.signum(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T signum(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			Math.signum(v1.x()),
			Math.signum(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signum(float[] v1, @ExtractionParam T res)
	{
		res.set(
			Math.signum(v1[0]),
			Math.signum(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signum(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			Math.signum(v1X),
			Math.signum(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumAssign(@ExtractionParam T v1)
	{
		v1.set(
			Math.signum(v1.x()),
			Math.signum(v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T signumEps4(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps4(v1.x()),
			MathUtils.signumEps4(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps4(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps4(v1[0]),
			MathUtils.signumEps4(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps4(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps4(v1X),
			MathUtils.signumEps4(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps4Assign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.signumEps4(v1.x()),
			MathUtils.signumEps4(v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T signumEps6(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps6(v1.x()),
			MathUtils.signumEps6(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps6(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps6(v1[0]),
			MathUtils.signumEps6(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps6(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps6(v1X),
			MathUtils.signumEps6(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps6Assign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.signumEps6(v1.x()),
			MathUtils.signumEps6(v1.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T signumEps8(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps8(v1.x()),
			MathUtils.signumEps8(v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps8(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps8(v1[0]),
			MathUtils.signumEps8(v1[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps8(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.signumEps8(v1X),
			MathUtils.signumEps8(v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T signumEps8Assign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.signumEps8(v1.x()),
			MathUtils.signumEps8(v1.y())
		);
		
		return v1;
	}
	
	public static float[] clampMin(IVec2RF v1, IVec2RF min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1.x(), min.x());
		res[1] = MathUtils.clampMin(v1.y(), min.y());
		
		return res;
	}
	
	public static float[] clampMin(IVec2RF v1, float[] min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1.x(), min[0]);
		res[1] = MathUtils.clampMin(v1.y(), min[1]);
		
		return res;
	}
	
	public static float[] clampMin(IVec2RF v1, float min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1.x(), min);
		res[1] = MathUtils.clampMin(v1.y(), min);
		
		return res;
	}
	
	public static float[] clampMin(IVec2RF v1, float minX, float minY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1.x(), minX);
		res[1] = MathUtils.clampMin(v1.y(), minY);
		
		return res;
	}
	
	public static float[] clampMin(float[] v1, IVec2RF min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1[0], min.x());
		res[1] = MathUtils.clampMin(v1[1], min.y());
		
		return res;
	}
	
	public static float[] clampMin(float v1X, float v1Y, IVec2RF min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1X, min.x());
		res[1] = MathUtils.clampMin(v1Y, min.y());
		
		return res;
	}
	
	public static float[] clampMinAssign(@ExtractionParam float[] v1, IVec2RF min)
	{
		v1[0] = MathUtils.clampMin(v1[0], min.x());
		v1[1] = MathUtils.clampMin(v1[1], min.y());
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampMin(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1.x(), v2.x()),
			MathUtils.clampMin(v1.y(), v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1.x(), v2[0]),
			MathUtils.clampMin(v1.y(), v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1.x(), v2),
			MathUtils.clampMin(v1.y(), v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1.x(), v2X),
			MathUtils.clampMin(v1.y(), v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1[0], v2.x()),
			MathUtils.clampMin(v1[1], v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1[0], v2[0]),
			MathUtils.clampMin(v1[1], v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1[0], v2),
			MathUtils.clampMin(v1[1], v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1[0], v2X),
			MathUtils.clampMin(v1[1], v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1X, v2.x()),
			MathUtils.clampMin(v1Y, v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1X, v2[0]),
			MathUtils.clampMin(v1Y, v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMin(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMin(v1X, v2X),
			MathUtils.clampMin(v1Y, v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMinAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			MathUtils.clampMin(v1.x(), v2.x()),
			MathUtils.clampMin(v1.y(), v2.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampMinAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			MathUtils.clampMin(v1.x(), v2[0]),
			MathUtils.clampMin(v1.y(), v2[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampMinAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			MathUtils.clampMin(v1.x(), v2),
			MathUtils.clampMin(v1.y(), v2)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampMinAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			MathUtils.clampMin(v1.x(), v2X),
			MathUtils.clampMin(v1.y(), v2Y)
		);
		
		return v1;
	}
	
	public static float[] clampMax(IVec2RF v1, IVec2RF min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1.x(), min.x());
		res[1] = MathUtils.clampMax(v1.y(), min.y());
		
		return res;
	}
	
	public static float[] clampMax(IVec2RF v1, float[] min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1.x(), min[0]);
		res[1] = MathUtils.clampMax(v1.y(), min[1]);
		
		return res;
	}
	
	public static float[] clampMax(IVec2RF v1, float min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1.x(), min);
		res[1] = MathUtils.clampMax(v1.y(), min);
		
		return res;
	}
	
	public static float[] clampMax(IVec2RF v1, float minX, float minY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1.x(), minX);
		res[1] = MathUtils.clampMax(v1.y(), minY);
		
		return res;
	}
	
	public static float[] clampMax(float[] v1, IVec2RF min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1[0], min.x());
		res[1] = MathUtils.clampMax(v1[1], min.y());
		
		return res;
	}
	
	public static float[] clampMax(float v1X, float v1Y, IVec2RF min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1X, min.x());
		res[1] = MathUtils.clampMax(v1Y, min.y());
		
		return res;
	}
	
	public static float[] clampMaxAssign(@ExtractionParam float[] v1, IVec2RF min)
	{
		v1[0] = MathUtils.clampMax(v1[0], min.x());
		v1[1] = MathUtils.clampMax(v1[1], min.y());
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampMax(IVec2RF v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1.x(), v2.x()),
			MathUtils.clampMax(v1.y(), v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(IVec2RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1.x(), v2[0]),
			MathUtils.clampMax(v1.y(), v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(IVec2RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1.x(), v2),
			MathUtils.clampMax(v1.y(), v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(IVec2RF v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1.x(), v2X),
			MathUtils.clampMax(v1.y(), v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(float[] v1, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1[0], v2.x()),
			MathUtils.clampMax(v1[1], v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1[0], v2[0]),
			MathUtils.clampMax(v1[1], v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1[0], v2),
			MathUtils.clampMax(v1[1], v2)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(float[] v1, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1[0], v2X),
			MathUtils.clampMax(v1[1], v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(float v1X, float v1Y, IVec2RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1X, v2.x()),
			MathUtils.clampMax(v1Y, v2.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(float v1X, float v1Y, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1X, v2[0]),
			MathUtils.clampMax(v1Y, v2[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMax(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clampMax(v1X, v2X),
			MathUtils.clampMax(v1Y, v2Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampMaxAssign(@ExtractionParam T v1, IVec2RF v2)
	{
		v1.set(
			MathUtils.clampMax(v1.x(), v2.x()),
			MathUtils.clampMax(v1.y(), v2.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampMaxAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			MathUtils.clampMax(v1.x(), v2[0]),
			MathUtils.clampMax(v1.y(), v2[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampMaxAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			MathUtils.clampMax(v1.x(), v2),
			MathUtils.clampMax(v1.y(), v2)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampMaxAssign(@ExtractionParam T v1, float v2X, float v2Y)
	{
		v1.set(
			MathUtils.clampMax(v1.x(), v2X),
			MathUtils.clampMax(v1.y(), v2Y)
		);
		
		return v1;
	}
	
	public static float[] clamp(IVec2RF v1, IVec2RF min, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), min.x(), max.x());
		res[1] = MathUtils.clamp(v1.y(), min.y(), max.y());
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, IVec2RF min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), min.x(), max[0]);
		res[1] = MathUtils.clamp(v1.y(), min.y(), max[1]);
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, IVec2RF min, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), min.x(), maxX);
		res[1] = MathUtils.clamp(v1.y(), min.y(), maxY);
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, float[] min, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), min[0], max.x());
		res[1] = MathUtils.clamp(v1.y(), min[1], max.y());
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), min[0], max[0]);
		res[1] = MathUtils.clamp(v1.y(), min[1], max[1]);
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, float[] min, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), min[0], maxX);
		res[1] = MathUtils.clamp(v1.y(), min[1], maxY);
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, float min, float max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), min, max);
		res[1] = MathUtils.clamp(v1.y(), min, max);
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, float minX, float minY, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), minX, max.x());
		res[1] = MathUtils.clamp(v1.y(), minY, max.y());
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, float minX, float minY, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), minX, max[0]);
		res[1] = MathUtils.clamp(v1.y(), minY, max[1]);
		
		return res;
	}
	
	public static float[] clamp(IVec2RF v1, float minX, float minY, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1.x(), minX, maxX);
		res[1] = MathUtils.clamp(v1.y(), minY, maxY);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, IVec2RF min, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min.x(), max.x());
		res[1] = MathUtils.clamp(v1[1], min.y(), max.y());
		
		return res;
	}
	
	public static float[] clamp(float[] v1, IVec2RF min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min.x(), max[0]);
		res[1] = MathUtils.clamp(v1[1], min.y(), max[1]);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, IVec2RF min, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min.x(), maxX);
		res[1] = MathUtils.clamp(v1[1], min.y(), maxY);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float[] min, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min[0], max.x());
		res[1] = MathUtils.clamp(v1[1], min[1], max.y());
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float minX, float minY, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], minX, max.x());
		res[1] = MathUtils.clamp(v1[1], minY, max.y());
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, IVec2RF min, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min.x(), max.x());
		res[1] = MathUtils.clamp(v1Y, min.y(), max.y());
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, IVec2RF min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min.x(), max[0]);
		res[1] = MathUtils.clamp(v1Y, min.y(), max[1]);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, IVec2RF min, float max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min.x(), max);
		res[1] = MathUtils.clamp(v1Y, min.y(), max);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, IVec2RF min, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min.x(), maxX);
		res[1] = MathUtils.clamp(v1Y, min.y(), maxY);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float[] min, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min[0], max.x());
		res[1] = MathUtils.clamp(v1Y, min[1], max.y());
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float minX, float minY, IVec2RF max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, minX, max.x());
		res[1] = MathUtils.clamp(v1Y, minY, max.y());
		
		return res;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, IVec2RF min, IVec2RF max)
	{
		v1[0] = MathUtils.clamp(v1[0], min.x(), max.x());
		v1[1] = MathUtils.clamp(v1[1], min.y(), max.y());
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, IVec2RF min, float[] max)
	{
		v1[0] = MathUtils.clamp(v1[0], min.x(), max[0]);
		v1[1] = MathUtils.clamp(v1[1], min.y(), max[1]);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, IVec2RF min, float maxX, float maxY)
	{
		v1[0] = MathUtils.clamp(v1[0], min.x(), maxX);
		v1[1] = MathUtils.clamp(v1[1], min.y(), maxY);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float[] min, IVec2RF max)
	{
		v1[0] = MathUtils.clamp(v1[0], min[0], max.x());
		v1[1] = MathUtils.clamp(v1[1], min[1], max.y());
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float minX, float minY, IVec2RF max)
	{
		v1[0] = MathUtils.clamp(v1[0], minX, max.x());
		v1[1] = MathUtils.clamp(v1[1], minY, max.y());
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, IVec2RF min, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), min.x(), max.x()),
			MathUtils.clamp(v1.y(), min.y(), max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, IVec2RF min, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), min.x(), max[0]),
			MathUtils.clamp(v1.y(), min.y(), max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, IVec2RF min, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), min.x(), maxX),
			MathUtils.clamp(v1.y(), min.y(), maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, float[] min, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), min[0], max.x()),
			MathUtils.clamp(v1.y(), min[1], max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, float[] min, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), min[0], max[0]),
			MathUtils.clamp(v1.y(), min[1], max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, float[] min, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), min[0], maxX),
			MathUtils.clamp(v1.y(), min[1], maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, float min, float max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), min, max),
			MathUtils.clamp(v1.y(), min, max)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, float minX, float minY, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), minX, max.x()),
			MathUtils.clamp(v1.y(), minY, max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, float minX, float minY, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), minX, max[0]),
			MathUtils.clamp(v1.y(), minY, max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(IVec2RF v1, float minX, float minY, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1.x(), minX, maxX),
			MathUtils.clamp(v1.y(), minY, maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, IVec2RF min, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], min.x(), max.x()),
			MathUtils.clamp(v1[1], min.y(), max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, IVec2RF min, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], min.x(), max[0]),
			MathUtils.clamp(v1[1], min.y(), max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, IVec2RF min, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], min.x(), maxX),
			MathUtils.clamp(v1[1], min.y(), maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, float[] min, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], min[0], max.x()),
			MathUtils.clamp(v1[1], min[1], max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, float[] min, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], min[0], max[0]),
			MathUtils.clamp(v1[1], min[1], max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, float[] min, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], min[0], maxX),
			MathUtils.clamp(v1[1], min[1], maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, float min, float max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], min, max),
			MathUtils.clamp(v1[1], min, max)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, float minX, float minY, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], minX, max.x()),
			MathUtils.clamp(v1[1], minY, max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, float minX, float minY, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], minX, max[0]),
			MathUtils.clamp(v1[1], minY, max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float[] v1, float minX, float minY, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1[0], minX, maxX),
			MathUtils.clamp(v1[1], minY, maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, IVec2RF min, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, min.x(), max.x()),
			MathUtils.clamp(v1Y, min.y(), max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, IVec2RF min, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, min.x(), max[0]),
			MathUtils.clamp(v1Y, min.y(), max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, IVec2RF min, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, min.x(), maxX),
			MathUtils.clamp(v1Y, min.y(), maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, float[] min, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, min[0], max.x()),
			MathUtils.clamp(v1Y, min[1], max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, float[] min, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, min[0], max[0]),
			MathUtils.clamp(v1Y, min[1], max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, float[] min, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, min[0], maxX),
			MathUtils.clamp(v1Y, min[1], maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, float minX, float minY, IVec2RF max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, minX, max.x()),
			MathUtils.clamp(v1Y, minY, max.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, float minX, float minY, float[] max, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, minX, max[0]),
			MathUtils.clamp(v1Y, minY, max[1])
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clamp(float v1X, float v1Y, float minX, float minY, float maxX, float maxY, @ExtractionParam T res)
	{
		res.set(
			MathUtils.clamp(v1X, minX, maxX),
			MathUtils.clamp(v1Y, minY, maxY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, IVec2RF min, IVec2RF max)
	{
		v1.set(
			MathUtils.clamp(v1.x(), min.x(), max.x()),
			MathUtils.clamp(v1.y(), min.y(), max.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, IVec2RF min, float[] max)
	{
		v1.set(
			MathUtils.clamp(v1.x(), min.x(), max[0]),
			MathUtils.clamp(v1.y(), min.y(), max[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, IVec2RF min, float maxX, float maxY)
	{
		v1.set(
			MathUtils.clamp(v1.x(), min.x(), maxX),
			MathUtils.clamp(v1.y(), min.y(), maxY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, float[] min, IVec2RF max)
	{
		v1.set(
			MathUtils.clamp(v1.x(), min[0], max.x()),
			MathUtils.clamp(v1.y(), min[1], max.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, float[] min, float[] max)
	{
		v1.set(
			MathUtils.clamp(v1.x(), min[0], max[0]),
			MathUtils.clamp(v1.y(), min[1], max[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, float[] min, float maxX, float maxY)
	{
		v1.set(
			MathUtils.clamp(v1.x(), min[0], maxX),
			MathUtils.clamp(v1.y(), min[1], maxY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, float min, float max)
	{
		v1.set(
			MathUtils.clamp(v1.x(), min, max),
			MathUtils.clamp(v1.y(), min, max)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, float minX, float minY, IVec2RF max)
	{
		v1.set(
			MathUtils.clamp(v1.x(), minX, max.x()),
			MathUtils.clamp(v1.y(), minY, max.y())
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, float minX, float minY, float[] max)
	{
		v1.set(
			MathUtils.clamp(v1.x(), minX, max[0]),
			MathUtils.clamp(v1.y(), minY, max[1])
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T clampAssign(@ExtractionParam T v1, float minX, float minY, float maxX, float maxY)
	{
		v1.set(
			MathUtils.clamp(v1.x(), minX, maxX),
			MathUtils.clamp(v1.y(), minY, maxY)
		);
		
		return v1;
	}
	
	public static float[] swizzle(IVec2RF v1, int[] indices, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		res[0] = x;
		res[1] = y;

		return res;
	}
	
	public static float[] swizzle(IVec2RF v1, int indexX, int indexY, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		res[0] = x;
		res[1] = y;

		return res;
	}
	
	public static <T extends IVec2WF> T swizzle(IVec2RF v1, int[] indices, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res.set(
			x,
			y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swizzle(IVec2RF v1, int indexX, int indexY, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res.set(
			x,
			y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swizzle(float[] v1, int[] indices, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res.set(
			x,
			y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swizzle(float[] v1, int indexX, int indexY, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res.set(
			x,
			y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swizzle(float v1X, float v1Y, int[] indices, @ExtractionParam T res)
	{
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res.set(
			x,
			y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swizzle(float v1X, float v1Y, int indexX, int indexY, @ExtractionParam T res)
	{
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res.set(
			x,
			y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swizzleAssign(@ExtractionParam T v1, int[] indices)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		v1.set(
			x,
			y
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T swizzleAssign(@ExtractionParam T v1, int indexX, int indexY)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		v1.set(
			x,
			y
		);
		
		return v1;
	}
	
	public static float[] swap(IVec2RF v1, int[] indices, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;

		return res;
	}
	
	public static float[] swap(IVec2RF v1, int indexA, int indexB, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;

		return res;
	}
	
	public static <T extends IVec2WF> T swap(IVec2RF v1, int[] indices, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			res.set(
				v1X,
				v1Y
			);
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res.set(
			rX,
			rY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swap(IVec2RF v1, int indexA, int indexB, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(indexA == indexB)
		{
			res.set(
				v1X,
				v1Y
			);
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res.set(
			rX,
			rY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swap(float[] v1, int[] indices, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			res.set(
				v1X,
				v1Y
			);
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res.set(
			rX,
			rY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swap(float[] v1, int indexA, int indexB, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(indexA == indexB)
		{
			res.set(
				v1X,
				v1Y
			);
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res.set(
			rX,
			rY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swap(float v1X, float v1Y, int[] indices, @ExtractionParam T res)
	{
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			res.set(
				v1X,
				v1Y
			);
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res.set(
			rX,
			rY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swap(float v1X, float v1Y, int indexA, int indexB, @ExtractionParam T res)
	{
		if(indexA == indexB)
		{
			res.set(
				v1X,
				v1Y
			);
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res.set(
			rX,
			rY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T swapAssign(@ExtractionParam T v1, int[] indices)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			v1.set(
				v1X,
				v1Y
			);
			
			return v1;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		v1.set(
			rX,
			rY
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T swapAssign(@ExtractionParam T v1, int indexA, int indexB)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(indexA == indexB)
		{
			v1.set(
				v1X,
				v1Y
			);
			
			return v1;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		v1.set(
			rX,
			rY
		);
		
		return v1;
	}
	
	public static float[] swapXY(IVec2RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res[0] = v1Y;
		res[1] = v1X;

		return res;
	}
	
	public static <T extends IVec2WF> T swapXY(IVec2RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			v1Y,
			v1X
		);

		return res;
	}
	
	public static <T extends IVec2WF> T swapXY(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res.set(
			v1Y,
			v1X
		);

		return res;
	}
	
	public static <T extends IVec2WF> T swapXY(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			v1Y,
			v1X
		);

		return res;
	}
	
	public static <T extends IVec2WF> T swapXYAssign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			v1Y,
			v1X
		);

		return v1;
	}
	
	public static float[] integer(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.integer(v1.x());
		res[1] = MathUtils.integer(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T integer(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.integer(v1.x()),
			MathUtils.integer(v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T integer(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.integer(v1[0]),
			MathUtils.integer(v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T integer(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.integer(v1X),
			MathUtils.integer(v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T integerAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.integer(v1.x()),
			MathUtils.integer(v1.y())
		);

		return v1;
	}
	
	public static float[] frac(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.frac(v1.x());
		res[1] = MathUtils.frac(v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T frac(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.frac(v1.x()),
			MathUtils.frac(v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T frac(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.frac(v1[0]),
			MathUtils.frac(v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T frac(float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.frac(v1X),
			MathUtils.frac(v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T fracAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.frac(v1.x()),
			MathUtils.frac(v1.y())
		);

		return v1;
	}
	
	public static float[] sanitizeEps(float tolerance, IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps(tolerance, v1.x());
		res[1] = MathUtils.sanitizeEps(tolerance, v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps(float tolerance, IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps(tolerance, v1.x()),
			MathUtils.sanitizeEps(tolerance, v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps(float tolerance, float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps(tolerance, v1[0]),
			MathUtils.sanitizeEps(tolerance, v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps(float tolerance, float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps(tolerance, v1X),
			MathUtils.sanitizeEps(tolerance, v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEpsAssign(float tolerance, @ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sanitizeEps(tolerance, v1.x()),
			MathUtils.sanitizeEps(tolerance, v1.y())
		);

		return v1;
	}
	
	public static float[] sanitizeEps4f(float tolerance, IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps4(tolerance, v1.x());
		res[1] = MathUtils.sanitizeEps4(tolerance, v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps4(float tolerance, IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps4(tolerance, v1.x()),
			MathUtils.sanitizeEps4(tolerance, v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps4(float tolerance, float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps4(tolerance, v1[0]),
			MathUtils.sanitizeEps4(tolerance, v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps4(float tolerance, float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps4(tolerance, v1X),
			MathUtils.sanitizeEps4(tolerance, v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps4Assign(float tolerance, @ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sanitizeEps4(tolerance, v1.x()),
			MathUtils.sanitizeEps4(tolerance, v1.y())
		);

		return v1;
	}
	
	public static float[] sanitizeEps6(float tolerance, IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps6(tolerance, v1.x());
		res[1] = MathUtils.sanitizeEps6(tolerance, v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps6(float tolerance, IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps6(tolerance, v1.x()),
			MathUtils.sanitizeEps6(tolerance, v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps6(float tolerance, float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps6(tolerance, v1[0]),
			MathUtils.sanitizeEps6(tolerance, v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps6(float tolerance, float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps6(tolerance, v1X),
			MathUtils.sanitizeEps6(tolerance, v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps6Assign(float tolerance, @ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sanitizeEps6(tolerance, v1.x()),
			MathUtils.sanitizeEps6(tolerance, v1.y())
		);

		return v1;
	}
	
	public static float[] sanitizeEps8(float tolerance, IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps8(tolerance, v1.x());
		res[1] = MathUtils.sanitizeEps8(tolerance, v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps8(float tolerance, IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps8(tolerance, v1.x()),
			MathUtils.sanitizeEps8(tolerance, v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps8(float tolerance, float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps8(tolerance, v1[0]),
			MathUtils.sanitizeEps8(tolerance, v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps8(float tolerance, float v1X, float v1Y, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sanitizeEps8(tolerance, v1X),
			MathUtils.sanitizeEps8(tolerance, v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T sanitizeEps8Assign(float tolerance, @ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sanitizeEps8(tolerance, v1.x()),
			MathUtils.sanitizeEps8(tolerance, v1.y())
		);

		return v1;
	}
	
	public static float[] addWeighted(IVec2RF v1, IVec2RF v2, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight.x(), v1.x());
		res[1] = Math.fma(v2.y(), weight.y(), v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, IVec2RF v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight[0], v1.x());
		res[1] = Math.fma(v2.y(), weight[1], v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, IVec2RF v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight, v1.x());
		res[1] = Math.fma(v2.y(), weight, v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, IVec2RF v2, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weightX, v1.x());
		res[1] = Math.fma(v2.y(), weightY, v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, float[] v2, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight.x(), v1.x());
		res[1] = Math.fma(v2[1], weight.y(), v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, float[] v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight[0], v1.x());
		res[1] = Math.fma(v2[1], weight[1], v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, float[] v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight, v1.x());
		res[1] = Math.fma(v2[1], weight, v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, float[] v2, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weightX, v1.x());
		res[1] = Math.fma(v2[1], weightY, v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, float v2X, float v2Y, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weight.x(), v1.x());
		res[1] = Math.fma(v2Y, weight.y(), v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, float v2X, float v2Y, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weight[0], v1.x());
		res[1] = Math.fma(v2Y, weight[1], v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(IVec2RF v1, float v2X, float v2Y, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weightX, v1.x());
		res[1] = Math.fma(v2Y, weightY, v1.y());
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, IVec2RF v2, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight.x(), v1[0]);
		res[1] = Math.fma(v2.y(), weight.y(), v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, IVec2RF v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight[0], v1[0]);
		res[1] = Math.fma(v2.y(), weight[1], v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, IVec2RF v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight, v1[0]);
		res[1] = Math.fma(v2.y(), weight, v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, IVec2RF v2, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weightX, v1[0]);
		res[1] = Math.fma(v2.y(), weightY, v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float[] v2, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight.x(), v1[0]);
		res[1] = Math.fma(v2[1], weight.y(), v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float v2X, float v2Y, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weight.x(), v1[0]);
		res[1] = Math.fma(v2Y, weight.y(), v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, IVec2RF v2, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight.x(), v1X);
		res[1] = Math.fma(v2.y(), weight.y(), v1Y);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, IVec2RF v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight[0], v1X);
		res[1] = Math.fma(v2.y(), weight[1], v1Y);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, IVec2RF v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight, v1X);
		res[1] = Math.fma(v2.y(), weight, v1Y);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, IVec2RF v2, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weightX, v1X);
		res[1] = Math.fma(v2.y(), weightY, v1Y);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float[] v2, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight.x(), v1X);
		res[1] = Math.fma(v2[1], weight.y(), v1Y);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v2X, float v2Y, IVec2RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weight.x(), v1X);
		res[1] = Math.fma(v2Y, weight.y(), v1Y);
		
		return res;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, IVec2RF v2, IVec2RF weight)
	{
		v1[0] = Math.fma(v2.x(), weight.x(), v1[0]);
		v1[1] = Math.fma(v2.y(), weight.y(), v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, IVec2RF v2, float[] weight)
	{
		v1[0] = Math.fma(v2.x(), weight[0], v1[0]);
		v1[1] = Math.fma(v2.y(), weight[1], v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, IVec2RF v2, float weight)
	{
		v1[0] = Math.fma(v2.x(), weight, v1[0]);
		v1[1] = Math.fma(v2.y(), weight, v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, IVec2RF v2, float weightX, float weightY)
	{
		v1[0] = Math.fma(v2.x(), weightX, v1[0]);
		v1[1] = Math.fma(v2.y(), weightY, v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float[] v2, IVec2RF weight)
	{
		v1[0] = Math.fma(v2[0], weight.x(), v1[0]);
		v1[1] = Math.fma(v2[1], weight.y(), v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float v2X, float v2Y, IVec2RF weight)
	{
		v1[0] = Math.fma(v2X, weight.x(), v1[0]);
		v1[1] = Math.fma(v2Y, weight.y(), v1[1]);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, IVec2RF v2, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight.x(), v1.x()),
			Math.fma(v2.y(), weight.x(), v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, IVec2RF v2, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight[0], v1.x()),
			Math.fma(v2.y(), weight[1], v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, IVec2RF v2, float weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight, v1.x()),
			Math.fma(v2.y(), weight, v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, IVec2RF v2, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weightX, v1.x()),
			Math.fma(v2.y(), weightY, v1.y())
		);

		return res;
	}

	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, float[] v2, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight.x(), v1.x()),
			Math.fma(v2[1], weight.x(), v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, float[] v2, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight[0], v1.x()),
			Math.fma(v2[1], weight[1], v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, float[] v2, float weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight, v1.x()),
			Math.fma(v2[1], weight, v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, float[] v2, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weightX, v1.x()),
			Math.fma(v2[1], weightY, v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, float v2X, float v2Y, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weight.x(), v1.x()),
			Math.fma(v2Y, weight.x(), v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, float v2X, float v2Y, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weight[0], v1.x()),
			Math.fma(v2Y, weight[1], v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(IVec2RF v1, float v2X, float v2Y, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weightX, v1.x()),
			Math.fma(v2Y, weightY, v1.y())
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, IVec2RF v2, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight.x(), v1[0]),
			Math.fma(v2.y(), weight.x(), v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, IVec2RF v2, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight[0], v1[0]),
			Math.fma(v2.y(), weight[1], v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, IVec2RF v2, float weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight, v1[0]),
			Math.fma(v2.y(), weight, v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, IVec2RF v2, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weightX, v1[0]),
			Math.fma(v2.y(), weightY, v1[1])
		);

		return res;
	}

	public static <T extends IVec2WF> T addWeighted(float[] v1, float[] v2, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight.x(), v1[0]),
			Math.fma(v2[1], weight.x(), v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, float[] v2, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight[0], v1[0]),
			Math.fma(v2[1], weight[1], v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, float[] v2, float weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight, v1[0]),
			Math.fma(v2[1], weight, v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, float[] v2, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weightX, v1[0]),
			Math.fma(v2[1], weightY, v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, float v2X, float v2Y, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weight.x(), v1[0]),
			Math.fma(v2Y, weight.x(), v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, float v2X, float v2Y, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weight[0], v1[0]),
			Math.fma(v2Y, weight[1], v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float[] v1, float v2X, float v2Y, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weightX, v1[0]),
			Math.fma(v2Y, weightY, v1[1])
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, IVec2RF v2, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight.x(), v1X),
			Math.fma(v2.y(), weight.x(), v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, IVec2RF v2, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight[0], v1X),
			Math.fma(v2.y(), weight[1], v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, IVec2RF v2, float weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weight, v1X),
			Math.fma(v2.y(), weight, v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, IVec2RF v2, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), weightX, v1X),
			Math.fma(v2.y(), weightY, v1Y)
		);

		return res;
	}

	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, float[] v2, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight.x(), v1X),
			Math.fma(v2[1], weight.x(), v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, float[] v2, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight[0], v1X),
			Math.fma(v2[1], weight[1], v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, float[] v2, float weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weight, v1X),
			Math.fma(v2[1], weight, v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, float[] v2, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], weightX, v1X),
			Math.fma(v2[1], weightY, v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, float v2X, float v2Y, IVec2RF weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weight.x(), v1X),
			Math.fma(v2Y, weight.x(), v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, float v2X, float v2Y, float[] weight, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weight[0], v1X),
			Math.fma(v2Y, weight[1], v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeighted(float v1X, float v1Y, float v2X, float v2Y, float weightX, float weightY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, weightX, v1X),
			Math.fma(v2Y, weightY, v1Y)
		);

		return res;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, IVec2RF v2, IVec2RF weight)
	{
		v1.set(
			Math.fma(v2.x(), weight.x(), v1.x()),
			Math.fma(v2.y(), weight.x(), v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, IVec2RF v2, float[] weight)
	{
		v1.set(
			Math.fma(v2.x(), weight[0], v1.x()),
			Math.fma(v2.y(), weight[1], v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, IVec2RF v2, float weight)
	{
		v1.set(
			Math.fma(v2.x(), weight, v1.x()),
			Math.fma(v2.y(), weight, v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, IVec2RF v2, float weightX, float weightY)
	{
		v1.set(
			Math.fma(v2.x(), weightX, v1.x()),
			Math.fma(v2.y(), weightY, v1.y())
		);

		return v1;
	}

	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, float[] v2, IVec2RF weight)
	{
		v1.set(
			Math.fma(v2[0], weight.x(), v1.x()),
			Math.fma(v2[1], weight.x(), v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, float[] v2, float[] weight)
	{
		v1.set(
			Math.fma(v2[0], weight[0], v1.x()),
			Math.fma(v2[1], weight[1], v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, float[] v2, float weight)
	{
		v1.set(
			Math.fma(v2[0], weight, v1.x()),
			Math.fma(v2[1], weight, v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, float[] v2, float weightX, float weightY)
	{
		v1.set(
			Math.fma(v2[0], weightX, v1.x()),
			Math.fma(v2[1], weightY, v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, float v2X, float v2Y, IVec2RF weight)
	{
		v1.set(
			Math.fma(v2X, weight.x(), v1.x()),
			Math.fma(v2Y, weight.x(), v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, float v2X, float v2Y, float[] weight)
	{
		v1.set(
			Math.fma(v2X, weight[0], v1.x()),
			Math.fma(v2Y, weight[1], v1.y())
		);

		return v1;
	}
	
	public static <T extends IVec2WF> T addWeightedAssign(@ExtractionParam T v1, float v2X, float v2Y, float weightX, float weightY)
	{
		v1.set(
			Math.fma(v2X, weightX, v1.x()),
			Math.fma(v2Y, weightY, v1.y())
		);
	
		return v1;
	}
	
}
