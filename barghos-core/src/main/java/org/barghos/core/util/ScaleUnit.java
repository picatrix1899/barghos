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

package org.barghos.core.util;


public enum ScaleUnit
{
	PETA	(1000000000000.0),
	GIGA	(1000000000.0),
	MEGA	(1000000.0),
	KILO	(1000.0),
	HECTO	(100.0),
	DECA	(10.0),
	NORMAL	(1.0),
	DECI	(0.1),
	ZENTI	(0.01),
	MILLI	(0.001),
	MICRO	(0.000001),
	NANO	(0.000000001),
	PICO	(0.000000000001),
	FEMTO	(0.000000000000001)
	;
	
	private double factor;
	
	private ScaleUnit(double factor)
	{
		this.factor = factor;
	}
	
	public double getFactor()
	{
		return this.factor;
	}
	
	public double convertToNormal(double value)
	{
		return value * factor;
	}
	
	public double convertTo(double value, ScaleUnit unit)
	{
		return value * factor / unit.getFactor();
	}
}
