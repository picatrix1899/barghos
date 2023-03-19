package org.barghos.lwjgl;

import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.opengl.GL15C.*;
import static org.lwjgl.opengl.GL20C.*;
import static org.lwjgl.opengl.GL30C.*;

import java.nio.IntBuffer;

public class DefaultGLUtilsProvider implements GLUtilsProvider
{
	public int genBuffer()
	{
		return glGenBuffers();
	}
	
	public int[] genBuffers(int[] res)
	{
		glGenBuffers(res);
		
		return res;
	}
	
	public int[] genBuffers(int amount)
	{
		int[] res = new int[amount];
		
		return genBuffers(res);
	}
	
	public IntBuffer genBuffers(IntBuffer buffer)
	{
		glGenBuffers(buffer);
		
		return buffer;
	}
	
	public void deleteBuffer(int buffer)
	{
		glDeleteBuffers(buffer);
	}
	
	public void deleteBuffers(int[] buffers)
	{
		glDeleteBuffers(buffers);
	}
	
	public void deleteBuffers(IntBuffer buffers)
	{
		glDeleteBuffers(buffers);
	}
	
	public int genVertexArray()
	{
		return glGenVertexArrays();
	}
	
	public int[] genVertexArrays(int[] res)
	{
		glGenVertexArrays(res);
		
		return res;
	}
	
	public int[] genVertexArrays(int amount)
	{
		int[] res = new int[amount];
		
		return genVertexArrays(res);
	}
	
	public IntBuffer genVertexArrays(IntBuffer buffers)
	{
		glGenVertexArrays(buffers);
		
		return buffers;
	}
	
	public void deleteVertexArray(int array)
	{
		glDeleteVertexArrays(array);
	}
	
	public void deleteVertexArrays(int[] arrays)
	{
		glDeleteVertexArrays(arrays);
	}
	
	public void deleteVertexArrays(IntBuffer buffers)
	{
		glDeleteVertexArrays(buffers);
	}
	
	public int genTexture()
	{
		return glGenTextures();
	}
	
	public int[] genTextures(int[] res)
	{
		glGenTextures(res);
		
		return res;
	}
	
	public int[] genTextures(int amount)
	{
		int[] res = new int[amount];
		
		return genTextures(res);
	}
	
	public IntBuffer genTextures(IntBuffer buffer)
	{
		glGenTextures(buffer);
		
		return buffer;
	}
	
	public void deleteTexture(int texture)
	{
		glDeleteTextures(texture);
	}
	
	public void deleteTextures(int[] textures)
	{
		glDeleteTextures(textures);
	}
	
	public void deleteTextures(IntBuffer buffer)
	{
		glDeleteTextures(buffer);
	}
	
	public int genProgram()
	{
		return glCreateProgram();
	}
	
	public void deleteProgram(int program)
	{
		glDeleteProgram(program);
	}
	
	public int genShader(int type)
	{
		return glCreateShader(type);
	}
	
	public void deleteShader(int shader)
	{
		glDeleteShader(shader);
	}
	
	public void setClearColor(float r, float g, float b, float a)
	{
		glClearColor(r, g, b, a);
	}
	
	public void clearAll(float r, float g, float b, float a)
	{
		setClearColor(r, g, b, a);
		clearAll();
	}
	
	public void clearAll()
	{
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
	}
	
	public void clear(boolean color, boolean depth, boolean stencil)
	{
		int flags = 0;
		if(color) flags |= GL_COLOR_BUFFER_BIT;
		if(depth) flags |= GL_DEPTH_BUFFER_BIT;
		if(stencil) flags |= GL_STENCIL_BUFFER_BIT;
		
		glClear(flags);
	}
	
	public void clearColor()
	{
		glClear(GL_COLOR_BUFFER_BIT);
	}
	
	public void clearDepth()
	{
		glClear(GL_DEPTH_BUFFER_BIT);
	}
	
	public void clearStencil()
	{
		glClear(GL_STENCIL_BUFFER_BIT);
	}
}
