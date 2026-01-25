package org.barghos.impl.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.vector.floats.IVec3RF;
import org.barghos.api.math.vector.floats.IVec3WF;
import org.barghos.core.math.MathUtils;

public class BaseOpsVec3F
{
	private BaseOpsVec3F() { }
	
	public static float[] add_vv_rvec3f(Vec3F a, Vec3F b)
	{
		return new float[] {
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		};
	}
	
	public static float[] add_vv_rvec3f(Vec3F a, ConstVec3F b)
	{
		return new float[] {
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		};
	}
	
	public static float[] add_vv_rvec3f(Vec3F a, IVec3RF b)
	{
		return new float[] {
			a.x + b.x(),
			a.y + b.y(),
			a.z + b.z()
		};
	}
	
	public static float[] add_va_rvec3f(Vec3F a, float[] b)
	{
		return new float[] {
			a.x + b[0],
			a.y + b[1],
			a.z + b[2]
		};
	}
	
	public static float[] add_vs_rvec3f(Vec3F a, float b)
	{
		return new float[] {
			a.x + b,
			a.y + b,
			a.z + b
		};
	}
	
	public static float[] add_vc_rvec3f(Vec3F a, float bX, float bY, float bZ)
	{
		return new float[] {
			a.x + bX,
			a.y + bY,
			a.z + bZ
		};
	}
	
	public static float[] add_vv_rvec3f(ConstVec3F a, Vec3F b)
	{
		return new float[] {
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		};
	}
	
	public static float[] add_vv_rvec3f(ConstVec3F a, ConstVec3F b)
	{
		return new float[] {
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		};
	}
	
	public static float[] add_vv_rvec3f(ConstVec3F a, IVec3RF b)
	{
		return new float[] {
			a.x + b.x(),
			a.y + b.y(),
			a.z + b.z()
		};
	}
	
	public static float[] add_va_rvec3f(ConstVec3F a, float[] b)
	{
		return new float[] {
			a.x + b[0],
			a.y + b[1],
			a.z + b[2]
		};
	}
	
	public static float[] add_vs_rvec3f(ConstVec3F a, float b)
	{
		return new float[] {
			a.x + b,
			a.y + b,
			a.z + b
		};
	}
	
	public static float[] add_vc_rvec3f(ConstVec3F a, float bX, float bY, float bZ)
	{
		return new float[] {
			a.x + bX,
			a.y + bY,
			a.z + bZ
		};
	}
	
	public static float[] add_vv_rvec3f(IVec3RF a, Vec3F b)
	{
		return new float[] {
			a.x() + b.x,
			a.y() + b.y,
			a.z() + b.z
		};
	}
	
	public static float[] add_vv_rvec3f(IVec3RF a, ConstVec3F b)
	{
		return new float[] {
			a.x() + b.x,
			a.y() + b.y,
			a.z() + b.z
		};
	}
	
	public static float[] add_av_rvec3f(float[] a, Vec3F b)
	{
		return new float[] {
			a[0] + b.x,
			a[1] + b.y,
			a[2] + b.z
		};
	}
	
	public static float[] add_av_rvec3f(float[] a, ConstVec3F b)
	{
		return new float[] {
			a[0] + b.x,
			a[1] + b.y,
			a[2] + b.z
		};
	}
	
	public static float[] add_sv_rvec3f(float a, Vec3F b)
	{
		return new float[] {
			a + b.x,
			a + b.y,
			a + b.z
		};
	}
	
	public static float[] add_sv_rvec3f(float a, ConstVec3F b)
	{
		return new float[] {
			a + b.x,
			a + b.y,
			a + b.z
		};
	}
	
	public static float[] add_cv_rvec3f(float aX, float aY, float aZ, Vec3F b)
	{
		return new float[] {
			aX + b.x,
			aY + b.y,
			aZ + b.z
		};
	}
	
	public static float[] add_cv_rvec3f(float aX, float aY, float aZ, ConstVec3F b)
	{
		return new float[] {
			aX + b.x,
			aY + b.y,
			aZ + b.z
		};
	}
	
	public static float[] addT_vv_rvec3f(Vec3F a, Vec3F b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b.x;
		res[1] = a.y + b.y;
		res[2] = a.z + b.z;
		
		return res;
	}
	
	public static float[] addT_vv_rvec3f(Vec3F a, ConstVec3F b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b.x;
		res[1] = a.y + b.y;
		res[2] = a.z + b.z;
		
		return res;
	}
	
	public static float[] addT_vv_rvec3f(Vec3F a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b.x();
		res[1] = a.y + b.y();
		res[2] = a.z + b.z();
		
		return res;
	}
	
	public static float[] addT_va_rvec3f(Vec3F a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b[0];
		res[1] = a.y + b[1];
		res[2] = a.z + b[2];
		
		return res;
	}
	
	public static float[] addT_vs_rvec3f(Vec3F a, float b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b;
		res[1] = a.y + b;
		res[2] = a.z + b;
		
		return res;
	}
	
	public static float[] addT_vc_rvec3f(Vec3F a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = a.x + bX;
		res[1] = a.y + bY;
		res[2] = a.z + bZ;
		
		return res;
	}
	
	public static float[] addT_vv_rvec3f(ConstVec3F a, Vec3F b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b.x;
		res[1] = a.y + b.y;
		res[2] = a.z + b.z;
		
		return res;
	}
	
	public static float[] addT_vv_rvec3f(ConstVec3F a, ConstVec3F b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b.x;
		res[1] = a.y + b.y;
		res[2] = a.z + b.z;
		
		return res;
	}
	
	public static float[] addT_vv_rvec3f(ConstVec3F a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b.x();
		res[1] = a.y + b.y();
		res[2] = a.z + b.z();
		
		return res;
	}
	
	public static float[] addT_va_rvec3f(ConstVec3F a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b[0];
		res[1] = a.y + b[1];
		res[2] = a.z + b[2];
		
		return res;
	}
	
	public static float[] addT_vs_rvec3f(ConstVec3F a, float b, @ExtractionParam float[] res)
	{
		res[0] = a.x + b;
		res[1] = a.y + b;
		res[2] = a.z + b;
		
		return res;
	}
	
	public static float[] addT_vc_rvec3f(ConstVec3F a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = a.x + bX;
		res[1] = a.y + bY;
		res[2] = a.z + bZ;
		
		return res;
	}
	
	public static float[] addT_vv_rvec3f(IVec3RF a, Vec3F b, @ExtractionParam float[] res)
	{
		res[0] = a.x() + b.x;
		res[1] = a.y() + b.y;
		res[2] = a.z() + b.z;
		
		return res;
	}
	
	public static float[] addT_vv_rvec3f(IVec3RF a, ConstVec3F b, @ExtractionParam float[] res)
	{
		res[0] = a.x() + b.x;
		res[1] = a.y() + b.y;
		res[2] = a.z() + b.z;
		
		return res;
	}
	
	public static float[] addT_av_rvec3f(float[] a, Vec3F b, @ExtractionParam float[] res)
	{
		res[0] = a[0] + b.x;
		res[1] = a[1] + b.y;
		res[2] = a[2] + b.z;
		
		return res;
	}
	
	public static float[] addT_av_rvec3f(float[] a, ConstVec3F b, @ExtractionParam float[] res)
	{
		res[0] = a[0] + b.x;
		res[1] = a[1] + b.y;
		res[2] = a[2] + b.z;
		
		return res;
	}
	
	public static float[] addT_sv_rvec3f(float a, Vec3F b, @ExtractionParam float[] res)
	{
		res[0] = a + b.x;
		res[1] = a + b.y;
		res[2] = a + b.z;
		
		return res;
	}
	
	public static float[] addT_sv_rvec3f(float a, ConstVec3F b, @ExtractionParam float[] res)
	{
		res[0] = a + b.x;
		res[1] = a + b.y;
		res[2] = a + b.z;
		
		return res;
	}
	
	public static float[] addT_cv_rvec3f(float aX, float aY, float aZ, Vec3F b, @ExtractionParam float[] res)
	{
		res[0] = aX + b.x;
		res[1] = aY + b.y;
		res[2] = aZ + b.z;
		
		return res;
	}
	
	public static float[] addT_cv_rvec3f(float aX, float aY, float aZ, ConstVec3F b, @ExtractionParam float[] res)
	{
		res[0] = aX + b.x;
		res[1] = aY + b.y;
		res[2] = aZ + b.z;
		
		return res;
	}
	
	public static float[] addT_rvec3f(float[] a, Vec3F b)
	{
		a[0] += b.x;
		a[1] += b.y;
		a[2] += b.z;
		
		return a;
	}
	
	public static float[] addT_rvec3f(float[] a, ConstVec3F b)
	{
		a[0] += b.x;
		a[1] += b.y;
		a[2] += b.z;
		
		return a;
	}
	
	public static <T extends IVec3WF> T addT_vv_ivec3f(Vec3F a, Vec3F b, @ExtractionParam T res)
	{
		res.set(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vv_ivec3f(Vec3F a, ConstVec3F b, @ExtractionParam T res)
	{
		res.set(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vv_ivec3f(Vec3F a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a.x + b.x(),
			a.y + b.y(),
			a.z + b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_va_ivec3f(Vec3F a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a.x + b[0],
			a.y + b[1],
			a.z + b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vs_ivec3f(Vec3F a, float b, @ExtractionParam T res)
	{
		res.set(
			a.x + b,
			a.y + b,
			a.z + b
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vc_ivec3f(Vec3F a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a.x + bX,
			a.y + bY,
			a.z + bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vv_ivec3f(ConstVec3F a, Vec3F b, @ExtractionParam T res)
	{
		res.set(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vv_ivec3f(ConstVec3F a, ConstVec3F b, @ExtractionParam T res)
	{
		res.set(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vv_ivec3f(ConstVec3F a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a.x + b.x(),
			a.y + b.y(),
			a.z + b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_va_ivec3f(ConstVec3F a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a.x + b[0],
			a.y + b[1],
			a.z + b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vs_ivec3f(ConstVec3F a, float b, @ExtractionParam T res)
	{
		res.set(
			a.x + b,
			a.y + b,
			a.z + b
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vc_ivec3f(ConstVec3F a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a.x + bX,
			a.y + bY,
			a.z + bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vv_ivec3f(IVec3RF a, Vec3F b, @ExtractionParam T res)
	{
		res.set(
			a.x() + b.x,
			a.y() + b.y,
			a.z() + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_vv_ivec3f(IVec3RF a, ConstVec3F b, @ExtractionParam T res)
	{
		res.set(
			a.x() + b.x,
			a.y() + b.y,
			a.z() + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_av_ivec3f(float[] a, Vec3F b, @ExtractionParam T res)
	{
		res.set(
			a[0] + b.x,
			a[1] + b.y,
			a[2] + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_av_ivec3f(float[] a, ConstVec3F b, @ExtractionParam T res)
	{
		res.set(
			a[0] + b.x,
			a[1] + b.y,
			a[2] + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_sv_ivec3f(float a, Vec3F b, @ExtractionParam T res)
	{
		res.set(
			a + b.x,
			a + b.y,
			a + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_sv_ivec3f(float a, ConstVec3F b, @ExtractionParam T res)
	{
		res.set(
			a + b.x,
			a + b.y,
			a + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_cv_ivec3f(float aX, float aY, float aZ, Vec3F b, @ExtractionParam T res)
	{
		res.set(
			aX + b.x,
			aY + b.y,
			aZ + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_cv_ivec3f(float aX, float aY, float aZ, ConstVec3F b, @ExtractionParam T res)
	{
		res.set(
			aX + b.x,
			aY + b.y,
			aZ + b.z
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T addT_ivec3f(T a, Vec3F b)
	{
		a.set(
			a.x() + b.x,
			a.y() + b.y,
			a.z() + b.z
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T addT_ivec3f(T a, ConstVec3F b)
	{
		a.set(
			a.x() + b.x,
			a.y() + b.y,
			a.z() + b.z
		);
		
		return a;
	}
	
	public static Vec3F add_vv_vec3f(Vec3F a, Vec3F b)
	{
		return new Vec3F(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
	}
	
	public static Vec3F add_vv_vec3f(Vec3F a, ConstVec3F b)
	{
		return new Vec3F(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
	}
	
	public static Vec3F add_vv_vec3f(Vec3F a, IVec3RF b)
	{
		return new Vec3F(
			a.x + b.x(),
			a.y + b.y(),
			a.z + b.z()
		);
	}
	
	public static Vec3F add_va_vec3f(Vec3F a, float[] b)
	{
		return new Vec3F(
			a.x + b[0],
			a.y + b[1],
			a.z + b[2]
		);
	}
	
	public static Vec3F add_vs_vec3f(Vec3F a, float b)
	{
		return new Vec3F(
			a.x + b,
			a.y + b,
			a.z + b
		);
	}
	
	public static Vec3F add_vc_vec3f(Vec3F a, float bX, float bY, float bZ)
	{
		return new Vec3F(
			a.x + bX,
			a.y + bY,
			a.z + bZ
		);
	}
	
	public static Vec3F add_vv_vec3f(ConstVec3F a, Vec3F b)
	{
		return new Vec3F(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
	}
	
	public static Vec3F add_vv_vec3f(ConstVec3F a, ConstVec3F b)
	{
		return new Vec3F(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
	}
	
	public static Vec3F add_vv_vec3f(ConstVec3F a, IVec3RF b)
	{
		return new Vec3F(
			a.x + b.x(),
			a.y + b.y(),
			a.z + b.z()
		);
	}
	
	public static Vec3F add_va_vec3f(ConstVec3F a, float[] b)
	{
		return new Vec3F(
			a.x + b[0],
			a.y + b[1],
			a.z + b[2]
		);
	}
	
	public static Vec3F add_vs_vec3f(ConstVec3F a, float b)
	{
		return new Vec3F(
			a.x + b,
			a.y + b,
			a.z + b
		);
	}
	
	public static Vec3F add_vc_vec3f(ConstVec3F a, float bX, float bY, float bZ)
	{
		return new Vec3F(
			a.x + bX,
			a.y + bY,
			a.z + bZ
		);
	}
	
	public static Vec3F add_vv_vec3f(IVec3RF a, Vec3F b)
	{
		return new Vec3F(
			a.x() + b.x,
			a.y() + b.y,
			a.z() + b.z
		);
	}
	
	public static Vec3F add_vv_vec3f(IVec3RF a, ConstVec3F b)
	{
		return new Vec3F(
			a.x() + b.x,
			a.y() + b.y,
			a.z() + b.z
		);
	}
	
	public static Vec3F add_vv_vec3f(IVec3RF a, IVec3RF b)
	{
		return new Vec3F(
			a.x() + b.x(),
			a.y() + b.y(),
			a.z() + b.z()
		);
	}
	
	public static Vec3F add_va_vec3f(IVec3RF a, float[] b)
	{
		return new Vec3F(
			a.x() + b[0],
			a.y() + b[1],
			a.z() + b[2]
		);
	}
	
	public static Vec3F add_vs_vec3f(IVec3RF a, float b)
	{
		return new Vec3F(
			a.x() + b,
			a.y() + b,
			a.z() + b
		);
	}
	
	public static Vec3F add_vc_vec3f(IVec3RF a, float bX, float bY, float bZ)
	{
		return new Vec3F(
			a.x() + bX,
			a.y() + bY,
			a.z() + bZ
		);
	}
	
	public static ConstVec3F add_vv_cvec3f(Vec3F a, Vec3F b)
	{
		return new ConstVec3F(
				a.x + b.x,
				a.y + b.y,
				a.z + b.z
			);
	}
	
	public static Vec3F addT_vv_vec3f(Vec3F a, Vec3F b, Vec3F res)
	{
		return res.set(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
	}
	
	public static Vec3F addT_vv_vec3f(Vec3F a, Vec3F b)
	{
		return a.set(
			a.x + b.x,
			a.y + b.y,
			a.z + b.z
		);
	}
	
	public static float[] sub_vv_rvec3f(IVec3RF a, IVec3RF b)
	{
		return new float[] {
			a.x() - b.x(),
			a.y() - b.y(),
			a.z() - b.z(),
		};
	}
	
	public static float[] sub_va_rvec3f(IVec3RF a, float[] b)
	{
		return new float[] {
			a.x() - b[0],
			a.y() - b[1],
			a.z() - b[2],
		};
	}
	
	public static float[] sub_vs_rvec3f(IVec3RF a, float b)
	{
		return new float[] {
			a.x() - b,
			a.y() - b,
			a.z() - b,
		};
	}
	
	public static float[] sub_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ)
	{
		return new float[] {
			a.x() - bX,
			a.y() - bY,
			a.z() - bZ,
		};
	}
	
	public static float[] sub_av_rvec3f(float[] a, IVec3RF b)
	{
		return new float[] {
			a[0] - b.x(),
			a[1] - b.y(),
			a[2] - b.z(),
		};
	}
	
	public static float[] sub_av_rvec3f(float a, IVec3RF b)
	{
		return new float[] {
			a - b.x(),
			a - b.y(),
			a - b.z(),
		};
	}
	
	public static float[] sub_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b)
	{
		return new float[] {
			aX - b.x(),
			aY - b.y(),
			aZ - b.z(),
		};
	}
	
	public static float[] subT_vv_rvec3f(IVec3RF a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a.x() - b.x();
		res[1] = a.y() - b.y();
		res[2] = a.z() - b.z();
		
		return res;
	}
	
	public static float[] subT_va_rvec3f(IVec3RF a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = a.x() - b[0];
		res[1] = a.y() - b[1];
		res[2] = a.z() - b[2];
		
		return res;
	}
	
	public static float[] subT_vs_rvec3f(IVec3RF a, float b, @ExtractionParam float[] res)
	{
		res[0] = a.x() - b;
		res[1] = a.y() - b;
		res[2] = a.z() - b;
		
		return res;
	}
	
	public static float[] subT_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = a.x() - bX;
		res[1] = a.y() - bY;
		res[2] = a.z() - bZ;
		
		return res;
	}
	
	public static float[] subT_av_rvec3f(float[] a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a[0] - b.x();
		res[1] = a[1] - b.y();
		res[2] = a[2] - b.z();
		
		return res;
	}
	
	public static float[] subT_av_rvec3f(float a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a - b.x();
		res[1] = a - b.y();
		res[2] = a - b.z();
		
		return res;
	}
	
	public static float[] subT_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = aX - b.x();
		res[1] = aY - b.y();
		res[2] = aZ - b.z();
		
		return res;
	}
	
	public static float[] subT_rvec3f(float[] a, IVec3RF b)
	{
		a[0] -= b.x();
		a[1] -= b.y();
		a[2] -= b.z();
		
		return a;
	}
	
	public static <T extends IVec3WF> T subT_vv_ivec3f(IVec3RF a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a.x() - b.x(),
			a.y() - b.y(),
			a.z() - b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_va_ivec3f(IVec3RF a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a.x() - b[0],
			a.y() - b[1],
			a.z() - b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_vs_ivec3f(IVec3RF a, float b, @ExtractionParam T res)
	{
		res.set(
			a.x() - b,
			a.y() - b,
			a.z() - b
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_vc_ivec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a.x() - bX,
			a.y() - bY,
			a.z() - bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_av_ivec3f(float[] a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a[0] - b.x(),
			a[1] - b.y(),
			a[2] - b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_aa_ivec3f(float[] a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a[0] - b[0],
			a[1] - b[1],
			a[2] - b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_as_ivec3f(float[] a, float b, @ExtractionParam T res)
	{
		res.set(
			a[0] - b,
			a[1] - b,
			a[2] - b
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_ac_ivec3f(float[] a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a[0] - bX,
			a[1] - bY,
			a[2] - bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_sv_ivec3f(float a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a - b.x(),
			a - b.y(),
			a - b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_sa_ivec3f(float a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a - b[0],
			a - b[1],
			a - b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_ss_ivec3f(float a, float b, @ExtractionParam T res)
	{
		float v = a - b;
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_sc_ivec3f(float a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a - bX,
			a - bY,
			a - bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_cv_ivec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			aX - b.x(),
			aY - b.y(),
			aZ - b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_ca_ivec3f(float aX, float aY, float aZ, float[] b, @ExtractionParam T res)
	{
		res.set(
			aX - b[0],
			aY - b[1],
			aZ - b[2]
		);
		
		return res;
	}

	public static <T extends IVec3WF> T subT_cs_ivec3f(float aX, float aY, float aZ, float b, @ExtractionParam T res)
	{
		res.set(
			aX - b,
			aY - b,
			aZ - b
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_cc_ivec3f(float aX, float aY, float aZ, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			aX - bX,
			aY - bY,
			aZ - bZ
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T subT_ivec3f(T a, IVec3RF b)
	{
		a.set(
			a.x() - b.x(),
			a.y() - b.y(),
			a.z() - b.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T subT_ivec3f(T a, float[] b)
	{
		a.set(
			a.x() - b[0],
			a.y() - b[1],
			a.z() - b[2]
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T subT_ivec3f(T a, float b)
	{
		a.set(
			a.x() - b,
			a.y() - b,
			a.z() - b
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T subT_ivec3f(T a, float bX, float bY, float bZ)
	{
		a.set(
			a.x() - bX,
			a.y() - bY,
			a.z() - bZ
		);
		
		return a;
	}
	
	public static float[] revSub_vv_rvec3f(IVec3RF a, IVec3RF b)
	{
		return new float[] {
			b.x() - a.x(),
			b.y() - a.y(),
			b.z() - a.z(),
		};
	}
	
	public static float[] revSub_va_rvec3f(IVec3RF a, float[] b)
	{
		return new float[] {
			b[0] - a.x(),
			b[1] - a.y(),
			b[2] - a.z(),
		};
	}
	
	public static float[] revSub_vs_rvec3f(IVec3RF a, float b)
	{
		return new float[] {
			b - a.x(),
			b - a.y(),
			b - a.z(),
		};
	}
	
	public static float[] revSub_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ)
	{
		return new float[] {
			bX - a.x(),
			bY - a.y(),
			bZ - a.z(),
		};
	}
	
	public static float[] revSub_av_rvec3f(float[] a, IVec3RF b)
	{
		return new float[] {
			b.x() - a[0],
			b.y() - a[1],
			b.z() - a[2],
		};
	}
	
	public static float[] revSub_sv_rvec3f(float a, IVec3RF b)
	{
		return new float[] {
			b.x() - a,
			b.y() - a,
			b.z() - a,
		};
	}
	
	public static float[] revSub_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b)
	{
		return new float[] {
			b.x() - aX,
			b.y() - aY,
			b.z() - aZ,
		};
	}
	
	public static float[] revSubT_vv_rvec3f(IVec3RF a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = b.x() - a.x();
		res[1] = b.y() - a.y();
		res[2] = b.z() - a.z();
		
		return res;
	}
	
	public static float[] revSubT_va_rvec3f(IVec3RF a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = b[0] - a.x();
		res[1] = b[1] - a.y();
		res[2] = b[2] - a.z();
		
		return res;
	}
	
	public static float[] revSubT_vs_rvec3f(IVec3RF a, float b, @ExtractionParam float[] res)
	{
		res[0] = b - a.x();
		res[1] = b - a.y();
		res[2] = b - a.z();
		
		return res;
	}
	
	public static float[] revSubT_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = bX - a.x();
		res[1] = bY - a.y();
		res[2] = bZ - a.z();
		
		return res;
	}
	
	public static float[] revSubT_av_rvec3f(float[] a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = b.x() - a[0];
		res[1] = b.y() - a[1];
		res[2] = b.z() - a[2];
		
		return res;
	}
	
	public static float[] revSubT_sv_rvec3f(float a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = b.x() - a;
		res[1] = b.y() - a;
		res[2] = b.z() - a;
		
		return res;
	}
	
	public static float[] revSubT_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = b.x() - aX;
		res[1] = b.y() - aY;
		res[2] = b.z() - aZ;
		
		return res;
	}
	
	public static float[] revSubT_av_rvec3f(float[] a, IVec3RF b)
	{
		a[0] = b.x() - a[0];
		a[1] = b.y() - a[1];
		a[2] = b.z() - a[2];
		
		return a;
	}
	
	public static <T extends IVec3WF> T revSubT_vv_ivec3f(IVec3RF a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			b.x() - a.x(),
			b.y() - a.y(),
			b.z() - a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_va_ivec3f(IVec3RF a, float[] b, @ExtractionParam T res)
	{
		res.set(
			b[0] - a.x(),
			b[1] - a.y(),
			b[2] - a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_vs_ivec3f(IVec3RF a, float b, @ExtractionParam T res)
	{
		res.set(
			b - a.x(),
			b - a.y(),
			b - a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_vc_ivec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			bX - a.x(),
			bY - a.y(),
			bZ - a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_av_ivec3f(float[] a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			b.x() - a[0],
			b.y() - a[1],
			b.z() - a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_aa_ivec3f(float[] a, float[] b, @ExtractionParam T res)
	{
		res.set(
			b[0] - a[0],
			b[1] - a[1],
			b[2] - a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_as_ivec3f(float[] a, float b, @ExtractionParam T res)
	{
		res.set(
			b - a[0],
			b - a[1],
			b - a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_ac_ivec3f(float[] a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			bX - a[0],
			bY - a[1],
			bZ - a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_sv_ivec3f(float a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			b.x() - a,
			b.y() - a,
			b.z() - a
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_sa_ivec3f(float a, float[] b, @ExtractionParam T res)
	{
		res.set(
			b[0] - a,
			b[1] - a,
			b[2] - a
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_ss_ivec3f(float a, float b, @ExtractionParam T res)
	{
		float v = b - a;
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_sc_ivec3f(float a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			bX - a,
			bY - a,
			bZ - a
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_cv_ivec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			b.x() - aX,
			b.y() - aY,
			b.z() - aZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_ca_ivec3f(float aX, float aY, float aZ, float[] b, @ExtractionParam T res)
	{
		res.set(
			b[0] - aX,
			b[1] - aY,
			b[2] - aZ
		);
		
		return res;
	}

	public static <T extends IVec3WF> T revSubT_cs_ivec3f(float aX, float aY, float aZ, float b, @ExtractionParam T res)
	{
		res.set(
			b - aX,
			b - aY,
			b - aZ
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_cc_ivec3f(float aX, float aY, float aZ, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			bX - aX,
			bY - aY,
			bZ - aZ
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revSubT_ivec3f(T a, IVec3RF b)
	{
		a.set(
			b.x() - a.x(),
			b.y() - a.y(),
			b.z() - a.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revSubT_ivec3f(T a, float[] b)
	{
		a.set(
			b[0] - a.x(),
			b[1] - a.y(),
			b[2] - a.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revSubT_ivec3f(T a, float b)
	{
		a.set(
			b - a.x(),
			b - a.y(),
			b - a.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revSubT_ivec3f(T a, float bX, float bY, float bZ)
	{
		a.set(
			bX - a.x(),
			bY - a.y(),
			bZ - a.z()
		);
		
		return a;
	}
	
	public static float[] mul_vv_rvec3f(IVec3RF a, IVec3RF b)
	{
		return new float[] {
			a.x() * b.x(),
			a.y() * b.y(),
			a.z() * b.z(),
		};
	}
	
	public static float[] mul_va_rvec3f(IVec3RF a, float[] b)
	{
		return new float[] {
			a.x() * b[0],
			a.y() * b[1],
			a.z() * b[2],
		};
	}
	
	public static float[] mul_vs_rvec3f(IVec3RF a, float b)
	{
		return new float[] {
			a.x() * b,
			a.y() * b,
			a.z() * b,
		};
	}
	
	public static float[] mul_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ)
	{
		return new float[] {
			a.x() * bX,
			a.y() * bY,
			a.z() * bZ,
		};
	}
	
	public static float[] mul_av_rvec3f(float[] a, IVec3RF b)
	{
		return new float[] {
			a[0] * b.x(),
			a[1] * b.y(),
			a[2] * b.z(),
		};
	}
	
	public static float[] mul_sv_rvec3f(float a, IVec3RF b)
	{
		return new float[] {
			a * b.x(),
			a * b.y(),
			a * b.z(),
		};
	}
	
	public static float[] mul_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b)
	{
		return new float[] {
			aX * b.x(),
			aY * b.y(),
			aZ * b.z(),
		};
	}
	
	public static float[] mulT_vv_rvec3f(IVec3RF a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a.x() * b.x();
		res[1] = a.y() * b.y();
		res[2] = a.z() * b.z();
		
		return res;
	}
	
	public static float[] mulT_va_rvec3f(IVec3RF a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = a.x() * b[0];
		res[1] = a.y() * b[1];
		res[2] = a.z() * b[2];
		
		return res;
	}
	
	public static float[] mulT_vs_rvec3f(IVec3RF a, float b, @ExtractionParam float[] res)
	{
		res[0] = a.x() * b;
		res[1] = a.y() * b;
		res[2] = a.z() * b;
		
		return res;
	}
	
	public static float[] mulT_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = a.x() * bX;
		res[1] = a.y() * bY;
		res[2] = a.z() * bZ;
		
		return res;
	}
	
	public static float[] mulT_av_rvec3f(float[] a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a[0] * b.x();
		res[1] = a[1] * b.y();
		res[2] = a[2] * b.z();
		
		return res;
	}
	
	public static float[] mulT_sv_rvec3f(float a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a * b.x();
		res[1] = a * b.y();
		res[2] = a * b.z();
		
		return res;
	}
	
	public static float[] mulT_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = aX * b.x();
		res[1] = aY * b.y();
		res[2] = aZ * b.z();
		
		return res;
	}
	
	public static float[] mulT_rvec3f(float[] a, IVec3RF b)
	{
		a[0] *= b.x();
		a[1] *= b.y();
		a[2] *= b.z();
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulT_vv_ivec3f(IVec3RF a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a.x() * b.x(),
			a.y() * b.y(),
			a.z() * b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_va_ivec3f(IVec3RF a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a.x() * b[0],
			a.y() * b[1],
			a.z() * b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_vs_ivec3f(IVec3RF a, float b, @ExtractionParam T res)
	{
		res.set(
			a.x() * b,
			a.y() * b,
			a.z() * b
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_vc_ivec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a.x() * bX,
			a.y() * bY,
			a.z() * bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_av_ivec3f(float[] a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a[0] * b.x(),
			a[1] * b.y(),
			a[2] * b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_aa_ivec3f(float[] a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a[0] * b[0],
			a[1] * b[1],
			a[2] * b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_as_ivec3f(float[] a, float b, @ExtractionParam T res)
	{
		res.set(
			a[0] * b,
			a[1] * b,
			a[2] * b
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_ac_ivec3f(float[] a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a[0] * bX,
			a[1] * bY,
			a[2] * bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_sv_ivec3f(float a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a * b.x(),
			a * b.y(),
			a * b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_sa_ivec3f(float a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a * b[0],
			a * b[1],
			a * b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_ss_ivec3f(float a, float b, @ExtractionParam T res)
	{
		float v = a * b;
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_sc_ivec3f(float a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a * bX,
			a * bY,
			a * bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_cv_ivec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			aX * b.x(),
			aY * b.y(),
			aZ * b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_ca_ivec3f(float aX, float aY, float aZ, float[] b, @ExtractionParam T res)
	{
		res.set(
			aX * b[0],
			aY * b[1],
			aZ * b[2]
		);
		
		return res;
	}

	public static <T extends IVec3WF> T mulT_cs_ivec3f(float aX, float aY, float aZ, float b, @ExtractionParam T res)
	{
		res.set(
			aX * b,
			aY * b,
			aZ * b
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_cc_ivec3f(float aX, float aY, float aZ, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			aX * bX,
			aY * bY,
			aZ * bZ
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulT_ivec3f(T a, IVec3RF b)
	{
		a.set(
			a.x() * b.x(),
			a.y() * b.y(),
			a.z() * b.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulT_ivec3f(T a, float[] b)
	{
		a.set(
			a.x() * b[0],
			a.y() * b[1],
			a.z() * b[2]
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulT_ivec3f(T a, float b)
	{
		a.set(
			a.x() * b,
			a.y() * b,
			a.z() * b
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulT_ivec3f(T a, float bX, float bY, float bZ)
	{
		a.set(
			a.x() * bX,
			a.y() * bY,
			a.z() * bZ
		);
		
		return a;
	}
	
	public static float[] div_vv_rvec3f(IVec3RF a, IVec3RF b)
	{
		return new float[] {
			a.x() / b.x(),
			a.y() / b.y(),
			a.z() / b.z(),
		};
	}
	
	public static float[] div_va_rvec3f(IVec3RF a, float[] b)
	{
		return new float[] {
			a.x() / b[0],
			a.y() / b[1],
			a.z() / b[2],
		};
	}
	
	public static float[] div_vs_rvec3f(IVec3RF a, float value)
	{
		return new float[] {
			a.x() / value,
			a.y() / value,
			a.z() / value,
		};
	}
	
	public static float[] div_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ)
	{
		return new float[] {
			a.x() / bX,
			a.y() / bY,
			a.z() / bZ,
		};
	}
	
	public static float[] div_av_rvec3f(float[] a, IVec3RF b)
	{
		return new float[] {
			a[0] / b.x(),
			a[1] / b.y(),
			a[2] / b.z(),
		};
	}
	
	public static float[] div_sv_rvec3f(float a, IVec3RF b)
	{
		return new float[] {
			a / b.x(),
			a / b.y(),
			a / b.z(),
		};
	}
	
	public static float[] div_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b)
	{
		return new float[] {
			aX / b.x(),
			aY / b.y(),
			aZ / b.z(),
		};
	}
	
	public static float[] divT_vv_rvec3f(IVec3RF a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a.x() / b.x();
		res[1] = a.y() / b.y();
		res[2] = a.z() / b.z();
		
		return res;
	}
	
	public static float[] divT_va_rvec3f(IVec3RF a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = a.x() / b[0];
		res[1] = a.y() / b[1];
		res[2] = a.z() / b[2];
		
		return res;
	}
	
	public static float[] divT_vs_rvec3f(IVec3RF a, float value, @ExtractionParam float[] res)
	{
		res[0] = a.x() / value;
		res[1] = a.y() / value;
		res[2] = a.z() / value;
		
		return res;
	}
	
	public static float[] divT_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = a.x() / bX;
		res[1] = a.y() / bY;
		res[2] = a.z() / bZ;
		
		return res;
	}
	
	public static float[] divT_av_rvec3f(float[] a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a[0] / b.x();
		res[1] = a[1] / b.y();
		res[2] = a[2] / b.z();
		
		return res;
	}
	
	public static float[] divT_sv_rvec3f(float a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = a / b.x();
		res[1] = a / b.y();
		res[2] = a / b.z();
		
		return res;
	}
	
	public static float[] divT_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = aX / b.x();
		res[1] = aY / b.y();
		res[2] = aZ / b.z();
		
		return res;
	}
	
	public static float[] divT_rvec3f(float[] a, IVec3RF b)
	{
		a[0] /= b.x();
		a[1] /= b.y();
		a[2] /= b.z();
		
		return a;
	}
	
	public static <T extends IVec3WF> T divT_vv_ivec3f(IVec3RF a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a.x() / b.x(),
			a.y() / b.y(),
			a.z() / b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_va_ivec3f(IVec3RF a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a.x() / b[0],
			a.y() / b[1],
			a.z() / b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_vs_ivec3f(IVec3RF a, float b, @ExtractionParam T res)
	{
		res.set(
			a.x() / b,
			a.y() / b,
			a.z() / b
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_vc_ivec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a.x() / bX,
			a.y() / bY,
			a.z() / bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_av_ivec3f(float[] a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a[0] / b.x(),
			a[1] / b.y(),
			a[2] / b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_aa_ivec3f(float[] a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a[0] / b[0],
			a[1] / b[1],
			a[2] / b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_as_ivec3f(float[] a, float b, @ExtractionParam T res)
	{
		res.set(
			a[0] / b,
			a[1] / b,
			a[2] / b
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_ac_ivec3f(float[] a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a[0] / bX,
			a[1] / bY,
			a[2] / bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_sv_ivec3f(float a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			a / b.x(),
			a / b.y(),
			a / b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_sa_ivec3f(float a, float[] b, @ExtractionParam T res)
	{
		res.set(
			a / b[0],
			a / b[1],
			a / b[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_ss_ivec3f(float a, float b, @ExtractionParam T res)
	{
		float v = a / b;
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_sc_ivec3f(float a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			a / bX,
			a / bY,
			a / bZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_cv_ivec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			aX / b.x(),
			aY / b.y(),
			aZ / b.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_ca_ivec3f(float aX, float aY, float aZ, float[] b, @ExtractionParam T res)
	{
		res.set(
			aX / b[0],
			aY / b[1],
			aZ / b[2]
		);
		
		return res;
	}

	public static <T extends IVec3WF> T divT_cs_ivec3f(float aX, float aY, float aZ, float b, @ExtractionParam T res)
	{
		res.set(
			aX / b,
			aY / b,
			aZ / b
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_cc_ivec3f(float aX, float aY, float aZ, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			aX / bX,
			aY / bY,
			aZ / bZ
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T divT_ivec3f(T a, IVec3RF b)
	{
		a.set(
			a.x() / b.x(),
			a.y() / b.y(),
			a.z() / b.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T divT_ivec3f(T a, float[] b)
	{
		a.set(
			a.x() / b[0],
			a.y() / b[1],
			a.z() / b[2]
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T divT_ivec3f(T a, float b)
	{
		a.set(
			a.x() / b,
			a.y() / b,
			a.z() / b
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T divT_ivec3f(T a, float bX, float bY, float bZ)
	{
		a.set(
			a.x() / bX,
			a.y() / bY,
			a.z() / bZ
		);
		
		return a;
	}
	
	public static float[] revDiv_vv_rvec3f(IVec3RF a, IVec3RF b)
	{
		return new float[] {
			b.x() / a.x(),
			b.y() / a.y(),
			b.z() / a.z(),
		};
	}
	
	public static float[] revDiv_va_rvec3f(IVec3RF a, float[] b)
	{
		return new float[] {
			b[0] / a.x(),
			b[1] / a.y(),
			b[2] / a.z(),
		};
	}
	
	public static float[] revDiv_vs_rvec3f(IVec3RF a, float b)
	{
		return new float[] {
			b / a.x(),
			b / a.y(),
			b / a.z(),
		};
	}
	
	public static float[] revDiv_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ)
	{
		return new float[] {
			bX / a.x(),
			bY / a.y(),
			bZ / a.z(),
		};
	}
	
	public static float[] revDiv_av_rvec3f(float[] a, IVec3RF b)
	{
		return new float[] {
			b.x() / a[0],
			b.y() / a[1],
			b.z() / a[2],
		};
	}
	
	public static float[] revDiv_sv_rvec3f(float a, IVec3RF b)
	{
		return new float[] {
			b.x() / a,
			b.y() / a,
			b.z() / a,
		};
	}
	
	public static float[] revDiv_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b)
	{
		return new float[] {
			b.x() / aX,
			b.y() / aY,
			b.z() / aZ,
		};
	}
	
	public static float[] revDivT_vv_rvec3f(IVec3RF a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = b.x() / a.x();
		res[1] = b.y() / a.y();
		res[2] = b.z() / a.z();
		
		return res;
	}
	
	public static float[] revDivT_va_rvec3f(IVec3RF a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = b[0] / a.x();
		res[1] = b[1] / a.y();
		res[2] = b[2] / a.z();
		
		return res;
	}
	
	public static float[] revDivT_vs_rvec3f(IVec3RF a, float b, @ExtractionParam float[] res)
	{
		res[0] = b / a.x();
		res[1] = b / a.y();
		res[2] = b / a.z();
		
		return res;
	}
	
	public static float[] revDivT_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = bX / a.x();
		res[1] = bY / a.y();
		res[2] = bZ / a.z();
		
		return res;
	}
	
	public static float[] revDivT_av_rvec3f(float[] a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = b.x() / a[0];
		res[1] = b.y() / a[1];
		res[2] = b.z() / a[2];
		
		return res;
	}
	
	public static float[] revDivT_sv_rvec3f(float a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = b.x() / a;
		res[1] = b.y() / a;
		res[2] = b.z() / a;
		
		return res;
	}
	
	public static float[] revDivT_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = b.x() / aX;
		res[1] = b.y() / aY;
		res[2] = b.z() / aZ;
		
		return res;
	}
	
	public static float[] revDivT_av_rvec3f(float[] a, IVec3RF b)
	{
		a[0] = b.x() / a[0];
		a[1] = b.y() / a[1];
		a[2] = b.z() / a[2];
		
		return a;
	}
	
	public static <T extends IVec3WF> T revDivT_vv_ivec3f(IVec3RF a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			b.x() / a.x(),
			b.y() / a.y(),
			b.z() / a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_va_ivec3f(IVec3RF a, float[] b, @ExtractionParam T res)
	{
		res.set(
			b[0] / a.x(),
			b[1] / a.y(),
			b[2] / a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_vs_ivec3f(IVec3RF a, float b, @ExtractionParam T res)
	{
		res.set(
			b / a.x(),
			b / a.y(),
			b / a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_vc_ivec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			bX / a.x(),
			bY / a.y(),
			bZ / a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_av_ivec3f(float[] a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			b.x() / a[0],
			b.y() / a[1],
			b.z() / a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_aa_ivec3f(float[] a, float[] b, @ExtractionParam T res)
	{
		res.set(
			b[0] / a[0],
			b[1] / a[1],
			b[2] / a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_as_ivec3f(float[] a, float b, @ExtractionParam T res)
	{
		res.set(
			b / a[0],
			b / a[1],
			b / a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_ac_ivec3f(float[] a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			bX / a[0],
			bY / a[1],
			bZ / a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_sv_ivec3f(float a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			b.x() / a,
			b.y() / a,
			b.z() / a
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_sa_ivec3f(float a, float[] b, @ExtractionParam T res)
	{
		res.set(
			b[0] / a,
			b[1] / a,
			b[2] / a
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_ss_ivec3f(float a, float b, @ExtractionParam T res)
	{
		float v = b / a;
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_sc_ivec3f(float a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			bX / a,
			bY / a,
			bZ / a
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_cv_ivec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			b.x() / aX,
			b.y() / aY,
			b.z() / aZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_ca_ivec3f(float aX, float aY, float aZ, float[] b, @ExtractionParam T res)
	{
		res.set(
			b[0] / aX,
			b[1] / aY,
			b[2] / aZ
		);
		
		return res;
	}

	public static <T extends IVec3WF> T revDivT_cs_ivec3f(float aX, float aY, float aZ, float b, @ExtractionParam T res)
	{
		res.set(
			b / aX,
			b / aY,
			b / aZ
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_cc_ivec3f(float aX, float aY, float aZ, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			bX / aX,
			bY / aY,
			bZ / aZ
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revDivT_ivec3f(T a, IVec3RF b)
	{
		a.set(
			b.x() / a.x(),
			b.y() / a.y(),
			b.z() / a.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revDivT_ivec3f(T a, float[] b)
	{
		a.set(
			b[0] / a.x(),
			b[1] / a.y(),
			b[2] / a.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revDivT_ivec3f(T a, float b)
	{
		a.set(
			b / a.x(),
			b / a.y(),
			b / a.z()
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revDivT_ivec3f(T a, float bX, float bY, float bZ)
	{
		a.set(
			bX / a.x(),
			bY / a.y(),
			bZ / a.z()
		);
		
		return a;
	}
	
	public static float[] pow_vv_rvec3f(IVec3RF a, IVec3RF b)
	{
		return new float[] {
			MathUtils.pow(a.x(), b.x()),
			MathUtils.pow(a.y(), b.y()),
			MathUtils.pow(a.z(), b.z()),
		};
	}
	
	public static float[] pow_va_rvec3f(IVec3RF a, float[] b)
	{
		return new float[] {
			MathUtils.pow(a.x(), b[0]),
			MathUtils.pow(a.y(), b[1]),
			MathUtils.pow(a.z(), b[2]),
		};
	}
	
	public static float[] pow_vs_rvec3f(IVec3RF a, float b)
	{
		return new float[] {
			MathUtils.pow(a.x(), b),
			MathUtils.pow(a.y(), b),
			MathUtils.pow(a.z(), b),
		};
	}
	
	public static float[] pow_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ)
	{
		return new float[] {
			MathUtils.pow(a.x(), bX),
			MathUtils.pow(a.y(), bY),
			MathUtils.pow(a.z(), bZ),
		};
	}
	
	public static float[] pow_av_rvec3f(float[] a, IVec3RF b)
	{
		return new float[] {
			MathUtils.pow(a[0], b.x()),
			MathUtils.pow(a[1], b.y()),
			MathUtils.pow(a[2], b.z()),
		};
	}
	
	public static float[] pow_sv_rvec3f(float a, IVec3RF b)
	{
		return new float[] {
			MathUtils.pow(a, b.x()),
			MathUtils.pow(a, b.y()),
			MathUtils.pow(a, b.z()),
		};
	}
	
	public static float[] pow_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b)
	{
		return new float[] {
			MathUtils.pow(aX, b.x()),
			MathUtils.pow(aY, b.y()),
			MathUtils.pow(aZ, b.z()),
		};
	}
	
	public static float[] powT_vv_rvec3f(IVec3RF a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(a.x(), b.x());
		res[1] = MathUtils.pow(a.y(), b.y());
		res[2] = MathUtils.pow(a.z(), b.z());
		
		return res;
	}
	
	public static float[] powT_va_rvec3f(IVec3RF a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(a.x(), b[0]);
		res[1] = MathUtils.pow(a.y(), b[1]);
		res[2] = MathUtils.pow(a.z(), b[2]);
		
		return res;
	}
	
	public static float[] powT_vs_rvec3f(IVec3RF a, float b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(a.x(), b);
		res[1] = MathUtils.pow(a.y(), b);
		res[2] = MathUtils.pow(a.z(), b);
		
		return res;
	}
	
	public static float[] powT_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(a.x(), bX);
		res[1] = MathUtils.pow(a.y(), bY);
		res[2] = MathUtils.pow(a.z(), bZ);
		
		return res;
	}
	
	public static float[] powT_av_rvec3f(float[] a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(a[0], b.x());
		res[1] = MathUtils.pow(a[1], b.y());
		res[2] = MathUtils.pow(a[2], b.z());
		
		return res;
	}
	
	public static float[] powT_sv_rvec3f(float a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(a, b.x());
		res[1] = MathUtils.pow(a, b.y());
		res[2] = MathUtils.pow(a, b.z());
		
		return res;
	}
	
	public static float[] powT_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(aX, b.x());
		res[1] = MathUtils.pow(aY, b.y());
		res[2] = MathUtils.pow(aZ, b.z());
		
		return res;
	}

	public static float[] powT_av_rvec3f(float[] a, IVec3RF b)
	{
		a[0] = MathUtils.pow(a[0], b.x());
		a[1] = MathUtils.pow(a[1], b.y());
		a[2] = MathUtils.pow(a[2], b.z());
		
		return a;
	}
	
	public static <T extends IVec3WF> T powT_vv_ivec3f(IVec3RF a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a.x(), b.x()),
			MathUtils.pow(a.y(), b.y()),
			MathUtils.pow(a.z(), b.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_va_ivec3f(IVec3RF a, float[] b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a.x(), b[0]),
			MathUtils.pow(a.y(), b[1]),
			MathUtils.pow(a.z(), b[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_vs_ivec3f(IVec3RF a, float b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a.x(), b),
			MathUtils.pow(a.y(), b),
			MathUtils.pow(a.z(), b)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_vc_ivec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a.x(), bX),
			MathUtils.pow(a.y(), bY),
			MathUtils.pow(a.z(), bZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_av_ivec3f(float[] a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a[0], b.x()),
			MathUtils.pow(a[1], b.y()),
			MathUtils.pow(a[2], b.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_aa_ivec3f(float[] a, float[] b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a[0], b[0]),
			MathUtils.pow(a[1], b[1]),
			MathUtils.pow(a[2], b[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_as_ivec3f(float[] a, float b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a[0], b),
			MathUtils.pow(a[1], b),
			MathUtils.pow(a[2], b)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_ac_ivec3f(float[] a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a[0], bX),
			MathUtils.pow(a[1], bY),
			MathUtils.pow(a[2], bZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_sv_ivec3f(float a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a, b.x()),
			MathUtils.pow(a, b.y()),
			MathUtils.pow(a, b.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_sa_ivec3f(float a, float[] b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a, b[0]),
			MathUtils.pow(a, b[1]),
			MathUtils.pow(a, b[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_ss_ivec3f(float a, float b, @ExtractionParam T res)
	{
		float v = MathUtils.pow(a, b);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_sc_ivec3f(float a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(a, bX),
			MathUtils.pow(a, bY),
			MathUtils.pow(a, bZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_cv_ivec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(aX, b.x()),
			MathUtils.pow(aY, b.y()),
			MathUtils.pow(aZ, b.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_ca_ivec3f(float aX, float aY, float aZ, float[] b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(aX, b[0]),
			MathUtils.pow(aY, b[1]),
			MathUtils.pow(aZ, b[2])
		);
		
		return res;
	}

	public static <T extends IVec3WF> T powT_cs_ivec3f(float aX, float aY, float aZ, float b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(aX, b),
			MathUtils.pow(aY, b),
			MathUtils.pow(aZ, b)
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_cc_ivec3f(float aX, float aY, float aZ, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(aX, bX),
			MathUtils.pow(aY, bY),
			MathUtils.pow(aZ, bZ)
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T powT_ivec3f(T a, IVec3RF b)
	{
		a.set(
			MathUtils.pow(a.x(), b.x()),
			MathUtils.pow(a.y(), b.y()),
			MathUtils.pow(a.z(), b.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T powT_ivec3f(T a, float[] b)
	{
		a.set(
			MathUtils.pow(a.x(), b[0]),
			MathUtils.pow(a.y(), b[1]),
			MathUtils.pow(a.z(), b[2])
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T powT_ivec3f(T a, float b)
	{
		a.set(
			MathUtils.pow(a.x(), b),
			MathUtils.pow(a.y(), b),
			MathUtils.pow(a.z(), b)
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T powT_ivec3f(T a, float bX, float bY, float bZ)
	{
		a.set(
			MathUtils.pow(a.x(), bX),
			MathUtils.pow(a.y(), bY),
			MathUtils.pow(a.z(), bZ)
		);
		
		return a;
	}
	
	public static float[] revPow_vv_rvec3f(IVec3RF a, IVec3RF b)
	{
		return new float[] {
			MathUtils.pow(b.x(), a.x()),
			MathUtils.pow(b.y(), a.y()),
			MathUtils.pow(b.z(), a.z()),
		};
	}
	
	public static float[] revPow_va_rvec3f(IVec3RF a, float[] b)
	{
		return new float[] {
			MathUtils.pow(b[0], a.x()),
			MathUtils.pow(b[1], a.y()),
			MathUtils.pow(b[2], a.z()),
		};
	}
	
	public static float[] revPow_vs_rvec3f(IVec3RF a, float value)
	{
		return new float[] {
			MathUtils.pow(value, a.x()),
			MathUtils.pow(value, a.y()),
			MathUtils.pow(value, a.z()),
		};
	}
	
	public static float[] revPow_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ)
	{
		return new float[] {
			MathUtils.pow(bX, a.x()),
			MathUtils.pow(bY, a.y()),
			MathUtils.pow(bZ, a.z()),
		};
	}
	
	public static float[] revPow_av_rvec3f(float[] a, IVec3RF b)
	{
		return new float[] {
			MathUtils.pow(b.x(), a[0]),
			MathUtils.pow(b.y(), a[1]),
			MathUtils.pow(b.z(), a[2]),
		};
	}
	
	public static float[] revPow_sv_rvec3f(float a, IVec3RF b)
	{
		return new float[] {
			MathUtils.pow(b.x(), a),
			MathUtils.pow(b.y(), a),
			MathUtils.pow(b.z(), a),
		};
	}
	
	public static float[] revPow_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b)
	{
		return new float[] {
			MathUtils.pow(b.x(), aX),
			MathUtils.pow(b.y(), aY),
			MathUtils.pow(b.z(), aZ),
		};
	}
	
	public static float[] revPowT_vv_rvec3f(IVec3RF a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(b.x(), a.x());
		res[1] = MathUtils.pow(b.y(), a.y());
		res[2] = MathUtils.pow(b.z(), a.z());
		
		return res;
	}
	
	public static float[] revPowT_va_rvec3f(IVec3RF a, float[] b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(b[0], a.x());
		res[1] = MathUtils.pow(b[1], a.y());
		res[2] = MathUtils.pow(b[2], a.z());
		
		return res;
	}
	
	public static float[] revPowT_vs_rvec3f(IVec3RF a, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(value, a.x());
		res[1] = MathUtils.pow(value, a.y());
		res[2] = MathUtils.pow(value, a.z());
		
		return res;
	}
	
	public static float[] revPowT_vc_rvec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(bX, a.x());
		res[1] = MathUtils.pow(bY, a.y());
		res[2] = MathUtils.pow(bZ, a.z());
		
		return res;
	}
	
	public static float[] revPowT_av_rvec3f(float[] a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(b.x(), a[0]);
		res[1] = MathUtils.pow(b.y(), a[1]);
		res[2] = MathUtils.pow(b.z(), a[2]);
		
		return res;
	}
	
	public static float[] revPowT_sv_rvec3f(float a, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(b.x(), a);
		res[1] = MathUtils.pow(b.y(), a);
		res[2] = MathUtils.pow(b.z(), a);
		
		return res;
	}
	
	public static float[] revPowT_cv_rvec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(b.x(), aX);
		res[1] = MathUtils.pow(b.y(), aY);
		res[2] = MathUtils.pow(b.z(), aZ);
		
		return res;
	}
	
	public static float[] revPowT_av_rvec3f(float[] a, IVec3RF b)
	{
		a[0] = MathUtils.pow(b.x(), a[0]);
		a[1] = MathUtils.pow(b.y(), a[1]);
		a[2] = MathUtils.pow(b.z(), a[2]);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revPowT_vv_ivec3f(IVec3RF a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b.x(), a.x()),
			MathUtils.pow(b.y(), a.y()),
			MathUtils.pow(b.z(), a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_va_ivec3f(IVec3RF a, float[] b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b[0], a.x()),
			MathUtils.pow(b[1], a.y()),
			MathUtils.pow(b[2], a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_vs_ivec3f(IVec3RF a, float b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b, a.x()),
			MathUtils.pow(b, a.y()),
			MathUtils.pow(b, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_vc_ivec3f(IVec3RF a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(bX, a.x()),
			MathUtils.pow(bY, a.y()),
			MathUtils.pow(bZ, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_av_ivec3f(float[] a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b.x(), a[0]),
			MathUtils.pow(b.y(), a[1]),
			MathUtils.pow(b.z(), a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_aa_ivec3f(float[] a, float[] b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b[0], a[0]),
			MathUtils.pow(b[1], a[1]),
			MathUtils.pow(b[2], a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_as_ivec3f(float[] a, float b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b, a[0]),
			MathUtils.pow(b, a[1]),
			MathUtils.pow(b, a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_ac_ivec3f(float[] a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(bX, a[0]),
			MathUtils.pow(bY, a[1]),
			MathUtils.pow(bZ, a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_sv_ivec3f(float a, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b.x(), a),
			MathUtils.pow(b.y(), a),
			MathUtils.pow(b.z(), a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_sa_ivec3f(float a, float[] b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b[0], a),
			MathUtils.pow(b[1], a),
			MathUtils.pow(b[2], a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_ss_ivec3f(float a, float b, @ExtractionParam T res)
	{
		float v = MathUtils.pow(b, a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_sc_ivec3f(float a, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(bX, a),
			MathUtils.pow(bY, a),
			MathUtils.pow(bZ, a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_cv_ivec3f(float aX, float aY, float aZ, IVec3RF b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b.x(), aX),
			MathUtils.pow(b.y(), aY),
			MathUtils.pow(b.z(), aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_ca_ivec3f(float aX, float aY, float aZ, float[] b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b[0], aX),
			MathUtils.pow(b[1], aY),
			MathUtils.pow(b[2], aZ)
		);
		
		return res;
	}

	public static <T extends IVec3WF> T revPowT_cs_ivec3f(float aX, float aY, float aZ, float b, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(b, aX),
			MathUtils.pow(b, aY),
			MathUtils.pow(b, aZ)
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_cc_ivec3f(float aX, float aY, float aZ, float bX, float bY, float bZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.pow(bX, aX),
			MathUtils.pow(bY, aY),
			MathUtils.pow(bZ, aZ)
		);		
		
		return res;
	}
	
	public static <T extends IVec3WF> T revPowT_ivec3f(T a, IVec3RF b)
	{
		a.set(
			MathUtils.pow(b.x(), a.at(0)),
			MathUtils.pow(b.y(), a.at(1)),
			MathUtils.pow(b.z(), a.at(2))
		);	
		
		return a;
	}
	
	public static <T extends IVec3WF> T revPowT_ivec3f(T a, float[] b)
	{
		a.set(
			MathUtils.pow(b[0], a.at(0)),
			MathUtils.pow(b[1], a.at(1)),
			MathUtils.pow(b[2], a.at(2))
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revPowT_ivec3f(T a, float b)
	{
		a.set(
			MathUtils.pow(b, a.at(0)),
			MathUtils.pow(b, a.at(1)),
			MathUtils.pow(b, a.at(2))
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revPowT_ivec3f(T a, float bX, float bY, float bZ)
	{
		a.set(
			MathUtils.pow(bX, a.at(0)),
			MathUtils.pow(bY, a.at(1)),
			MathUtils.pow(bZ, a.at(2))
		);
		
		return a;
	}
	
	public static float[] sqrt_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.sqrt(a.x()),
			MathUtils.sqrt(a.y()),
			MathUtils.sqrt(a.z()),
		};
	}
	
	public static float[] sqrtT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(a.x());
		res[1] = MathUtils.sqrt(a.y());
		res[2] = MathUtils.sqrt(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrtT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(a.x()),
			MathUtils.sqrt(a.y()),
			MathUtils.sqrt(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrtT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(a[0]),
			MathUtils.sqrt(a[1]),
			MathUtils.sqrt(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrtT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.sqrt(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrtT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sqrt(aX),
			MathUtils.sqrt(aY),
			MathUtils.sqrt(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sqrtT_ivec3f(T a)
	{
		a.set(
			MathUtils.sqrt(a.x()),
			MathUtils.sqrt(a.y()),
			MathUtils.sqrt(a.z())
		);
		
		return a;
	}
	
	public static float[] invSqrt_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.invSqrt(a.x()),
			MathUtils.invSqrt(a.y()),
			MathUtils.invSqrt(a.z()),
		};
	}
	
	public static float[] invSqrtT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invSqrt(a.x());
		res[1] = MathUtils.invSqrt(a.y());
		res[2] = MathUtils.invSqrt(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrtT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(a.x()),
			MathUtils.invSqrt(a.y()),
			MathUtils.invSqrt(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrtT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(a[0]),
			MathUtils.invSqrt(a[1]),
			MathUtils.invSqrt(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrtT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.invSqrt(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrtT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invSqrt(aX),
			MathUtils.invSqrt(aY),
			MathUtils.invSqrt(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invSqrtT_ivec3f(T a)
	{
		a.set(
			MathUtils.invSqrt(a.x()),
			MathUtils.invSqrt(a.y()),
			MathUtils.invSqrt(a.z())
		);
		
		return a;
	}
	
	public static float[] cbrt_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.cbrt(a.x()),
			MathUtils.cbrt(a.y()),
			MathUtils.cbrt(a.z()),
		};
	}
	
	public static float[] cbrtT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(a.x());
		res[1] = MathUtils.cbrt(a.y());
		res[2] = MathUtils.cbrt(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrtT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(a.x()),
			MathUtils.cbrt(a.y()),
			MathUtils.cbrt(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrtT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(a[0]),
			MathUtils.cbrt(a[1]),
			MathUtils.cbrt(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrtT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.cbrt(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrtT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cbrt(aX),
			MathUtils.cbrt(aY),
			MathUtils.cbrt(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cbrtT_ivec3f(T a)
	{
		a.set(
			MathUtils.cbrt(a.x()),
			MathUtils.cbrt(a.y()),
			MathUtils.cbrt(a.z())
		);
		
		return a;
	}
	
	public static float[] invCbrt_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.invCbrt(a.x()),
			MathUtils.invCbrt(a.y()),
			MathUtils.invCbrt(a.z()),
		};
	}
	
	public static float[] invCbrtT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invCbrt(a.x());
		res[1] = MathUtils.invCbrt(a.y());
		res[2] = MathUtils.invCbrt(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrtT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(a.x()),
			MathUtils.invCbrt(a.y()),
			MathUtils.invCbrt(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrtT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(a[0]),
			MathUtils.invCbrt(a[1]),
			MathUtils.invCbrt(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrtT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.invCbrt(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrtT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.invCbrt(aX),
			MathUtils.invCbrt(aY),
			MathUtils.invCbrt(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T invCbrtT_ivec3f(T a)
	{
		a.set(
			MathUtils.invCbrt(a.x()),
			MathUtils.invCbrt(a.y()),
			MathUtils.invCbrt(a.z())
		);
		
		return a;
	}
	
	public static float[] abs_rvec3f(IVec3RF a)
	{
		return new float[] {
			Math.abs(a.x()),
			Math.abs(a.y()),
			Math.abs(a.z()),
		};
	}
	
	public static float[] absT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(a.x());
		res[1] = Math.abs(a.y());
		res[2] = Math.abs(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T absT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			Math.abs(a.x()),
			Math.abs(a.y()),
			Math.abs(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T absT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			Math.abs(a[0]),
			Math.abs(a[1]),
			Math.abs(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T absT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = Math.abs(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T absT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			Math.abs(aX),
			Math.abs(aY),
			Math.abs(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T absT_ivec3f(T a)
	{
		a.set(
			Math.abs(a.x()),
			Math.abs(a.y()),
			Math.abs(a.z())
		);
		
		return a;
	}
	
	public static float[] reciprocal_rvec3f(IVec3RF a)
	{
		return new float[] {
			1.0f / a.x(),
			1.0f / a.y(),
			1.0f / a.z(),
		};
	}
	
	public static float[] reciprocalT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / a.x();
		res[1] = 1.0f / a.y();
		res[2] = 1.0f / a.z();
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocalT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			1.0f / a.x(),
			1.0f / a.y(),
			1.0f / a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocalT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			1.0f / a[0],
			1.0f / a[1],
			1.0f / a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocalT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = 1.0f / a;
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocalT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			1.0f / aX,
			1.0f / aY,
			1.0f / aZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reciprocalT_ivec3f(T a)
	{
		a.set(
			1.0f / a.x(),
			1.0f / a.y(),
			1.0f / a.z()
		);
		
		return a;
	}
	
	public static float[] negate_rvec3f(IVec3RF a)
	{
		return new float[] {
			-a.x(),
			-a.y(),
			-a.z(),
		};
	}
	
	public static float[] negateT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = -a.x();
		res[1] = -a.y();
		res[2] = -a.z();
		
		return res;
	}
	
	public static <T extends IVec3WF> T negateT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			-a.x(),
			-a.y(),
			-a.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T negateT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			-a[0],
			-a[1],
			-a[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T negateT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = -a;
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T negateT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			-aX,
			-aY,
			-aZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T negateT_ivec3f(T a)
	{
		a.set(
			-a.x(),
			-a.y(),
			-a.z()
		);
		
		return a;
	}
	
	public static float[] squared_rvec3f(IVec3RF a)
	{
		float aX = a.x();
		float aY = a.y();
		float aZ = a.z();
		
		return new float[] {
			aX * aX,
			aY * aY,
			aZ * aZ,
		};
	}
	
	public static float[] squaredT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		float aX = a.x();
		float aY = a.y();
		float aZ = a.z();
		
		res[0] = aX * aX;
		res[1] = aY * aY;
		res[2] = aZ * aZ;
		
		return res;
	}
	
	public static <T extends IVec3WF> T squaredT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		float aX = a.x();
		float aY = a.y();
		float aZ = a.z();
		
		res.set(
			aX * aX,
			aY * aY,
			aZ * aZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T squaredT_ivec3f(float[] a, @ExtractionParam T res)
	{
		float aX = a[0];
		float aY = a[1];
		float aZ = a[2];
		
		res.set(
			aX * aX,
			aY * aY,
			aZ * aZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T squaredT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = a * a;
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T squaredT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{	
		res.set(
			aX * aX,
			aY * aY,
			aZ * aZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T squaredT_ivec3f(T a)
	{
		float aX = a.x();
		float aY = a.y();
		float aZ = a.z();
		
		a.set(
			aX * aX,
			aY * aY,
			aZ * aZ
		);
		
		return a;
	}
	
	public static float[] sin_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.sin(a.x()),
			MathUtils.sin(a.y()),
			MathUtils.sin(a.z()),
		};
	}
	
	public static float[] sinT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sin(a.x());
		res[1] = MathUtils.sin(a.y());
		res[2] = MathUtils.sin(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(a.x()),
			MathUtils.sin(a.y()),
			MathUtils.sin(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(a[0]),
			MathUtils.sin(a[1]),
			MathUtils.sin(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.sin(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sin(aX),
			MathUtils.sin(aY),
			MathUtils.sin(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinT_ivec3f(T a)
	{
		a.set(
			MathUtils.sin(a.x()),
			MathUtils.sin(a.y()),
			MathUtils.sin(a.z())
		);
		
		return a;
	}
	
	public static float[] asin_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.asin(a.x()),
			MathUtils.asin(a.y()),
			MathUtils.asin(a.z()),
		};
	}
	
	public static float[] asinT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.asin(a.x());
		res[1] = MathUtils.asin(a.y());
		res[2] = MathUtils.asin(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T asinT_rvec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(a.x()),
			MathUtils.asin(a.y()),
			MathUtils.asin(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T asinT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(a[0]),
			MathUtils.asin(a[1]),
			MathUtils.asin(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T asinT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.asin(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T asinT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.asin(aX),
			MathUtils.asin(aY),
			MathUtils.asin(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T asinT_ivec3f(T a)
	{
		a.set(
			MathUtils.asin(a.x()),
			MathUtils.asin(a.y()),
			MathUtils.asin(a.z())
		);
		
		return a;
	}
	
	public static float[] sinh_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.sinh(a.x()),
			MathUtils.sinh(a.y()),
			MathUtils.sinh(a.z()),
		};
	}
	
	public static float[] sinhT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sinh(a.x());
		res[1] = MathUtils.sinh(a.y());
		res[2] = MathUtils.sinh(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinhT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(a.x()),
			MathUtils.sinh(a.y()),
			MathUtils.sinh(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinhT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(a[0]),
			MathUtils.sinh(a[1]),
			MathUtils.sinh(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinhT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.sinh(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinhT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.sinh(aX),
			MathUtils.sinh(aY),
			MathUtils.sinh(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T sinhT_ivec3f(T a)
	{
		a.set(
			MathUtils.sinh(a.x()),
			MathUtils.sinh(a.y()),
			MathUtils.sinh(a.z())
		);
		
		return a;
	}
	
	public static float[] cos_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.cos(a.x()),
			MathUtils.cos(a.y()),
			MathUtils.cos(a.z()),
		};
	}
	
	public static float[] cosT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cos(a.x());
		res[1] = MathUtils.cos(a.y());
		res[2] = MathUtils.cos(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(a.x()),
			MathUtils.cos(a.y()),
			MathUtils.cos(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(a[0]),
			MathUtils.cos(a[1]),
			MathUtils.cos(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.cos(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cos(aX),
			MathUtils.cos(aY),
			MathUtils.cos(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cosT_ivec3f(T a)
	{
		a.set(
			MathUtils.cos(a.x()),
			MathUtils.cos(a.y()),
			MathUtils.cos(a.z())
		);
		
		return a;
	}
	
	public static float[] acos_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.acos(a.x()),
			MathUtils.acos(a.y()),
			MathUtils.acos(a.z()),
		};
	}
	
	public static float[] acosT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.acos(a.x());
		res[1] = MathUtils.acos(a.y());
		res[2] = MathUtils.acos(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T acosT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(a.x()),
			MathUtils.acos(a.y()),
			MathUtils.acos(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T acosT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(a[0]),
			MathUtils.acos(a[1]),
			MathUtils.acos(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T acosT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.acos(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T acosT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.acos(aX),
			MathUtils.acos(aY),
			MathUtils.acos(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T acosT_ivec3f(T a)
	{
		a.set(
			MathUtils.acos(a.x()),
			MathUtils.acos(a.y()),
			MathUtils.acos(a.z())
		);
		
		return a;
	}
	
	public static float[] cosh_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.cosh(a.x()),
			MathUtils.cosh(a.y()),
			MathUtils.cosh(a.z()),
		};
	}
	
	public static float[] coshT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cosh(a.x());
		res[1] = MathUtils.cosh(a.y());
		res[2] = MathUtils.cosh(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T coshT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(a.x()),
			MathUtils.cosh(a.y()),
			MathUtils.cosh(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T coshT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(a[0]),
			MathUtils.cosh(a[1]),
			MathUtils.cosh(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T coshT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.cosh(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T coshT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.cosh(aX),
			MathUtils.cosh(aY),
			MathUtils.cosh(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T coshT_ivec3f(T a)
	{
		a.set(
			MathUtils.cosh(a.x()),
			MathUtils.cosh(a.y()),
			MathUtils.cosh(a.z())
		);
		
		return a;
	}
	
	public static float[] tan_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.tan(a.x()),
			MathUtils.tan(a.y()),
			MathUtils.tan(a.z()),
		};
	}
	
	public static float[] tanT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tan(a.x());
		res[1] = MathUtils.tan(a.y());
		res[2] = MathUtils.tan(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(a.x()),
			MathUtils.tan(a.y()),
			MathUtils.tan(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(a[0]),
			MathUtils.tan(a[1]),
			MathUtils.tan(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.tan(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tan(aX),
			MathUtils.tan(aY),
			MathUtils.tan(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanT_ivec3f(T a)
	{
		a.set(
			MathUtils.tan(a.x()),
			MathUtils.tan(a.y()),
			MathUtils.tan(a.z())
		);
		
		return a;
	}
	
	public static float[] atan_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.atan(a.x()),
			MathUtils.atan(a.y()),
			MathUtils.atan(a.z()),
		};
	}
	
	public static float[] atanT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.atan(a.x());
		res[1] = MathUtils.atan(a.y());
		res[2] = MathUtils.atan(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T atanT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(a.x()),
			MathUtils.atan(a.y()),
			MathUtils.atan(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T atanT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(a[0]),
			MathUtils.atan(a[1]),
			MathUtils.atan(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T atanT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.atan(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T atanT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.atan(aX),
			MathUtils.atan(aY),
			MathUtils.atan(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T atanT_ivec3f(T a)
	{
		a.set(
			MathUtils.atan(a.x()),
			MathUtils.atan(a.y()),
			MathUtils.atan(a.z())
		);
		
		return a;
	}
	
	public static float[] tanh_rvec3f(IVec3RF a)
	{
		return new float[] {
			MathUtils.tanh(a.x()),
			MathUtils.tanh(a.y()),
			MathUtils.tanh(a.z()),
		};
	}
	
	public static float[] tanhT_rvec3f(IVec3RF a, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tanh(a.x());
		res[1] = MathUtils.tanh(a.y());
		res[2] = MathUtils.tanh(a.z());
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanhT_ivec3f(IVec3RF a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(a.x()),
			MathUtils.tanh(a.y()),
			MathUtils.tanh(a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanhT_ivec3f(float[] a, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(a[0]),
			MathUtils.tanh(a[1]),
			MathUtils.tanh(a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanhT_ivec3f(float a, @ExtractionParam T res)
	{
		float v = MathUtils.tanh(a);
		
		res.set(
			v,
			v,
			v
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanhT_ivec3f(float aX, float aY, float aZ, @ExtractionParam T res)
	{
		res.set(
			MathUtils.tanh(aX),
			MathUtils.tanh(aY),
			MathUtils.tanh(aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T tanhT_ivec3f(T a)
	{
		a.set(
			MathUtils.tanh(a.x()),
			MathUtils.tanh(a.y()),
			MathUtils.tanh(a.z())
		);
		
		return a;
	}
	
	public static float[] mulAdd_vvv_rvec3(IVec3RF a, IVec3RF b, IVec3RF c)
	{
		return new float[] {
			Math.fma(a.x(), b.x(), c.x()),
			Math.fma(a.y(), b.y(), c.y()),
			Math.fma(a.z(), b.z(), c.z()),
		};
	}
	
	public static float[] mulAdd_vva_rvec3(IVec3RF a, IVec3RF b, float[] c)
	{
		return new float[] {
			Math.fma(a.x(), b.x(), c[0]),
			Math.fma(a.y(), b.y(), c[1]),
			Math.fma(a.z(), b.z(), c[2]),
		};
	}
	
	public static float[] mulAdd_vvs_rvec3(IVec3RF a, IVec3RF b, float c)
	{
		return new float[] {
			Math.fma(a.x(), b.x(), c),
			Math.fma(a.y(), b.y(), c),
			Math.fma(a.z(), b.z(), c),
		};
	}
	
	public static float[] mulAdd_vvc_rvec3(IVec3RF a, IVec3RF b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(a.x(), b.x(), cX),
			Math.fma(a.y(), b.y(), cY),
			Math.fma(a.z(), b.z(), cZ),
		};
	}
	
	public static float[] mulAdd_vav_rvec3(IVec3RF a, float[] b, IVec3RF c)
	{
		return new float[] {
			Math.fma(a.x(), b[0], c.x()),
			Math.fma(a.y(), b[1], c.y()),
			Math.fma(a.z(), b[2], c.z()),
		};
	}
	
	public static float[] mulAdd_vaa_rvec3(IVec3RF a, float[] b, float[] c)
	{
		return new float[] {
			Math.fma(a.x(), b[0], c[0]),
			Math.fma(a.y(), b[1], c[1]),
			Math.fma(a.z(), b[2], c[2]),
		};
	}
	
	public static float[] mulAdd_vas_rvec3(IVec3RF a, float[] b, float c)
	{
		return new float[] {
			Math.fma(a.x(), b[0], c),
			Math.fma(a.y(), b[1], c),
			Math.fma(a.z(), b[2], c),
		};
	}
	
	public static float[] mulAdd_vac_rvec3(IVec3RF a, float[] b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(a.x(), b[0], cX),
			Math.fma(a.y(), b[1], cY),
			Math.fma(a.z(), b[2], cZ),
		};
	}
	
	public static float[] mulAdd_vsv_rvec3(IVec3RF a, float b, IVec3RF c)
	{
		return new float[] {
			Math.fma(a.x(), b, c.x()),
			Math.fma(a.y(), b, c.y()),
			Math.fma(a.z(), b, c.z()),
		};
	}
	
	public static float[] mulAdd_vsa_rvec3(IVec3RF a, float b, float[] c)
	{
		return new float[] {
			Math.fma(a.x(), b, c[0]),
			Math.fma(a.y(), b, c[1]),
			Math.fma(a.z(), b, c[2]),
		};
	}
	
	public static float[] mulAdd_vss_rvec3(IVec3RF a, float b, float c)
	{
		return new float[] {
			Math.fma(a.x(), b, c),
			Math.fma(a.y(), b, c),
			Math.fma(a.z(), b, c),
		};
	}
	
	public static float[] mulAdd_vsc_rvec3(IVec3RF a, float b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(a.x(), b, cX),
			Math.fma(a.y(), b, cY),
			Math.fma(a.z(), b, cZ),
		};
	}
	
	public static float[] mulAdd_vcv_rvec3(IVec3RF a, float bX, float bY, float bZ, IVec3RF c)
	{
		return new float[] {
			Math.fma(a.x(), bX, c.x()),
			Math.fma(a.y(), bY, c.y()),
			Math.fma(a.z(), bZ, c.z()),
		};
	}
	
	public static float[] mulAdd_vca_rvec3(IVec3RF a, float bX, float bY, float bZ, float[] c)
	{
		return new float[] {
			Math.fma(a.x(), bX, c[0]),
			Math.fma(a.y(), bY, c[1]),
			Math.fma(a.z(), bZ, c[2]),
		};
	}
	
	public static float[] mulAdd_vcs_rvec3(IVec3RF a, float bX, float bY, float bZ, float c)
	{
		return new float[] {
			Math.fma(a.x(), bX, c),
			Math.fma(a.y(), bY, c),
			Math.fma(a.z(), bZ, c),
		};
	}
	
	public static float[] mulAdd_vcc_rvec3(IVec3RF a, float bX, float bY, float bZ, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(a.x(), bX, cX),
			Math.fma(a.y(), bY, cY),
			Math.fma(a.z(), bZ, cZ),
		};
	}
	
	public static float[] mulAdd_avv_rvec3(float[] a, IVec3RF b, IVec3RF c)
	{
		return new float[] {
			Math.fma(a[0], b.x(), c.x()),
			Math.fma(a[1], b.y(), c.y()),
			Math.fma(a[2], b.z(), c.z()),
		};
	}
	
	public static float[] mulAdd_ava_rvec3(float[] a, IVec3RF b, float[] c)
	{
		return new float[] {
			Math.fma(a[0], b.x(), c[0]),
			Math.fma(a[1], b.y(), c[1]),
			Math.fma(a[2], b.z(), c[2]),
		};
	}
	
	public static float[] mulAdd_avs_rvec3(float[] a, IVec3RF b, float c)
	{
		return new float[] {
			Math.fma(a[0], b.x(), c),
			Math.fma(a[1], b.y(), c),
			Math.fma(a[2], b.z(), c),
		};
	}
	
	public static float[] mulAdd_avc_rvec3(float[] a, IVec3RF b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(a[0], b.x(), cX),
			Math.fma(a[1], b.y(), cY),
			Math.fma(a[2], b.z(), cZ),
		};
	}
	
	public static float[] mulAdd_aav_rvec3(float[] a, float[] b, IVec3RF c)
	{
		return new float[] {
			Math.fma(a[0], b[0], c.x()),
			Math.fma(a[1], b[1], c.y()),
			Math.fma(a[2], b[2], c.z()),
		};
	}
	
	public static float[] mulAdd_asv_rvec3(float[] a, float b, IVec3RF c)
	{
		return new float[] {
			Math.fma(a[0], b, c.x()),
			Math.fma(a[1], b, c.y()),
			Math.fma(a[2], b, c.z()),
		};
	}
	
	public static float[] mulAdd_acv_rvec3(float[] a, float bX, float bY, float bZ, IVec3RF c)
	{
		return new float[] {
			Math.fma(a[0], bX, c.x()),
			Math.fma(a[1], bY, c.y()),
			Math.fma(a[2], bZ, c.z()),
		};
	}
	
	public static float[] mulAdd_sav_rvec3(float a, float[] b, IVec3RF c)
	{
		return new float[] {
			Math.fma(a, b[0], c.x()),
			Math.fma(a, b[1], c.y()),
			Math.fma(a, b[2], c.z()),
		};
	}
	
	public static float[] mulAdd_ssv_rvec3(float a, float b, IVec3RF c)
	{
		return new float[] {
			Math.fma(a, b, c.x()),
			Math.fma(a, b, c.y()),
			Math.fma(a, b, c.z()),
		};
	}
	
	public static float[] mulAdd_scv_rvec3(float a, float bX, float bY, float bZ, IVec3RF c)
	{
		return new float[] {
			Math.fma(a, bX, c.x()),
			Math.fma(a, bY, c.y()),
			Math.fma(a, bZ, c.z()),
		};
	}
	
	public static float[] mulAdd_cvv_rvec3(float aX, float aY, float aZ, IVec3RF b, IVec3RF c)
	{
		return new float[] {
			Math.fma(aX, b.x(), c.x()),
			Math.fma(aY, b.y(), c.y()),
			Math.fma(aZ, b.z(), c.z()),
		};
	}
	
	public static float[] mulAdd_cva_rvec3(float aX, float aY, float aZ, IVec3RF b, float[] c)
	{
		return new float[] {
			Math.fma(aX, b.x(), c[0]),
			Math.fma(aY, b.y(), c[1]),
			Math.fma(aZ, b.z(), c[2]),
		};
	}
	
	public static float[] mulAdd_cvs_rvec3(float aX, float aY, float aZ, IVec3RF b, float c)
	{
		return new float[] {
			Math.fma(aX, b.x(), c),
			Math.fma(aY, b.y(), c),
			Math.fma(aZ, b.z(), c),
		};
	}
	
	public static float[] mulAdd_cvc_rvec3(float aX, float aY, float aZ, IVec3RF b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(aX, b.x(), cX),
			Math.fma(aY, b.y(), cY),
			Math.fma(aZ, b.z(), cZ),
		};
	}
	
	public static float[] mulAdd_cav_rvec3(float aX, float aY, float aZ, float[] b, IVec3RF c)
	{
		return new float[] {
			Math.fma(aX, b[0], c.x()),
			Math.fma(aY, b[1], c.y()),
			Math.fma(aZ, b[2], c.z()),
		};
	}
	
	public static float[] mulAdd_csv_rvec3(float aX, float aY, float aZ, float b, IVec3RF c)
	{
		return new float[] {
			Math.fma(aX, b, c.x()),
			Math.fma(aY, b, c.y()),
			Math.fma(aZ, b, c.z()),
		};
	}
	
	public static float[] mulAdd_ccv_rvec3(float aX, float aY, float aZ, float bX, float bY, float bZ, IVec3RF c)
	{
		return new float[] {
			Math.fma(aX, bX, c.x()),
			Math.fma(aY, bY, c.y()),
			Math.fma(aZ, bZ, c.z()),
		};
	}
	
	public static float[] mulAddT_vvv_rvec3(IVec3RF a, IVec3RF b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b.x(), c.x());
		res[1] = Math.fma(a.y(), b.y(), c.y());
		res[2] = Math.fma(a.z(), b.z(), c.z());
		
		return res;
	}
	
	public static float[] mulAddT_vva_rvec3(IVec3RF a, IVec3RF b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b.x(), c[0]);
		res[1] = Math.fma(a.y(), b.y(), c[1]);
		res[2] = Math.fma(a.z(), b.z(), c[2]);
		
		return res;
	}
	
	public static float[] mulAddT_vvs_rvec3(IVec3RF a, IVec3RF b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b.x(), c);
		res[1] = Math.fma(a.y(), b.y(), c);
		res[2] = Math.fma(a.z(), b.z(), c);
		
		return res;
	}
	
	public static float[] mulAddT_vvc_rvec3(IVec3RF a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b.x(), cX);
		res[1] = Math.fma(a.y(), b.y(), cY);
		res[2] = Math.fma(a.z(), b.z(), cZ);
		
		return res;
	}
	
	public static float[] mulAddT_vav_rvec3(IVec3RF a, float[] b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b[0], c.x());
		res[1] = Math.fma(a.y(), b[1], c.y());
		res[2] = Math.fma(a.z(), b[2], c.z());
		
		return res;
	}
	
	public static float[] mulAddT_vaa_rvec3(IVec3RF a, float[] b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b[0], c[0]);
		res[1] = Math.fma(a.y(), b[1], c[1]);
		res[2] = Math.fma(a.z(), b[2], c[2]);
		
		return res;
	}
	
	public static float[] mulAddT_vas_rvec3(IVec3RF a, float[] b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b[0], c);
		res[1] = Math.fma(a.y(), b[1], c);
		res[2] = Math.fma(a.z(), b[2], c);
		
		return res;
	}
	
	public static float[] mulAddT_vac_rvec3(IVec3RF a, float[] b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b[0], cX);
		res[1] = Math.fma(a.y(), b[1], cY);
		res[2] = Math.fma(a.z(), b[2], cZ);
		
		return res;
	}
	
	public static float[] mulAddT_vsv_rvec3(IVec3RF a, float b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b, c.x());
		res[1] = Math.fma(a.y(), b, c.y());
		res[2] = Math.fma(a.z(), b, c.z());
		
		return res;
	}
	
	public static float[] mulAddT_vsa_rvec3(IVec3RF a, float b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b, c[0]);
		res[1] = Math.fma(a.y(), b, c[1]);
		res[2] = Math.fma(a.z(), b, c[2]);
		
		return res;
	}
	
	public static float[] mulAddT_vss_rvec3(IVec3RF a, float b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b, c);
		res[1] = Math.fma(a.y(), b, c);
		res[2] = Math.fma(a.z(), b, c);
		
		return res;
	}
	
	public static float[] mulAddT_vsc_rvec3(IVec3RF a, float b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), b, cX);
		res[1] = Math.fma(a.y(), b, cY);
		res[2] = Math.fma(a.z(), b, cZ);
		
		return res;
	}
	
	public static float[] mulAddT_vcv_rvec3(IVec3RF a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), bX, c.x());
		res[1] = Math.fma(a.y(), bY, c.y());
		res[2] = Math.fma(a.z(), bZ, c.z());
		
		return res;
	}
	
	public static float[] mulAddT_vca_rvec3(IVec3RF a, float bX, float bY, float bZ, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), bX, c[0]);
		res[1] = Math.fma(a.y(), bY, c[1]);
		res[2] = Math.fma(a.z(), bZ, c[2]);
		
		return res;
	}
	
	public static float[] mulAddT_vcs_rvec3(IVec3RF a, float bX, float bY, float bZ, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), bX, c);
		res[1] = Math.fma(a.y(), bY, c);
		res[2] = Math.fma(a.z(), bZ, c);
		
		return res;
	}
	
	public static float[] mulAddT_vcc_rvec3(IVec3RF a, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a.x(), bX, cX);
		res[1] = Math.fma(a.y(), bY, cY);
		res[2] = Math.fma(a.z(), bZ, cZ);
		
		return res;
	}
	
	public static float[] mulAddT_avv_rvec3(float[] a, IVec3RF b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a[0], b.x(), c.x());
		res[1] = Math.fma(a[1], b.y(), c.y());
		res[2] = Math.fma(a[2], b.z(), c.z());
		
		return res;
	}
	
	public static float[] mulAddT_ava_rvec3(float[] a, IVec3RF b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a[0], b.x(), c[0]);
		res[1] = Math.fma(a[1], b.y(), c[1]);
		res[2] = Math.fma(a[2], b.z(), c[2]);
		
		return res;
	}
	
	public static float[] mulAddT_avs_rvec3(float[] a, IVec3RF b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a[0], b.x(), c);
		res[1] = Math.fma(a[1], b.y(), c);
		res[2] = Math.fma(a[2], b.z(), c);
		
		return res;
	}
	
	public static float[] mulAddT_avc_rvec3(float[] a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a[0], b.x(), cX);
		res[1] = Math.fma(a[1], b.y(), cY);
		res[2] = Math.fma(a[2], b.z(), cZ);
		
		return res;
	}
	
	public static float[] mulAddT_aav_rvec3(float[] a, float[] b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a[0], b[0], c.x());
		res[1] = Math.fma(a[1], b[1], c.y());
		res[2] = Math.fma(a[2], b[2], c.z());
		
		return res;
	}
	
	public static float[] mulAddT_asv_rvec3(float[] a, float b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a[0], b, c.x());
		res[1] = Math.fma(a[1], b, c.y());
		res[2] = Math.fma(a[2], b, c.z());
		
		return res;
	}
	
	public static float[] mulAddT_acv_rvec3(float[] a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a[0], bX, c.x());
		res[1] = Math.fma(a[1], bY, c.y());
		res[2] = Math.fma(a[2], bZ, c.z());
		
		return res;
	}
	
	public static float[] mulAddT_svv_rvec3(float a, IVec3RF b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a, b.x(), c.x());
		res[1] = Math.fma(a, b.y(), c.y());
		res[2] = Math.fma(a, b.z(), c.z());
		
		return res;
	}
	
	public static float[] mulAddT_sva_rvec3(float a, IVec3RF b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a, b.x(), c[0]);
		res[1] = Math.fma(a, b.y(), c[1]);
		res[2] = Math.fma(a, b.z(), c[2]);
		
		return res;
	}
	
	public static float[] mulAddT_svs_rvec3(float a, IVec3RF b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a, b.x(), c);
		res[1] = Math.fma(a, b.y(), c);
		res[2] = Math.fma(a, b.z(), c);
		
		return res;
	}
	
	public static float[] mulAddT_svc_rvec3(float a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a, b.x(), cX);
		res[1] = Math.fma(a, b.y(), cY);
		res[2] = Math.fma(a, b.z(), cZ);
		
		return res;
	}
	
	public static float[] mulAddT_sav_rvec3(float a, float[] b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a, b[0], c.x());
		res[1] = Math.fma(a, b[1], c.y());
		res[2] = Math.fma(a, b[2], c.z());
		
		return res;
	}
	
	public static float[] mulAddT_ssv_rvec3(float a, float b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a, b, c.x());
		res[1] = Math.fma(a, b, c.y());
		res[2] = Math.fma(a, b, c.z());
		
		return res;
	}
	
	public static float[] mulAddT_acv_rvec3(float a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(a, bX, c.x());
		res[1] = Math.fma(a, bY, c.y());
		res[2] = Math.fma(a, bZ, c.z());
		
		return res;
	}
	
	public static float[] mulAddT_cvv_rvec3(float aX, float aY, float aZ, IVec3RF b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(aX, b.x(), c.x());
		res[1] = Math.fma(aY, b.y(), c.y());
		res[2] = Math.fma(aZ, b.z(), c.z());
		
		return res;
	}
	
	public static float[] mulAddT_cva_rvec3(float aX, float aY, float aZ, IVec3RF b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(aX, b.x(), c[0]);
		res[1] = Math.fma(aY, b.y(), c[1]);
		res[2] = Math.fma(aZ, b.z(), c[2]);
		
		return res;
	}
	
	public static float[] mulAddT_cvc_rvec3(float aX, float aY, float aZ, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(aX, b.x(), cX);
		res[1] = Math.fma(aY, b.y(), cY);
		res[2] = Math.fma(aZ, b.z(), cZ);
		
		return res;
	}
	
	public static float[] mulAddT_cav_rvec3(float aX, float aY, float aZ, float[] b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(aX, b[0], c.x());
		res[1] = Math.fma(aY, b[1], c.y());
		res[2] = Math.fma(aZ, b[2], c.z());
		
		return res;
	}
	
	public static float[] mulAddT_ccv_rvec3(float aX, float aY, float aZ, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(aX, bX, c.x());
		res[1] = Math.fma(aY, bY, c.y());
		res[2] = Math.fma(aZ, bZ, c.z());
		
		return res;
	}
	
	public static float[] mulAddT_avv_rvec3(float[] a, IVec3RF b, IVec3RF c)
	{
		a[0] = Math.fma(a[0], b.x(), c.x());
		a[1] = Math.fma(a[1], b.y(), c.y());
		a[2] = Math.fma(a[2], b.z(), c.z());
		
		return a;
	}
	
	public static float[] mulAddT_ava_rvec3(float[] a, IVec3RF b, float[] c)
	{
		a[0] = Math.fma(a[0], b.x(), c[0]);
		a[1] = Math.fma(a[1], b.y(), c[1]);
		a[2] = Math.fma(a[2], b.z(), c[2]);
		
		return a;
	}
	
	public static float[] mulAddT_avs_rvec3(float[] a, IVec3RF b, float c)
	{
		a[0] = Math.fma(a[0], b.x(), c);
		a[1] = Math.fma(a[1], b.y(), c);
		a[2] = Math.fma(a[2], b.z(), c);
		
		return a;
	}
	
	public static float[] mulAddT_avc_rvec3(float[] a, IVec3RF b, float cX, float cY, float cZ)
	{
		a[0] = Math.fma(a[0], b.x(), cX);
		a[1] = Math.fma(a[1], b.y(), cY);
		a[2] = Math.fma(a[2], b.z(), cZ);
		
		return a;
	}
	
	public static float[] mulAddT_aav_rvec3(float[] a, float[] b, IVec3RF c)
	{
		a[0] = Math.fma(a[0], b[0], c.x());
		a[1] = Math.fma(a[1], b[1], c.y());
		a[2] = Math.fma(a[2], b[2], c.z());
		
		return a;
	}
	
	public static float[] mulAddT_asv_rvec3(float[] a, float b, IVec3RF c)
	{
		a[0] = Math.fma(a[0], b, c.x());
		a[1] = Math.fma(a[1], b, c.y());
		a[2] = Math.fma(a[2], b, c.z());
		
		return a;
	}
	
	public static float[] mulAddT_acv_rvec3(float[] a, float bX, float bY, float bZ, IVec3RF c)
	{
		a[0] = Math.fma(a[0], bX, c.x());
		a[1] = Math.fma(a[1], bY, c.y());
		a[2] = Math.fma(a[2], bZ, c.z());
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAddT_vvv_ivec3(IVec3RF a, IVec3RF b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b.x(), c.x()),
			Math.fma(a.y(), b.y(), c.y()),
			Math.fma(a.z(), b.z(), c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vva_ivec3(IVec3RF a, IVec3RF b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b.x(), c[0]),
			Math.fma(a.y(), b.y(), c[1]),
			Math.fma(a.z(), b.z(), c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vvs_ivec3(IVec3RF a, IVec3RF b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b.x(), c),
			Math.fma(a.y(), b.y(), c),
			Math.fma(a.z(), b.z(), c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vvc_ivec3(IVec3RF a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b.x(), cX),
			Math.fma(a.y(), b.y(), cY),
			Math.fma(a.z(), b.z(), cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vav_ivec3(IVec3RF a, float[] b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b[0], c.x()),
			Math.fma(a.y(), b[1], c.y()),
			Math.fma(a.z(), b[2], c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vaa_ivec3(IVec3RF a, float[] b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b[0], c[0]),
			Math.fma(a.y(), b[1], c[1]),
			Math.fma(a.z(), b[2], c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vas_ivec3(IVec3RF a, float[] b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b[0], c),
			Math.fma(a.y(), b[1], c),
			Math.fma(a.z(), b[2], c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vac_ivec3(IVec3RF a, float[] b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b[0], cX),
			Math.fma(a.y(), b[1], cY),
			Math.fma(a.z(), b[2], cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vsv_ivec3(IVec3RF a, float b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b, c.x()),
			Math.fma(a.y(), b, c.y()),
			Math.fma(a.z(), b, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vsa_ivec3(IVec3RF a, float b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b, c[0]),
			Math.fma(a.y(), b, c[1]),
			Math.fma(a.z(), b, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vss_ivec3(IVec3RF a, float b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b, c),
			Math.fma(a.y(), b, c),
			Math.fma(a.z(), b, c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vsc_ivec3(IVec3RF a, float b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), b, cX),
			Math.fma(a.y(), b, cY),
			Math.fma(a.z(), b, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vcv_ivec3(IVec3RF a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), bX, c.x()),
			Math.fma(a.y(), bY, c.y()),
			Math.fma(a.z(), bZ, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vca_ivec3(IVec3RF a, float bX, float bY, float bZ, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), bX, c[0]),
			Math.fma(a.y(), bY, c[1]),
			Math.fma(a.z(), bZ, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vcs_ivec3(IVec3RF a, float bX, float bY, float bZ, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), bX, c),
			Math.fma(a.y(), bY, c),
			Math.fma(a.z(), bZ, c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_vcc_ivec3(IVec3RF a, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a.x(), bX, cX),
			Math.fma(a.y(), bY, cY),
			Math.fma(a.z(), bZ, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_avv_ivec3(float[] a, IVec3RF b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b.x(), c.x()),
			Math.fma(a[1], b.y(), c.y()),
			Math.fma(a[2], b.z(), c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_ava_ivec3(float[] a, IVec3RF b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b.x(), c[0]),
			Math.fma(a[1], b.y(), c[1]),
			Math.fma(a[2], b.z(), c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_avs_ivec3(float[] a, IVec3RF b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b.x(), c),
			Math.fma(a[1], b.y(), c),
			Math.fma(a[2], b.z(), c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_avc_ivec3(float[] a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b.x(), cX),
			Math.fma(a[1], b.y(), cY),
			Math.fma(a[2], b.z(), cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_aav_ivec3(float[] a, float[] b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b[0], c.x()),
			Math.fma(a[1], b[1], c.y()),
			Math.fma(a[2], b[2], c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_aaa_ivec3(float[] a, float[] b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b[0], c[0]),
			Math.fma(a[1], b[1], c[1]),
			Math.fma(a[2], b[2], c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_aas_ivec3(float[] a, float[] b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b[0], c),
			Math.fma(a[1], b[1], c),
			Math.fma(a[2], b[2], c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_aac_ivec3(float[] a, float[] b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b[0], cX),
			Math.fma(a[1], b[1], cY),
			Math.fma(a[2], b[2], cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_asv_ivec3(float[] a, float b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b, c.x()),
			Math.fma(a[1], b, c.y()),
			Math.fma(a[2], b, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_asa_ivec3(float[] a, float b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b, c[0]),
			Math.fma(a[1], b, c[1]),
			Math.fma(a[2], b, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_ass_ivec3(float[] a, float b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b, c),
			Math.fma(a[1], b, c),
			Math.fma(a[2], b, c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_asc_ivec3(float[] a, float b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], b, cX),
			Math.fma(a[1], b, cY),
			Math.fma(a[2], b, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_acv_ivec3(float[] a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], bX, c.x()),
			Math.fma(a[1], bY, c.y()),
			Math.fma(a[2], bZ, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_aca_ivec3(float[] a, float bX, float bY, float bZ, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], bX, c[0]),
			Math.fma(a[1], bY, c[1]),
			Math.fma(a[2], bZ, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_acs_ivec3(float[] a, float bX, float bY, float bZ, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], bX, c),
			Math.fma(a[1], bY, c),
			Math.fma(a[2], bZ, c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_acc_ivec3(float[] a, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a[0], bX, cX),
			Math.fma(a[1], bY, cY),
			Math.fma(a[2], bZ, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_svv_ivec3(float a, IVec3RF b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b.x(), c.x()),
			Math.fma(a, b.y(), c.y()),
			Math.fma(a, b.z(), c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_sva_ivec3(float a, IVec3RF b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b.x(), c[0]),
			Math.fma(a, b.y(), c[1]),
			Math.fma(a, b.z(), c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_svs_ivec3(float a, IVec3RF b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b.x(), c),
			Math.fma(a, b.y(), c),
			Math.fma(a, b.z(), c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_svc_ivec3(float a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b.x(), cX),
			Math.fma(a, b.y(), cY),
			Math.fma(a, b.z(), cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_sav_ivec3(float a, float[] b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b[0], c.x()),
			Math.fma(a, b[1], c.y()),
			Math.fma(a, b[2], c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_saa_ivec3(float a, float[] b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b[0], c[0]),
			Math.fma(a, b[1], c[1]),
			Math.fma(a, b[2], c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_sas_ivec3(float a, float[] b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b[0], c),
			Math.fma(a, b[1], c),
			Math.fma(a, b[2], c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_sac_ivec3(float a, float[] b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b[0], cX),
			Math.fma(a, b[1], cY),
			Math.fma(a, b[2], cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_ssv_ivec3(float a, float b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b, c.x()),
			Math.fma(a, b, c.y()),
			Math.fma(a, b, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_ssa_ivec3(float a, float b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b, c[0]),
			Math.fma(a, b, c[1]),
			Math.fma(a, b, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_sss_ivec3(float a, float b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b, c),
			Math.fma(a, b, c),
			Math.fma(a, b, c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_ssc_ivec3(float a, float b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, b, cX),
			Math.fma(a, b, cY),
			Math.fma(a, b, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_scv_ivec3(float a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, bX, c.x()),
			Math.fma(a, bY, c.y()),
			Math.fma(a, bZ, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_sca_ivec3(float a, float bX, float bY, float bZ, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, bX, c[0]),
			Math.fma(a, bY, c[1]),
			Math.fma(a, bZ, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_scs_ivec3(float a, float bX, float bY, float bZ, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, bX, c),
			Math.fma(a, bY, c),
			Math.fma(a, bZ, c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_scc_ivec3(float a, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(a, bX, cX),
			Math.fma(a, bY, cY),
			Math.fma(a, bZ, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_cvv_ivec3(float aX, float aY, float aZ, IVec3RF b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b.x(), c.x()),
			Math.fma(aY, b.y(), c.y()),
			Math.fma(aZ, b.z(), c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_cva_ivec3(float aX, float aY, float aZ, IVec3RF b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b.x(), c[0]),
			Math.fma(aY, b.y(), c[1]),
			Math.fma(aZ, b.z(), c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_cvs_ivec3(float aX, float aY, float aZ, IVec3RF b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b.x(), c),
			Math.fma(aY, b.y(), c),
			Math.fma(aZ, b.z(), c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_cvc_ivec3(float aX, float aY, float aZ, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b.x(), cX),
			Math.fma(aY, b.y(), cY),
			Math.fma(aZ, b.z(), cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_cav_ivec3(float aX, float aY, float aZ, float[] b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b[0], c.x()),
			Math.fma(aY, b[1], c.y()),
			Math.fma(aZ, b[2], c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_caa_ivec3(float aX, float aY, float aZ, float[] b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b[0], c[0]),
			Math.fma(aY, b[1], c[1]),
			Math.fma(aZ, b[2], c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_cas_ivec3(float aX, float aY, float aZ, float[] b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b[0], c),
			Math.fma(aY, b[1], c),
			Math.fma(aZ, b[2], c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_cac_ivec3(float aX, float aY, float aZ, float[] b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b[0], cX),
			Math.fma(aY, b[1], cY),
			Math.fma(aZ, b[2], cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_csv_ivec3(float aX, float aY, float aZ, float b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b, c.x()),
			Math.fma(aY, b, c.y()),
			Math.fma(aZ, b, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_csa_ivec3(float aX, float aY, float aZ, float b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b, c[0]),
			Math.fma(aY, b, c[1]),
			Math.fma(aZ, b, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_css_ivec3(float aX, float aY, float aZ, float b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b, c),
			Math.fma(aY, b, c),
			Math.fma(aZ, b, c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_csc_ivec3(float aX, float aY, float aZ, float b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, b, cX),
			Math.fma(aY, b, cY),
			Math.fma(aZ, b, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_ccv_ivec3(float aX, float aY, float aZ, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, bX, c.x()),
			Math.fma(aY, bY, c.y()),
			Math.fma(aZ, bZ, c.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_cca_ivec3(float aX, float aY, float aZ, float bX, float bY, float bZ, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, bX, c[0]),
			Math.fma(aY, bY, c[1]),
			Math.fma(aZ, bZ, c[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_ccs_ivec3(float aX, float aY, float aZ, float bX, float bY, float bZ, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, bX, c),
			Math.fma(aY, bY, c),
			Math.fma(aZ, bZ, c)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAddT_ccc_ivec3(float aX, float aY, float aZ, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(aX, bX, cX),
			Math.fma(aY, bY, cY),
			Math.fma(aZ, bZ, cZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T mulAdd_vv_ivec3(T a, IVec3RF b, IVec3RF c)
	{
		a.set(
			Math.fma(a.x(), b.x(), c.x()),
			Math.fma(a.y(), b.y(), c.y()),
			Math.fma(a.z(), b.z(), c.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_va_ivec3(T a, IVec3RF b, float[] c)
	{
		a.set(
			Math.fma(a.x(), b.x(), c[0]),
			Math.fma(a.y(), b.y(), c[1]),
			Math.fma(a.z(), b.z(), c[2])
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_vs_ivec3(T a, IVec3RF b, float c)
	{
		a.set(
			Math.fma(a.x(), b.x(), c),
			Math.fma(a.y(), b.y(), c),
			Math.fma(a.z(), b.z(), c)
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_vc_ivec3(T a, IVec3RF b, float cX, float cY, float cZ)
	{
		a.set(
			Math.fma(a.x(), b.x(), cX),
			Math.fma(a.y(), b.y(), cY),
			Math.fma(a.z(), b.z(), cZ)
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_av_ivec3(T a, float[] b, IVec3RF c)
	{
		a.set(
			Math.fma(a.x(), b[0], c.x()),
			Math.fma(a.y(), b[1], c.y()),
			Math.fma(a.z(), b[2], c.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_aa_ivec3(T a, float[] b, float[] c)
	{
		a.set(
			Math.fma(a.x(), b[0], c[0]),
			Math.fma(a.y(), b[1], c[1]),
			Math.fma(a.z(), b[2], c[2])
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_as_ivec3(T a, float[] b, float c)
	{
		a.set(
			Math.fma(a.x(), b[0], c),
			Math.fma(a.y(), b[1], c),
			Math.fma(a.z(), b[2], c)
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_ac_ivec3(T a, float[] b, float cX, float cY, float cZ)
	{
		a.set(
			Math.fma(a.x(), b[0], cX),
			Math.fma(a.y(), b[1], cY),
			Math.fma(a.z(), b[2], cZ)
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_sv_ivec3(T a, float b, IVec3RF c)
	{
		a.set(
			Math.fma(a.x(), b, c.x()),
			Math.fma(a.y(), b, c.y()),
			Math.fma(a.z(), b, c.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_sa_ivec3(T a, float b, float[] c)
	{
		a.set(
			Math.fma(a.x(), b, c[0]),
			Math.fma(a.y(), b, c[1]),
			Math.fma(a.z(), b, c[2])
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_ss_ivec3(T a, float b, float c)
	{
		a.set(
			Math.fma(a.x(), b, c),
			Math.fma(a.y(), b, c),
			Math.fma(a.z(), b, c)
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_sc_ivec3(T a, float b, float cX, float cY, float cZ)
	{
		a.set(
			Math.fma(a.x(), b, cX),
			Math.fma(a.y(), b, cY),
			Math.fma(a.z(), b, cZ)
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_cv_ivec3(T a, float bX, float bY, float bZ, IVec3RF c)
	{
		a.set(
			Math.fma(a.x(), bX, c.x()),
			Math.fma(a.y(), bY, c.y()),
			Math.fma(a.z(), bZ, c.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_ca_ivec3(T a, float bX, float bY, float bZ, float[] c)
	{
		a.set(
			Math.fma(a.x(), bX, c[0]),
			Math.fma(a.y(), bY, c[1]),
			Math.fma(a.z(), bZ, c[2])
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_cs_ivec3(T a, float bX, float bY, float bZ, float c)
	{
		a.set(
			Math.fma(a.x(), bX, c),
			Math.fma(a.y(), bY, c),
			Math.fma(a.z(), bZ, c)
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T mulAdd_cc_ivec3(T a, float bX, float bY, float bZ, float cX, float cY, float cZ)
	{
		a.set(
			Math.fma(a.x(), bX, cX),
			Math.fma(a.y(), bY, cY),
			Math.fma(a.z(), bZ, cZ)
		);
		
		return a;
	}
	
	public static float[] revMulAdd_vvv_rvec3(IVec3RF a, IVec3RF b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b.x(), c.x(), a.x()),
			Math.fma(b.y(), c.y(), a.y()),
			Math.fma(b.z(), c.z(), a.z()),
		};
	}
	
	public static float[] revMulAdd_vva_rvec3(IVec3RF a, IVec3RF b, float[] c)
	{
		return new float[] {
			Math.fma(b.x(), c[0], a.x()),
			Math.fma(b.y(), c[1], a.y()),
			Math.fma(b.z(), c[2], a.z()),
		};
	}
	
	public static float[] revMulAdd_vvs_rvec3(IVec3RF a, IVec3RF b, float c)
	{
		return new float[] {
			Math.fma(b.x(), c, a.x()),
			Math.fma(b.y(), c, a.y()),
			Math.fma(b.z(), c, a.z()),
		};
	}
	
	public static float[] revMulAdd_vvc_rvec3(IVec3RF a, IVec3RF b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(b.x(), cX, a.x()),
			Math.fma(b.y(), cY, a.y()),
			Math.fma(b.z(), cZ, a.z()),
		};
	}
	
	public static float[] revMulAdd_vav_rvec3(IVec3RF a, float[] b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b[0], c.x(), a.x()),
			Math.fma(b[1], c.y(), a.y()),
			Math.fma(b[2], c.z(), a.z()),
		};
	}
	
	public static float[] revMulAdd_vaa_rvec3(IVec3RF a, float[] b, float[] c)
	{
		return new float[] {
			Math.fma(b[0], c[0], a.x()),
			Math.fma(b[1], c[1], a.y()),
			Math.fma(b[2], c[2], a.z()),
		};
	}
	
	public static float[] revMulAdd_vas_rvec3(IVec3RF a, float[] b, float c)
	{
		return new float[] {
			Math.fma(b[0], c, a.x()),
			Math.fma(b[1], c, a.y()),
			Math.fma(b[2], c, a.z()),
		};
	}
	
	public static float[] revMulAdd_vac_rvec3(IVec3RF a, float[] b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(b[0], cX, a.x()),
			Math.fma(b[1], cY, a.y()),
			Math.fma(b[2], cZ, a.z()),
		};
	}
	
	public static float[] revMulAdd_vsv_rvec3(IVec3RF a, float b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b, c.x(), a.x()),
			Math.fma(b, c.y(), a.y()),
			Math.fma(b, c.z(), a.z()),
		};
	}
	
	public static float[] revMulAdd_vsa_rvec3(IVec3RF a, float b, float[] c)
	{
		return new float[] {
			Math.fma(b, c[0], a.x()),
			Math.fma(b, c[1], a.y()),
			Math.fma(b, c[2], a.z()),
		};
	}
	
	public static float[] revMulAdd_vss_rvec3(IVec3RF a, float b, float c)
	{
		return new float[] {
			Math.fma(b, c, a.x()),
			Math.fma(b, c, a.y()),
			Math.fma(b, c, a.z()),
		};
	}
	
	public static float[] revMulAdd_vsc_rvec3(IVec3RF a, float b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(b, cX, a.x()),
			Math.fma(b, cY, a.y()),
			Math.fma(b, cZ, a.z()),
		};
	}
	
	public static float[] revMulAdd_vcv_rvec3(IVec3RF a, float bX, float bY, float bZ, IVec3RF c)
	{
		return new float[] {
			Math.fma(bX, c.x(), a.x()),
			Math.fma(bY, c.y(), a.y()),
			Math.fma(bZ, c.z(), a.z()),
		};
	}
	
	public static float[] revMulAdd_vca_rvec3(IVec3RF a, float bX, float bY, float bZ, float[] c)
	{
		return new float[] {
			Math.fma(bX, c[0], a.x()),
			Math.fma(bY, c[1], a.y()),
			Math.fma(bZ, c[2], a.z()),
		};
	}
	
	public static float[] revMulAdd_vcs_rvec3(IVec3RF a, float bX, float bY, float bZ, float c)
	{
		return new float[] {
			Math.fma(bX, c, a.x()),
			Math.fma(bY, c, a.y()),
			Math.fma(bZ, c, a.z()),
		};
	}
	
	public static float[] revMulAdd_vcc_rvec3(IVec3RF a, float bX, float bY, float bZ, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(bX, cX, a.x()),
			Math.fma(bY, cY, a.y()),
			Math.fma(bZ, cZ, a.z()),
		};
	}
	
	public static float[] revMulAdd_avv_rvec3(float[] a, IVec3RF b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b.x(), c.x(), a[0]),
			Math.fma(b.y(), c.y(), a[1]),
			Math.fma(b.z(), c.z(), a[2]),
		};
	}
	
	public static float[] revMulAdd_ava_rvec3(float[] a, IVec3RF b, float[] c)
	{
		return new float[] {
			Math.fma(b.x(), c[0], a[0]),
			Math.fma(b.y(), c[1], a[1]),
			Math.fma(b.z(), c[2], a[2]),
		};
	}
	
	public static float[] revMulAdd_avs_rvec3(float[] a, IVec3RF b, float c)
	{
		return new float[] {
			Math.fma(b.x(), c, a[0]),
			Math.fma(b.y(), c, a[1]),
			Math.fma(b.z(), c, a[2]),
		};
	}
	
	public static float[] revMulAdd_avc_rvec3(float[] a, IVec3RF b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(b.x(), cX, a[0]),
			Math.fma(b.y(), cY, a[1]),
			Math.fma(b.z(), cZ, a[2]),
		};
	}
	
	public static float[] revMulAdd_aav_rvec3(float[] a, float[] b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b[0], c.x(), a[0]),
			Math.fma(b[1], c.y(), a[1]),
			Math.fma(b[2], c.z(), a[2]),
		};
	}
	
	public static float[] revMulAdd_asv_rvec3(float[] a, float b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b, c.x(), a[0]),
			Math.fma(b, c.y(), a[1]),
			Math.fma(b, c.z(), a[2]),
		};
	}
	
	public static float[] revMulAdd_acv_rvec3(float[] a, float bX, float bY, float bZ, IVec3RF c)
	{
		return new float[] {
			Math.fma(bX, c.x(), a[0]),
			Math.fma(bY, c.y(), a[1]),
			Math.fma(bZ, c.z(), a[2]),
		};
	}
	
	public static float[] revMulAdd_sav_rvec3(float a, float[] b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b[0], c.x(), a),
			Math.fma(b[1], c.y(), a),
			Math.fma(b[2], c.z(), a),
		};
	}
	
	public static float[] revMulAdd_ssv_rvec3(float a, float b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b, c.x(), a),
			Math.fma(b, c.y(), a),
			Math.fma(b, c.z(), a),
		};
	}
	
	public static float[] revMulAdd_scv_rvec3(float a, float bX, float bY, float bZ, IVec3RF c)
	{
		return new float[] {
			Math.fma(bX, c.x(), a),
			Math.fma(bY, c.y(), a),
			Math.fma(bZ, c.z(), a),
		};
	}
	
	public static float[] revMulAdd_cvv_rvec3(float aX, float aY, float aZ, IVec3RF b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b.x(), c.x(), aX),
			Math.fma(b.y(), c.y(), aY),
			Math.fma(b.z(), c.z(), aZ),
		};
	}
	
	public static float[] revMulAdd_cva_rvec3(float aX, float aY, float aZ, IVec3RF b, float[] c)
	{
		return new float[] {
			Math.fma(b.x(), c[0], aX),
			Math.fma(b.y(), c[1], aY),
			Math.fma(b.z(), c[2], aZ),
		};
	}
	
	public static float[] revMulAdd_cvs_rvec3(float aX, float aY, float aZ, IVec3RF b, float c)
	{
		return new float[] {
			Math.fma(b.x(), c, aX),
			Math.fma(b.y(), c, aY),
			Math.fma(b.z(), c, aZ),
		};
	}
	
	public static float[] revMulAdd_cvc_rvec3(float aX, float aY, float aZ, IVec3RF b, float cX, float cY, float cZ)
	{
		return new float[] {
			Math.fma(b.x(), cX, aX),
			Math.fma(b.y(), cY, aY),
			Math.fma(b.z(), cZ, aZ),
		};
	}
	
	public static float[] revMulAdd_cav_rvec3(float aX, float aY, float aZ, float[] b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b[0], c.x(), aX),
			Math.fma(b[1], c.y(), aY),
			Math.fma(b[2], c.z(), aZ),
		};
	}
	
	public static float[] revMulAdd_csv_rvec3(float aX, float aY, float aZ, float b, IVec3RF c)
	{
		return new float[] {
			Math.fma(b, c.x(), aX),
			Math.fma(b, c.y(), aY),
			Math.fma(b, c.z(), aZ),
		};
	}
	
	public static float[] revMulAdd_ccv_rvec3(float aX, float aY, float aZ, float bX, float bY, float bZ, IVec3RF c)
	{
		return new float[] {
			Math.fma(bX, c.x(), aX),
			Math.fma(bY, c.y(), aY),
			Math.fma(bZ, c.z(), aZ),
		};
	}
	
	public static float[] revMulAddT_vvv_rvec3(IVec3RF a, IVec3RF b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c.x(), a.x());
		res[1] = Math.fma(b.y(), c.y(), a.y());
		res[2] = Math.fma(b.z(), c.z(), a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vva_rvec3(IVec3RF a, IVec3RF b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c[0], a.x());
		res[1] = Math.fma(b.y(), c[1], a.y());
		res[2] = Math.fma(b.z(), c[2], a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vvs_rvec3(IVec3RF a, IVec3RF b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c, a.x());
		res[1] = Math.fma(b.y(), c, a.y());
		res[2] = Math.fma(b.z(), c, a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vvc_rvec3(IVec3RF a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), cX, a.x());
		res[1] = Math.fma(b.y(), cY, a.y());
		res[2] = Math.fma(b.z(), cZ, a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vav_rvec3(IVec3RF a, float[] b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], c.x(), a.x());
		res[1] = Math.fma(b[1], c.y(), a.y());
		res[2] = Math.fma(b[2], c.z(), a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vaa_rvec3(IVec3RF a, float[] b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], c[0], a.x());
		res[1] = Math.fma(b[1], c[1], a.y());
		res[2] = Math.fma(b[2], c[2], a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vas_rvec3(IVec3RF a, float[] b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], c, a.x());
		res[1] = Math.fma(b[1], c, a.y());
		res[2] = Math.fma(b[2], c, a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vac_rvec3(IVec3RF a, float[] b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], cX, a.x());
		res[1] = Math.fma(b[1], cY, a.y());
		res[2] = Math.fma(b[2], cZ, a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vsv_rvec3(IVec3RF a, float b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, c.x(), a.x());
		res[1] = Math.fma(b, c.y(), a.y());
		res[2] = Math.fma(b, c.z(), a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vsa_rvec3(IVec3RF a, float b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, c[0], a.x());
		res[1] = Math.fma(b, c[1], a.y());
		res[2] = Math.fma(b, c[2], a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vss_rvec3(IVec3RF a, float b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, c, a.x());
		res[1] = Math.fma(b, c, a.y());
		res[2] = Math.fma(b, c, a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vsc_rvec3(IVec3RF a, float b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, cX, a.x());
		res[1] = Math.fma(b, cY, a.y());
		res[2] = Math.fma(b, cZ, a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vcv_rvec3(IVec3RF a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(bX, c.x(), a.x());
		res[1] = Math.fma(bY, c.y(), a.y());
		res[2] = Math.fma(bZ, c.z(), a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vca_rvec3(IVec3RF a, float bX, float bY, float bZ, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(bX, c[0], a.x());
		res[1] = Math.fma(bY, c[1], a.y());
		res[2] = Math.fma(bZ, c[2], a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vcs_rvec3(IVec3RF a, float bX, float bY, float bZ, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(bX, c, a.x());
		res[1] = Math.fma(bY, c, a.y());
		res[2] = Math.fma(bZ, c, a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_vcc_rvec3(IVec3RF a, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(bX, cX, a.x());
		res[1] = Math.fma(bY, cY, a.y());
		res[2] = Math.fma(bZ, cZ, a.z());
		
		return res;
	}
	
	public static float[] revMulAddT_avv_rvec3(float[] a, IVec3RF b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c.x(), a[0]);
		res[1] = Math.fma(b.y(), c.y(), a[1]);
		res[2] = Math.fma(b.z(), c.z(), a[2]);
		
		return res;
	}
	
	public static float[] revMulAddT_ava_rvec3(float[] a, IVec3RF b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c[0], a[0]);
		res[1] = Math.fma(b.y(), c[1], a[1]);
		res[2] = Math.fma(b.z(), c[2], a[2]);
		
		return res;
	}
	
	public static float[] revMulAddT_ava_rvec3(float[] a, IVec3RF b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c, a[0]);
		res[1] = Math.fma(b.y(), c, a[1]);
		res[2] = Math.fma(b.z(), c, a[2]);
		
		return res;
	}
	
	public static float[] revMulAddT_avc_rvec3(float[] a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), cX, a[0]);
		res[1] = Math.fma(b.y(), cY, a[1]);
		res[2] = Math.fma(b.z(), cZ, a[2]);
		
		return res;
	}
	
	public static float[] revMulAddT_aav_rvec3(float[] a, float[] b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], c.x(), a[0]);
		res[1] = Math.fma(b[1], c.y(), a[1]);
		res[2] = Math.fma(b[2], c.z(), a[2]);
		
		return res;
	}
	
	public static float[] revMulAddT_asv_rvec3(float[] a, float b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, c.x(), a[0]);
		res[1] = Math.fma(b, c.y(), a[1]);
		res[2] = Math.fma(b, c.z(), a[2]);
		
		return res;
	}
	
	public static float[] revMulAddT_acv_rvec3(float[] a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(bX, c.x(), a[0]);
		res[1] = Math.fma(bY, c.y(), a[1]);
		res[2] = Math.fma(bZ, c.z(), a[2]);
		
		return res;
	}
	
	public static float[] revMulAddT_svv_rvec3(float a, IVec3RF b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c.x(), a);
		res[1] = Math.fma(b.y(), c.y(), a);
		res[2] = Math.fma(b.z(), c.z(), a);
		
		return res;
	}
	
	public static float[] revMulAddT_sva_rvec3(float a, IVec3RF b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c[0], a);
		res[1] = Math.fma(b.y(), c[1], a);
		res[2] = Math.fma(b.z(), c[2], a);
		
		return res;
	}
	
	public static float[] revMulAddT_sva_rvec3(float a, IVec3RF b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c, a);
		res[1] = Math.fma(b.y(), c, a);
		res[2] = Math.fma(b.z(), c, a);
		
		return res;
	}
	
	public static float[] revMulAddT_svc_rvec3(float a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), cX, a);
		res[1] = Math.fma(b.y(), cY, a);
		res[2] = Math.fma(b.z(), cZ, a);
		
		return res;
	}
	
	public static float[] revMulAddT_sav_rvec3(float a, float[] b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], c.x(), a);
		res[1] = Math.fma(b[1], c.y(), a);
		res[2] = Math.fma(b[2], c.z(), a);
		
		return res;
	}
	
	public static float[] revMulAddT_ssv_rvec3(float a, float b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, c.x(), a);
		res[1] = Math.fma(b, c.y(), a);
		res[2] = Math.fma(b, c.z(), a);
		
		return res;
	}
	
	public static float[] revMulAddT_scv_rvec3(float a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(bX, c.x(), a);
		res[1] = Math.fma(bY, c.y(), a);
		res[2] = Math.fma(bZ, c.z(), a);
		
		return res;
	}
	
	public static float[] revMulAddT_cvv_rvec3(float aX, float aY, float aZ, IVec3RF b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c.x(), aX);
		res[1] = Math.fma(b.y(), c.y(), aY);
		res[2] = Math.fma(b.z(), c.z(), aZ);
		
		return res;
	}
	
	public static float[] revMulAddT_cva_rvec3(float aX, float aY, float aZ, IVec3RF b, float[] c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c[0], aX);
		res[1] = Math.fma(b.y(), c[1], aY);
		res[2] = Math.fma(b.z(), c[2], aZ);
		
		return res;
	}
	
	public static float[] revMulAddT_cvs_rvec3(float aX, float aY, float aZ, IVec3RF b, float c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), c, aX);
		res[1] = Math.fma(b.y(), c, aY);
		res[2] = Math.fma(b.z(), c, aZ);
		
		return res;
	}
	
	public static float[] revMulAddT_cvc_rvec3(float aX, float aY, float aZ, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), cX, aX);
		res[1] = Math.fma(b.y(), cY, aY);
		res[2] = Math.fma(b.z(), cZ, aZ);
		
		return res;
	}
	
	public static float[] revMulAddT_cav_rvec3(float aX, float aY, float aZ, float[] b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], c.x(), aX);
		res[1] = Math.fma(b[1], c.y(), aY);
		res[2] = Math.fma(b[2], c.z(), aZ);
		
		return res;
	}
	
	public static float[] revMulAddT_csv_rvec3(float aX, float aY, float aZ, float b, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, c.x(), aX);
		res[1] = Math.fma(b, c.y(), aY);
		res[2] = Math.fma(b, c.z(), aZ);
		
		return res;
	}
	
	public static float[] revMulAddT_ccv_rvec3(float aX, float aY, float aZ, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(bX, c.x(), aX);
		res[1] = Math.fma(bY, c.y(), aY);
		res[2] = Math.fma(bZ, c.z(), aZ);
		
		return res;
	}
	
	public static float[] revMulAddT_avv_rvec3(float[] a, IVec3RF b, IVec3RF c)
	{
		a[0] = Math.fma(b.x(), c.x(), a[0]);
		a[1] = Math.fma(b.y(), c.y(), a[1]);
		a[2] = Math.fma(b.z(), c.z(), a[2]);
		
		return a;
	}
	
	public static float[] revMulAddT_ava_rvec3(float[] a, IVec3RF b, float[] c)
	{
		a[0] = Math.fma(b.x(), c[0], a[0]);
		a[1] = Math.fma(b.y(), c[1], a[1]);
		a[2] = Math.fma(b.z(), c[2], a[2]);
		
		return a;
	}
	
	public static float[] revMulAddT_ava_rvec3(float[] a, IVec3RF b, float c)
	{
		a[0] = Math.fma(b.x(), c, a[0]);
		a[1] = Math.fma(b.y(), c, a[1]);
		a[2] = Math.fma(b.z(), c, a[2]);
		
		return a;
	}
	
	public static float[] revMulAddT_avc_rvec3(float[] a, IVec3RF b, float cX, float cY, float cZ)
	{
		a[0] = Math.fma(b.x(), cX, a[0]);
		a[1] = Math.fma(b.y(), cY, a[1]);
		a[2] = Math.fma(b.z(), cZ, a[2]);
		
		return a;
	}
	
	public static float[] revMulAddT_aav_rvec3(float[] a, float[] b, IVec3RF c)
	{
		a[0] = Math.fma(b[0], c.x(), a[0]);
		a[1] = Math.fma(b[1], c.y(), a[1]);
		a[2] = Math.fma(b[2], c.z(), a[2]);
		
		return a;
	}
	
	public static float[] revMulAddT_aav_rvec3(float[] a, float b, IVec3RF c)
	{
		a[0] = Math.fma(b, c.x(), a[0]);
		a[1] = Math.fma(b, c.y(), a[1]);
		a[2] = Math.fma(b, c.z(), a[2]);
		
		return a;
	}
	
	public static float[] revMulAddT_acv_rvec3(float[] a, float bX, float bY, float bZ, IVec3RF c)
	{
		a[0] = Math.fma(bX, c.x(), a[0]);
		a[1] = Math.fma(bY, c.y(), a[1]);
		a[2] = Math.fma(bZ, c.z(), a[2]);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vvv_ivec3(IVec3RF a, IVec3RF b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c.x(), a.x()),
			Math.fma(b.y(), c.y(), a.y()),
			Math.fma(b.z(), c.z(), a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vva_ivec3(IVec3RF a, IVec3RF b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c[0], a.x()),
			Math.fma(b.y(), c[1], a.y()),
			Math.fma(b.z(), c[2], a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vvs_ivec3(IVec3RF a, IVec3RF b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c, a.x()),
			Math.fma(b.y(), c, a.y()),
			Math.fma(b.z(), c, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vvc_ivec3(IVec3RF a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), cX, a.x()),
			Math.fma(b.y(), cY, a.y()),
			Math.fma(b.z(), cZ, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vav_ivec3(IVec3RF a, float[] b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c.x(), a.x()),
			Math.fma(b[1], c.y(), a.y()),
			Math.fma(b[2], c.z(), a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vaa_ivec3(IVec3RF a, float[] b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c[0], a.x()),
			Math.fma(b[1], c[1], a.y()),
			Math.fma(b[2], c[2], a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vas_ivec3(IVec3RF a, float[] b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c, a.x()),
			Math.fma(b[1], c, a.y()),
			Math.fma(b[2], c, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vac_ivec3(IVec3RF a, float[] b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], cX, a.x()),
			Math.fma(b[1], cY, a.y()),
			Math.fma(b[2], cZ, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vsv_ivec3(IVec3RF a, float b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b, c.x(), a.x()),
			Math.fma(b, c.y(), a.y()),
			Math.fma(b, c.z(), a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vsa_ivec3(IVec3RF a, float b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b, c[0], a.x()),
			Math.fma(b, c[1], a.y()),
			Math.fma(b, c[2], a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vss_ivec3(IVec3RF a, float b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b, c, a.x()),
			Math.fma(b, c, a.y()),
			Math.fma(b, c, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vsc_ivec3(IVec3RF a, float b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b, cX, a.x()),
			Math.fma(b, cY, a.y()),
			Math.fma(b, cZ, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vcv_ivec3(IVec3RF a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c.x(), a.x()),
			Math.fma(bY, c.y(), a.y()),
			Math.fma(bZ, c.z(), a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vca_ivec3(IVec3RF a, float bX, float bY, float bZ, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c[0], a.x()),
			Math.fma(bY, c[1], a.y()),
			Math.fma(bZ, c[2], a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vcs_ivec3(IVec3RF a, float bX, float bY, float bZ, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c, a.x()),
			Math.fma(bY, c, a.y()),
			Math.fma(bZ, c, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_vcc_ivec3(IVec3RF a, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, cX, a.x()),
			Math.fma(bY, cY, a.y()),
			Math.fma(bZ, cZ, a.z())
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_avv_ivec3(float[] a, IVec3RF b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c.x(), a[0]),
			Math.fma(b.y(), c.y(), a[1]),
			Math.fma(b.z(), c.z(), a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_ava_ivec3(float[] a, IVec3RF b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c[0], a[0]),
			Math.fma(b.y(), c[1], a[1]),
			Math.fma(b.z(), c[2], a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_avs_ivec3(float[] a, IVec3RF b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c, a[0]),
			Math.fma(b.y(), c, a[1]),
			Math.fma(b.z(), c, a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_avc_ivec3(float[] a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), cX, a[0]),
			Math.fma(b.y(), cY, a[1]),
			Math.fma(b.z(), cZ, a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_aav_ivec3(float[] a, float[] b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c.x(), a[0]),
			Math.fma(b[1], c.y(), a[1]),
			Math.fma(b[2], c.z(), a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_aaa_ivec3(float[] a, float[] b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c[0], a[0]),
			Math.fma(b[1], c[1], a[1]),
			Math.fma(b[2], c[2], a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_aas_ivec3(float[] a, float[] b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c, a[0]),
			Math.fma(b[1], c, a[1]),
			Math.fma(b[2], c, a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_aac_ivec3(float[] a, float[] b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], cX, a[0]),
			Math.fma(b[1], cY, a[1]),
			Math.fma(b[2], cZ, a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_acv_ivec3(float[] a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c.x(), a[0]),
			Math.fma(bY, c.y(), a[1]),
			Math.fma(bZ, c.z(), a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_aca_ivec3(float[] a, float bX, float bY, float bZ, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c[0], a[0]),
			Math.fma(bY, c[1], a[1]),
			Math.fma(bZ, c[2], a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_acs_ivec3(float[] a, float bX, float bY, float bZ, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c, a[0]),
			Math.fma(bY, c, a[1]),
			Math.fma(bZ, c, a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_acc_ivec3(float[] a, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, cX, a[0]),
			Math.fma(bY, cY, a[1]),
			Math.fma(bZ, cZ, a[2])
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_svv_ivec3(float a, IVec3RF b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c.x(), a),
			Math.fma(b.y(), c.y(), a),
			Math.fma(b.z(), c.z(), a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_sva_ivec3(float a, IVec3RF b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c[0], a),
			Math.fma(b.y(), c[1], a),
			Math.fma(b.z(), c[2], a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_svs_ivec3(float a, IVec3RF b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c, a),
			Math.fma(b.y(), c, a),
			Math.fma(b.z(), c, a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_svc_ivec3(float a, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), cX, a),
			Math.fma(b.y(), cY, a),
			Math.fma(b.z(), cZ, a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_sav_ivec3(float a, float[] b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c.x(), a),
			Math.fma(b[1], c.y(), a),
			Math.fma(b[2], c.z(), a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_saa_ivec3(float a, float[] b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c[0], a),
			Math.fma(b[1], c[1], a),
			Math.fma(b[2], c[2], a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_sas_ivec3(float a, float[] b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c, a),
			Math.fma(b[1], c, a),
			Math.fma(b[2], c, a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_sac_ivec3(float a, float[] b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], cX, a),
			Math.fma(b[1], cY, a),
			Math.fma(b[2], cZ, a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_scv_ivec3(float a, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c.x(), a),
			Math.fma(bY, c.y(), a),
			Math.fma(bZ, c.z(), a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_sca_ivec3(float a, float bX, float bY, float bZ, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c[0], a),
			Math.fma(bY, c[1], a),
			Math.fma(bZ, c[2], a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_scs_ivec3(float a, float bX, float bY, float bZ, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c, a),
			Math.fma(bY, c, a),
			Math.fma(bZ, c, a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_scc_ivec3(float a, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, cX, a),
			Math.fma(bY, cY, a),
			Math.fma(bZ, cZ, a)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_cvv_ivec3(float aX, float aY, float aZ, IVec3RF b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c.x(), aX),
			Math.fma(b.y(), c.y(), aY),
			Math.fma(b.z(), c.z(), aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_cva_ivec3(float aX, float aY, float aZ, IVec3RF b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c[0], aX),
			Math.fma(b.y(), c[1], aY),
			Math.fma(b.z(), c[2], aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_cvs_ivec3(float aX, float aY, float aZ, IVec3RF b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), c, aX),
			Math.fma(b.y(), c, aY),
			Math.fma(b.z(), c, aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_cvc_ivec3(float aX, float aY, float aZ, IVec3RF b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b.x(), cX, aX),
			Math.fma(b.y(), cY, aY),
			Math.fma(b.z(), cZ, aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_cav_ivec3(float aX, float aY, float aZ, float[] b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c.x(), aX),
			Math.fma(b[1], c.y(), aY),
			Math.fma(b[2], c.z(), aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_caa_ivec3(float aX, float aY, float aZ, float[] b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c[0], aX),
			Math.fma(b[1], c[1], aY),
			Math.fma(b[2], c[2], aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_cas_ivec3(float aX, float aY, float aZ, float[] b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], c, aX),
			Math.fma(b[1], c, aY),
			Math.fma(b[2], c, aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_cac_ivec3(float aX, float aY, float aZ, float[] b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b[0], cX, aX),
			Math.fma(b[1], cY, aY),
			Math.fma(b[2], cZ, aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_csv_ivec3(float aX, float aY, float aZ, float b, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b, c.x(), aX),
			Math.fma(b, c.y(), aY),
			Math.fma(b, c.z(), aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_csa_ivec3(float aX, float aY, float aZ, float b, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b, c[0], aX),
			Math.fma(b, c[1], aY),
			Math.fma(b, c[2], aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_csa_ivec3(float aX, float aY, float aZ, float b, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b, c, aX),
			Math.fma(b, c, aY),
			Math.fma(b, c, aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_csc_ivec3(float aX, float aY, float aZ, float b, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(b, cX, aX),
			Math.fma(b, cY, aY),
			Math.fma(b, cZ, aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_ccv_ivec3(float aX, float aY, float aZ, float bX, float bY, float bZ, IVec3RF c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c.x(), aX),
			Math.fma(bY, c.y(), aY),
			Math.fma(bZ, c.z(), aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_cca_ivec3(float aX, float aY, float aZ, float bX, float bY, float bZ, float[] c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c[0], aX),
			Math.fma(bY, c[1], aY),
			Math.fma(bZ, c[2], aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_ccs_ivec3(float aX, float aY, float aZ, float bX, float bY, float bZ, float c, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, c, aX),
			Math.fma(bY, c, aY),
			Math.fma(bZ, c, aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAddT_ccc_ivec3(float aX, float aY, float aZ, float bX, float bY, float bZ, float cX, float cY, float cZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(bX, cX, aX),
			Math.fma(bY, cY, aY),
			Math.fma(bZ, cZ, aZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T revMulAdd_vv_ivec3(T a, IVec3RF b, IVec3RF c)
	{
		a.set(
			Math.fma(b.x(), c.x(), a.x()),
			Math.fma(b.y(), c.y(), a.y()),
			Math.fma(b.z(), c.z(), a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_va_ivec3(T a, IVec3RF b, float[] c)
	{
		a.set(
			Math.fma(b.x(), c[0], a.x()),
			Math.fma(b.y(), c[1], a.y()),
			Math.fma(b.z(), c[2], a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_vs_ivec3(T a, IVec3RF b, float c)
	{
		a.set(
			Math.fma(b.x(), c, a.x()),
			Math.fma(b.y(), c, a.y()),
			Math.fma(b.z(), c, a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_vc_ivec3(T a, IVec3RF b, float cX, float cY, float cZ)
	{
		a.set(
			Math.fma(b.x(), cX, a.x()),
			Math.fma(b.y(), cY, a.y()),
			Math.fma(b.z(), cZ, a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_av_ivec3(T a, float[] b, IVec3RF c)
	{
		a.set(
			Math.fma(b[0], c.x(), a.x()),
			Math.fma(b[1], c.y(), a.y()),
			Math.fma(b[2], c.z(), a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_aa_ivec3(T a, float[] b, float[] c)
	{
		a.set(
			Math.fma(b[0], c[0], a.x()),
			Math.fma(b[1], c[1], a.y()),
			Math.fma(b[2], c[2], a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_as_ivec3(T a, float[] b, float c)
	{
		a.set(
			Math.fma(b[0], c, a.x()),
			Math.fma(b[1], c, a.y()),
			Math.fma(b[2], c, a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_ac_ivec3(T a, float[] b, float cX, float cY, float cZ)
	{
		a.set(
			Math.fma(b[0], cX, a.x()),
			Math.fma(b[1], cY, a.y()),
			Math.fma(b[2], cZ, a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_sv_ivec3(T a, float b, IVec3RF c)
	{
		a.set(
			Math.fma(b, c.x(), a.x()),
			Math.fma(b, c.y(), a.y()),
			Math.fma(b, c.z(), a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_sa_ivec3(T a, float b, float[] c)
	{
		a.set(
			Math.fma(b, c[0], a.x()),
			Math.fma(b, c[1], a.y()),
			Math.fma(b, c[2], a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_ss_ivec3(T a, float b, float c)
	{
		a.set(
			Math.fma(b, c, a.x()),
			Math.fma(b, c, a.y()),
			Math.fma(b, c, a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_sc_ivec3(T a, float b, float cX, float cY, float cZ)
	{
		a.set(
			Math.fma(b, cX, a.x()),
			Math.fma(b, cY, a.y()),
			Math.fma(b, cZ, a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_cv_ivec3(T a, float bX, float bY, float bZ, IVec3RF c)
	{
		a.set(
			Math.fma(bX, c.x(), a.x()),
			Math.fma(bY, c.y(), a.y()),
			Math.fma(bZ, c.z(), a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_ca_ivec3(T a, float bX, float bY, float bZ, float[] c)
	{
		a.set(
			Math.fma(bX, c[0], a.x()),
			Math.fma(bY, c[1], a.y()),
			Math.fma(bZ, c[2], a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_cs_ivec3(T a, float bX, float bY, float bZ, float c)
	{
		a.set(
			Math.fma(bX, c, a.x()),
			Math.fma(bY, c, a.y()),
			Math.fma(bZ, c, a.z())
		);
		
		return a;
	}
	
	public static <T extends IVec3WF> T revMulAdd_cc_ivec3(T a, float bX, float bY, float bZ, float cX, float cY, float cZ)
	{
		a.set(
			Math.fma(bX, cX, a.x()),
			Math.fma(bY, cY, a.y()),
			Math.fma(bZ, cZ, a.z())
		);
		
		return a;
	}
	
	public static float[] addWeightedT_vvv_rvec3(IVec3RF a, IVec3RF b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight.x(), a.x());
		res[1] = Math.fma(b.y(), weight.y(), a.y());
		res[2] = Math.fma(b.z(), weight.z(), a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vva_rvec3(IVec3RF a, IVec3RF b, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight[0], a.x());
		res[1] = Math.fma(b.y(), weight[1], a.y());
		res[2] = Math.fma(b.z(), weight[2], a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vvs_rvec3(IVec3RF a, IVec3RF b, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight, a.x());
		res[1] = Math.fma(b.y(), weight, a.y());
		res[2] = Math.fma(b.z(), weight, a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vvc_rvec3(IVec3RF a, IVec3RF b, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weightX, a.x());
		res[1] = Math.fma(b.y(), weightY, a.y());
		res[2] = Math.fma(b.z(), weightZ, a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vav_rvec3(IVec3RF a, float[] b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], weight.x(), a.x());
		res[1] = Math.fma(b[1], weight.y(), a.y());
		res[2] = Math.fma(b[2], weight.z(), a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vaa_rvec3(IVec3RF a, float[] b, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], weight[0], a.x());
		res[1] = Math.fma(b[1], weight[1], a.y());
		res[2] = Math.fma(b[2], weight[2], a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vas_rvec3(IVec3RF a, float[] b, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], weight, a.x());
		res[1] = Math.fma(b[1], weight, a.y());
		res[2] = Math.fma(b[2], weight, a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vac_rvec3(IVec3RF a, float[] b, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], weightX, a.x());
		res[1] = Math.fma(b[1], weightY, a.y());
		res[2] = Math.fma(b[2], weightZ, a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vsv_rvec3(IVec3RF a, float b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, weight.x(), a.x());
		res[1] = Math.fma(b, weight.y(), a.y());
		res[2] = Math.fma(b, weight.z(), a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vsa_rvec3(IVec3RF a, float b, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, weight[0], a.x());
		res[1] = Math.fma(b, weight[1], a.y());
		res[2] = Math.fma(b, weight[2], a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vss_rvec3(IVec3RF a, float b, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, weight, a.x());
		res[1] = Math.fma(b, weight, a.y());
		res[2] = Math.fma(b, weight, a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_vsc_rvec3(IVec3RF a, float b, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, weightX, a.x());
		res[1] = Math.fma(b, weightY, a.y());
		res[2] = Math.fma(b, weightZ, a.z());
		
		return res;
	}
	
	public static float[] addWeightedT_avv_rvec3(float[] a, IVec3RF b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight.x(), a[0]);
		res[1] = Math.fma(b.y(), weight.y(), a[1]);
		res[2] = Math.fma(b.z(), weight.z(), a[2]);
		
		return res;
	}
	
	public static float[] addWeightedT_ava_rvec3(float[] a, IVec3RF b, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight[0], a[0]);
		res[1] = Math.fma(b.y(), weight[1], a[1]);
		res[2] = Math.fma(b.z(), weight[2], a[2]);
		
		return res;
	}
	
	public static float[] addWeightedT_avs_rvec3(float[] a, IVec3RF b, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight, a[0]);
		res[1] = Math.fma(b.y(), weight, a[1]);
		res[2] = Math.fma(b.z(), weight, a[2]);
		
		return res;
	}
	
	public static float[] addWeightedT_avc_rvec3(float[] a, IVec3RF b, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weightX, a[0]);
		res[1] = Math.fma(b.y(), weightY, a[1]);
		res[2] = Math.fma(b.z(), weightZ, a[2]);
		
		return res;
	}
	
	public static float[] addWeightedT_aav_rvec3(float[] a, float[] b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], weight.x(), a[0]);
		res[1] = Math.fma(b[1], weight.y(), a[1]);
		res[2] = Math.fma(b[2], weight.z(), a[2]);
		
		return res;
	}
	
	public static float[] addWeightedT_asv_rvec3(float[] a, float b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, weight.x(), a[0]);
		res[1] = Math.fma(b, weight.y(), a[1]);
		res[2] = Math.fma(b, weight.z(), a[2]);
		
		return res;
	}
	
	public static float[] addWeightedT_svv_rvec3(float a, IVec3RF b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight.x(), a);
		res[1] = Math.fma(b.y(), weight.y(), a);
		res[2] = Math.fma(b.z(), weight.z(), a);
		
		return res;
	}
	
	public static float[] addWeightedT_sva_rvec3(float a, IVec3RF b, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight[0], a);
		res[1] = Math.fma(b.y(), weight[1], a);
		res[2] = Math.fma(b.z(), weight[2], a);
		
		return res;
	}
	
	public static float[] addWeightedT_svs_rvec3(float a, IVec3RF b, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight, a);
		res[1] = Math.fma(b.y(), weight, a);
		res[2] = Math.fma(b.z(), weight, a);
		
		return res;
	}
	
	public static float[] addWeightedT_svc_rvec3(float a, IVec3RF b, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weightX, a);
		res[1] = Math.fma(b.y(), weightY, a);
		res[2] = Math.fma(b.z(), weightZ, a);
		
		return res;
	}
	
	public static float[] addWeightedT_sav_rvec3(float a, float[] b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], weight.x(), a);
		res[1] = Math.fma(b[1], weight.y(), a);
		res[2] = Math.fma(b[2], weight.z(), a);
		
		return res;
	}
	
	public static float[] addWeightedT_ssv_rvec3(float a, float b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, weight.x(), a);
		res[1] = Math.fma(b, weight.y(), a);
		res[2] = Math.fma(b, weight.z(), a);
		
		return res;
	}
	
	public static float[] addWeightedT_cvv_rvec3(float aX, float aY, float aZ, IVec3RF b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight.x(), aX);
		res[1] = Math.fma(b.y(), weight.y(), aY);
		res[2] = Math.fma(b.z(), weight.z(), aZ);
		
		return res;
	}
	
	public static float[] addWeightedT_cva_rvec3(float aX, float aY, float aZ, IVec3RF b, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight[0], aX);
		res[1] = Math.fma(b.y(), weight[1], aY);
		res[2] = Math.fma(b.z(), weight[2], aZ);
		
		return res;
	}
	
	public static float[] addWeightedT_cvs_rvec3(float aX, float aY, float aZ, IVec3RF b, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weight, aX);
		res[1] = Math.fma(b.y(), weight, aY);
		res[2] = Math.fma(b.z(), weight, aZ);
		
		return res;
	}
	
	public static float[] addWeightedT_cvc_rvec3(float aX, float aY, float aZ, IVec3RF b, float weightX, float weightY, float weightZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b.x(), weightX, aX);
		res[1] = Math.fma(b.y(), weightY, aY);
		res[2] = Math.fma(b.z(), weightZ, aZ);
		
		return res;
	}
	
	public static float[] addWeightedT_cav_rvec3(float aX, float aY, float aZ, float[] b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b[0], weight.x(), aX);
		res[1] = Math.fma(b[1], weight.y(), aY);
		res[2] = Math.fma(b[2], weight.z(), aZ);
		
		return res;
	}
	
	public static float[] addWeightedT_csv_rvec3(float aX, float aY, float aZ, float b, IVec3RF weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(b, weight.x(), aX);
		res[1] = Math.fma(b, weight.y(), aY);
		res[2] = Math.fma(b, weight.z(), aZ);
		
		return res;
	}
	
	public static float[] addWeighted_vv_rvec3(float[] a, IVec3RF b, IVec3RF weight)
	{
		a[0] = Math.fma(b.x(), weight.x(), a[0]);
		a[1] = Math.fma(b.y(), weight.y(), a[1]);
		a[2] = Math.fma(b.z(), weight.z(), a[2]);
		
		return a;
	}
	
	public static float[] addWeighted_va_rvec3(float[] a, IVec3RF b, float[] weight)
	{
		a[0] = Math.fma(b.x(), weight[0], a[0]);
		a[1] = Math.fma(b.y(), weight[1], a[1]);
		a[2] = Math.fma(b.z(), weight[2], a[2]);
		
		return a;
	}
	
	public static float[] addWeighted_vs_rvec3(float[] a, IVec3RF b, float weight)
	{
		a[0] = Math.fma(b.x(), weight, a[0]);
		a[1] = Math.fma(b.y(), weight, a[1]);
		a[2] = Math.fma(b.z(), weight, a[2]);
		
		return a;
	}
	
	public static float[] addWeighted_vc_rvec3(float[] a, IVec3RF b, float weightX, float weightY, float weightZ)
	{
		a[0] = Math.fma(b.x(), weightX, a[0]);
		a[1] = Math.fma(b.y(), weightY, a[1]);
		a[2] = Math.fma(b.z(), weightZ, a[2]);
		
		return a;
	}
	
	public static float[] addWeighted_av_rvec3(float[] a, float[] b, IVec3RF weight)
	{
		a[0] = Math.fma(b[0], weight.x(), a[0]);
		a[1] = Math.fma(b[1], weight.y(), a[1]);
		a[2] = Math.fma(b[2], weight.z(), a[2]);
		
		return a;
	}
	
	public static float[] addWeighted_sv_rvec3(float[] a, float b, IVec3RF weight)
	{
		a[0] = Math.fma(b, weight.x(), a[0]);
		a[1] = Math.fma(b, weight.y(), a[1]);
		a[2] = Math.fma(b, weight.z(), a[2]);
		
		return a;
	}
	
	public static float[] addWeighted_sv_rvec3(float[] a, float bX, float bY, float bZ, IVec3RF weight)
	{
		a[0] = Math.fma(bX, weight.x(), a[0]);
		a[1] = Math.fma(bY, weight.y(), a[1]);
		a[2] = Math.fma(bZ, weight.z(), a[2]);
		
		return a;
	}
	
}
