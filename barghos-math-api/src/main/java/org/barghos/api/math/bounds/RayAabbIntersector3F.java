package org.barghos.api.math.bounds;

public class RayAabbIntersector3F
{
	public IntersectionData intersect(float[] ray, float[] aabb)
	{
		float rayOriginX = ray[0];
		float rayOriginY = ray[1];
		float rayOriginZ = ray[2];
		float rayDirX = ray[3];
		float rayDirY = ray[4];
		float rayDirZ = ray[5];
		
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];

		float tEntry;
		float tExit;
		
		int axisEntry;
		int axisExit;
		
		float tMinX = 0;
		float tMaxX = 0;
		if(rayDirX != 0)
		{
			float invDirX = 1.0f / rayDirX;
			
			tMinX = (aabbMinX - rayOriginX) * invDirX;
			tMaxX = (aabbMaxX - rayOriginX) * invDirX;
			
			if(tMinX > tMaxX)
			{
				float t = tMinX;
				tMinX = tMaxX;
				tMaxX = t;
			}
		}
		else
		{
			if(rayOriginX < aabbMinX || rayOriginX > aabbMaxX) return IntersectionData.createNoHit();
			
			tMinX = Float.NEGATIVE_INFINITY;		
			tMaxX = Float.POSITIVE_INFINITY;	
		}
		
		tEntry = tMinX;
		tExit = tMaxX;
		
		axisEntry = 0;
		axisExit = 0;
		
		float tMinY = 0;
		float tMaxY = 0;
		if(rayDirY != 0)
		{
			float invDirY = 1.0f / rayDirY;
			
			tMinY = (aabbMinY - rayOriginY) * invDirY;
			tMaxY = (aabbMaxY - rayOriginY) * invDirY;
			
			if(tMinY > tMaxY)
			{
				float t = tMinY;
				tMinY = tMaxY;
				tMaxY = t;
			}
		}
		else
		{
			if(rayOriginY < aabbMinY || rayOriginY > aabbMaxY) return IntersectionData.createNoHit();
			
			tMinY = Float.NEGATIVE_INFINITY;		
			tMaxY = Float.POSITIVE_INFINITY;	
		}
		
		if(tMinY > tEntry)
		{
			tEntry = tMinY;
			axisEntry = 1;
		}
		
		if(tMaxY < tExit)
		{
			tExit = tMaxY;
			axisExit = 1;
		}
		
		float tMinZ = 0;
		float tMaxZ = 0;
		if(rayDirZ != 0)
		{
			float invDirZ = 1.0f / rayDirZ;
			
			tMinZ = (aabbMinZ - rayOriginZ) * invDirZ;
			tMaxZ = (aabbMaxZ - rayOriginZ) * invDirZ;
			
			if(tMinZ > tMaxZ)
			{
				float t = tMinZ;
				tMinZ = tMaxZ;
				tMaxZ = t;
			}
		}
		else
		{
			if(rayOriginZ < aabbMinZ || rayOriginZ > aabbMaxZ) return IntersectionData.createNoHit();
			
			tMinZ = Float.NEGATIVE_INFINITY;		
			tMaxZ = Float.POSITIVE_INFINITY;	
		}
		
		if(tMinZ > tEntry)
		{
			tEntry = tMinZ;
			axisEntry = 2;
		}
		
		if(tMaxZ < tExit)
		{
			tExit = tMaxZ;
			axisExit = 2;
		}
		
		if(tEntry > tExit || tExit < 0) return IntersectionData.createNoHit();
		
		if(tEntry < 0)
		{
			float[] exitNormal = switch(axisExit) {
				case 0 -> new float[] { rayDirX > 0 ? 1.0f : -1.0f, 0.0f, 0.0f };
				case 1 -> new float[] { 0.0f, rayDirY > 0 ? 1.0f : -1.0f, 0.0f };
				case 2 -> new float[] { 0.0f, 0.0f, rayDirZ > 0 ? 1.0f : -1.0f };
				default -> throw new AssertionError();
			};
			
			IntersectionData data = new IntersectionData();
			data.hit = true;
			data.startedInside = true;
			data.entryTime = 0.0f;
			data.exitTime = tExit;
			data.entryPoint = new float[] { rayOriginX, rayOriginY, rayOriginZ };
			data.exitPoint = new float[] { rayOriginX + rayDirX * tExit, rayOriginY + rayDirY * tExit, rayOriginZ + rayDirZ * tExit };
			data.entryNormal = new float[] { 0.0f, 0.0f, 0.0f };
			data.exitNormal = exitNormal;
			
			return data;
		}
		
		float[] entryNormal = switch(axisEntry) {
			case 0 -> new float[] { rayDirX > 0 ? -1.0f : 1.0f, 0.0f, 0.0f };
			case 1 -> new float[] { 0.0f, rayDirY > 0 ? -1.0f : 1.0f, 0.0f };
			case 2 -> new float[] { 0.0f, 0.0f, rayDirZ > 0 ? -1.0f : 1.0f };
			default -> throw new AssertionError();
		};
		
		float[] exitNormal = switch(axisExit) {
			case 0 -> new float[] { rayDirX > 0 ? 1.0f : -1.0f, 0.0f, 0.0f };
			case 1 -> new float[] { 0.0f, rayDirY > 0 ? 1.0f : -1.0f, 0.0f };
			case 2 -> new float[] { 0.0f, 0.0f, rayDirZ > 0 ? 1.0f : -1.0f };
			default -> throw new AssertionError();
		};
		
		IntersectionData data = new IntersectionData();
		data.hit = true;
		data.startedInside = false;
		data.entryTime = tEntry;
		data.exitTime = tExit;
		data.entryPoint = new float[] { rayOriginX + rayDirX * tEntry, rayOriginY + rayDirY * tEntry, rayOriginZ + rayDirZ * tEntry };
		data.exitPoint = new float[] { rayOriginX + rayDirX * tExit, rayOriginY + rayDirY * tExit, rayOriginZ + rayDirZ * tExit };
		data.entryNormal = entryNormal;
		data.exitNormal = exitNormal;
		
		return data;
	}
	
	
	public static class IntersectionData
	{
		public boolean hit;
		public boolean startedInside;
		public float entryTime;
		public float exitTime;
		public float[] entryPoint;
		public float[] exitPoint;
		public float[] entryNormal;
		public float[] exitNormal;
		
		public static IntersectionData createNoHit()
		{
			IntersectionData data = new IntersectionData();
			data.hit = false;
			
			return data;
		}
	}
}
