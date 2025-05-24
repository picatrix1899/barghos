package org.barghos.util.nullable.floats;

import org.barghos.annotation.AllowNull;

public interface INullableRF
{
	boolean isNull();
	
	boolean isNotNull();
	
	float value();
	
	float valueOrDefault(float def);
	
	float valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRF obj);
	
	boolean equals(float obj);
	
	boolean equals(@AllowNull Float obj);
}
