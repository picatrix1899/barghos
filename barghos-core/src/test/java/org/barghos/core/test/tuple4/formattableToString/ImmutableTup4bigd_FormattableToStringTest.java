package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.ImmutableTup4bigd;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link ImmutableTup4bigd}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4bigd_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link ImmutableTup4bigd#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		ImmutableTup4bigd t = mock(ImmutableTup4bigd.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(4.0));

		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());
		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals(BigDecimal.valueOf(1.0), entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals(BigDecimal.valueOf(2.0), entry.getValue());
		
		entry = l.get(2);
		assertEquals("z", entry.getKey());
		assertEquals(BigDecimal.valueOf(3.0), entry.getValue());
		
		entry = l.get(3);
		assertEquals("w", entry.getKey());
		assertEquals(BigDecimal.valueOf(4.0), entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
}