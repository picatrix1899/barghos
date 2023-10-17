//package org.barghos.math;
//
//import org.barghos.math.api.vector.Vec3fC;
//import org.barghos.math.api.vector.Vec3fR;
//import org.barghos.math.vector.Vec3f;
//
//public class RayAabbIntersector
//{
//	public boolean intersect(Vec3fR rayOrigin, Vec3fR rayDir, Vec3fR min, Vec3fR max)
//	{
//		Vec3fR invDir = rayDir.revDivN(1.0f);
//		
//		Vec3fC minV = new Vec3f(min).sub(rayOrigin).mul(invDir);
//		Vec3fC maxV = new Vec3f(max).sub(rayOrigin).mul(invDir);
//		
//		float tmin, tmax;
//		float tminY, tmaxY;
//		float tminZ, tmaxZ;
//		
//		if(invDir.getX() >= 0.0f)
//		{
//			tmin = minV.getX();
//			tmax = maxV.getX();
//		}
//		else
//		{
//			tmin = maxV.getX();
//			tmax = minV.getX();
//		}
//		
//		if(invDir.getY() >= 0.0f)
//		{
//			tminY = minV.getY();
//			tmaxY = maxV.getY();
//		}
//		else
//		{
//			tminY = maxV.getY();
//			tmaxY = minV.getY();
//		}
//		
//		if((tmin > tmaxY) || (tminY > tmax))
//		{
//			return false;
//		}
//		
//		if(tminY > tmin)
//		{
//			tmin = tminY;
//		}
//		
//		if(tmaxY < tmax)
//		{
//			tmax = tmaxY;
//		}
//		
//		if(invDir.getZ() >= 0.0f)
//		{
//			tminZ = minV.getZ();
//			tmaxZ = maxV.getZ();
//		}
//		else
//		{
//			tminZ = maxV.getZ();
//			tmaxZ = minV.getZ();
//		}
//		
//		if((tmin > tmaxZ) || (tminZ > tmax))
//		{
//			return false;
//		}
//		
//		if(tminZ > tmin)
//		{
//			tmin = tminZ;
//		}
//		
//		if(tmaxZ < tmax)
//		{
//			tmax = tmaxZ;
//		}
//		
//		return true;
//	}
//}
