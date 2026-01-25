package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public class BaseVecOpsI3F
{
	private BaseVecOpsI3F() { }
	
	public static float[] add(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2.x();
		res[1] = v1.y() + v2.y();
		res[2] = v1.z() + v2.z();
		
		return res;
	}
	
	public static float[] add(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2[0];
		res[1] = v1.y() + v2[1];
		res[2] = v1.z() + v2[2];
		
		return res;
	}
	
	public static float[] add(IVec3RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2;
		res[1] = v1.y() + v2;
		res[2] = v1.z() + v2;
		
		return res;
	}
	
	public static float[] add(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2X;
		res[1] = v1.y() + v2Y;
		res[2] = v1.z() + v2Z;
		
		return res;
	}
	
	public static float[] add(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2.x();
		res[1] = v1[1] + v2.y();
		res[2] = v1[2] + v2.z();
		
		return res;
	}
	
	public static float[] add(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2.x();
		res[1] = v1Y + v2.y();
		res[2] = v1Z + v2.z();
		
		return res;
	}
	
	public static float[] addAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		v1[0] += v2.x();
		v1[1] += v2.y();
		v1[2] += v2.z();
		
		return v1;
	}
	
	public static <T extends IVec3WF> T add(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2.x(),
			v1.y() + v2.y(),
			v1.z() + v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2[0],
			v1.y() + v2[1],
			v1.z() + v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(IVec3RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2,
			v1.y() + v2,
			v1.z() + v2
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2X,
			v1.y() + v2Y,
			v1.z() + v2Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2.x(),
			v1[1] + v2.y(),
			v1[2] + v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2[0],
			v1[1] + v2[1],
			v1[2] + v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2,
			v1[1] + v2,
			v1[2] + v2
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2X,
			v1[1] + v2Y,
			v1[2] + v2Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X + v2.x(),
			v1Y + v2.y(),
			v1Z + v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X + v2[0],
			v1Y + v2[1],
			v1Z + v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(float v1X, float v1Y, float v1Z, float v2, @ExtractionParam T res)
	{
		res.set(
			v1X + v2,
			v1Y + v2,
			v1Z + v2
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T add(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1X + v2X,
			v1Y + v2Y,
			v1Z + v2Z
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T addAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		v1.set(
			v1.x() + v2.x(),
			v1.y() + v2.y(),
			v1.z() + v2.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T addAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() + v2[0],
			v1.y() + v2[1],
			v1.z() + v2[2]
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T addAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() + v2,
			v1.y() + v2,
			v1.z() + v2
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T addAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			v1.x() + v2X,
			v1.y() + v2Y,
			v1.z() + v2Z
		);
		
		return v1;
	}
	
	public static float[] sub(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2.x();
		res[1] = v1.y() - v2.y();
		res[2] = v1.z() - v2.z();
		
		return res;
	}
	
	public static float[] sub(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2[0];
		res[1] = v1.y() - v2[1];
		res[2] = v1.z() - v2[2];
		
		return res;
	}
	
	public static float[] sub(IVec3RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2;
		res[1] = v1.y() - v2;
		res[2] = v1.z() - v2;
		
		return res;
	}
	
	public static float[] sub(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2X;
		res[1] = v1.y() - v2Y;
		res[2] = v1.z() - v2Z;
		
		return res;
	}
	
	public static float[] sub(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2.x();
		res[1] = v1[1] - v2.y();
		res[2] = v1[2] - v2.z();
		
		return res;
	}
	
	public static float[] sub(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2.x();
		res[1] = v1Y - v2.y();
		res[2] = v1Z - v2.z();
		
		return res;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		v1[0] -= v2.x();
		v1[1] -= v2.y();
		v1[2] -= v2.z();
		
		return v1;
	}
	
	public static <T extends IVec3WF> T sub(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2.x(),
			v1.y() - v2.y(),
			v1.z() - v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2[0],
			v1.y() - v2[1],
			v1.z() - v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(IVec3RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2,
			v1.y() - v2,
			v1.z() - v2
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2X,
			v1.y() - v2Y,
			v1.z() - v2Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2.x(),
			v1[1] - v2.y(),
			v1[2] - v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2[0],
			v1[1] - v2[1],
			v1[2] - v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2,
			v1[1] - v2,
			v1[2] - v2
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2X,
			v1[1] - v2Y,
			v1[2] - v2Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X - v2.x(),
			v1Y - v2.y(),
			v1Z - v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X - v2[0],
			v1Y - v2[1],
			v1Z - v2[2]
		);
		
		return res;
	}

	public static <T extends IVec3WF> T sub(float v1X, float v1Y, float v1Z, float v2, @ExtractionParam T res)
	{
		res.set(
			v1X - v2,
			v1Y - v2,
			v1Z - v2
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T sub(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1X - v2X,
			v1Y - v2Y,
			v1Z - v2Z
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T subAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		v1.set(
			v1.x() - v2.x(),
			v1.y() - v2.y(),
			v1.z() - v2.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T subAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() - v2[0],
			v1.y() - v2[1],
			v1.z() - v2[2]
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T subAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() - v2,
			v1.y() - v2,
			v1.z() - v2
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T subAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			v1.x() - v2X,
			v1.y() - v2Y,
			v1.z() - v2Z
		);
		
		return v1;
	}
	
	public static float[] revSub(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1.x();
		res[1] = v2.y() - v1.y();
		res[2] = v2.z() - v1.z();
		
		return res;
	}
	
	public static float[] revSub(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1.x();
		res[1] = v2[1] - v1.y();
		res[2] = v2[2] - v1.z();
		
		return res;
	}
	
	public static float[] revSub(IVec3RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 - v1.x();
		res[1] = v2 - v1.y();
		res[2] = v2 - v1.z();
		
		return res;
	}
	
	public static float[] revSub(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1.x();
		res[1] = v2Y - v1.y();
		res[2] = v2Z - v1.z();
		
		return res;
	}
	
	public static float[] revSub(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1[0];
		res[1] = v2.y() - v1[1];
		res[2] = v2.z() - v1[2];
		
		return res;
	}
	
	public static float[] revSub(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1X;
		res[1] = v2.y() - v1Y;
		res[2] = v2.z() - v1Z;
		
		return res;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		v1[0] = v2.x() - v1[0];
		v1[1] = v2.y() - v1[1];
		v1[2] = v2.z() - v1[2];
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revSub(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1.x(),
			v2.y() - v1.y(),
			v2.z() - v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1.x(),
			v2[1] - v1.y(),
			v2[2] - v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(IVec3RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 - v1.x(),
			v2 - v1.y(),
			v2 - v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v2X - v1.x(),
			v2Y - v1.y(),
			v2Z - v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1[0],
			v2.y() - v1[1],
			v2.z() - v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1[0],
			v2[1] - v1[1],
			v2[2] - v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 - v1[0],
			v2 - v1[1],
			v2 - v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v2X - v1[0],
			v2Y - v1[1],
			v2Z - v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1X,
			v2.y() - v1Y,
			v2.z() - v1Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1X,
			v2[1] - v1Y,
			v2[2] - v1Z
		);
		
		return res;
	}

	public static <T extends IVec3WF> T revSub(float v1X, float v1Y, float v1Z, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 - v1X,
			v2 - v1Y,
			v2 - v1Z
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSub(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v2X - v1X,
			v2Y - v1Y,
			v2Z - v1Z
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		v1.set(
			v2.x() - v1.x(),
			v2.y() - v1.y(),
			v2.z() - v1.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revSubAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v2[0] - v1.x(),
			v2[1] - v1.y(),
			v2[2] - v1.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revSubAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v2 - v1.x(),
			v2 - v1.y(),
			v2 - v1.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revSubAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			v2X - v1.x(),
			v2Y - v1.y(),
			v2Z - v1.z()
		);
		
		return v1;
	}
	
	public static float[] mul(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2.x();
		res[1] = v1.y() * v2.y();
		res[2] = v1.z() * v2.z();
		
		return res;
	}
	
	public static float[] mul(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2[0];
		res[1] = v1.y() * v2[1];
		res[2] = v1.z() * v2[2];
		
		return res;
	}
	
	public static float[] mul(IVec3RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2;
		res[1] = v1.y() * v2;
		res[2] = v1.z() * v2;
		
		return res;
	}
	
	public static float[] mul(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2X;
		res[1] = v1.y() * v2Y;
		res[2] = v1.z() * v2Z;
		
		return res;
	}
	
	public static float[] mul(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2.x();
		res[1] = v1[1] * v2.y();
		res[2] = v1[2] * v2.z();
		
		return res;
	}
	
	public static float[] mul(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X * v2.x();
		res[1] = v1Y * v2.y();
		res[2] = v1Z * v2.z();
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		v1[0] *= v2.x();
		v1[1] *= v2.y();
		v1[2] *= v2.z();
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mul(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2.x(),
			v1.y() * v2.y(),
			v1.z() * v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2[0],
			v1.y() * v2[1],
			v1.z() * v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(IVec3RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2,
			v1.y() * v2,
			v1.z() * v2
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2X,
			v1.y() * v2Y,
			v1.z() * v2Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2.x(),
			v1[1] * v2.y(),
			v1[2] * v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2[0],
			v1[1] * v2[1],
			v1[2] * v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2,
			v1[1] * v2,
			v1[2] * v2
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2X,
			v1[1] * v2Y,
			v1[2] * v2Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X * v2.x(),
			v1Y * v2.y(),
			v1Z * v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X * v2[0],
			v1Y * v2[1],
			v1Z * v2[2]
		);
		
		return res;
	}

	public static <T extends IVec3WF> T mul(float v1X, float v1Y, float v1Z, float v2, @ExtractionParam T res)
	{
		res.set(
			v1X * v2,
			v1Y * v2,
			v1Z * v2
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T mul(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1X * v2X,
			v1Y * v2Y,
			v1Z * v2Z
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		v1.set(
			v1.x() * v2.x(),
			v1.y() * v2.y(),
			v1.z() * v2.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() * v2[0],
			v1.y() * v2[1],
			v1.z() * v2[2]
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() * v2,
			v1.y() * v2,
			v1.z() * v2
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			v1.x() * v2X,
			v1.y() * v2Y,
			v1.z() * v2Z
		);
		
		return v1;
	}
	
	public static float[] div(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2.x();
		res[1] = v1.y() / v2.y();
		res[2] = v1.z() / v2.z();
		
		return res;
	}
	
	public static float[] div(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2[0];
		res[1] = v1.y() / v2[1];
		res[2] = v1.z() / v2[2];
		
		return res;
	}
	
	public static float[] div(IVec3RF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / value;
		res[1] = v1.y() / value;
		res[2] = v1.z() / value;
		
		return res;
	}
	
	public static float[] div(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2X;
		res[1] = v1.y() / v2Y;
		res[2] = v1.z() / v2Z;
		
		return res;
	}
	
	public static float[] div(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2.x();
		res[1] = v1[1] / v2.y();
		res[2] = v1[2] / v2.z();
		
		return res;
	}
	
	public static float[] div(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X / v2.x();
		res[1] = v1Y / v2.y();
		res[2] = v1Z / v2.z();
		
		return res;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		v1[0] /= v2.x();
		v1[1] /= v2.y();
		v1[2] /= v2.z();
		
		return v1;
	}
	
	public static <T extends IVec3WF> T div(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2.x(),
			v1.y() / v2.y(),
			v1.z() / v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2[0],
			v1.y() / v2[1],
			v1.z() / v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(IVec3RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2,
			v1.y() / v2,
			v1.z() / v2
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2X,
			v1.y() / v2Y,
			v1.z() / v2Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2.x(),
			v1[1] / v2.y(),
			v1[2] / v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2[0],
			v1[1] / v2[1],
			v1[2] / v2[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2,
			v1[1] / v2,
			v1[2] / v2
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2X,
			v1[1] / v2Y,
			v1[2] / v2Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X / v2.x(),
			v1Y / v2.y(),
			v1Z / v2.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X / v2[0],
			v1Y / v2[1],
			v1Z / v2[2]
		);
		
		return res;
	}

	public static <T extends IVec3WF> T div(float v1X, float v1Y, float v1Z, float v2, @ExtractionParam T res)
	{
		res.set(
			v1X / v2,
			v1Y / v2,
			v1Z / v2
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T div(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v1X / v2X,
			v1Y / v2Y,
			v1Z / v2Z
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T divAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		v1.set(
			v1.x() / v2.x(),
			v1.y() / v2.y(),
			v1.z() / v2.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T divAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() / v2[0],
			v1.y() / v2[1],
			v1.z() / v2[2]
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T divAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() / v2,
			v1.y() / v2,
			v1.z() / v2
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T divAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			v1.x() / v2X,
			v1.y() / v2Y,
			v1.z() / v2Z
		);
		
		return v1;
	}
	
	public static float[] revDiv(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1.x();
		res[1] = v2.y() / v1.y();
		res[2] = v2.z() / v1.z();
		
		return res;
	}
	
	public static float[] revDiv(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] / v1.x();
		res[1] = v2[1] / v1.y();
		res[2] = v2[2] / v1.z();
		
		return res;
	}
	
	public static float[] revDiv(IVec3RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 / v1.x();
		res[1] = v2 / v1.y();
		res[2] = v2 / v1.z();
		
		return res;
	}
	
	public static float[] revDiv(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v2X / v1.x();
		res[1] = v2Y / v1.y();
		res[2] = v2Z / v1.z();
		
		return res;
	}
	
	public static float[] revDiv(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1[0];
		res[1] = v2.y() / v1[1];
		res[2] = v2.z() / v1[2];
		
		return res;
	}
	
	public static float[] revDiv(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1X;
		res[1] = v2.y() / v1Y;
		res[2] = v2.z() / v1Z;
		
		return res;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		v1[0] = v2.x() / v1[0];
		v1[1] = v2.y() / v1[1];
		v1[2] = v2.z() / v1[2];
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revDiv(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1.x(),
			v2.y() / v1.y(),
			v2.z() / v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1.x(),
			v2[1] / v1.y(),
			v2[2] / v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(IVec3RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 / v1.x(),
			v2 / v1.y(),
			v2 / v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v2X / v1.x(),
			v2Y / v1.y(),
			v2Z / v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1[0],
			v2.y() / v1[1],
			v2.z() / v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1[0],
			v2[1] / v1[1],
			v2[2] / v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 / v1[0],
			v2 / v1[1],
			v2 / v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v2X / v1[0],
			v2Y / v1[1],
			v2Z / v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1X,
			v2.y() / v1Y,
			v2.z() / v1Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1X,
			v2[1] / v1Y,
			v2[2] / v1Z
		);
		
		return res;
	}

	public static <T extends IVec3WF> T revDiv(float v1X, float v1Y, float v1Z, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 / v1X,
			v2 / v1Y,
			v2 / v1Z
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDiv(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			v2X / v1X,
			v2Y / v1Y,
			v2Z / v1Z
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		v1.set(
			v2.x() / v1.x(),
			v2.y() / v1.y(),
			v2.z() / v1.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revDivAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v2[0] / v1.x(),
			v2[1] / v1.y(),
			v2[2] / v1.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revDivAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v2 / v1.x(),
			v2 / v1.y(),
			v2 / v1.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revDivAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			v2X / v1.x(),
			v2Y / v1.y(),
			v2Z / v1.z()
		);
		
		return v1;
	}
	
	public static float[] pow(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2.x());
		res[1] = MathUtils.pow(v1.y(), v2.y());
		res[2] = MathUtils.pow(v1.z(), v2.z());
		
		return res;
	}
	
	public static float[] pow(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2[0]);
		res[1] = MathUtils.pow(v1.y(), v2[1]);
		res[2] = MathUtils.pow(v1.z(), v2[2]);
		
		return res;
	}
	
	public static float[] pow(IVec3RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2);
		res[1] = MathUtils.pow(v1.y(), v2);
		res[2] = MathUtils.pow(v1.z(), v2);
		
		return res;
	}
	
	public static float[] pow(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2X);
		res[1] = MathUtils.pow(v1.y(), v2Y);
		res[2] = MathUtils.pow(v1.z(), v2Z);
		
		return res;
	}
	
	public static float[] pow(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2.x());
		res[1] = MathUtils.pow(v1[1], v2.y());
		res[2] = MathUtils.pow(v1[2], v2.z());
		
		return res;
	}
	
	public static float[] pow(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1X, v2.x());
		res[1] = MathUtils.pow(v1Y, v2.y());
		res[2] = MathUtils.pow(v1Z, v2.z());
		
		return res;
	}

	public static float[] powAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		v1[0] = MathUtils.pow(v1[0], v2.x());
		v1[1] = MathUtils.pow(v1[1], v2.y());
		v1[2] = MathUtils.pow(v1[2], v2.z());
		
		return v1;
	}
	
	public static <T extends IVec3WF> T pow(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2.x()),
			MathUtils.pow(v1.y(), v2.y()),
			MathUtils.pow(v1.z(), v2.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2[0]),
			MathUtils.pow(v1.y(), v2[1]),
			MathUtils.pow(v1.z(), v2[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(IVec3RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2),
			MathUtils.pow(v1.y(), v2),
			MathUtils.pow(v1.z(), v2)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2X),
			MathUtils.pow(v1.y(), v2Y),
			MathUtils.pow(v1.z(), v2Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2.x()),
			MathUtils.pow(v1[1], v2.y()),
			MathUtils.pow(v1[2], v2.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2[0]),
			MathUtils.pow(v1[1], v2[1]),
			MathUtils.pow(v1[2], v2[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2),
			MathUtils.pow(v1[1], v2),
			MathUtils.pow(v1[2], v2)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2X),
			MathUtils.pow(v1[1], v2Y),
			MathUtils.pow(v1[2], v2Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2.x()),
			MathUtils.pow(v1Y, v2.y()),
			MathUtils.pow(v1Z, v2.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2[0]),
			MathUtils.pow(v1Y, v2[1]),
			MathUtils.pow(v1Z, v2[2])
		);
		
		return res;
	}

	public static <T extends IVec3WF> T pow(float v1X, float v1Y, float v1Z, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2),
			MathUtils.pow(v1Y, v2),
			MathUtils.pow(v1Z, v2)
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T pow(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2X),
			MathUtils.pow(v1Y, v2Y),
			MathUtils.pow(v1Z, v2Z)
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T powAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2.x()),
			MathUtils.pow(v1.y(), v2.y()),
			MathUtils.pow(v1.z(), v2.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T powAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2[0]),
			MathUtils.pow(v1.y(), v2[1]),
			MathUtils.pow(v1.z(), v2[2])
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T powAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2),
			MathUtils.pow(v1.y(), v2),
			MathUtils.pow(v1.z(), v2)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T powAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2X),
			MathUtils.pow(v1.y(), v2Y),
			MathUtils.pow(v1.z(), v2Z)
		);
		
		return v1;
	}
	
	public static float[] revPow(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1.x());
		res[1] = MathUtils.pow(v2.y(), v1.y());
		res[2] = MathUtils.pow(v2.z(), v1.z());
		
		return res;
	}
	
	public static float[] revPow(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2[0], v1.x());
		res[1] = MathUtils.pow(v2[1], v1.y());
		res[2] = MathUtils.pow(v2[2], v1.z());
		
		return res;
	}
	
	public static float[] revPow(IVec3RF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(value, v1.x());
		res[1] = MathUtils.pow(value, v1.y());
		res[2] = MathUtils.pow(value, v1.z());
		
		return res;
	}
	
	public static float[] revPow(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2X, v1.x());
		res[1] = MathUtils.pow(v2Y, v1.y());
		res[2] = MathUtils.pow(v2Z, v1.z());
		
		return res;
	}
	
	public static float[] revPow(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1[0]);
		res[1] = MathUtils.pow(v2.y(), v1[1]);
		res[2] = MathUtils.pow(v2.z(), v1[2]);
		
		return res;
	}
	
	public static float[] revPow(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1X);
		res[1] = MathUtils.pow(v2.y(), v1Y);
		res[2] = MathUtils.pow(v2.z(), v1Z);
		
		return res;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		v1[0] = MathUtils.pow(v2.x(), v1[0]);
		v1[1] = MathUtils.pow(v2.y(), v1[1]);
		v1[2] = MathUtils.pow(v2.z(), v1[2]);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revPow(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1.x()),
			MathUtils.pow(v2.y(), v1.y()),
			MathUtils.pow(v2.z(), v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1.x()),
			MathUtils.pow(v2[1], v1.y()),
			MathUtils.pow(v2[2], v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(IVec3RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2, v1.x()),
			MathUtils.pow(v2, v1.y()),
			MathUtils.pow(v2, v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1.x()),
			MathUtils.pow(v2Y, v1.y()),
			MathUtils.pow(v2Z, v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1[0]),
			MathUtils.pow(v2.y(), v1[1]),
			MathUtils.pow(v2.z(), v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1[0]),
			MathUtils.pow(v2[1], v1[1]),
			MathUtils.pow(v2[2], v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2, v1[0]),
			MathUtils.pow(v2, v1[1]),
			MathUtils.pow(v2, v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1[0]),
			MathUtils.pow(v2Y, v1[1]),
			MathUtils.pow(v2Z, v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1X),
			MathUtils.pow(v2.y(), v1Y),
			MathUtils.pow(v2.z(), v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1X),
			MathUtils.pow(v2[1], v1Y),
			MathUtils.pow(v2[2], v1Z)
		);
		
		return res;
	}

	public static <T extends IVec3WF> T revPow(float v1X, float v1Y, float v1Z, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2, v1X),
			MathUtils.pow(v2, v1Y),
			MathUtils.pow(v2, v1Z)
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPow(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1X),
			MathUtils.pow(v2Y, v1Y),
			MathUtils.pow(v2Z, v1Z)
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		v1.set(
			MathUtils.pow(v2.x(), v1.at(0)),
			MathUtils.pow(v2.y(), v1.at(1)),
			MathUtils.pow(v2.z(), v1.at(2))
		);	
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revPowAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			MathUtils.pow(v2[0], v1.at(0)),
			MathUtils.pow(v2[1], v1.at(1)),
			MathUtils.pow(v2[2], v1.at(2))
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revPowAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			MathUtils.pow(v2, v1.at(0)),
			MathUtils.pow(v2, v1.at(1)),
			MathUtils.pow(v2, v1.at(2))
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revPowAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			MathUtils.pow(v2X, v1.at(0)),
			MathUtils.pow(v2Y, v1.at(1)),
			MathUtils.pow(v2Z, v1.at(2))
		);
		
		return v1;
	}
	
	public static float[] sqrt(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(v1.x());
		res[1] = MathUtils.sqrt(v1.y());
		res[2] = MathUtils.sqrt(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrt(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1.x()),
			MathUtils.sqrt(v1.y()),
			MathUtils.sqrt(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1[0]),
			MathUtils.sqrt(v1[1]),
			MathUtils.sqrt(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrt(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1X),
			MathUtils.sqrt(v1Y),
			MathUtils.sqrt(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sqrt(v1.x()),
			MathUtils.sqrt(v1.y()),
			MathUtils.sqrt(v1.z())
		);
		
		return v1;
	}
	
	public static float[] invSqrt(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invSqrt(v1.x());
		res[1] = MathUtils.invSqrt(v1.y());
		res[2] = MathUtils.invSqrt(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrt(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1.x()),
			MathUtils.invSqrt(v1.y()),
			MathUtils.invSqrt(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1[0]),
			MathUtils.invSqrt(v1[1]),
			MathUtils.invSqrt(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrt(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1X),
			MathUtils.invSqrt(v1Y),
			MathUtils.invSqrt(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.invSqrt(v1.x()),
			MathUtils.invSqrt(v1.y()),
			MathUtils.invSqrt(v1.z())
		);
		
		return v1;
	}
	
	public static float[] cbrt(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(v1.x());
		res[1] = MathUtils.cbrt(v1.y());
		res[2] = MathUtils.cbrt(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrt(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1.x()),
			MathUtils.cbrt(v1.y()),
			MathUtils.cbrt(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1[0]),
			MathUtils.cbrt(v1[1]),
			MathUtils.cbrt(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrt(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1X),
			MathUtils.cbrt(v1Y),
			MathUtils.cbrt(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cbrt(v1.x()),
			MathUtils.cbrt(v1.y()),
			MathUtils.cbrt(v1.z())
		);
		
		return v1;
	}
	
	public static float[] invCbrt(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invCbrt(v1.x());
		res[1] = MathUtils.invCbrt(v1.y());
		res[2] = MathUtils.invCbrt(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrt(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1.x()),
			MathUtils.invCbrt(v1.y()),
			MathUtils.invCbrt(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1[0]),
			MathUtils.invCbrt(v1[1]),
			MathUtils.invCbrt(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrt(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1X),
			MathUtils.invCbrt(v1Y),
			MathUtils.invCbrt(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.invCbrt(v1.x()),
			MathUtils.invCbrt(v1.y()),
			MathUtils.invCbrt(v1.z())
		);
		
		return v1;
	}
	
	public static float[] abs(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(v1.x());
		res[1] = Math.abs(v1.y());
		res[2] = Math.abs(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T abs(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1.x()),
			Math.abs(v1.y()),
			Math.abs(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T abs(float[] v1, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1[0]),
			Math.abs(v1[1]),
			Math.abs(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T abs(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1X),
			Math.abs(v1Y),
			Math.abs(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T absAssign(@ExtractionParam T v1)
	{
		v1.set(
			Math.abs(v1.x()),
			Math.abs(v1.y()),
			Math.abs(v1.z())
		);
		
		return v1;
	}
	
	public static float[] reciprocal(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v1.x();
		res[1] = 1.0f / v1.y();
		res[2] = 1.0f / v1.z();
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocal(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1.x(),
			1.0f / v1.y(),
			1.0f / v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocal(float[] v1, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1[0],
			1.0f / v1[1],
			1.0f / v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocal(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1X,
			1.0f / v1Y,
			1.0f / v1Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocalAssign(@ExtractionParam T v1)
	{
		v1.set(
			1.0f / v1.x(),
			1.0f / v1.y(),
			1.0f / v1.z()
		);
		
		return v1;
	}
	
	public static float[] negate(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = -v1.x();
		res[1] = -v1.y();
		res[2] = -v1.z();
		
		return res;
	}
	
	public static <T extends IVec3WF> T negate(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			-v1.x(),
			-v1.y(),
			-v1.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T negate(float[] v1, @ExtractionParam T res)
	{
		res.set(
			-v1[0],
			-v1[1],
			-v1[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T negate(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			-v1X,
			-v1Y,
			-v1Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T negateAssign(@ExtractionParam T v1)
	{
		v1.set(
			-v1.x(),
			-v1.y(),
			-v1.z()
		);
		
		return v1;
	}
	
	public static float[] squared(IVec3RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		res[0] = v1X * v1X;
		res[1] = v1Y * v1Y;
		res[2] = v1Z * v1Z;
		
		return res;
	}
	
	public static <T extends IVec3WF> T squared(IVec3RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		res.set(
			v1X * v1X,
			v1Y * v1Y,
			v1Z * v1Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T squared(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		res.set(
			v1X * v1X,
			v1Y * v1Y,
			v1Z * v1Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T squared(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{	
		res.set(
			v1X * v1X,
			v1Y * v1Y,
			v1Z * v1Z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T squaredAssign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		v1.set(
			v1X * v1X,
			v1Y * v1Y,
			v1Z * v1Z
		);
		
		return v1;
	}
	
	public static float[] sin(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sin(v1.x());
		res[1] = MathUtils.sin(v1.y());
		res[2] = MathUtils.sin(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T sin(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1.x()),
			MathUtils.sin(v1.y()),
			MathUtils.sin(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sin(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1[0]),
			MathUtils.sin(v1[1]),
			MathUtils.sin(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sin(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1X),
			MathUtils.sin(v1Y),
			MathUtils.sin(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sin(v1.x()),
			MathUtils.sin(v1.y()),
			MathUtils.sin(v1.z())
		);
		
		return v1;
	}
	
	public static float[] asin(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.asin(v1.x());
		res[1] = MathUtils.asin(v1.y());
		res[2] = MathUtils.asin(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T asin(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1.x()),
			MathUtils.asin(v1.y()),
			MathUtils.asin(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T asin(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1[0]),
			MathUtils.asin(v1[1]),
			MathUtils.asin(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T asin(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1X),
			MathUtils.asin(v1Y),
			MathUtils.asin(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T asinAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.asin(v1.x()),
			MathUtils.asin(v1.y()),
			MathUtils.asin(v1.z())
		);
		
		return v1;
	}
	
	public static float[] sinh(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sinh(v1.x());
		res[1] = MathUtils.sinh(v1.y());
		res[2] = MathUtils.sinh(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinh(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1.x()),
			MathUtils.sinh(v1.y()),
			MathUtils.sinh(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1[0]),
			MathUtils.sinh(v1[1]),
			MathUtils.sinh(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinh(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1X),
			MathUtils.sinh(v1Y),
			MathUtils.sinh(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinhAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sinh(v1.x()),
			MathUtils.sinh(v1.y()),
			MathUtils.sinh(v1.z())
		);
		
		return v1;
	}
	
	public static float[] cos(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cos(v1.x());
		res[1] = MathUtils.cos(v1.y());
		res[2] = MathUtils.cos(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T cos(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1.x()),
			MathUtils.cos(v1.y()),
			MathUtils.cos(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cos(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1[0]),
			MathUtils.cos(v1[1]),
			MathUtils.cos(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cos(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1X),
			MathUtils.cos(v1Y),
			MathUtils.cos(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cos(v1.x()),
			MathUtils.cos(v1.y()),
			MathUtils.cos(v1.z())
		);
		
		return v1;
	}
	
	public static float[] acos(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.acos(v1.x());
		res[1] = MathUtils.acos(v1.y());
		res[2] = MathUtils.acos(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T acos(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1.x()),
			MathUtils.acos(v1.y()),
			MathUtils.acos(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T acos(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1[0]),
			MathUtils.acos(v1[1]),
			MathUtils.acos(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T acos(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1X),
			MathUtils.acos(v1Y),
			MathUtils.acos(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T acosAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.acos(v1.x()),
			MathUtils.acos(v1.y()),
			MathUtils.acos(v1.z())
		);
		
		return v1;
	}
	
	public static float[] cosh(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cosh(v1.x());
		res[1] = MathUtils.cosh(v1.y());
		res[2] = MathUtils.cosh(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosh(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1.x()),
			MathUtils.cosh(v1.y()),
			MathUtils.cosh(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1[0]),
			MathUtils.cosh(v1[1]),
			MathUtils.cosh(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosh(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1X),
			MathUtils.cosh(v1Y),
			MathUtils.cosh(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T coshAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cosh(v1.x()),
			MathUtils.cosh(v1.y()),
			MathUtils.cosh(v1.z())
		);
		
		return v1;
	}
	
	public static float[] tan(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tan(v1.x());
		res[1] = MathUtils.tan(v1.y());
		res[2] = MathUtils.tan(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T tan(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1.x()),
			MathUtils.tan(v1.y()),
			MathUtils.tan(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tan(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1[0]),
			MathUtils.tan(v1[1]),
			MathUtils.tan(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tan(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1X),
			MathUtils.tan(v1Y),
			MathUtils.tan(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.tan(v1.x()),
			MathUtils.tan(v1.y()),
			MathUtils.tan(v1.z())
		);
		
		return v1;
	}
	
	public static float[] atan(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.atan(v1.x());
		res[1] = MathUtils.atan(v1.y());
		res[2] = MathUtils.atan(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T atan(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1.x()),
			MathUtils.atan(v1.y()),
			MathUtils.atan(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T atan(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1[0]),
			MathUtils.atan(v1[1]),
			MathUtils.atan(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T atan(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1X),
			MathUtils.atan(v1Y),
			MathUtils.atan(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T atanAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.atan(v1.x()),
			MathUtils.atan(v1.y()),
			MathUtils.atan(v1.z())
		);
		
		return v1;
	}
	
	public static float[] tanh(IVec3RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tanh(v1.x());
		res[1] = MathUtils.tanh(v1.y());
		res[2] = MathUtils.tanh(v1.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanh(IVec3RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1.x()),
			MathUtils.tanh(v1.y()),
			MathUtils.tanh(v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1[0]),
			MathUtils.tanh(v1[1]),
			MathUtils.tanh(v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanh(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1X),
			MathUtils.tanh(v1Y),
			MathUtils.tanh(v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanhAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.tanh(v1.x()),
			MathUtils.tanh(v1.y()),
			MathUtils.tanh(v1.z())
		);
		
		return v1;
	}
	
	public static float[] mulAdd(IVec3RF v1, IVec3RF v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2.x(), c.x());
		res[1] = Math.fma(v1.y(), v2.y(), c.y());
		res[2] = Math.fma(v1.z(), v2.z(), c.z());
		
		return res;
	}
	
	public static float[] mulAdd(IVec3RF v1, IVec3RF v2, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2.x(), c[0]);
		res[1] = Math.fma(v1.y(), v2.y(), c[1]);
		res[2] = Math.fma(v1.z(), v2.z(), c[2]);
		
		return res;
	}
	
	public static float[] mulAdd(IVec3RF v1, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2.x(), cX);
		res[1] = Math.fma(v1.y(), v2.y(), cY);
		res[2] = Math.fma(v1.z(), v2.z(), cZ);
		
		return res;
	}
	
	public static float[] mulAdd(IVec3RF v1, float[] v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2[0], c.x());
		res[1] = Math.fma(v1.y(), v2[1], c.y());
		res[2] = Math.fma(v1.z(), v2[2], c.z());
		
		return res;
	}
	
	public static float[] mulAdd(IVec3RF v1, float[] v2, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2[0], c[0]);
		res[1] = Math.fma(v1.y(), v2[1], c[1]);
		res[2] = Math.fma(v1.z(), v2[2], c[2]);
		
		return res;
	}
	
	public static float[] mulAdd(IVec3RF v1, float[] v2, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2[0], cX);
		res[1] = Math.fma(v1.y(), v2[1], cY);
		res[2] = Math.fma(v1.z(), v2[2], cZ);
		
		return res;
	}
	
	public static float[] mulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2X, c.x());
		res[1] = Math.fma(v1.y(), v2Y, c.y());
		res[2] = Math.fma(v1.z(), v2Z, c.z());
		
		return res;
	}
	
	public static float[] mulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2X, c[0]);
		res[1] = Math.fma(v1.y(), v2Y, c[1]);
		res[2] = Math.fma(v1.z(), v2Z, c[2]);
		
		return res;
	}
	
	public static float[] mulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x(), v2X, cX);
		res[1] = Math.fma(v1.y(), v2Y, cY);
		res[2] = Math.fma(v1.z(), v2Z, cZ);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, IVec3RF v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2.x(), c.x());
		res[1] = Math.fma(v1[1], v2.y(), c.y());
		res[2] = Math.fma(v1[2], v2.z(), c.z());
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, IVec3RF v2, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2.x(), c[0]);
		res[1] = Math.fma(v1[1], v2.y(), c[1]);
		res[2] = Math.fma(v1[2], v2.z(), c[2]);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2.x(), cX);
		res[1] = Math.fma(v1[1], v2.y(), cY);
		res[2] = Math.fma(v1[2], v2.z(), cZ);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float[] v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2[0], c.x());
		res[1] = Math.fma(v1[1], v2[1], c.y());
		res[2] = Math.fma(v1[2], v2[2], c.z());
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2X, c.x());
		res[1] = Math.fma(v1[1], v2Y, c.y());
		res[2] = Math.fma(v1[2], v2Z, c.z());
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2.x(), c.x());
		res[1] = Math.fma(v1Y, v2.y(), c.y());
		res[2] = Math.fma(v1Z, v2.z(), c.z());
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2.x(), c[0]);
		res[1] = Math.fma(v1Y, v2.y(), c[1]);
		res[2] = Math.fma(v1Z, v2.z(), c[2]);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2.x(), cX);
		res[1] = Math.fma(v1Y, v2.y(), cY);
		res[2] = Math.fma(v1Z, v2.z(), cZ);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, float[] v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2[0], c.x());
		res[1] = Math.fma(v1Y, v2[1], c.y());
		res[2] = Math.fma(v1Z, v2[2], c.z());
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2X, c.x());
		res[1] = Math.fma(v1Y, v2Y, c.y());
		res[2] = Math.fma(v1Z, v2Z, c.z());
		
		return res;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, IVec3RF v2, IVec3RF c)
	{
		v1[0] = Math.fma(v1[0], v2.x(), c.x());
		v1[1] = Math.fma(v1[1], v2.y(), c.y());
		v1[2] = Math.fma(v1[2], v2.z(), c.z());
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, IVec3RF v2, float[] c)
	{
		v1[0] = Math.fma(v1[0], v2.x(), c[0]);
		v1[1] = Math.fma(v1[1], v2.y(), c[1]);
		v1[2] = Math.fma(v1[2], v2.z(), c[2]);
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, IVec3RF v2, float cX, float cY, float cZ)
	{
		v1[0] = Math.fma(v1[0], v2.x(), cX);
		v1[1] = Math.fma(v1[1], v2.y(), cY);
		v1[2] = Math.fma(v1[2], v2.z(), cZ);
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float[] v2, IVec3RF c)
	{
		v1[0] = Math.fma(v1[0], v2[0], c.x());
		v1[1] = Math.fma(v1[1], v2[1], c.y());
		v1[2] = Math.fma(v1[2], v2[2], c.z());
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, IVec3RF c)
	{
		v1[0] = Math.fma(v1[0], v2X, c.x());
		v1[1] = Math.fma(v1[1], v2Y, c.y());
		v1[2] = Math.fma(v1[2], v2Z, c.z());
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, IVec3RF v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2.x(), c.x()),
			Math.fma(v1.y(), v2.y(), c.y()),
			Math.fma(v1.z(), v2.z(), c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, IVec3RF v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2.x(), c[0]),
			Math.fma(v1.y(), v2.y(), c[1]),
			Math.fma(v1.z(), v2.z(), c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2.x(), cX),
			Math.fma(v1.y(), v2.y(), cY),
			Math.fma(v1.z(), v2.z(), cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, float[] v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2[0], c.x()),
			Math.fma(v1.y(), v2[1], c.y()),
			Math.fma(v1.z(), v2[2], c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, float[] v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2[0], c[0]),
			Math.fma(v1.y(), v2[1], c[1]),
			Math.fma(v1.z(), v2[2], c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, float[] v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2[0], cX),
			Math.fma(v1.y(), v2[1], cY),
			Math.fma(v1.z(), v2[2], cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2X, c.x()),
			Math.fma(v1.y(), v2Y, c.y()),
			Math.fma(v1.z(), v2Z, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2X, c[0]),
			Math.fma(v1.y(), v2Y, c[1]),
			Math.fma(v1.z(), v2Z, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x(), v2X, cX),
			Math.fma(v1.y(), v2Y, cY),
			Math.fma(v1.z(), v2Z, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, IVec3RF v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2.x(), c.x()),
			Math.fma(v1[1], v2.y(), c.y()),
			Math.fma(v1[2], v2.z(), c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, IVec3RF v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2.x(), c[0]),
			Math.fma(v1[1], v2.y(), c[1]),
			Math.fma(v1[2], v2.z(), c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2.x(), cX),
			Math.fma(v1[1], v2.y(), cY),
			Math.fma(v1[2], v2.z(), cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, float[] v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2[0], c.x()),
			Math.fma(v1[1], v2[1], c.y()),
			Math.fma(v1[2], v2[2], c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, float[] v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2[0], c[0]),
			Math.fma(v1[1], v2[1], c[1]),
			Math.fma(v1[2], v2[2], c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, float[] v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2[0], cX),
			Math.fma(v1[1], v2[1], cY),
			Math.fma(v1[2], v2[2], cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2X, c.x()),
			Math.fma(v1[1], v2Y, c.y()),
			Math.fma(v1[2], v2Z, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, float v2X, float v2Y, float v2Z, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2X, c[0]),
			Math.fma(v1[1], v2Y, c[1]),
			Math.fma(v1[2], v2Z, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float[] v1, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0], v2X, cX),
			Math.fma(v1[1], v2Y, cY),
			Math.fma(v1[2], v2Z, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2.x(), c.x()),
			Math.fma(v1Y, v2.y(), c.y()),
			Math.fma(v1Z, v2.z(), c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2.x(), c[0]),
			Math.fma(v1Y, v2.y(), c[1]),
			Math.fma(v1Z, v2.z(), c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2.x(), cX),
			Math.fma(v1Y, v2.y(), cY),
			Math.fma(v1Z, v2.z(), cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, float[] v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2[0], c.x()),
			Math.fma(v1Y, v2[1], c.y()),
			Math.fma(v1Z, v2[2], c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, float[] v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2[0], c[0]),
			Math.fma(v1Y, v2[1], c[1]),
			Math.fma(v1Z, v2[2], c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, float[] v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2[0], cX),
			Math.fma(v1Y, v2[1], cY),
			Math.fma(v1Z, v2[2], cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2X, c.x()),
			Math.fma(v1Y, v2Y, c.y()),
			Math.fma(v1Z, v2Z, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2X, c[0]),
			Math.fma(v1Y, v2Y, c[1]),
			Math.fma(v1Z, v2Z, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X, v2X, cX),
			Math.fma(v1Y, v2Y, cY),
			Math.fma(v1Z, v2Z, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, IVec3RF v2, IVec3RF c)
	{
		v1.set(
			Math.fma(v1.x(), v2.x(), c.x()),
			Math.fma(v1.y(), v2.y(), c.y()),
			Math.fma(v1.z(), v2.z(), c.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, IVec3RF v2, float[] c)
	{
		v1.set(
			Math.fma(v1.x(), v2.x(), c[0]),
			Math.fma(v1.y(), v2.y(), c[1]),
			Math.fma(v1.z(), v2.z(), c[2])
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, IVec3RF v2, float cX, float cY, float cZ)
	{
		v1.set(
			Math.fma(v1.x(), v2.x(), cX),
			Math.fma(v1.y(), v2.y(), cY),
			Math.fma(v1.z(), v2.z(), cZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float[] v2, IVec3RF c)
	{
		v1.set(
			Math.fma(v1.x(), v2[0], c.x()),
			Math.fma(v1.y(), v2[1], c.y()),
			Math.fma(v1.z(), v2[2], c.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float[] v2, float[] c)
	{
		v1.set(
			Math.fma(v1.x(), v2[0], c[0]),
			Math.fma(v1.y(), v2[1], c[1]),
			Math.fma(v1.z(), v2[2], c[2])
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float[] v2, float cX, float cY, float cZ)
	{
		v1.set(
			Math.fma(v1.x(), v2[0], cX),
			Math.fma(v1.y(), v2[1], cY),
			Math.fma(v1.z(), v2[2], cZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float v2, IVec3RF c)
	{
		v1.set(
			Math.fma(v1.x(), v2, c.x()),
			Math.fma(v1.y(), v2, c.y()),
			Math.fma(v1.z(), v2, c.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float v2, float[] c)
	{
		v1.set(
			Math.fma(v1.x(), v2, c[0]),
			Math.fma(v1.y(), v2, c[1]),
			Math.fma(v1.z(), v2, c[2])
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float v2, float cX, float cY, float cZ)
	{
		v1.set(
			Math.fma(v1.x(), v2, cX),
			Math.fma(v1.y(), v2, cY),
			Math.fma(v1.z(), v2, cZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, IVec3RF c)
	{
		v1.set(
			Math.fma(v1.x(), v2X, c.x()),
			Math.fma(v1.y(), v2Y, c.y()),
			Math.fma(v1.z(), v2Z, c.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float[] c)
	{
		v1.set(
			Math.fma(v1.x(), v2X, c[0]),
			Math.fma(v1.y(), v2Y, c[1]),
			Math.fma(v1.z(), v2Z, c[2])
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T mulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ)
	{
		v1.set(
			Math.fma(v1.x(), v2X, cX),
			Math.fma(v1.y(), v2Y, cY),
			Math.fma(v1.z(), v2Z, cZ)
		);
		
		return v1;
	}
	
	public static float[] revMulAdd(IVec3RF v1, IVec3RF v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), c.x(), v1.x());
		res[1] = Math.fma(v2.y(), c.y(), v1.y());
		res[2] = Math.fma(v2.z(), c.z(), v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec3RF v1, IVec3RF v2, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), c[0], v1.x());
		res[1] = Math.fma(v2.y(), c[1], v1.y());
		res[2] = Math.fma(v2.z(), c[2], v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec3RF v1, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), cX, v1.x());
		res[1] = Math.fma(v2.y(), cY, v1.y());
		res[2] = Math.fma(v2.z(), cZ, v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec3RF v1, float[] v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], c.x(), v1.x());
		res[1] = Math.fma(v2[1], c.y(), v1.y());
		res[2] = Math.fma(v2[2], c.z(), v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec3RF v1, float[] v2, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], c[0], v1.x());
		res[1] = Math.fma(v2[1], c[1], v1.y());
		res[2] = Math.fma(v2[2], c[2], v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec3RF v1, float[] v2, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], cX, v1.x());
		res[1] = Math.fma(v2[1], cY, v1.y());
		res[2] = Math.fma(v2[2], cZ, v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, c.x(), v1.x());
		res[1] = Math.fma(v2Y, c.y(), v1.y());
		res[2] = Math.fma(v2Z, c.z(), v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, c[0], v1.x());
		res[1] = Math.fma(v2Y, c[1], v1.y());
		res[2] = Math.fma(v2Z, c[2], v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, cX, v1.x());
		res[1] = Math.fma(v2Y, cY, v1.y());
		res[2] = Math.fma(v2Z, cZ, v1.z());
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, IVec3RF v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), c.x(), v1[0]);
		res[1] = Math.fma(v2.y(), c.y(), v1[1]);
		res[2] = Math.fma(v2.z(), c.z(), v1[2]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, IVec3RF v2, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), c[0], v1[0]);
		res[1] = Math.fma(v2.y(), c[1], v1[1]);
		res[2] = Math.fma(v2.z(), c[2], v1[2]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), cX, v1[0]);
		res[1] = Math.fma(v2.y(), cY, v1[1]);
		res[2] = Math.fma(v2.z(), cZ, v1[2]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float[] v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], c.x(), v1[0]);
		res[1] = Math.fma(v2[1], c.y(), v1[1]);
		res[2] = Math.fma(v2[2], c.z(), v1[2]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, c.x(), v1[0]);
		res[1] = Math.fma(v2Y, c.y(), v1[1]);
		res[2] = Math.fma(v2Z, c.z(), v1[2]);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), c.x(), v1X);
		res[1] = Math.fma(v2.y(), c.y(), v1Y);
		res[2] = Math.fma(v2.z(), c.z(), v1Z);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), c[0], v1X);
		res[1] = Math.fma(v2.y(), c[1], v1Y);
		res[2] = Math.fma(v2.z(), c[2], v1Z);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), cX, v1X);
		res[1] = Math.fma(v2.y(), cY, v1Y);
		res[2] = Math.fma(v2.z(), cZ, v1Z);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, float[] v2, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], c.x(), v1X);
		res[1] = Math.fma(v2[1], c.y(), v1Y);
		res[2] = Math.fma(v2[2], c.z(), v1Z);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, c.x(), v1X);
		res[1] = Math.fma(v2Y, c.y(), v1Y);
		res[2] = Math.fma(v2Z, c.z(), v1Z);
		
		return res;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, IVec3RF v2, IVec3RF c)
	{
		v1[0] = Math.fma(v2.x(), c.x(), v1[0]);
		v1[1] = Math.fma(v2.y(), c.y(), v1[1]);
		v1[2] = Math.fma(v2.z(), c.z(), v1[2]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, IVec3RF v2, float[] c)
	{
		v1[0] = Math.fma(v2.x(), c[0], v1[0]);
		v1[1] = Math.fma(v2.y(), c[1], v1[1]);
		v1[2] = Math.fma(v2.z(), c[2], v1[2]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, IVec3RF v2, float cX, float cY, float cZ)
	{
		v1[0] = Math.fma(v2.x(), cX, v1[0]);
		v1[1] = Math.fma(v2.y(), cY, v1[1]);
		v1[2] = Math.fma(v2.z(), cZ, v1[2]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float[] v2, IVec3RF c)
	{
		v1[0] = Math.fma(v2[0], c.x(), v1[0]);
		v1[1] = Math.fma(v2[1], c.y(), v1[1]);
		v1[2] = Math.fma(v2[2], c.z(), v1[2]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, IVec3RF c)
	{
		v1[0] = Math.fma(v2X, c.x(), v1[0]);
		v1[1] = Math.fma(v2Y, c.y(), v1[1]);
		v1[2] = Math.fma(v2Z, c.z(), v1[2]);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, IVec3RF v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), c.x(), v1.x()),
			Math.fma(v2.y(), c.y(), v1.y()),
			Math.fma(v2.z(), c.z(), v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, IVec3RF v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), c[0], v1.x()),
			Math.fma(v2.y(), c[1], v1.y()),
			Math.fma(v2.z(), c[2], v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), cX, v1.x()),
			Math.fma(v2.y(), cY, v1.y()),
			Math.fma(v2.z(), cZ, v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, float[] v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], c.x(), v1.x()),
			Math.fma(v2[1], c.y(), v1.y()),
			Math.fma(v2[2], c.z(), v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, float[] v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], c[0], v1.x()),
			Math.fma(v2[1], c[1], v1.y()),
			Math.fma(v2[2], c[2], v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, float[] v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], cX, v1.x()),
			Math.fma(v2[1], cY, v1.y()),
			Math.fma(v2[2], cZ, v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, c.x(), v1.x()),
			Math.fma(v2Y, c.y(), v1.y()),
			Math.fma(v2Z, c.z(), v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, c[0], v1.x()),
			Math.fma(v2Y, c[1], v1.y()),
			Math.fma(v2Z, c[2], v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(IVec3RF v1, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, cX, v1.x()),
			Math.fma(v2Y, cY, v1.y()),
			Math.fma(v2Z, cZ, v1.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, IVec3RF v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), c.x(), v1[0]),
			Math.fma(v2.y(), c.y(), v1[1]),
			Math.fma(v2.z(), c.z(), v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, IVec3RF v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), c[0], v1[0]),
			Math.fma(v2.y(), c[1], v1[1]),
			Math.fma(v2.z(), c[2], v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), cX, v1[0]),
			Math.fma(v2.y(), cY, v1[1]),
			Math.fma(v2.z(), cZ, v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, float[] v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], c.x(), v1[0]),
			Math.fma(v2[1], c.y(), v1[1]),
			Math.fma(v2[2], c.z(), v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, float[] v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], c[0], v1[0]),
			Math.fma(v2[1], c[1], v1[1]),
			Math.fma(v2[2], c[2], v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, float[] v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], cX, v1[0]),
			Math.fma(v2[1], cY, v1[1]),
			Math.fma(v2[2], cZ, v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, c.x(), v1[0]),
			Math.fma(v2Y, c.y(), v1[1]),
			Math.fma(v2Z, c.z(), v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, float v2X, float v2Y, float v2Z, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, c[0], v1[0]),
			Math.fma(v2Y, c[1], v1[1]),
			Math.fma(v2Z, c[2], v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float[] v1, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, cX, v1[0]),
			Math.fma(v2Y, cY, v1[1]),
			Math.fma(v2Z, cZ, v1[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), c.x(), v1X),
			Math.fma(v2.y(), c.y(), v1Y),
			Math.fma(v2.z(), c.z(), v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), c[0], v1X),
			Math.fma(v2.y(), c[1], v1Y),
			Math.fma(v2.z(), c[2], v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, IVec3RF v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2.x(), cX, v1X),
			Math.fma(v2.y(), cY, v1Y),
			Math.fma(v2.z(), cZ, v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, float[] v2, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], c.x(), v1X),
			Math.fma(v2[1], c.y(), v1Y),
			Math.fma(v2[2], c.z(), v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, float[] v2, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], c[0], v1X),
			Math.fma(v2[1], c[1], v1Y),
			Math.fma(v2[2], c[2], v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, float[] v2, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2[0], cX, v1X),
			Math.fma(v2[1], cY, v1Y),
			Math.fma(v2[2], cZ, v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, c.x(), v1X),
			Math.fma(v2Y, c.y(), v1Y),
			Math.fma(v2Z, c.z(), v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, c[0], v1X),
			Math.fma(v2Y, c[1], v1Y),
			Math.fma(v2Z, c[2], v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v2X, cX, v1X),
			Math.fma(v2Y, cY, v1Y),
			Math.fma(v2Z, cZ, v1Z)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, IVec3RF v2, IVec3RF c)
	{
		v1.set(
			Math.fma(v2.x(), c.x(), v1.x()),
			Math.fma(v2.y(), c.y(), v1.y()),
			Math.fma(v2.z(), c.z(), v1.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, IVec3RF v2, float[] c)
	{
		v1.set(
			Math.fma(v2.x(), c[0], v1.x()),
			Math.fma(v2.y(), c[1], v1.y()),
			Math.fma(v2.z(), c[2], v1.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, IVec3RF v2, float cX, float cY, float cZ)
	{
		v1.set(
			Math.fma(v2.x(), cX, v1.x()),
			Math.fma(v2.y(), cY, v1.y()),
			Math.fma(v2.z(), cZ, v1.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, float[] v2, IVec3RF c)
	{
		v1.set(
			Math.fma(v2[0], c.x(), v1.x()),
			Math.fma(v2[1], c.y(), v1.y()),
			Math.fma(v2[2], c.z(), v1.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, float[] v2, float[] c)
	{
		v1.set(
			Math.fma(v2[0], c[0], v1.x()),
			Math.fma(v2[1], c[1], v1.y()),
			Math.fma(v2[2], c[2], v1.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, float[] v2, float cX, float cY, float cZ)
	{
		v1.set(
			Math.fma(v2[0], cX, v1.x()),
			Math.fma(v2[1], cY, v1.y()),
			Math.fma(v2[2], cZ, v1.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, IVec3RF c)
	{
		v1.set(
			Math.fma(v2X, c.x(), v1.x()),
			Math.fma(v2Y, c.y(), v1.y()),
			Math.fma(v2Z, c.z(), v1.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float[] c)
	{
		v1.set(
			Math.fma(v2X, c[0], v1.x()),
			Math.fma(v2Y, c[1], v1.y()),
			Math.fma(v2Z, c[2], v1.z())
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T revMulAddAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float cX, float cY, float cZ)
	{
		v1.set(
			Math.fma(v2X, cX, v1.x()),
			Math.fma(v2Y, cY, v1.y()),
			Math.fma(v2Z, cZ, v1.z())
		);
		
		return v1;
	}
	
	public static float[] addWeighted(IVec3RF v1, IVec3RF v2, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight.x(), v1.x());
		res[1] = Math.fma(v2.y(), weight.y(), v1.y());
		res[2] = Math.fma(v2.z(), weight.z(), v1.z());
		
		return res;
	}
	
	public static float[] addWeighted(IVec3RF v1, IVec3RF v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight[0], v1.x());
		res[1] = Math.fma(v2.y(), weight[1], v1.y());
		res[2] = Math.fma(v2.z(), weight[2], v1.z());
		
		return res;
	}
	
	public static float[] addWeighted(IVec3RF v1, IVec3RF v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight, v1.x());
		res[1] = Math.fma(v2.y(), weight, v1.y());
		res[2] = Math.fma(v2.z(), weight, v1.z());
		
		return res;
	}
	
	public static float[] addWeighted(IVec3RF v1, IVec3RF v2, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weightX, v1.x());
		res[1] = Math.fma(v2.y(), weightY, v1.y());
		res[2] = Math.fma(v2.z(), weightZ, v1.z());
		
		return res;
	}
	
	public static float[] addWeighted(IVec3RF v1, float[] v2, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight.x(), v1.x());
		res[1] = Math.fma(v2[1], weight.y(), v1.y());
		res[2] = Math.fma(v2[2], weight.z(), v1.z());
		
		return res;
	}
	
	public static float[] addWeighted(IVec3RF v1, float[] v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight[0], v1.x());
		res[1] = Math.fma(v2[1], weight[1], v1.y());
		res[2] = Math.fma(v2[2], weight[2], v1.z());
		
		return res;
	}
	
	public static float[] addWeighted(IVec3RF v1, float[] v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight, v1.x());
		res[1] = Math.fma(v2[1], weight, v1.y());
		res[2] = Math.fma(v2[2], weight, v1.z());
		
		return res;
	}
	
	public static float[] addWeighted(IVec3RF v1, float[] v2, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weightX, v1.x());
		res[1] = Math.fma(v2[1], weightY, v1.y());
		res[2] = Math.fma(v2[2], weightZ, v1.z());
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, IVec3RF v2, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight.x(), v1[0]);
		res[1] = Math.fma(v2.y(), weight.y(), v1[1]);
		res[2] = Math.fma(v2.z(), weight.z(), v1[2]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, IVec3RF v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight[0], v1[0]);
		res[1] = Math.fma(v2.y(), weight[1], v1[1]);
		res[2] = Math.fma(v2.z(), weight[2], v1[2]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, IVec3RF v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight, v1[0]);
		res[1] = Math.fma(v2.y(), weight, v1[1]);
		res[2] = Math.fma(v2.z(), weight, v1[2]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, IVec3RF v2, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weightX, v1[0]);
		res[1] = Math.fma(v2.y(), weightY, v1[1]);
		res[2] = Math.fma(v2.z(), weightZ, v1[2]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float[] v2, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight.x(), v1[0]);
		res[1] = Math.fma(v2[1], weight.y(), v1[1]);
		res[2] = Math.fma(v2[2], weight.z(), v1[2]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float v2, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2, weight.x(), v1[0]);
		res[1] = Math.fma(v2, weight.y(), v1[1]);
		res[2] = Math.fma(v2, weight.z(), v1[2]);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, IVec3RF v2, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight.x(), v1X);
		res[1] = Math.fma(v2.y(), weight.y(), v1Y);
		res[2] = Math.fma(v2.z(), weight.z(), v1Z);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, IVec3RF v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight[0], v1X);
		res[1] = Math.fma(v2.y(), weight[1], v1Y);
		res[2] = Math.fma(v2.z(), weight[2], v1Z);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, IVec3RF v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weight, v1X);
		res[1] = Math.fma(v2.y(), weight, v1Y);
		res[2] = Math.fma(v2.z(), weight, v1Z);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, IVec3RF v2, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2.x(), weightX, v1X);
		res[1] = Math.fma(v2.y(), weightY, v1Y);
		res[2] = Math.fma(v2.z(), weightZ, v1Z);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, float[] v2, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight.x(), v1X);
		res[1] = Math.fma(v2[1], weight.y(), v1Y);
		res[2] = Math.fma(v2[2], weight.z(), v1Z);
		
		return res;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, IVec3RF v2, IVec3RF weight)
	{
		v1[0] = Math.fma(v2.x(), weight.x(), v1[0]);
		v1[1] = Math.fma(v2.y(), weight.y(), v1[1]);
		v1[2] = Math.fma(v2.z(), weight.z(), v1[2]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, IVec3RF v2, float[] weight)
	{
		v1[0] = Math.fma(v2.x(), weight[0], v1[0]);
		v1[1] = Math.fma(v2.y(), weight[1], v1[1]);
		v1[2] = Math.fma(v2.z(), weight[2], v1[2]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, IVec3RF v2, float weight)
	{
		v1[0] = Math.fma(v2.x(), weight, v1[0]);
		v1[1] = Math.fma(v2.y(), weight, v1[1]);
		v1[2] = Math.fma(v2.z(), weight, v1[2]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, IVec3RF v2, float weightX, float weightY, float weightZ)
	{
		v1[0] = Math.fma(v2.x(), weightX, v1[0]);
		v1[1] = Math.fma(v2.y(), weightY, v1[1]);
		v1[2] = Math.fma(v2.z(), weightZ, v1[2]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float[] v2, IVec3RF weight)
	{
		v1[0] = Math.fma(v2[0], weight.x(), v1[0]);
		v1[1] = Math.fma(v2[1], weight.y(), v1[1]);
		v1[2] = Math.fma(v2[2], weight.z(), v1[2]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, IVec3RF weight)
	{
		v1[0] = Math.fma(v2X, weight.x(), v1[0]);
		v1[1] = Math.fma(v2Y, weight.y(), v1[1]);
		v1[2] = Math.fma(v2Z, weight.z(), v1[2]);
		
		return v1;
	}
	
}
