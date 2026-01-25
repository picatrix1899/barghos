package org.barghos.api.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;
import org.barghos.api.math.quaternion.IQuatRF;
import org.barghos.api.math.transform.ITransform3RF;
import org.barghos.api.math.vector.floats.IVec2RF;
import org.barghos.api.math.vector.floats.IVec3RF;
import org.barghos.api.math.vector.floats.IVec4RF;

public class DefaultMatsI4F
{
	private DefaultMatsI4F() { }
	
	public static <T extends IMat4WF> T zero(@ExtractionParam T res)
	{
		res.set(
			0, 0, 0, 0,
			0, 0, 0, 0,
			0, 0, 0, 0,
			0, 0, 0, 0);
		
		return res;
	}
	
	public static <T extends IMat4WF> T identity(@ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingX(float sX, @ExtractionParam T res)
	{
		res.set(
			sX, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingY(float sY, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, sY, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingZ(float sZ, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, sZ, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingW(float sW, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, sW);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXY(IVec2RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, s.y(), 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXY(IVec3RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, s.y(), 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXY(IVec4RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, s.y(), 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXY(float[] s, @ExtractionParam T res)
	{
		res.set(
			s[0], 0, 0, 0,
			0, s[1], 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXY(float s, @ExtractionParam T res)
	{
		res.set(
			s, 0, 0, 0,
			0, s, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXY(float sX, float sY, @ExtractionParam T res)
	{
		res.set(
			sX, 0, 0, 0,
			0, sY, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXZ(IVec2RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s.y(), 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXZ(float[] s, @ExtractionParam T res)
	{
		res.set(
			s[0], 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s[1], 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXZ(float s, @ExtractionParam T res)
	{
		res.set(
			s, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXZ(float sX, float sZ, @ExtractionParam T res)
	{
		res.set(
			sX, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, sZ, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXW(IVec2RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s.y());
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXW(float[] s, @ExtractionParam T res)
	{
		res.set(
			s[0], 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s[1]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXW(float s, @ExtractionParam T res)
	{
		res.set(
			s, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXW(float sX, float sW, @ExtractionParam T res)
	{
		res.set(
			sX, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, sW);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYZ(IVec2RF s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s.x(), 0, 0,
			0, 0, s.y(), 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYZ(float[] s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s[0], 0, 0,
			0, 0, s[1], 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYZ(float s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s, 0, 0,
			0, 0, s, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYZ(float sY, float sZ, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, sY, 0, 0,
			0, 0, sZ, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYW(IVec2RF s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s.x(), 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s.y());
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYW(float[] s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s[0], 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s[1]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYW(float s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYW(float sY, float sW, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, sY, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, sW);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingZW(IVec2RF s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s.x(), 0,
			0, 0, 0, s.y());
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingZW(float[] s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s[0], 0,
			0, 0, 0, s[1]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingZW(float s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s, 0,
			0, 0, 0, s);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingZW(float sZ, float sW, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, sZ, 0,
			0, 0, 0, sW);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYZ(IVec3RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, s.y(), 0, 0,
			0, 0, s.z(), 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYZ(float[] s, @ExtractionParam T res)
	{
		res.set(
			s[0], 0, 0, 0,
			0, s[1], 0, 0,
			0, 0, s[2], 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYZ(float s, @ExtractionParam T res)
	{
		res.set(
			s, 0, 0, 0,
			0, s, 0, 0,
			0, 0, s, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYZ(float sX, float sY, float sZ, @ExtractionParam T res)
	{
		res.set(
			sX, 0, 0, 0,
			0, sY, 0, 0,
			0, 0, sZ, 0,
			0, 0, 0, 1);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYW(IVec3RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, s.y(), 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s.z());
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYW(float[] s, @ExtractionParam T res)
	{
		res.set(
			s[0], 0, 0, 0,
			0, s[1], 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s[2]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYW(float s, @ExtractionParam T res)
	{
		res.set(
			s, 0, 0, 0,
			0, s, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, s);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYW(float sX, float sY, float sW, @ExtractionParam T res)
	{
		res.set(
			sX, 0, 0, 0,
			0, sY, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, sW);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXZW(IVec3RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s.y(), 0,
			0, 0, 0, s.z());
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXZW(float[] s, @ExtractionParam T res)
	{
		res.set(
			s[0], 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s[1], 0,
			0, 0, 0, s[2]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXZW(float s, @ExtractionParam T res)
	{
		res.set(
			s, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, s, 0,
			0, 0, 0, s);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXZW(float sX, float sZ, float sW, @ExtractionParam T res)
	{
		res.set(
			sX, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, sZ, 0,
			0, 0, 0, sW);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYZW(IVec3RF s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s.x(), 0, 0,
			0, 0, s.y(), 0,
			0, 0, 0, s.z());
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingYZW(float[] s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s[0], 0, 0,
			0, 0, s[1], 0,
			0, 0, 0, s[2]);
		
		return res;
	}

	public static <T extends IMat4WF> T scalingYZW(float s, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, s, 0, 0,
			0, 0, s, 0,
			0, 0, 0, s);
		
		return res;
	}	
	
	public static <T extends IMat4WF> T scalingYZW(float sY, float sZ, float sW, @ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, sY, 0, 0,
			0, 0, sZ, 0,
			0, 0, 0, sW);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYZW(IVec4RF s, @ExtractionParam T res)
	{
		res.set(
			s.x(), 0, 0, 0,
			0, s.y(), 0, 0,
			0, 0, s.z(), 0,
			0, 0, 0, s.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYZW(float[] s, @ExtractionParam T res)
	{
		res.set(
			s[0], 0, 0, 0,
			0, s[1], 0, 0,
			0, 0, s[2], 0,
			0, 0, 0, s[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYZW(float s, @ExtractionParam T res)
	{
		res.set(
			s, 0, 0, 0,
			0, s, 0, 0,
			0, 0, s, 0,
			0, 0, 0, s);
		
		return res;
	}
	
	public static <T extends IMat4WF> T scalingXYZW(float sX, float sY, float sZ, float sW, @ExtractionParam T res)
	{
		res.set(
			sX, 0, 0, 0,
			0, sY, 0, 0,
			0, 0, sZ, 0,
			0, 0, 0, sW);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXY(IVec2RF t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t.x(), t.y(), 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXY(float[] t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t[0], t[1], 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXY(float t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t, t, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXY(float tX, float tY, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			tX, tY, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXZ(IVec2RF t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t.x(), 0.0f, t.y(), 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXZ(float[] t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t[0], 0.0f, t[1], 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXZ(float t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t, 0.0f, t, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXZ(float tX, float tY, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			tX, 0.0f, tY, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationYZ(IVec2RF t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, t.x(), t.y(), 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationYZ(float[] t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, t[0], t[1], 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationYZ(float t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, t, t, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationYZ(float tX, float tY, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, tX, tY, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXYZ(IVec3RF t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXYZ(float[] t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t[0], t[1], t[2], 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXYZ(float t, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			t, t, t, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T translationXYZ(float tX, float tY, float tZ, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			tX, tY, tZ, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T rotationRad(IVec3RF a, float angle, @ExtractionParam T res)
	{
		float aX = a.x();
		float aY = a.y();
		float aZ = a.z();
		
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float xyRecCosAngle = aX * aY * recCosAngle;
		float xzRecCosAngle = aX * aZ * recCosAngle;
		float yzRecCosAngle = aY * aZ * recCosAngle;
		
		float xSinAngle = aX * sinAngle;
		float ySinAngle = aY * sinAngle;
		float zSinAngle = aZ * sinAngle;
		
		res.set(
			Math.fma(aX * aX, recCosAngle, cosAngle), xyRecCosAngle + zSinAngle, xzRecCosAngle - ySinAngle, 0.0f,
			xyRecCosAngle - zSinAngle, Math.fma(aY * aY, recCosAngle, cosAngle), yzRecCosAngle + xSinAngle, 0.0f,
			xzRecCosAngle + ySinAngle, yzRecCosAngle - xSinAngle, Math.fma(aZ * aZ, recCosAngle, cosAngle), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T rotationRad(float[] a, float angle, @ExtractionParam T res)
	{
		float aX = a[0];
		float aY = a[1];
		float aZ = a[2];
		
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float xyRecCosAngle = aX * aY * recCosAngle;
		float xzRecCosAngle = aX * aZ * recCosAngle;
		float yzRecCosAngle = aY * aZ * recCosAngle;
		
		float xSinAngle = aX * sinAngle;
		float ySinAngle = aY * sinAngle;
		float zSinAngle = aZ * sinAngle;
		
		res.set(
			Math.fma(aX * aX, recCosAngle, cosAngle), xyRecCosAngle + zSinAngle, xzRecCosAngle - ySinAngle, 0.0f,
			xyRecCosAngle - zSinAngle, Math.fma(aY * aY, recCosAngle, cosAngle), yzRecCosAngle + xSinAngle, 0.0f,
			xzRecCosAngle + ySinAngle, yzRecCosAngle - xSinAngle, Math.fma(aZ * aZ, recCosAngle, cosAngle), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T rotationRad(float aX, float aY, float aZ, float angle, @ExtractionParam T res)
	{
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float xyRecCosAngle = aX * aY * recCosAngle;
		float xzRecCosAngle = aX * aZ * recCosAngle;
		float yzRecCosAngle = aY * aZ * recCosAngle;
		
		float xSinAngle = aX * sinAngle;
		float ySinAngle = aY * sinAngle;
		float zSinAngle = aZ * sinAngle;
		
		res.set(
			Math.fma(aX * aX, recCosAngle, cosAngle), xyRecCosAngle + zSinAngle, xzRecCosAngle - ySinAngle, 0.0f,
			xyRecCosAngle - zSinAngle, Math.fma(aY * aY, recCosAngle, cosAngle), yzRecCosAngle + xSinAngle, 0.0f,
			xzRecCosAngle + ySinAngle, yzRecCosAngle - xSinAngle, Math.fma(aZ * aZ, recCosAngle, cosAngle), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T rotationDeg(IVec3RF a, float angle, @ExtractionParam T res)
	{
		float aX = a.x();
		float aY = a.y();
		float aZ = a.z();
		
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float xyRecCosAngle = aX * aY * recCosAngle;
		float xzRecCosAngle = aX * aZ * recCosAngle;
		float yzRecCosAngle = aY * aZ * recCosAngle;
		
		float xSinAngle = aX * sinAngle;
		float ySinAngle = aY * sinAngle;
		float zSinAngle = aZ * sinAngle;
		
		res.set(
			Math.fma(aX * aX, recCosAngle, cosAngle), xyRecCosAngle + zSinAngle, xzRecCosAngle - ySinAngle, 0.0f,
			xyRecCosAngle - zSinAngle, Math.fma(aY * aY, recCosAngle, cosAngle), yzRecCosAngle + xSinAngle, 0.0f,
			xzRecCosAngle + ySinAngle, yzRecCosAngle - xSinAngle, Math.fma(aZ * aZ, recCosAngle, cosAngle), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T rotationDeg(float[] a, float angle, @ExtractionParam T res)
	{
		float aX = a[0];
		float aY = a[1];
		float aZ = a[2];
		
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float xyRecCosAngle = aX * aY * recCosAngle;
		float xzRecCosAngle = aX * aZ * recCosAngle;
		float yzRecCosAngle = aY * aZ * recCosAngle;
		
		float xSinAngle = aX * sinAngle;
		float ySinAngle = aY * sinAngle;
		float zSinAngle = aZ * sinAngle;
		
		res.set(
			Math.fma(aX * aX, recCosAngle, cosAngle), xyRecCosAngle + zSinAngle, xzRecCosAngle - ySinAngle, 0.0f,
			xyRecCosAngle - zSinAngle, Math.fma(aY * aY, recCosAngle, cosAngle), yzRecCosAngle + xSinAngle, 0.0f,
			xzRecCosAngle + ySinAngle, yzRecCosAngle - xSinAngle, Math.fma(aZ * aZ, recCosAngle, cosAngle), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T rotationDeg(float aX, float aY, float aZ, float angle, @ExtractionParam T res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float xyRecCosAngle = aX * aY * recCosAngle;
		float xzRecCosAngle = aX * aZ * recCosAngle;
		float yzRecCosAngle = aY * aZ * recCosAngle;
		
		float xSinAngle = aX * sinAngle;
		float ySinAngle = aY * sinAngle;
		float zSinAngle = aZ * sinAngle;
		
		res.set(
			Math.fma(aX * aX, recCosAngle, cosAngle), xyRecCosAngle + zSinAngle, xzRecCosAngle - ySinAngle, 0.0f,
			xyRecCosAngle - zSinAngle, Math.fma(aY * aY, recCosAngle, cosAngle), yzRecCosAngle + xSinAngle, 0.0f,
			xzRecCosAngle + ySinAngle, yzRecCosAngle - xSinAngle, Math.fma(aZ * aZ, recCosAngle, cosAngle), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T rotationQuat(IQuatRF q, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f), 2.0f * (qXY + qZW), 2.0f * (qXZ - qYW), 0.0f,
			2.0f * (qXY - qZW), Math.fma(-2.0f, qXX + qZZ, 1.0f), 2.0f * (qYZ + qXW), 0.0f,
			2.0f * (qXZ + qYW), 2.0f * (qYZ - qXW), Math.fma(-2.0f, qXX + qYY, 1.0f), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T rotationQuat(float[] q, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f), 2.0f * (qXY + qZW), 2.0f * (qXZ - qYW), 0.0f,
			2.0f * (qXY - qZW), Math.fma(-2.0f, qXX + qZZ, 1.0f), 2.0f * (qYZ + qXW), 0.0f,
			2.0f * (qXZ + qYW), 2.0f * (qYZ - qXW), Math.fma(-2.0f, qXX + qYY, 1.0f), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T rotationQuat(float qX, float qY, float qZ, float qW, @ExtractionParam T res)
	{
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f), 2.0f * (qXY + qZW), 2.0f * (qXZ - qYW), 0.0f,
			2.0f * (qXY - qZW), Math.fma(-2.0f, qXX + qZZ, 1.0f), 2.0f * (qYZ + qXW), 0.0f,
			2.0f * (qXZ + qYW), 2.0f * (qYZ - qXW), Math.fma(-2.0f, qXX + qYY, 1.0f), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRS(ITransform3RF t, @ExtractionParam T res)
	{
		float qX = t.rotX();
		float qY = t.rotY();
		float qZ = t.rotZ();
		float qW = t.rotW();
		
		float sX = t.scaleX();
		float sY = t.scaleY();
		float sZ = t.scaleZ();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.posX(), t.posY(), t.posZ(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, IQuatRF q, IVec3RF s, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, IQuatRF q, float[] s, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, IQuatRF q, float sX, float sY, float sZ, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, float[] q, IVec3RF s, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, float[] q, float[] s, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, float[] q, float sX, float sY, float sZ, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, float qX, float qY, float qZ, float qW, IVec3RF s, @ExtractionParam T res)
	{
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, float qX, float qY, float qZ, float qW, float[] s, @ExtractionParam T res)
	{
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(IVec3RF t, float qX, float qY, float qZ, float qW, float sX, float sY, float sZ, @ExtractionParam T res)
	{
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t.x(), t.y(), t.z(), 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float[] t, IQuatRF q, IVec3RF s, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t[0], t[1], t[2], 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float[] t, IQuatRF q, float[] s, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t[0], t[1], t[2], 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float[] t, IQuatRF q, float sX, float sY, float sZ, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t[0], t[1], t[2], 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float[] t, float[] q, IVec3RF s, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t[0], t[1], t[2], 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float[] t, float[] q, float[] s, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t[0], t[1], t[2], 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float[] t, float[] q, float sX, float sY, float sZ, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t[0], t[1], t[2], 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float[] t, float qX, float qY, float qZ, float qW, IVec3RF s, @ExtractionParam T res)
	{
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t[0], t[1], t[2], 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float[] t, float qX, float qY, float qZ, float qW, float[] s, @ExtractionParam T res)
	{
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			t[0], t[1], t[2], 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, IQuatRF q, IVec3RF s, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, IQuatRF q, float[] s, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, IQuatRF q, float sX, float sY, float sZ, @ExtractionParam T res)
	{
		float qX = q.x();
		float qY = q.y();
		float qZ = q.z();
		float qW = q.w();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, float[] q, IVec3RF s, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, float[] q, float[] s, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, float[] q, float sX, float sY, float sZ, @ExtractionParam T res)
	{
		float qX = q[0];
		float qY = q[1];
		float qZ = q[2];
		float qW = q[3];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, float qX, float qY, float qZ, float qW, IVec3RF s, @ExtractionParam T res)
	{
		float sX = s.x();
		float sY = s.y();
		float sZ = s.z();
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, float qX, float qY, float qZ, float qW, float[] s, @ExtractionParam T res)
	{
		float sX = s[0];
		float sY = s[1];
		float sZ = s[2];
		
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T modelTRSQuat(float tX, float tY, float tZ, float qX, float qY, float qZ, float qW, float sX, float sY, float sZ, @ExtractionParam T res)
	{
		float qXX = qX * qX;
		float qYY = qY * qY;
		float qZZ = qZ * qZ;
		
		float qXY = qX * qY;
		float qXZ = qX * qZ;
		float qYZ = qY * qZ;
		float qXW = qX * qW;
		float qYW = qY * qW;
		float qZW = qZ * qW;
		
		float sX2 = sX * 2.0f;
		float sY2 = sY * 2.0f;
		float sZ2 = sZ * 2.0f;
		
		res.set(
			Math.fma(- 2.0f, qYY + qZZ, 1.0f) * sX, (qXY + qZW) * sX2, (qXZ - qYW) * sX2, 0.0f,
			(qXY - qZW) * sY2, Math.fma(-2.0f, qXX + qZZ, 1.0f) * sY, (qYZ + qXW) * sY2, 0.0f,
			(qXZ + qYW) * sZ2, (qYZ - qXW) * sZ2, Math.fma(-2.0f, qXX + qYY, 1.0f) * sZ, 0.0f,
			tX, tY, tZ, 1.0f);

		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, IVec3RF u, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, IVec3RF u, float[] f, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, IVec3RF u, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, float[] u, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			u[0], u[1], u[2], 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, float[] u, float[] f, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			u[0], u[1], u[2], 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, float[] u, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			u[0], u[1], u[2], 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, float uX, float uY, float uZ, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			uX, uY, uZ, 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, float uX, float uY, float uZ, float[] f, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			uX, uY, uZ, 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(IVec3RF r, float uX, float uY, float uZ, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			r.x(), r.y(), r.z(), 0.0f,
			uX, uY, uZ, 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, IVec3RF u, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, IVec3RF u, float[] f, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, IVec3RF u, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, float[] u, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			u[0], u[1], u[2], 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, float[] u, float[] f, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			u[0], u[1], u[2], 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, float[] u, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			u[0], u[1], u[2], 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, float uX, float uY, float uZ, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			uX, uY, uZ, 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, float uX, float uY, float uZ, float[] f, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			uX, uY, uZ, 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float[] r, float uX, float uY, float uZ, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			r[0], r[1], r[2], 0.0f,
			uX, uY, uZ, 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, IVec3RF u, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, IVec3RF u, float[] f, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, IVec3RF u, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			u.x(), u.y(), u.z(), 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, float[] u, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			u[0], u[1], u[2], 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, float[] u, float[] f, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			u[0], u[1], u[2], 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, float[] u, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			u[0], u[1], u[2], 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, float uX, float uY, float uZ, IVec3RF f, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			uX, uY, uZ, 0.0f,
			f.x(), f.y(), f.z(), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, float uX, float uY, float uZ, float[] f, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			uX, uY, uZ, 0.0f,
			f[0], f[1], f[2], 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T baseChanging(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ, @ExtractionParam T res)
	{
		res.set(
			rX, rY, rZ, 0.0f,
			uX, uY, uZ, 0.0f,
			fX, fY, fZ, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T perspectiveProjectionRad(float fovY, float aspectRatio, float near, float far, @ExtractionParam T res)
	{
		float f = MathUtils.tan(0.5f * fovY);
		
		float nearMinusFar = near - far;
		
		res.set(
			1.0f / (f * aspectRatio), 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f / f, 0.0f, 0.0f,
			0.0f, 0.0f, (far + near) / nearMinusFar, -1.0f,
			0.0f, 0.0f, (2.0f * far * near) / nearMinusFar, 0.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T perspectiveProjectionDeg(float fovY, float aspectRatio, float near, float far, @ExtractionParam T res)
	{
		float f = MathUtils.tan(0.5f * fovY * MathUtils.DEG_TO_RADf);
		
		float nearMinusFar = near - far;
		
		res.set(
			1.0f / (f * aspectRatio), 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f / f, 0.0f, 0.0f,
			0.0f, 0.0f, (far + near) / nearMinusFar, -1.0f,
			0.0f, 0.0f, (2.0f * far * near) / nearMinusFar, 0.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T orthographicProjection(float left, float right, float bottom, float top, float near, float far, @ExtractionParam T res)
	{
		float rightMinusLeft = right - left;
		float topMinusBottom = top - bottom;
		float farMinusNear = far - near;
		
		res.set(
			2.0f / rightMinusLeft, 0f, 0f, 0f,
			0f, 2.0f / topMinusBottom, 0f, 0f,
			0f, 0f, -2.0f / farMinusNear, 0f,
			-(right + left) / rightMinusLeft, -(top + bottom) / topMinusBottom, -(far + near) / farMinusNear, 1.0f);
		 
		return res;
	}

	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, IVec3RF target, IVec3RF up, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, IVec3RF target, float[] up, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, IVec3RF target, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, float[] target, IVec3RF up, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, float[] target, float[] up, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, float[] target, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, float targetX, float targetY, float targetZ, IVec3RF up, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, float targetX, float targetY, float targetZ, float[] up, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(IVec3RF eye, float targetX, float targetY, float targetZ, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		float eyeX = eye.x();
		float eyeY = eye.y();
		float eyeZ = eye.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, IVec3RF target, IVec3RF up, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, IVec3RF target, float[] up, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, IVec3RF target, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, float[] target, IVec3RF up, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, float[] target, float[] up, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, float[] target, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, float targetX, float targetY, float targetZ, IVec3RF up, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, float targetX, float targetY, float targetZ, float[] up, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float[] eye, float targetX, float targetY, float targetZ, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		float eyeX = eye[0];
		float eyeY = eye[1];
		float eyeZ = eye[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, IVec3RF target, IVec3RF up, @ExtractionParam T res)
	{
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, IVec3RF target, float[] up, @ExtractionParam T res)
	{
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, IVec3RF target, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target.x() - eyeX;
	    float forwardY = target.y() - eyeY;
	    float forwardZ = target.z() - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, float[] target, IVec3RF up, @ExtractionParam T res)
	{
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, float[] target, float[] up, @ExtractionParam T res)
	{
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, float[] target, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = target[0] - eyeX;
	    float forwardY = target[1] - eyeY;
	    float forwardZ = target[2] - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, float targetX, float targetY, float targetZ, IVec3RF up, @ExtractionParam T res)
	{
		float upX = up.x();
		float upY = up.y();
		float upZ = up.z();
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, float targetX, float targetY, float targetZ, float[] up, @ExtractionParam T res)
	{
		float upX = up[0];
		float upY = up[1];
		float upZ = up[2];
		
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
	
	public static <T extends IMat4WF> T lookingAt(float eyeX, float eyeY, float eyeZ, float targetX, float targetY, float targetZ, float upX, float upY, float upZ, @ExtractionParam T res)
	{
		// Forward (z axis of camera but inverted toward target)
	    float forwardX = targetX - eyeX;
	    float forwardY = targetY - eyeY;
	    float forwardZ = targetZ - eyeZ;
	    
	    float forwardRecLen = MathUtils.invSqrt(Math.fma(forwardX, forwardX, Math.fma(forwardY, forwardY, forwardZ * forwardZ)));
	    
	    forwardX *= forwardRecLen;
	    forwardY *= forwardRecLen;
	    forwardZ *= forwardRecLen;

	    // Right (x axis of camera)
	    float rightX = Math.fma(forwardY, upZ, -forwardZ * upY);
	    float rightY = Math.fma(forwardZ, upX, -forwardX * upZ);
	    float rightZ = Math.fma(forwardX, upY, -forwardY * upX);
	    
	    float rightInvLen = MathUtils.invSqrt(Math.fma(rightX, rightX, Math.fma(rightY, rightY, rightZ * rightZ)));
	    rightX *= rightInvLen;
	    rightY *= rightInvLen;
	    rightZ *= rightInvLen;

	    // Recomputed Up (y axis)
	    float newUpX = Math.fma(rightY, forwardZ, -rightZ * forwardY);
	    float newUpY = Math.fma(rightZ, forwardX, -rightX * forwardZ);
	    float newUpZ = Math.fma(rightX, forwardY, -rightY * forwardX);

	    // Translation
	    float translationX = -Math.fma(rightX, eyeX, Math.fma(rightY, eyeY, rightZ * eyeZ));
	    float translationY = -Math.fma(newUpX, eyeX, Math.fma(newUpY, eyeY, newUpZ * eyeZ));
	    float translationZ = -Math.fma(forwardX, eyeX, Math.fma(forwardY, eyeY, forwardZ * eyeZ));
	    
	    res.set(
    		rightX, newUpX, forwardX, 0.0f,
    		rightY, newUpY, forwardY, 0.0f,
    		rightZ, newUpZ, forwardZ, 0.0f,
    		translationX, translationY, translationZ, 1.0f);

	    return res;
	}
}
