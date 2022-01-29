package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.Tup4f;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup4f}.
 * 
 * @author picatrix1899
 */
class Tup4f_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup4f#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup4f t = mock(Tup4f.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(2.0f);
		when(t.getZ()).thenReturn(3.0f);
		when(t.getW()).thenReturn(4.0f);

		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());
		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals(1.0f, entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals(2.0f, entry.getValue());
		
		entry = l.get(2);
		assertEquals("z", entry.getKey());
		assertEquals(3.0f, entry.getValue());
		
		entry = l.get(3);
		assertEquals("w", entry.getKey());
		assertEquals(4.0f, entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
}