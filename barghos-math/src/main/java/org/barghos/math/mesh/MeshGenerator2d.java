package org.barghos.math.mesh;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import org.barghos.core.math.MathUtils;

public class MeshGenerator2d
{
	public static final long INDEX =		0b1;
	public static final long POS =			0b10;
	public static final long UV0 =			0b100;
	
	public static MeshVertexData generateRect2D(long generateDataBitField, float p1X, float p1Y, float p2X, float p2Y, float uv1X, float uv1Y, float uv2X, float uv2Y)
	{
		MeshVertexData meshVertexData = new MeshVertexData();
		meshVertexData.vertexCount = 4;
		meshVertexData.indexList = new int[] { 0, 1, 2, 0, 2, 3 };
		meshVertexData.posList = new float[] { p1X, p1Y, p1X, p2Y, p2X, p2Y, p2X, p1Y };
		meshVertexData.uv0List = (generateDataBitField & UV0) != 0 ?  new float[] { uv1X, uv1Y, uv1X, uv2Y, uv2X, uv2Y, uv2X, uv1Y } : null;

		return meshVertexData;
	}
	
	public static MeshVertexData generateRoundedRect2D(long generateDataBitField, float p1X, float p1Y, float p2X, float p2Y, float uv1X, float uv1Y, float uv2X, float uv2Y, float radius, int cornerVertices)
	{
		float sW = (uv2X - uv1X) / (p2X - p1X);
		float sH = (uv2Y - uv1Y) / (p2Y - p1Y);
		
		float centerLeft = p1X + radius;
		float centerRight = p2X - radius;
		float centerTop = p1Y + radius;
		float centerBottom = p2Y - radius;
		
		int vertexCount = 12 + (cornerVertices * 4);
		
		int triangleCountPerCorner = cornerVertices + 1;
		
		float[] posList = new float[vertexCount * 2];
		posList[0] = centerLeft;
		posList[1] = p1Y;
		posList[2] = centerLeft;
		posList[3] = centerTop;
		posList[4] = centerRight;
		posList[5] = centerTop;
		posList[6] = centerRight;
		posList[7] = p1Y;
		posList[8] = p1X;
		posList[9] = centerTop;
		posList[10] = p1X;
		posList[11] = centerBottom;
		posList[12] = centerLeft;
		posList[13] = centerBottom;
		posList[14] = centerRight;
		posList[15] = centerBottom;
		posList[16] = p2X;
		posList[17] = centerBottom;
		posList[18] = p2X;
		posList[19] = centerTop;
		posList[20] = centerLeft;
		posList[21] = p2Y;
		posList[22] = centerRight;
		posList[23] = p2Y;
		
		float theta = (90 * MathUtils.DEG_TO_RADf) / triangleCountPerCorner;
		
		int cornerVerticesStride = cornerVertices * 2;
		int posListIndexBase1 = 24;
		int posListIndexBase2 = posListIndexBase1 + cornerVerticesStride;
		int posListIndexBase3 = posListIndexBase2 + cornerVerticesStride;
		int posListIndexBase4 = posListIndexBase3 + cornerVerticesStride;
		
		float posListAngle = theta;
		
		for(int seg = 0; seg < cornerVertices; seg++)
		{
			float sin = MathUtils.sin(posListAngle) * radius;
			float cos = MathUtils.cos(posListAngle) * radius;
			
			posList[posListIndexBase1] = centerLeft - sin;
			posList[posListIndexBase1+1] = centerTop - cos;
			
			posList[posListIndexBase2] = centerLeft - cos;
			posList[posListIndexBase2+1] = centerBottom + sin;
			
			posList[posListIndexBase3] = centerRight + sin;
			posList[posListIndexBase3+1] = centerBottom + cos;
			
			posList[posListIndexBase4] = centerRight + cos;
			posList[posListIndexBase4+1] = centerTop - sin;
			
			posListAngle += theta;
			
			posListIndexBase1 += 2;
			posListIndexBase2 += 2;
			posListIndexBase3 += 2;
			posListIndexBase4 += 2;
		}
		
		int indicesPerCorner = triangleCountPerCorner * 3;
		int indexCount = 18 + 4 * indicesPerCorner;
		
		int[] indexList = new int[indexCount];
		indexList[0] = 0;
		indexList[1] = 10;
		indexList[2] = 11;
		indexList[3] = 0;
		indexList[4] = 11;
		indexList[5] = 3;
			
		indexList[6] = 4;
		indexList[7] = 5;
		indexList[8] = 6;
		indexList[9] = 4;
		indexList[10] = 6;
		indexList[11] = 1;
		
		indexList[12] = 2;
		indexList[13] = 7;
		indexList[14] = 8;
		indexList[15] = 2;
		indexList[16] = 8;
		indexList[17] = 9;
		
		int[] indicesA = new int[] { 0, 5, 11, 9 };
		int[] indicesB = new int[] { 4, 10, 8, 3 };
		int[] indicesC = new int[] { 1, 6, 7, 2 };
		int[] indicesS = new int[] { 12, 12 + cornerVertices, 12 + cornerVertices * 2, 12 + cornerVertices * 3 };
		
		for(int corner = 0; corner < 4; corner++)
		{
			int curA = indicesA[corner];
			int curB = indicesS[corner];
			int curC = indicesC[corner];
			
			int cornerBaseListIndex = 18 + indicesPerCorner * corner;
			
			for(int tri = 0; tri < triangleCountPerCorner - 1; tri++)
			{
				int baseListIndex = cornerBaseListIndex + (tri * 3);
				
				indexList[baseListIndex] = curA;
				indexList[baseListIndex + 1] = curB;
				indexList[baseListIndex + 2] = curC;
				curA = curB;
				curB++;
			}
			
			int endListIndex = cornerBaseListIndex + (cornerVertices * 3);
			
			indexList[endListIndex] = curA;
			indexList[endListIndex+1] = indicesB[corner];
			indexList[endListIndex+2] = curC;
		}
		
		float[] uv0 = null;
		if((generateDataBitField & UV0) != 0)
		{
			uv0 = new float[vertexCount * 2];
			
			for(int i = 0; i < uv0.length; i+=2)
			{
				uv0[i] = uv1X + (posList[i] - p1X) * sW;
				uv0[i+1] = uv1Y + (posList[i+1] - p1Y) * sH;
			}
		}
		
		MeshVertexData meshVertexData = new MeshVertexData();
		meshVertexData.vertexCount = vertexCount;
		meshVertexData.indexList = indexList;
		meshVertexData.posList = posList;
		meshVertexData.uv0List = uv0;

		return meshVertexData;
	}
	
	public static MeshData packInterleaved(MeshVertexData vertexData, Arena arena)
	{
		long dataBlockSize = 0;
		dataBlockSize += vertexData.posList.length * Float.BYTES;
		if(vertexData.uv0List != null) dataBlockSize += vertexData.uv0List.length * Float.BYTES;
		
		MemorySegment data = arena.allocate((vertexData.indexList.length * Integer.BYTES) + dataBlockSize);
		
		data.asSlice(0, vertexData.indexList.length * Integer.BYTES).copyFrom(MemorySegment.ofArray(vertexData.indexList));
		
		MemorySegment dataBlock = data.asSlice(vertexData.indexList.length * Integer.BYTES, dataBlockSize);
		
		int posDimensions = vertexData.posList.length / vertexData.vertexCount;
		int uv0Dimensions = vertexData.uv0List != null ? vertexData.uv0List.length / vertexData.vertexCount : 0;
		
		long dataBlockCursor = 0;
		
		for(int vertexIndex = 0; vertexIndex  < vertexData.vertexCount; vertexIndex++)
		{
			int posBase = vertexIndex * posDimensions;
			
			for(int i = 0; i < posDimensions; i++)
			{
				dataBlock.set(ValueLayout.JAVA_FLOAT, dataBlockCursor, vertexData.posList[posBase+i]);
				dataBlockCursor += Float.BYTES;
			}
			
			if(vertexData.uv0List != null)
			{
				int uv0Base = vertexIndex * uv0Dimensions;
				
				for(int i = 0; i < uv0Dimensions; i++)
				{
					dataBlock.set(ValueLayout.JAVA_FLOAT, dataBlockCursor, vertexData.uv0List[uv0Base+i]);
					dataBlockCursor += Float.BYTES;
				}
			}
		}
		
		MeshData meshData = new MeshData();
		meshData.arena = arena;
		meshData.data = data;
		meshData.vertexCount = vertexData.vertexCount;
		meshData.indexCount = vertexData.indexList.length;
		meshData.indexBlockByteSize = vertexData.indexList.length * Integer.BYTES;
		meshData.vertexDataBlockByteSize = dataBlockSize;
		
		return meshData;
	}
}
