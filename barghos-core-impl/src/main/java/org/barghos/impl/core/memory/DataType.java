package org.barghos.impl.core.memory;

/**
 * This interface represents a data type.
 * These can be used to calculate byte offsets and lengths.
 * 
 * @author picatrix1899
 */
public interface DataType
{
	/**
	 * Returns the length of the current data type in bytes.
	 * This version returns the length as an {@code int}.
	 * 
	 * @return The length in bytes.
	 */
	int bytesi();
	
	/**
	 * Returns the length of the current data type multiplied with the multiplier in bytes.
	 * This version returns the length as an {@code int}.
	 * 
	 * @param multiplier This parameter specifies how many instances of the data type should be used for the calculation.
	 * I.E. if the length in bytes of an {@code int} array with 4 entries should be calculated, the data type int is used
	 * together with a multiplier of 4 resulting in 4 times 4 bytes.
	 * 
	 * @return The length in bytes multiplied by the multiplier.
	 */
	int bytesi(int multiplier);
	
	/**
	 * Returns the length of the current data type in bytes.
	 * This version returns the length as a {@code long}.
	 * 
	 * @return The length in bytes.
	 */
	long bytesl();
	
	/**
	 * Returns the length of the current data type multiplied with the multiplier in bytes.
	 * This version returns the length as a {@code long}.
	 * 
	 * @param multiplier This parameter specifies how many instances of the data type should be used for the calculation.
	 * I.E. if the length in bytes of an {@code int} array with 4 entries should be calculated, the data type int is used
	 * together with a multiplier of 4 resulting in 4 times 4 bytes.
	 * 
	 * @return The length in bytes multiplied by the multiplier.
	 */
	long bytesl(long multiplier);
	
	/**
	 * Returns the sum of the lengths of the given data types.
	 * This is useful for calculating offsets.
	 * This version returns the length as an {@code int}.
	 * 
	 * @param dataTypes The data types.
	 * 
	 * @return The sum of the lengths.
	 */
	static int bytesi(DataType... dataTypes)
	{
		int bytes = 0;
		for(DataType dataType : dataTypes)
			bytes += dataType.bytesl();
		
		return bytes;
	}
	
	/**
	 * Returns the sum of the lengths of the given data types.
	 * This is useful for calculating offsets.
	 * This version returns the length as a {@code long}.
	 * 
	 * @param dataTypes The data types.
	 * 
	 * @return The sum of the lengths.
	 */
	static long bytesl(DataType... dataTypes)
	{
		long bytes = 0;
		for(DataType dataType : dataTypes)
			bytes += dataType.bytesl();
		
		return bytes;
	}
}
