package org.barghos.core.api.util;


public interface DataType
{
	int bytesi();
	int bytesi(int multiplier);
	
	long bytesl();
	long bytesl(long multiplier);
	
	static int bytesi(DataType... dataTypes)
	{
		int bytes = 0;
		for(DataType dataType : dataTypes)
			bytes += dataType.bytesl();
		
		return bytes;
	}
	
	static long bytesl(DataType... dataTypes)
	{
		long bytes = 0;
		for(DataType dataType : dataTypes)
			bytes += dataType.bytesl();
		
		return bytes;
	}
}
