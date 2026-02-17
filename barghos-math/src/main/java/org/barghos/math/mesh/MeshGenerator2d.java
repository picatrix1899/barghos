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
		
		float centerLeftX = p1X + radius;
		float centerRightX = p2X - radius;
		float centerTopY = p1Y + radius;
		float centerBottomY = p2Y - radius;
		
		int vertexCount = 12 + (cornerVertices * 4);
		
		float[] posList = new float[vertexCount * 2];
		posList[0] = centerLeftX;
		posList[1] = p1Y;
		posList[2] = centerLeftX;
		posList[3] = centerTopY;
		posList[4] = centerRightX;
		posList[5] = centerTopY;
		posList[6] = centerRightX;
		posList[7] = p1Y;
		
		posList[8] = p1X;
		posList[9] = centerTopY;
		posList[10] = p1X;
		posList[11] = centerBottomY;
		posList[12] = centerLeftX;
		posList[13] = centerBottomY;
		
		posList[14] = centerRightX;
		posList[15] = centerBottomY;
		
		posList[16] = p2X;
		posList[17] = centerBottomY;
		posList[18] = p2X;
		posList[19] = centerTopY;
		
		posList[20] = centerLeftX;
		posList[21] = p2Y;
		posList[22] = centerRightX;
		posList[23] = p2Y;
		
		int segments = cornerVertices + 1;
		
		float theta = (90 * MathUtils.DEG_TO_RADf) / segments;
		
		for(int seg = 0; seg < cornerVertices; seg++)
		{
			float angle = theta * seg;
			float sin = MathUtils.sin(angle) * radius;
			float cos = MathUtils.cos(angle) * radius;
			
			int segIndexBase1 = 24 + (seg * 2);
			int segIndexBase2 = 24 + (seg * 2) + (cornerVertices * 2);
			int segIndexBase3 = 24 + (seg * 2) + (cornerVertices * 2) * 2;
			int segIndexBase4 = 24 + (seg * 2) + (cornerVertices * 2) * 3;
			
			posList[segIndexBase1] = centerLeftX - sin;
			posList[segIndexBase1 + 1] = centerTopY - cos;
			
			posList[segIndexBase2] = centerLeftX - cos;
			posList[segIndexBase2 + 1] = centerBottomY + sin;
			
			posList[segIndexBase3] = centerRightX + sin;
			posList[segIndexBase3 + 1] = centerBottomY + cos;
			
			posList[segIndexBase4] = centerRightX + cos;
			posList[segIndexBase4 + 1] = centerTopY - sin;
		}
		
		int indexCount = 18 + 4 * ((cornerVertices + 1) * 3);
		
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
		
		int index1A = 0;
		int index1B = 4;
		int index1C = 1;
		int index2A = 5;
		int index2B = 10;
		int index2C = 6;
		int index3A = 11;
		int index3B = 8;
		int index3C = 7;
		int index4A = 9;
		int index4B = 3;
		int index4C = 2;
		
		int currentIndex1A = index1A;
		int currentIndex1B = 12;
		int currentIndex2A = index2A;
		int currentIndex2B = 12 + cornerVertices;
		int currentIndex3A = index3A;
		int currentIndex3B = 12 + cornerVertices * 2;
		int currentIndex4A = index4A;
		int currentIndex4B = 12 + cornerVertices * 3;
		
		int listIndexOffset = 18;
		int triangleCountPerCorner = cornerVertices + 1;
		
		for(int tri = 0; tri < triangleCountPerCorner - 1; tri++)
		{
			int triIndexBase1 = listIndexOffset + (tri * 3);
			int triIndexBase2 = listIndexOffset + (tri * 3) + (triangleCountPerCorner * 3);
			int triIndexBase3 = listIndexOffset + (tri * 3) + (triangleCountPerCorner * 3) * 2;
			int triIndexBase4 = listIndexOffset + (tri * 3) + (triangleCountPerCorner * 3) * 3;
			
			indexList[triIndexBase1] = currentIndex1A;
			indexList[triIndexBase1 + 1] = currentIndex1B;
			indexList[triIndexBase1 + 2] = index1C;
			currentIndex1A = currentIndex1B;
			currentIndex1B++;
			
			indexList[triIndexBase2] = currentIndex2A;
			indexList[triIndexBase2 + 1] = currentIndex2B;
			indexList[triIndexBase2 + 2] = index2C;
			currentIndex2A = currentIndex2B;
			currentIndex2B++;
			
			indexList[triIndexBase3] = currentIndex3A;
			indexList[triIndexBase3 + 1] = currentIndex3B;
			indexList[triIndexBase3 + 2] = index3C;
			currentIndex3A = currentIndex3B;
			currentIndex3B++;
			
			indexList[triIndexBase4] = currentIndex4A;
			indexList[triIndexBase4 + 1] = currentIndex4B;
			indexList[triIndexBase4 + 2] = index4C;
			currentIndex4A = currentIndex4B;
			currentIndex4B++;
		}
		
		int triIndexBase1 = listIndexOffset + ((triangleCountPerCorner - 1) * 3);
		int triIndexBase2 = listIndexOffset + ((triangleCountPerCorner - 1) * 3) + (triangleCountPerCorner * 3);
		int triIndexBase3 = listIndexOffset + ((triangleCountPerCorner - 1) * 3) + (triangleCountPerCorner * 3) * 2;
		int triIndexBase4 = listIndexOffset + ((triangleCountPerCorner - 1) * 3) + (triangleCountPerCorner * 3) * 3;
		
		indexList[triIndexBase1] = currentIndex1A;
		indexList[triIndexBase1 + 1] = index1B;
		indexList[triIndexBase1 + 2] = index1C;
		
		indexList[triIndexBase2] = currentIndex2A;
		indexList[triIndexBase2 + 1] = index2B;
		indexList[triIndexBase2 + 2] = index2C;
		
		indexList[triIndexBase3] = currentIndex3A;
		indexList[triIndexBase3 + 1] = index3B;
		indexList[triIndexBase3 + 2] = index3C;
		
		indexList[triIndexBase4] = currentIndex4A;
		indexList[triIndexBase4 + 1] = index4B;
		indexList[triIndexBase4 + 2] = index4C;
		
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
