package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public class BaseVecOpsI4F
{
	private BaseVecOpsI4F() { }
	
	public static float[] add(IVec4RF v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2.x();
		res[1] = v1.y() + v2.y();
		res[2] = v1.z() + v2.z();
		res[3] = v1.w() + v2.w();
		
		return res;
	}
	
	public static float[] add(IVec4RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2[0];
		res[1] = v1.y() + v2[1];
		res[2] = v1.z() + v2[2];
		res[3] = v1.w() + v2[3];
		
		return res;
	}
	
	public static float[] add(IVec4RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2;
		res[1] = v1.y() + v2;
		res[2] = v1.z() + v2;
		res[3] = v1.w() + v2;
		
		return res;
	}
	
	public static float[] add(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1.x() + v2X;
		res[1] = v1.y() + v2Y;
		res[2] = v1.z() + v2Z;
		res[3] = v1.w() + v2W;
		
		return res;
	}
	
	public static float[] add(float[] v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2.x();
		res[1] = v1[1] + v2.y();
		res[2] = v1[2] + v2.z();
		res[3] = v1[3] + v2.w();
		
		return res;
	}
	
	public static float[] add(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2.x();
		res[1] = v1Y + v2.y();
		res[2] = aZ + v2.z();
		res[3] = aW + v2.w();
		
		return res;
	}
	
	public static float[] addAssign(@ExtractionParam float[] v1, IVec4RF v2)
	{
		v1[0] += v2.x();
		v1[1] += v2.y();
		v1[2] += v2.z();
		v1[3] += v2.w();
		
		return v1;
	}
	
	public static <T extends IVec4WF> T add(IVec4RF v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2.x(),
			v1.y() + v2.y(),
			v1.z() + v2.z(),
			v1.w() + v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(IVec4RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2[0],
			v1.y() + v2[1],
			v1.z() + v2[2],
			v1.w() + v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(IVec4RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2,
			v1.y() + v2,
			v1.z() + v2,
			v1.w() + v2
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1.x() + v2X,
			v1.y() + v2Y,
			v1.z() + v2Z,
			v1.w() + v2W
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(float[] v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2.x(),
			v1[1] + v2.y(),
			v1[2] + v2.z(),
			v1[3] + v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2[0],
			v1[1] + v2[1],
			v1[2] + v2[2],
			v1[3] + v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2,
			v1[1] + v2,
			v1[2] + v2,
			v1[3] + v2
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1[0] + v2X,
			v1[1] + v2Y,
			v1[2] + v2Z,
			v1[3] + v2W
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X + v2.x(),
			v1Y + v2.y(),
			aZ + v2.z(),
			aW + v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(float v1X, float v1Y, float aZ, float aW, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X + v2[0],
			v1Y + v2[1],
			aZ + v2[2],
			aW + v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(float v1X, float v1Y, float aZ, float aW, float v2, @ExtractionParam T res)
	{
		res.set(
			v1X + v2,
			v1Y + v2,
			aZ + v2,
			aW + v2
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T add(float v1X, float v1Y, float aZ, float aW, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1X + v2X,
			v1Y + v2Y,
			aZ + v2Z,
			aW + v2W
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T addAssign(@ExtractionParam T v1, IVec4RF v2)
	{
		v1.set(
			v1.x() + v2.x(),
			v1.y() + v2.y(),
			v1.z() + v2.z(),
			v1.w() + v2.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T addAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() + v2[0],
			v1.y() + v2[1],
			v1.z() + v2[2],
			v1.w() + v2[3]
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T addAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() + v2,
			v1.y() + v2,
			v1.z() + v2,
			v1.w() + v2
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T addAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1.set(
			v1.x() + v2X,
			v1.y() + v2Y,
			v1.z() + v2Z,
			v1.w() + v2W
		);
		
		return v1;
	}
	
	public static float[] sub(IVec4RF v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2.x();
		res[1] = v1.y() - v2.y();
		res[2] = v1.z() - v2.z();
		res[3] = v1.w() - v2.w();
		
		return res;
	}
	
	public static float[] sub(IVec4RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2[0];
		res[1] = v1.y() - v2[1];
		res[2] = v1.z() - v2[2];
		res[3] = v1.w() - v2[3];
		
		return res;
	}
	
	public static float[] sub(IVec4RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2;
		res[1] = v1.y() - v2;
		res[2] = v1.z() - v2;
		res[3] = v1.w() - v2;
		
		return res;
	}
	
	public static float[] sub(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1.x() - v2X;
		res[1] = v1.y() - v2Y;
		res[2] = v1.z() - v2Z;
		res[3] = v1.w() - v2W;
		
		return res;
	}
	
	public static float[] sub(float[] v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2.x();
		res[1] = v1[1] - v2.y();
		res[2] = v1[2] - v2.z();
		res[3] = v1[3] - v2.w();
		
		return res;
	}
	
	public static float[] sub(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2.x();
		res[1] = v1Y - v2.y();
		res[2] = aZ - v2.z();
		res[3] = aW - v2.w();
		
		return res;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, IVec4RF v2)
	{
		v1[0] -= v2.x();
		v1[1] -= v2.y();
		v1[2] -= v2.z();
		v1[3] -= v2.w();
		
		return v1;
	}
	
	public static <T extends IVec4WF> T sub(IVec4RF v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2.x(),
			v1.y() - v2.y(),
			v1.z() - v2.z(),
			v1.w() - v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(IVec4RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2[0],
			v1.y() - v2[1],
			v1.z() - v2[2],
			v1.w() - v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(IVec4RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2,
			v1.y() - v2,
			v1.z() - v2,
			v1.w() - v2
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1.x() - v2X,
			v1.y() - v2Y,
			v1.z() - v2Z,
			v1.w() - v2W
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(float[] v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2.x(),
			v1[1] - v2.y(),
			v1[2] - v2.z(),
			v1[3] - v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2[0],
			v1[1] - v2[1],
			v1[2] - v2[2],
			v1[3] - v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2,
			v1[1] - v2,
			v1[2] - v2,
			v1[3] - v2
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1[0] - v2X,
			v1[1] - v2Y,
			v1[2] - v2Z,
			v1[3] - v2W
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X - v2.x(),
			v1Y - v2.y(),
			aZ - v2.z(),
			aW - v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(float v1X, float v1Y, float aZ, float aW, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X - v2[0],
			v1Y - v2[1],
			aZ - v2[2],
			aW - v2[3]
		);
		
		return res;
	}

	public static <T extends IVec4WF> T sub(float v1X, float v1Y, float aZ, float aW, float v2, @ExtractionParam T res)
	{
		res.set(
			v1X - v2,
			v1Y - v2,
			aZ - v2,
			aW - v2
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T sub(float v1X, float v1Y, float aZ, float aW, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1X - v2X,
			v1Y - v2Y,
			aZ - v2Z,
			aW - v2W
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T subAssign(@ExtractionParam T v1, IVec4RF v2)
	{
		v1.set(
			v1.x() - v2.x(),
			v1.y() - v2.y(),
			v1.z() - v2.z(),
			v1.w() - v2.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T subAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() - v2[0],
			v1.y() - v2[1],
			v1.z() - v2[2],
			v1.w() - v2[3]
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T subAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() - v2,
			v1.y() - v2,
			v1.z() - v2,
			v1.w() - v2
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T subAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1.set(
			v1.x() - v2X,
			v1.y() - v2Y,
			v1.z() - v2Z,
			v1.w() - v2W
		);
		
		return v1;
	}
	
	public static float[] revSub(IVec4RF v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1.x();
		res[1] = v2.y() - v1.y();
		res[2] = v2.z() - v1.z();
		res[3] = v2.w() - v1.w();
		
		return res;
	}
	
	public static float[] revSub(IVec4RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1.x();
		res[1] = v2[1] - v1.y();
		res[2] = v2[2] - v1.z();
		res[3] = v2[3] - v1.w();
		
		return res;
	}
	
	public static float[] revSub(IVec4RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 - v1.x();
		res[1] = v2 - v1.y();
		res[2] = v2 - v1.z();
		res[3] = v2 - v1.w();
		
		return res;
	}
	
	public static float[] revSub(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1.x();
		res[1] = v2Y - v1.y();
		res[2] = v2Z - v1.z();
		res[3] = v2W - v1.w();
		
		return res;
	}
	
	public static float[] revSub(float[] v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1[0];
		res[1] = v2.y() - v1[1];
		res[2] = v2.z() - v1[2];
		res[3] = v2.w() - v1[3];
		
		return res;
	}
	
	public static float[] revSub(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() - v1X;
		res[1] = v2.y() - v1Y;
		res[2] = v2.z() - aZ;
		res[3] = v2.w() - aW;
		
		return res;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, IVec4RF v2)
	{
		v1[0] = v2.x() - v1[0];
		v1[1] = v2.y() - v1[1];
		v1[2] = v2.z() - v1[2];
		v1[3] = v2.w() - v1[3];
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revSub(IVec4RF v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1.x(),
			v2.y() - v1.y(),
			v2.z() - v1.z(),
			v2.w() - v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(IVec4RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1.x(),
			v2[1] - v1.y(),
			v2[2] - v1.z(),
			v2[3] - v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(IVec4RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 - v1.x(),
			v2 - v1.y(),
			v2 - v1.z(),
			v2 - v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v2X - v1.x(),
			v2Y - v1.y(),
			v2Z - v1.z(),
			v2W - v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(float[] v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1[0],
			v2.y() - v1[1],
			v2.z() - v1[2],
			v2.w() - v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1[0],
			v2[1] - v1[1],
			v2[2] - v1[2],
			v2[3] - v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 - v1[0],
			v2 - v1[1],
			v2 - v1[2],
			v2 - v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v2X - v1[0],
			v2Y - v1[1],
			v2Z - v1[2],
			v2W - v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() - v1X,
			v2.y() - v1Y,
			v2.z() - aZ,
			v2.w() - aW
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(float v1X, float v1Y, float aZ, float aW, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] - v1X,
			v2[1] - v1Y,
			v2[2] - aZ,
			v2[3] - aW
		);
		
		return res;
	}

	public static <T extends IVec4WF> T revSub(float v1X, float v1Y, float aZ, float aW, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 - v1X,
			v2 - v1Y,
			v2 - aZ,
			v2 - aW
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSub(float v1X, float v1Y, float aZ, float aW, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v2X - v1X,
			v2Y - v1Y,
			v2Z - aZ,
			v2W - aW
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T revSubAssign(@ExtractionParam T v1, IVec4RF v2)
	{
		v1.set(
			v2.x() - v1.x(),
			v2.y() - v1.y(),
			v2.z() - v1.z(),
			v2.w() - v1.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revSubAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v2[0] - v1.x(),
			v2[1] - v1.y(),
			v2[2] - v1.z(),
			v2[3] - v1.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revSubAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v2 - v1.x(),
			v2 - v1.y(),
			v2 - v1.z(),
			v2 - v1.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revSubAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1.set(
			v2X - v1.x(),
			v2Y - v1.y(),
			v2Z - v1.z(),
			v2W - v1.w()
		);
		
		return v1;
	}
	
	public static float[] mul(IVec4RF v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2.x();
		res[1] = v1.y() * v2.y();
		res[2] = v1.z() * v2.z();
		res[3] = v1.w() * v2.w();
		
		return res;
	}
	
	public static float[] mul(IVec4RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2[0];
		res[1] = v1.y() * v2[1];
		res[2] = v1.z() * v2[2];
		res[3] = v1.w() * v2[3];
		
		return res;
	}
	
	public static float[] mul(IVec4RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2;
		res[1] = v1.y() * v2;
		res[2] = v1.z() * v2;
		res[3] = v1.w() * v2;
		
		return res;
	}
	
	public static float[] mul(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * v2X;
		res[1] = v1.y() * v2Y;
		res[2] = v1.z() * v2Z;
		res[3] = v1.w() * v2W;
		
		return res;
	}
	
	public static float[] mul(float[] v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2.x();
		res[1] = v1[1] * v2.y();
		res[2] = v1[2] * v2.z();
		res[3] = v1[3] * v2.w();
		
		return res;
	}
	
	public static float[] mul(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X * v2.x();
		res[1] = v1Y * v2.y();
		res[2] = aZ * v2.z();
		res[3] = aW * v2.w();
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, IVec4RF v2)
	{
		v1[0] *= v2.x();
		v1[1] *= v2.y();
		v1[2] *= v2.z();
		v1[3] *= v2.w();
		
		return v1;
	}
	
	public static <T extends IVec4WF> T mul(IVec4RF v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2.x(),
			v1.y() * v2.y(),
			v1.z() * v2.z(),
			v1.w() * v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(IVec4RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2[0],
			v1.y() * v2[1],
			v1.z() * v2[2],
			v1.w() * v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(IVec4RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2,
			v1.y() * v2,
			v1.z() * v2,
			v1.w() * v2
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1.x() * v2X,
			v1.y() * v2Y,
			v1.z() * v2Z,
			v1.w() * v2W
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(float[] v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2.x(),
			v1[1] * v2.y(),
			v1[2] * v2.z(),
			v1[3] * v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2[0],
			v1[1] * v2[1],
			v1[2] * v2[2],
			v1[3] * v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2,
			v1[1] * v2,
			v1[2] * v2,
			v1[3] * v2
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1[0] * v2X,
			v1[1] * v2Y,
			v1[2] * v2Z,
			v1[3] * v2W
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X * v2.x(),
			v1Y * v2.y(),
			aZ * v2.z(),
			aW * v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(float v1X, float v1Y, float aZ, float aW, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X * v2[0],
			v1Y * v2[1],
			aZ * v2[2],
			aW * v2[3]
		);
		
		return res;
	}

	public static <T extends IVec4WF> T mul(float v1X, float v1Y, float aZ, float aW, float v2, @ExtractionParam T res)
	{
		res.set(
			v1X * v2,
			v1Y * v2,
			aZ * v2,
			aW * v2
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T mul(float v1X, float v1Y, float aZ, float aW, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1X * v2X,
			v1Y * v2Y,
			aZ * v2Z,
			aW * v2W
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T mulAssign(@ExtractionParam T v1, IVec4RF v2)
	{
		v1.set(
			v1.x() * v2.x(),
			v1.y() * v2.y(),
			v1.z() * v2.z(),
			v1.w() * v2.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T mulAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() * v2[0],
			v1.y() * v2[1],
			v1.z() * v2[2],
			v1.w() * v2[3]
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T mulAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() * v2,
			v1.y() * v2,
			v1.z() * v2,
			v1.w() * v2
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T mulAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1.set(
			v1.x() * v2X,
			v1.y() * v2Y,
			v1.z() * v2Z,
			v1.w() * v2W
		);
		
		return v1;
	}
	
	public static float[] div(IVec4RF v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2.x();
		res[1] = v1.y() / v2.y();
		res[2] = v1.z() / v2.z();
		res[2] = v1.w() / v2.w();
		
		return res;
	}
	
	public static float[] div(IVec4RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2[0];
		res[1] = v1.y() / v2[1];
		res[2] = v1.z() / v2[2];
		res[3] = v1.w() / v2[3];
		
		return res;
	}
	
	public static float[] div(IVec4RF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / value;
		res[1] = v1.y() / value;
		res[2] = v1.z() / value;
		res[3] = v1.w() / value;
		
		return res;
	}
	
	public static float[] div(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1.x() / v2X;
		res[1] = v1.y() / v2Y;
		res[2] = v1.z() / v2Z;
		res[3] = v1.w() / v2W;
		
		return res;
	}
	
	public static float[] div(float[] v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2.x();
		res[1] = v1[1] / v2.y();
		res[2] = v1[2] / v2.z();
		res[3] = v1[3] / v2.w();
		
		return res;
	}
	
	public static float[] div(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1X / v2.x();
		res[1] = v1Y / v2.y();
		res[2] = aZ / v2.z();
		res[3] = aW / v2.w();
		
		return res;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, IVec4RF v2)
	{
		v1[0] /= v2.x();
		v1[1] /= v2.y();
		v1[2] /= v2.z();
		v1[3] /= v2.w();
		
		return v1;
	}
	
	public static <T extends IVec4WF> T div(IVec4RF v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2.x(),
			v1.y() / v2.y(),
			v1.z() / v2.z(),
			v1.w() / v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(IVec4RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2[0],
			v1.y() / v2[1],
			v1.z() / v2[2],
			v1.w() / v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(IVec4RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2,
			v1.y() / v2,
			v1.z() / v2,
			v1.w() / v2
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1.x() / v2X,
			v1.y() / v2Y,
			v1.z() / v2Z,
			v1.w() / v2W
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(float[] v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2.x(),
			v1[1] / v2.y(),
			v1[2] / v2.z(),
			v1[3] / v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2[0],
			v1[1] / v2[1],
			v1[2] / v2[2],
			v1[3] / v2[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2,
			v1[1] / v2,
			v1[2] / v2,
			v1[3] / v2
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1[0] / v2X,
			v1[1] / v2Y,
			v1[2] / v2Z,
			v1[3] / v2W
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v1X / v2.x(),
			v1Y / v2.y(),
			aZ / v2.z(),
			aW / v2.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(float v1X, float v1Y, float aZ, float aW, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v1X / v2[0],
			v1Y / v2[1],
			aZ / v2[2],
			aW / v2[3]
		);
		
		return res;
	}

	public static <T extends IVec4WF> T div(float v1X, float v1Y, float aZ, float aW, float v2, @ExtractionParam T res)
	{
		res.set(
			v1X / v2,
			v1Y / v2,
			aZ / v2,
			aW / v2
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T div(float v1X, float v1Y, float aZ, float aW, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v1X / v2X,
			v1Y / v2Y,
			aZ / v2Z,
			aW / v2W
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T divAssign(@ExtractionParam T v1, IVec4RF v2)
	{
		v1.set(
			v1.x() / v2.x(),
			v1.y() / v2.y(),
			v1.z() / v2.z(),
			v1.w() / v2.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T divAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v1.x() / v2[0],
			v1.y() / v2[1],
			v1.z() / v2[2],
			v1.w() / v2[3]
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T divAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v1.x() / v2,
			v1.y() / v2,
			v1.z() / v2,
			v1.w() / v2
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T divAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1.set(
			v1.x() / v2X,
			v1.y() / v2Y,
			v1.z() / v2Z,
			v1.w() / v2W
		);
		
		return v1;
	}
	
	public static float[] revDiv(IVec4RF v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1.x();
		res[1] = v2.y() / v1.y();
		res[2] = v2.z() / v1.z();
		res[3] = v2.w() / v1.w();
		
		return res;
	}
	
	public static float[] revDiv(IVec4RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] / v1.x();
		res[1] = v2[1] / v1.y();
		res[2] = v2[2] / v1.z();
		res[3] = v2[3] / v1.w();
		
		return res;
	}
	
	public static float[] revDiv(IVec4RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 / v1.x();
		res[1] = v2 / v1.y();
		res[2] = v2 / v1.z();
		res[3] = v2 / v1.w();
		
		return res;
	}
	
	public static float[] revDiv(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v2X / v1.x();
		res[1] = v2Y / v1.y();
		res[2] = v2Z / v1.z();
		res[3] = v2W / v1.w();
		
		return res;
	}
	
	public static float[] revDiv(float[] v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1[0];
		res[1] = v2.y() / v1[1];
		res[2] = v2.z() / v1[2];
		res[3] = v2.w() / v1[3];
		
		return res;
	}
	
	public static float[] revDiv(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = v2.x() / v1X;
		res[1] = v2.y() / v1Y;
		res[2] = v2.z() / aZ;
		res[3] = v2.w() / aW;
		
		return res;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, IVec4RF v2)
	{
		v1[0] = v2.x() / v1[0];
		v1[1] = v2.y() / v1[1];
		v1[2] = v2.z() / v1[2];
		v1[3] = v2.w() / v1[3];
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revDiv(IVec4RF v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1.x(),
			v2.y() / v1.y(),
			v2.z() / v1.z(),
			v2.w() / v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(IVec4RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1.x(),
			v2[1] / v1.y(),
			v2[2] / v1.z(),
			v2[3] / v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(IVec4RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 / v1.x(),
			v2 / v1.y(),
			v2 / v1.z(),
			v2 / v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v2X / v1.x(),
			v2Y / v1.y(),
			v2Z / v1.z(),
			v2W / v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(float[] v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1[0],
			v2.y() / v1[1],
			v2.z() / v1[2],
			v2.w() / v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1[0],
			v2[1] / v1[1],
			v2[2] / v1[2],
			v2[3] / v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 / v1[0],
			v2 / v1[1],
			v2 / v1[2],
			v2 / v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v2X / v1[0],
			v2Y / v1[1],
			v2Z / v1[2],
			v2W / v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			v2.x() / v1X,
			v2.y() / v1Y,
			v2.z() / aZ,
			v2.w() / aW
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(float v1X, float v1Y, float aZ, float aW, float[] v2, @ExtractionParam T res)
	{
		res.set(
			v2[0] / v1X,
			v2[1] / v1Y,
			v2[2] / aZ,
			v2[3] / aW
		);
		
		return res;
	}

	public static <T extends IVec4WF> T revDiv(float v1X, float v1Y, float aZ, float aW, float v2, @ExtractionParam T res)
	{
		res.set(
			v2 / v1X,
			v2 / v1Y,
			v2 / aZ,
			v2 / aW
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDiv(float v1X, float v1Y, float aZ, float aW, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			v2X / v1X,
			v2Y / v1Y,
			v2Z / aZ,
			v2W / aW
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T revDivAssign(@ExtractionParam T v1, IVec4RF v2)
	{
		v1.set(
			v2.x() / v1.x(),
			v2.y() / v1.y(),
			v2.z() / v1.z(),
			v2.w() / v1.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revDivAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			v2[0] / v1.x(),
			v2[1] / v1.y(),
			v2[2] / v1.z(),
			v2[3] / v1.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revDivAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			v2 / v1.x(),
			v2 / v1.y(),
			v2 / v1.z(),
			v2 / v1.w()
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revDivAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1.set(
			v2X / v1.x(),
			v2Y / v1.y(),
			v2Z / v1.z(),
			v2W / v1.w()
		);
		
		return v1;
	}
	
	public static float[] pow(IVec4RF v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2.x());
		res[1] = MathUtils.pow(v1.y(), v2.y());
		res[2] = MathUtils.pow(v1.z(), v2.z());
		res[3] = MathUtils.pow(v1.w(), v2.w());
		
		return res;
	}
	
	public static float[] pow(IVec4RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2[0]);
		res[1] = MathUtils.pow(v1.y(), v2[1]);
		res[2] = MathUtils.pow(v1.z(), v2[2]);
		res[3] = MathUtils.pow(v1.w(), v2[3]);
		
		return res;
	}
	
	public static float[] pow(IVec4RF v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2);
		res[1] = MathUtils.pow(v1.y(), v2);
		res[2] = MathUtils.pow(v1.z(), v2);
		res[3] = MathUtils.pow(v1.w(), v2);
		
		return res;
	}
	
	public static float[] pow(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1.x(), v2X);
		res[1] = MathUtils.pow(v1.y(), v2Y);
		res[2] = MathUtils.pow(v1.z(), v2Z);
		res[3] = MathUtils.pow(v1.w(), v2W);
		
		return res;
	}
	
	public static float[] pow(float[] v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2.x());
		res[1] = MathUtils.pow(v1[1], v2.y());
		res[2] = MathUtils.pow(v1[2], v2.z());
		res[3] = MathUtils.pow(v1[3], v2.w());
		
		return res;
	}
	
	public static float[] pow(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1X, v2.x());
		res[1] = MathUtils.pow(v1Y, v2.y());
		res[2] = MathUtils.pow(aZ, v2.z());
		res[3] = MathUtils.pow(aW, v2.w());
		
		return res;
	}

	public static float[] powAssign(@ExtractionParam float[] v1, IVec4RF v2)
	{
		v1[0] = MathUtils.pow(v1[0], v2.x());
		v1[1] = MathUtils.pow(v1[1], v2.y());
		v1[2] = MathUtils.pow(v1[2], v2.z());
		v1[3] = MathUtils.pow(v1[3], v2.w());
		
		return v1;
	}
	
	public static <T extends IVec4WF> T pow(IVec4RF v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2.x()),
			MathUtils.pow(v1.y(), v2.y()),
			MathUtils.pow(v1.z(), v2.z()),
			MathUtils.pow(v1.w(), v2.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(IVec4RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2[0]),
			MathUtils.pow(v1.y(), v2[1]),
			MathUtils.pow(v1.z(), v2[2]),
			MathUtils.pow(v1.w(), v2[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(IVec4RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2),
			MathUtils.pow(v1.y(), v2),
			MathUtils.pow(v1.z(), v2),
			MathUtils.pow(v1.w(), v2)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1.x(), v2X),
			MathUtils.pow(v1.y(), v2Y),
			MathUtils.pow(v1.z(), v2Z),
			MathUtils.pow(v1.w(), v2W)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(float[] v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2.x()),
			MathUtils.pow(v1[1], v2.y()),
			MathUtils.pow(v1[2], v2.z()),
			MathUtils.pow(v1[3], v2.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2[0]),
			MathUtils.pow(v1[1], v2[1]),
			MathUtils.pow(v1[2], v2[2]),
			MathUtils.pow(v1[3], v2[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2),
			MathUtils.pow(v1[1], v2),
			MathUtils.pow(v1[2], v2),
			MathUtils.pow(v1[3], v2)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1[0], v2X),
			MathUtils.pow(v1[1], v2Y),
			MathUtils.pow(v1[2], v2Z),
			MathUtils.pow(v1[3], v2W)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2.x()),
			MathUtils.pow(v1Y, v2.y()),
			MathUtils.pow(aZ, v2.z()),
			MathUtils.pow(aW, v2.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(float v1X, float v1Y, float aZ, float aW, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2[0]),
			MathUtils.pow(v1Y, v2[1]),
			MathUtils.pow(aZ, v2[2]),
			MathUtils.pow(aW, v2[3])
		);
		
		return res;
	}

	public static <T extends IVec4WF> T pow(float v1X, float v1Y, float aZ, float aW, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2),
			MathUtils.pow(v1Y, v2),
			MathUtils.pow(aZ, v2),
			MathUtils.pow(aW, v2)
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T pow(float v1X, float v1Y, float aZ, float aW, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v1X, v2X),
			MathUtils.pow(v1Y, v2Y),
			MathUtils.pow(aZ, v2Z),
			MathUtils.pow(aW, v2W)
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T powAssign(@ExtractionParam T v1, IVec4RF v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2.x()),
			MathUtils.pow(v1.y(), v2.y()),
			MathUtils.pow(v1.z(), v2.z()),
			MathUtils.pow(v1.w(), v2.w())
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T powAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2[0]),
			MathUtils.pow(v1.y(), v2[1]),
			MathUtils.pow(v1.z(), v2[2]),
			MathUtils.pow(v1.w(), v2[3])
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T powAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2),
			MathUtils.pow(v1.y(), v2),
			MathUtils.pow(v1.z(), v2),
			MathUtils.pow(v1.w(), v2)
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T powAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1.set(
			MathUtils.pow(v1.x(), v2X),
			MathUtils.pow(v1.y(), v2Y),
			MathUtils.pow(v1.z(), v2Z),
			MathUtils.pow(v1.w(), v2W)
		);
		
		return v1;
	}
	
	public static float[] revPow(IVec4RF v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1.x());
		res[1] = MathUtils.pow(v2.y(), v1.y());
		res[2] = MathUtils.pow(v2.z(), v1.z());
		res[3] = MathUtils.pow(v2.w(), v1.w());
		
		return res;
	}
	
	public static float[] revPow(IVec4RF v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2[0], v1.x());
		res[1] = MathUtils.pow(v2[1], v1.y());
		res[2] = MathUtils.pow(v2[2], v1.z());
		res[3] = MathUtils.pow(v2[3], v1.w());
		
		return res;
	}
	
	public static float[] revPow(IVec4RF v1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(value, v1.x());
		res[1] = MathUtils.pow(value, v1.y());
		res[2] = MathUtils.pow(value, v1.z());
		res[3] = MathUtils.pow(value, v1.w());
		
		return res;
	}
	
	public static float[] revPow(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2X, v1.x());
		res[1] = MathUtils.pow(v2Y, v1.y());
		res[2] = MathUtils.pow(v2Z, v1.z());
		res[3] = MathUtils.pow(v2W, v1.w());
		
		return res;
	}
	
	public static float[] revPow(float[] v1, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1[0]);
		res[1] = MathUtils.pow(v2.y(), v1[1]);
		res[2] = MathUtils.pow(v2.z(), v1[2]);
		res[3] = MathUtils.pow(v2.w(), v1[3]);
		
		return res;
	}
	
	public static float[] revPow(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2.x(), v1X);
		res[1] = MathUtils.pow(v2.y(), v1Y);
		res[2] = MathUtils.pow(v2.z(), aZ);
		res[3] = MathUtils.pow(v2.w(), aW);
		
		return res;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, IVec4RF v2)
	{
		v1[0] = MathUtils.pow(v2.x(), v1[0]);
		v1[1] = MathUtils.pow(v2.y(), v1[1]);
		v1[2] = MathUtils.pow(v2.z(), v1[2]);
		v1[3] = MathUtils.pow(v2.w(), v1[3]);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revPow(IVec4RF v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1.x()),
			MathUtils.pow(v2.y(), v1.y()),
			MathUtils.pow(v2.z(), v1.z()),
			MathUtils.pow(v2.w(), v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(IVec4RF v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1.x()),
			MathUtils.pow(v2[1], v1.y()),
			MathUtils.pow(v2[2], v1.z()),
			MathUtils.pow(v2[3], v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(IVec4RF v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2, v1.x()),
			MathUtils.pow(v2, v1.y()),
			MathUtils.pow(v2, v1.z()),
			MathUtils.pow(v2, v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(IVec4RF v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1.x()),
			MathUtils.pow(v2Y, v1.y()),
			MathUtils.pow(v2Z, v1.z()),
			MathUtils.pow(v2W, v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(float[] v1, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1[0]),
			MathUtils.pow(v2.y(), v1[1]),
			MathUtils.pow(v2.z(), v1[2]),
			MathUtils.pow(v2.w(), v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(float[] v1, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1[0]),
			MathUtils.pow(v2[1], v1[1]),
			MathUtils.pow(v2[2], v1[2]),
			MathUtils.pow(v2[3], v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(float[] v1, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2, v1[0]),
			MathUtils.pow(v2, v1[1]),
			MathUtils.pow(v2, v1[2]),
			MathUtils.pow(v2, v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1[0]),
			MathUtils.pow(v2Y, v1[1]),
			MathUtils.pow(v2Z, v1[2]),
			MathUtils.pow(v2W, v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(float v1X, float v1Y, float aZ, float aW, IVec4RF v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2.x(), v1X),
			MathUtils.pow(v2.y(), v1Y),
			MathUtils.pow(v2.z(), aZ),
			MathUtils.pow(v2.w(), aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(float v1X, float v1Y, float aZ, float aW, float[] v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2[0], v1X),
			MathUtils.pow(v2[1], v1Y),
			MathUtils.pow(v2[2], aZ),
			MathUtils.pow(v2[3], aW)
		);
		
		return res;
	}

	public static <T extends IVec4WF> T revPow(float v1X, float v1Y, float aZ, float aW, float v2, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2, v1X),
			MathUtils.pow(v2, v1Y),
			MathUtils.pow(v2, aZ),
			MathUtils.pow(v2, aW)
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPow(float v1X, float v1Y, float aZ, float aW, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(v2X, v1X),
			MathUtils.pow(v2Y, v1Y),
			MathUtils.pow(v2Z, aZ),
			MathUtils.pow(v2W, aW)
		);		
		
		return res;
	}
	
	public static <T extends IVec4WF> T revPowAssign(@ExtractionParam T v1, IVec4RF v2)
	{
		v1.set(
			MathUtils.pow(v2.x(), v1.x()),
			MathUtils.pow(v2.y(), v1.y()),
			MathUtils.pow(v2.z(), v1.z()),
			MathUtils.pow(v2.z(), v1.w())
		);	
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revPowAssign(@ExtractionParam T v1, float[] v2)
	{
		v1.set(
			MathUtils.pow(v2[0], v1.x()),
			MathUtils.pow(v2[1], v1.y()),
			MathUtils.pow(v2[2], v1.z()),
			MathUtils.pow(v2[3], v1.w())
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revPowAssign(@ExtractionParam T v1, float v2)
	{
		v1.set(
			MathUtils.pow(v2, v1.x()),
			MathUtils.pow(v2, v1.y()),
			MathUtils.pow(v2, v1.z()),
			MathUtils.pow(v2, v1.w())
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T revPowAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		v1.set(
			MathUtils.pow(v2X, v1.x()),
			MathUtils.pow(v2Y, v1.y()),
			MathUtils.pow(v2Z, v1.z()),
			MathUtils.pow(v2Z, v1.w())
		);
		
		return v1;
	}
	
	public static float[] sqrt(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(v1.x());
		res[1] = MathUtils.sqrt(v1.y());
		res[2] = MathUtils.sqrt(v1.z());
		res[3] = MathUtils.sqrt(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T sqrt(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1.x()),
			MathUtils.sqrt(v1.y()),
			MathUtils.sqrt(v1.z()),
			MathUtils.sqrt(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sqrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1[0]),
			MathUtils.sqrt(v1[1]),
			MathUtils.sqrt(v1[2]),
			MathUtils.sqrt(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sqrt(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(v1X),
			MathUtils.sqrt(v1Y),
			MathUtils.sqrt(aZ),
			MathUtils.sqrt(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sqrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sqrt(v1.x()),
			MathUtils.sqrt(v1.y()),
			MathUtils.sqrt(v1.z()),
			MathUtils.sqrt(v1.w())
		);
		
		return v1;
	}
	
	public static float[] invSqrt(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invSqrt(v1.x());
		res[1] = MathUtils.invSqrt(v1.y());
		res[2] = MathUtils.invSqrt(v1.z());
		res[3] = MathUtils.invSqrt(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T invSqrt(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1.x()),
			MathUtils.invSqrt(v1.y()),
			MathUtils.invSqrt(v1.z()),
			MathUtils.invSqrt(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T invSqrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1[0]),
			MathUtils.invSqrt(v1[1]),
			MathUtils.invSqrt(v1[2]),
			MathUtils.invSqrt(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T invSqrt(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(v1X),
			MathUtils.invSqrt(v1Y),
			MathUtils.invSqrt(aZ),
			MathUtils.invSqrt(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T invSqrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.invSqrt(v1.x()),
			MathUtils.invSqrt(v1.y()),
			MathUtils.invSqrt(v1.z()),
			MathUtils.invSqrt(v1.w())
		);
		
		return v1;
	}
	
	public static float[] cbrt(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(v1.x());
		res[1] = MathUtils.cbrt(v1.y());
		res[2] = MathUtils.cbrt(v1.z());
		res[3] = MathUtils.cbrt(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T cbrt(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1.x()),
			MathUtils.cbrt(v1.y()),
			MathUtils.cbrt(v1.z()),
			MathUtils.cbrt(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T cbrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1[0]),
			MathUtils.cbrt(v1[1]),
			MathUtils.cbrt(v1[2]),
			MathUtils.cbrt(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T cbrt(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(v1X),
			MathUtils.cbrt(v1Y),
			MathUtils.cbrt(aZ),
			MathUtils.cbrt(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T cbrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cbrt(v1.x()),
			MathUtils.cbrt(v1.y()),
			MathUtils.cbrt(v1.z()),
			MathUtils.cbrt(v1.w())
		);
		
		return v1;
	}
	
	public static float[] invCbrt(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invCbrt(v1.x());
		res[1] = MathUtils.invCbrt(v1.y());
		res[2] = MathUtils.invCbrt(v1.z());
		res[3] = MathUtils.invCbrt(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T invCbrt(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1.x()),
			MathUtils.invCbrt(v1.y()),
			MathUtils.invCbrt(v1.z()),
			MathUtils.invCbrt(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T invCbrt(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1[0]),
			MathUtils.invCbrt(v1[1]),
			MathUtils.invCbrt(v1[2]),
			MathUtils.invCbrt(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T invCbrt(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(v1X),
			MathUtils.invCbrt(v1Y),
			MathUtils.invCbrt(aZ),
			MathUtils.invCbrt(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T invCbrtAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.invCbrt(v1.x()),
			MathUtils.invCbrt(v1.y()),
			MathUtils.invCbrt(v1.z()),
			MathUtils.invCbrt(v1.w())
		);
		
		return v1;
	}
	
	public static float[] abs(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(v1.x());
		res[1] = Math.abs(v1.y());
		res[2] = Math.abs(v1.z());
		res[3] = Math.abs(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T abs(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1.x()),
			Math.abs(v1.y()),
			Math.abs(v1.z()),
			Math.abs(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T abs(float[] v1, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1[0]),
			Math.abs(v1[1]),
			Math.abs(v1[2]),
			Math.abs(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T abs(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			Math.abs(v1X),
			Math.abs(v1Y),
			Math.abs(aZ),
			Math.abs(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T absAssign(@ExtractionParam T v1)
	{
		v1.set(
			Math.abs(v1.x()),
			Math.abs(v1.y()),
			Math.abs(v1.z()),
			Math.abs(v1.w())
		);
		
		return v1;
	}
	
	public static float[] reciprocal(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v1.x();
		res[1] = 1.0f / v1.y();
		res[2] = 1.0f / v1.z();
		res[3] = 1.0f / v1.w();
		
		return res;
	}
	
	public static <T extends IVec4WF> T reciprocal(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1.x(),
			1.0f / v1.y(),
			1.0f / v1.z(),
			1.0f / v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T reciprocal(float[] v1, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1[0],
			1.0f / v1[1],
			1.0f / v1[2],
			1.0f / v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T reciprocal(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			1.0f / v1X,
			1.0f / v1Y,
			1.0f / aZ,
			1.0f / aW
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T reciprocalAssign(@ExtractionParam T v1)
	{
		v1.set(
			1.0f / v1.x(),
			1.0f / v1.y(),
			1.0f / v1.z(),
			1.0f / v1.w()
		);
		
		return v1;
	}
	
	public static float[] negate(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = -v1.x();
		res[1] = -v1.y();
		res[2] = -v1.z();
		res[3] = -v1.w();
		
		return res;
	}
	
	public static <T extends IVec4WF> T negate(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			-v1.x(),
			-v1.y(),
			-v1.z(),
			-v1.w()
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T negate(float[] v1, @ExtractionParam T res)
	{
		res.set(
			-v1[0],
			-v1[1],
			-v1[2],
			-v1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T negate(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			-v1X,
			-v1Y,
			-aZ,
			-aW
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T negateAssign(@ExtractionParam T v1)
	{
		v1.set(
			-v1.x(),
			-v1.y(),
			-v1.z(),
			-v1.w()
		);
		
		return v1;
	}
	
	public static float[] squared(IVec4RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float aZ = v1.z();
		float aW = v1.w();
		
		res[0] = v1X * v1X;
		res[1] = v1Y * v1Y;
		res[2] = aZ * aZ;
		res[3] = aW * aW;
		
		return res;
	}
	
	public static <T extends IVec4WF> T squared(IVec4RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float aZ = v1.z();
		float aW = v1.w();
		
		res.set(
			v1X * v1X,
			v1Y * v1Y,
			aZ * aZ,
			aW * aW
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T squared(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float aZ = v1[2];
		float aW = v1[3];
		
		res.set(
			v1X * v1X,
			v1Y * v1Y,
			aZ * aZ,
			aW * aW
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T squared(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{	
		res.set(
			v1X * v1X,
			v1Y * v1Y,
			aZ * aZ,
			aW * aW
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T squaredAssign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float aZ = v1.z();
		float aW = v1.w();
		
		v1.set(
			v1X * v1X,
			v1Y * v1Y,
			aZ * aZ,
			aW * aW
		);
		
		return v1;
	}
	
	public static float[] sin(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sin(v1.x());
		res[1] = MathUtils.sin(v1.y());
		res[2] = MathUtils.sin(v1.z());
		res[3] = MathUtils.sin(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T sin(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1.x()),
			MathUtils.sin(v1.y()),
			MathUtils.sin(v1.z()),
			MathUtils.sin(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sin(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1[0]),
			MathUtils.sin(v1[1]),
			MathUtils.sin(v1[2]),
			MathUtils.sin(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sin(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(v1X),
			MathUtils.sin(v1Y),
			MathUtils.sin(aZ),
			MathUtils.sin(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sinAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sin(v1.x()),
			MathUtils.sin(v1.y()),
			MathUtils.sin(v1.z()),
			MathUtils.sin(v1.w())
		);
		
		return v1;
	}
	
	public static float[] asin(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.asin(v1.x());
		res[1] = MathUtils.asin(v1.y());
		res[2] = MathUtils.asin(v1.z());
		res[3] = MathUtils.asin(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T asin(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1.x()),
			MathUtils.asin(v1.y()),
			MathUtils.asin(v1.z()),
			MathUtils.asin(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T asin(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1[0]),
			MathUtils.asin(v1[1]),
			MathUtils.asin(v1[2]),
			MathUtils.asin(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T asin(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(v1X),
			MathUtils.asin(v1Y),
			MathUtils.asin(aZ),
			MathUtils.asin(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T asinAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.asin(v1.x()),
			MathUtils.asin(v1.y()),
			MathUtils.asin(v1.z()),
			MathUtils.asin(v1.w())
		);
		
		return v1;
	}
	
	public static float[] sinh(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sinh(v1.x());
		res[1] = MathUtils.sinh(v1.y());
		res[2] = MathUtils.sinh(v1.z());
		res[3] = MathUtils.sinh(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T sinh(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1.x()),
			MathUtils.sinh(v1.y()),
			MathUtils.sinh(v1.z()),
			MathUtils.sinh(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sinh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1[0]),
			MathUtils.sinh(v1[1]),
			MathUtils.sinh(v1[2]),
			MathUtils.sinh(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sinh(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(v1X),
			MathUtils.sinh(v1Y),
			MathUtils.sinh(aZ),
			MathUtils.sinh(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T sinhAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.sinh(v1.x()),
			MathUtils.sinh(v1.y()),
			MathUtils.sinh(v1.z()),
			MathUtils.sinh(v1.w())
		);
		
		return v1;
	}
	
	public static float[] cos(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cos(v1.x());
		res[1] = MathUtils.cos(v1.y());
		res[2] = MathUtils.cos(v1.z());
		res[3] = MathUtils.cos(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T cos(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1.x()),
			MathUtils.cos(v1.y()),
			MathUtils.cos(v1.z()),
			MathUtils.cos(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T cos(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1[0]),
			MathUtils.cos(v1[1]),
			MathUtils.cos(v1[2]),
			MathUtils.cos(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T cos(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(v1X),
			MathUtils.cos(v1Y),
			MathUtils.cos(aZ),
			MathUtils.cos(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T cosAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cos(v1.x()),
			MathUtils.cos(v1.y()),
			MathUtils.cos(v1.z()),
			MathUtils.cos(v1.w())
		);
		
		return v1;
	}
	
	public static float[] acos(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.acos(v1.x());
		res[1] = MathUtils.acos(v1.y());
		res[2] = MathUtils.acos(v1.z());
		res[3] = MathUtils.acos(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T acos(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1.x()),
			MathUtils.acos(v1.y()),
			MathUtils.acos(v1.z()),
			MathUtils.acos(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T acos(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1[0]),
			MathUtils.acos(v1[1]),
			MathUtils.acos(v1[2]),
			MathUtils.acos(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T acos(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(v1X),
			MathUtils.acos(v1Y),
			MathUtils.acos(aZ),
			MathUtils.acos(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T acosAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.acos(v1.x()),
			MathUtils.acos(v1.y()),
			MathUtils.acos(v1.z()),
			MathUtils.acos(v1.w())
		);
		
		return v1;
	}
	
	public static float[] cosh(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cosh(v1.x());
		res[1] = MathUtils.cosh(v1.y());
		res[2] = MathUtils.cosh(v1.z());
		res[3] = MathUtils.cosh(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T cosh(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1.x()),
			MathUtils.cosh(v1.y()),
			MathUtils.cosh(v1.z()),
			MathUtils.cosh(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T cosh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1[0]),
			MathUtils.cosh(v1[1]),
			MathUtils.cosh(v1[2]),
			MathUtils.cosh(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T cosh(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(v1X),
			MathUtils.cosh(v1Y),
			MathUtils.cosh(aZ),
			MathUtils.cosh(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T coshAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.cosh(v1.x()),
			MathUtils.cosh(v1.y()),
			MathUtils.cosh(v1.z()),
			MathUtils.cosh(v1.w())
		);
		
		return v1;
	}
	
	public static float[] tan(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tan(v1.x());
		res[1] = MathUtils.tan(v1.y());
		res[2] = MathUtils.tan(v1.z());
		res[3] = MathUtils.tan(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T tan(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1.x()),
			MathUtils.tan(v1.y()),
			MathUtils.tan(v1.z()),
			MathUtils.tan(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T tan(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1[0]),
			MathUtils.tan(v1[1]),
			MathUtils.tan(v1[2]),
			MathUtils.tan(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T tan(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(v1X),
			MathUtils.tan(v1Y),
			MathUtils.tan(aZ),
			MathUtils.tan(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T tan(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.tan(v1.x()),
			MathUtils.tan(v1.y()),
			MathUtils.tan(v1.z()),
			MathUtils.tan(v1.w())
		);
		
		return v1;
	}
	
	public static float[] atan(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.atan(v1.x());
		res[1] = MathUtils.atan(v1.y());
		res[2] = MathUtils.atan(v1.z());
		res[3] = MathUtils.atan(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T atan(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1.x()),
			MathUtils.atan(v1.y()),
			MathUtils.atan(v1.z()),
			MathUtils.atan(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T atan(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1[0]),
			MathUtils.atan(v1[1]),
			MathUtils.atan(v1[2]),
			MathUtils.atan(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T atan(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(v1X),
			MathUtils.atan(v1Y),
			MathUtils.atan(aZ),
			MathUtils.atan(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T atanAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.atan(v1.x()),
			MathUtils.atan(v1.y()),
			MathUtils.atan(v1.z()),
			MathUtils.atan(v1.w())
		);
		
		return v1;
	}
	
	public static float[] tanh(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tanh(v1.x());
		res[1] = MathUtils.tanh(v1.y());
		res[2] = MathUtils.tanh(v1.z());
		res[3] = MathUtils.tanh(v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T tanh(IVec4RF v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1.x()),
			MathUtils.tanh(v1.y()),
			MathUtils.tanh(v1.z()),
			MathUtils.tanh(v1.w())
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T tanh(float[] v1, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1[0]),
			MathUtils.tanh(v1[1]),
			MathUtils.tanh(v1[2]),
			MathUtils.tanh(v1[3])
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T tanh(float v1X, float v1Y, float aZ, float aW, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(v1X),
			MathUtils.tanh(v1Y),
			MathUtils.tanh(aZ),
			MathUtils.tanh(aW)
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T tanhAssign(@ExtractionParam T v1)
	{
		v1.set(
			MathUtils.tanh(v1.x()),
			MathUtils.tanh(v1.y()),
			MathUtils.tanh(v1.z()),
			MathUtils.tanh(v1.w())
		);
		
		return v1;
	}
}
