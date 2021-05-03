/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.core.color;

import org.barghos.core.api.color.HDRColor3R;

/**
 * This enumeration contains a default color palette for high dynamic range (HDR) RGB-Colors.
 * 
 * @author picatrix1899
 *
 * @since 1.0.0.0
 */
public enum HDRColor3Colors implements HDRColor3R
{
	/**
	 * White Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	WHITE {
		public int getR() { return 255; }
		public int getG() { return 255; }
		public int getB() { return 255; }
		public float getUnityR() { return 1; }
		public float getUnityG() { return 1; }
		public float getUnityB() { return 1; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/**
	 * Black Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	BLACK {
		public int getR() { return 0; }
		public int getG() { return 0; }
		public int getB() { return 0; }
		public float getUnityR() { return 0; }
		public float getUnityG() { return 0; }
		public float getUnityB() { return 0; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/**
	 * Red Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	RED {
		public int getR() { return 255; }
		public int getG() { return 0; }
		public int getB() { return 0; }
		public float getUnityR() { return 1; }
		public float getUnityG() { return 0; }
		public float getUnityB() { return 0; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/**
	 * Green Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	GREEN {
		public int getR() { return 0; }
		public int getG() { return 255; }
		public int getB() { return 0; }
		public float getUnityR() { return 0; }
		public float getUnityG() { return 1; }
		public float getUnityB() { return 0; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/**
	 * Blue Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	BLUE {
		public int getR() { return 0; }
		public int getG() { return 0; }
		public int getB() { return 255; }
		public float getUnityR() { return 0; }
		public float getUnityG() { return 0; }
		public float getUnityB() { return 1; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/** 
	 * Yellow Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	YELLOW {
		public int getR() { return 255; }
		public int getG() { return 255; }
		public int getB() { return 0; }
		public float getUnityR() { return 1; }
		public float getUnityG() { return 1; }
		public float getUnityB() { return 0; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/**
	 * Purple Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	PURPLE {
		public int getR() { return 128; }
		public int getG() { return 0; }
		public int getB() { return 128; }
		public float getUnityG() { return 0; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/** 
	 * Gold Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	GOLD {
		public int getR() { return 255; }
		public int getG() { return 215; }
		public int getB() { return 0; }
		public float getUnityR() { return 1; }
		public float getUnityB() { return 0; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/**
	 * Orange Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	ORANGE {
		public int getR() { return 255; }
		public int getG() { return 140; }
		public int getB() { return 0; }
		public float getUnityR() { return 1; }
		public float getUnityB() { return 0; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
	
	/** 
	 * Grey Color constant.
	 * 
	 * @since 1.0.0.0
	 */
	GREY {
		public int getR() { return 128; }
		public int getG() { return 128; }
		public int getB() { return 128; }
		
		@Override
		public HDRColor3R getNewInstance(float x, float y, float z)
		{
			return new HDRColor3(x, y, z);
		}
	},
;

	@Override
	public float getUnityR()
	{
		return getR() * 0.00392156862f;
	}
	
	@Override
	public float getUnityG()
	{
		return getG() * 0.00392156862f;
	}
	
	@Override
	public float getUnityB()
	{
		return getB() * 0.00392156862f;
	}
}