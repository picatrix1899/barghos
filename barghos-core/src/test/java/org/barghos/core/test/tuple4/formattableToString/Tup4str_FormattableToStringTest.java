package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.Tup4str;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup4str}.
 * 
 * @author picatrix1899
 */
class Tup4str_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup4str#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup4str t = mock(Tup4str.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn("arg1");
		when(t.getY()).thenReturn("arg2");
		when(t.getZ()).thenReturn("arg3");
		when(t.getW()).thenReturn("arg4");

		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());
		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals("arg1", entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals("arg2", entry.getValue());
		
		entry = l.get(2);
		assertEquals("z", entry.getKey());
		assertEquals("arg3", entry.getValue());
		
		entry = l.get(3);
		assertEquals("w", entry.getKey());
		assertEquals("arg4", entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
}