package org.barghos.lwjgl;

import java.nio.IntBuffer;

public interface GLUtilsProvider
{
	int genBuffer();
	
	int[] genBuffers(int[] res);
	
	int[] genBuffers(int amount);
	
	IntBuffer genBuffers(IntBuffer buffer);
	
	void deleteBuffer(int buffer);
	
	void deleteBuffers(int[] buffers);
	
	void deleteBuffers(IntBuffer buffers);
	
	int genVertexArray();
	
	int[] genVertexArrays(int[] res);
	
	int[] genVertexArrays(int amount);
	
	IntBuffer genVertexArrays(IntBuffer buffers);
	
	void deleteVertexArray(int array);
	
	void deleteVertexArrays(int[] arrays);
	
	void deleteVertexArrays(IntBuffer buffers);
	
	int genTexture();
	
	int[] genTextures(int[] res);
	
	int[] genTextures(int amount);
	
	IntBuffer genTextures(IntBuffer buffer);
	
	void deleteTexture(int texture);
	
	void deleteTextures(int[] textures);
	
	void deleteTextures(IntBuffer buffer);
	
	int genProgram();
	
	void deleteProgram(int program);
	
	int genShader(int type);
	
	void deleteShader(int shader);
	
	void setClearColor(float r, float g, float b, float a);
	
	void clearAll(float r, float g, float b, float a);
	
	void clearAll();
	
	void clear(boolean color, boolean depth, boolean stencil);
	
	void clearColor();
	
	void clearDepth();
	
	void clearStencil();
}
