package org.barghos.util.lazy.floats;

import org.barghos.util.lazy.Lazy;

public interface LazyF extends Lazy<Float>
{
	float valueFloat();
	
	default Float value()
	{
		return valueFloat();
	}
}
