package org.barghos.api.core.nullable.bools;

import org.barghos.annotation.AllowNull;

public interface INullableRBo
{
	boolean isNull();
	
	boolean isNotNull();
	
	boolean value();
	
	boolean valueOrDefault(boolean def);
	
	boolean valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRBo obj);
	
	boolean equals(boolean obj);
	
	boolean equals(@AllowNull Boolean obj);
}
