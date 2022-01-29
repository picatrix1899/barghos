package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.ImmutableTup4o;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link ImmutableTup4o}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4o_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link ImmutableTup4o#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		@SuppressWarnings("unchecked")
		ImmutableTup4o<Integer,Double,String,Character> t = (ImmutableTup4o<Integer,Double,String,Character>)mock(ImmutableTup4o.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(2.0);
		when(t.getZ()).thenReturn("a");
		when(t.getW()).thenReturn('a');

		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());
		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals(1, entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals(2.0, entry.getValue());
		
		entry = l.get(2);
		assertEquals("z", entry.getKey());
		assertEquals("a", entry.getValue());
		
		entry = l.get(3);
		assertEquals("w", entry.getKey());
		assertEquals('a', entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
}