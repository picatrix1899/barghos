package org.barghos.util.math;

public class FloatRoundMethods
{
	private FloatRoundMethods() {}
	
	FloatRoundMethod FLOOR = (v) -> (float)Math.floor(v);
	FloatRoundMethod CEIL = (v) -> (float)Math.ceil(v);
}
