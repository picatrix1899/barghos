package org.barghos.math.mesh;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class MeshData
{
	public static final int ATTRIB_INDEX = 0;
	public static final int ATTRIB_POS = 1;
	public static final int ATTRIB_UV = 2;
	
	public int indexCount;
	public int vertexCount;
	
	public long indexBlockByteSize;
	public long vertexDataBlockByteSize;
	
	public Arena arena;
	public MemorySegment data;
	
	public MeshVertexAttribute[] attribs;
	
	public Object extension;
	
	public static class MeshVertexAttribute
	{
		public long offset;
	}
}
