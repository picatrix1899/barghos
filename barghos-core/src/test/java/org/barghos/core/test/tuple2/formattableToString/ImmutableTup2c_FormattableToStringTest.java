package org.barghos.core.test.tuple2.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple2.ImmutableTup2c;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link ImmutableTup2c}.
 * 
 * @author picatrix1899
 */
class ImmutableTup2c_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link ImmutableTup2c#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		ImmutableTup2c t = mock(ImmutableTup2c.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn('a');
		when(t.getY()).thenReturn('b');

		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());

		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals('a', entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals('b', entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
}