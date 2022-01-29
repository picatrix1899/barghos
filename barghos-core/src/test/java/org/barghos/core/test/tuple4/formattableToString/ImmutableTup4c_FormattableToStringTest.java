package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.ImmutableTup4c;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link ImmutableTup4c}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4c_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link ImmutableTup4c#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		ImmutableTup4c t = mock(ImmutableTup4c.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn('a');
		when(t.getY()).thenReturn('b');
		when(t.getZ()).thenReturn('c');
		when(t.getW()).thenReturn('d');

		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());

		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals('a', entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals('b', entry.getValue());
		
		entry = l.get(2);
		assertEquals("z", entry.getKey());
		assertEquals('c', entry.getValue());
		
		entry = l.get(3);
		assertEquals("w", entry.getKey());
		assertEquals('d', entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
}