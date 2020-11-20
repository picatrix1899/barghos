/*
MIT License

Copyright (c) 2019 picatrix1899

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.core.bitmask;


/**
 * @author picatrix1899
 *
 */
public class FlagWrapperByte
{
	
	public byte set(byte flag, int...values)
	{
		for(int i = 0; i < values.length && i < 8; i++)
		{
			if(values[i] < 0) continue;
			
			if(values[i] == 1)
			{
				flag = (byte)(flag | (0x01 << i));
			}
			else
			{
				flag = (byte)(flag & ~(0x01 << i));
			}
		}
		
		return flag;
	}
	
	public byte set(byte flag, Boolean... values)
	{
		for(int i = 0; i < values.length && i < 8; i++)
		{
			if(values[i] == null) continue;
			
			if(values[i])
			{
				flag = (byte)(flag | (0x01 << i));
			}
			else
			{
				flag = (byte)(flag & ~(0x01 << i));
			}
		}
		
		return flag;
	}
	
	public byte set(byte flag, int pos, boolean value)
	{
		if(value)
		{
			flag = (byte)(flag | (0x01 << pos));
		}
		else
		{
			flag = (byte)(flag & ~(0x01 << pos));
		}
		
		return flag;
	}
	
	public byte set(byte flag, int pos, int value)
	{
		if(value == 1)
		{
			flag = (byte)(flag | (0x01 << pos));
		}
		else
		{
			flag = (byte)(flag & ~(0x01 << pos));
		}
		
		return flag;
	}
	
	public boolean getBoolean(byte flag, int pos)
	{
		return (flag & (0x01 << pos)) > 0;
	}
	
	public int getInt(byte flag, int pos)
	{
		return (flag & (0x01 << pos)) >> pos;
	}
	
	public boolean[] getBoolean(byte flag)
	{
		boolean[] res = new boolean[8];
		
		for(int i = 0; i < 8; i++)
		{
			res[i] = (flag & (0x01 << i)) > 0;
		}
		
		return res;
	}
	
	public int[] getInt(byte flag)
	{
		int[] res = new int[8];
		
		for(int i = 0; i < 8; i++)
		{
			res[i] = (flag & (0x01 << i)) >> i;
		}
		
		return res;
	}
	
	public int[] getInt(byte flag, int[] res)
	{
		for(int i = 0; i < 8; i++)
		{
			res[i] = (flag & (0x01 << i)) >> i;
		}
		
		return res;
	}
	
}
