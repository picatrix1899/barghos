package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.ImmutableTup4s;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link ImmutableTup4s}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4s_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link ImmutableTup4s#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		ImmutableTup4s t = mock(ImmutableTup4s.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)1);
		when(t.getY()).thenReturn((short)2);
		when(t.getZ()).thenReturn((short)3);
		when(t.getW()).thenReturn((short)4);

		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());
		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals((short)1, entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals((short)2, entry.getValue());
		
		entry = l.get(2);
		assertEquals("z", entry.getKey());
		assertEquals((short)3, entry.getValue());
		
		entry = l.get(3);
		assertEquals("w", entry.getKey());
		assertEquals((short)4, entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
	}
}