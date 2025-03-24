package org.barghos.util.nullable.chars;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWC extends NullableRC, NullableW<Character>
{
	
	NullableWC valueC(char value);
	
	NullableWC value(Character value);
	
	NullableWC set(NullableRC value);
	
	NullableWC set(NullableR<Character> value);
	
	NullableWC setNull();
	
}
