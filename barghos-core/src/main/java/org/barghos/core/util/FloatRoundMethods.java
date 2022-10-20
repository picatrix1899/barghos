package org.barghos.core.util;

import org.barghos.core.api.math.FloatRoundMethod;

public class FloatRoundMethods
{
	private FloatRoundMethods() {}
	
	FloatRoundMethod FLOOR = (v) -> (float)Math.floor(v);
	FloatRoundMethod CEIL = (v) -> (float)Math.ceil(v);
}
