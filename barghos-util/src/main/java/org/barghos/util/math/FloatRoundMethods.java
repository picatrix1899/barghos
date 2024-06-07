package org.barghos.util.math;

public class FloatRoundMethods
{
	private FloatRoundMethods() {}
	
	FloatRoundMethod NONE = (v) -> v;
	FloatRoundMethod FLOOR = (v) -> (float)Math.floor(v);
	FloatRoundMethod CEIL = (v) -> (float)Math.ceil(v);
	FloatRoundMethod ROUND = (v) -> (float)Math.round(v);
	FloatRoundMethod TRUNCATE = (v) -> (float)(int)v;
}
