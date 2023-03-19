package org.barghos.lwjgl;

import java.nio.IntBuffer;

public class GLUtils
{
	public static GLUtilsProvider PROVIDER = new DefaultGLUtilsProvider();
	
	public static int genBuffer()
	{
		return PROVIDER.genBuffer();
	}
	
	public static int[] genBuffers(int[] res)
	{
		return PROVIDER.genBuffers(res);
	}
	
	public static int[] genBuffers(int amount)
	{
		return PROVIDER.genBuffers(amount);
	}
	
	public static IntBuffer genBuffers(IntBuffer buffer)
	{
		return PROVIDER.genBuffers(buffer);
	}
	
	public static void deleteBuffer(int buffer)
	{
		PROVIDER.deleteBuffer(buffer);
	}
	
	public static void deleteBuffers(int[] buffers)
	{
		PROVIDER.deleteBuffers(buffers);
	}
	
	public static void deleteBuffers(IntBuffer buffers)
	{
		PROVIDER.deleteBuffers(buffers);
	}
	
	public static int genVertexArray()
	{
		return PROVIDER.genVertexArray();
	}
	
	public static int[] genVertexArrays(int[] res)
	{
		return PROVIDER.genVertexArrays(res);
	}
	
	public static int[] genVertexArrays(int amount)
	{
		return PROVIDER.genVertexArrays(amount);
	}
	
	public static IntBuffer genVertexArrays(IntBuffer buffers)
	{
		return PROVIDER.genVertexArrays(buffers);
	}
	
	public static void deleteVertexArray(int array)
	{
		PROVIDER.deleteVertexArray(array);
	}
	
	public static void deleteVertexArrays(int[] arrays)
	{
		PROVIDER.deleteVertexArrays(arrays);
	}
	
	public static void deleteVertexArrays(IntBuffer buffers)
	{
		PROVIDER.deleteVertexArrays(buffers);
	}
	
	public static int genTexture()
	{
		return PROVIDER.genTexture();
	}
	
	public static int[] genTextures(int[] res)
	{
		return PROVIDER.genTextures(res);
	}
	
	public static int[] genTextures(int amount)
	{
		return PROVIDER.genTextures(amount);
	}
	
	public static IntBuffer genTextures(IntBuffer buffer)
	{
		return PROVIDER.genTextures(buffer);
	}
	
	public static void deleteTexture(int texture)
	{
		PROVIDER.deleteTexture(texture);
	}
	
	public static void deleteTextures(int[] textures)
	{
		PROVIDER.deleteTextures(textures);
	}
	
	public static void deleteTextures(IntBuffer buffer)
	{
		PROVIDER.deleteTextures(buffer);
	}
	
	public static int genProgram()
	{
		return PROVIDER.genProgram();
	}
	
	public static void deleteProgram(int program)
	{
		PROVIDER.deleteProgram(program);
	}
	
	public static int genShader(int type)
	{
		return PROVIDER.genShader(type);
	}
	
	public static void deleteShader(int shader)
	{
		PROVIDER.deleteShader(shader);
	}
	
	public static void setClearColor(float r, float g, float b, float a)
	{
		PROVIDER.setClearColor(r, g, b, a);
	}
	
	public static void clearAll(float r, float g, float b, float a)
	{
		PROVIDER.clearAll(r, g, b, a);
	}
	
	public static void clearAll()
	{
		PROVIDER.clearAll();
	}
	
	public static void clear(boolean color, boolean depth, boolean stencil)
	{
		PROVIDER.clear(color, depth, stencil);
	}
	
	public static void clearColor()
	{
		PROVIDER.clearColor();
	}
	
	public static void clearDepth()
	{
		PROVIDER.clearDepth();
	}
	
	public static void clearStencil()
	{
		PROVIDER.clearStencil();
	}
}
