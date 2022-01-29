package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.ImmutableTup4l;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link ImmutableTup4l}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4l_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link ImmutableTup4l#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		ImmutableTup4l t = mock(ImmutableTup4l.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		when(t.getY()).thenReturn(2l);
		when(t.getZ()).thenReturn(3l);
		when(t.getW()).thenReturn(4l);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());
		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals(1l, entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals(2l, entry.getValue());
		
		entry = l.get(2);
		assertEquals("z", entry.getKey());
		assertEquals(3l, entry.getValue());
		
		entry = l.get(3);
		assertEquals("w", entry.getKey());
		assertEquals(4l, entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
}