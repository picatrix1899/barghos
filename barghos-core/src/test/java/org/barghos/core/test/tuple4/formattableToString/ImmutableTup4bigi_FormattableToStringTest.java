package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.ImmutableTup4bigi;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link ImmutableTup4bigi}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4bigi_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		ImmutableTup4bigi t = mock(ImmutableTup4bigi.class);
		
		when(t.getValueMapping()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(1));
		when(t.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t.getW()).thenReturn(BigInteger.valueOf(4));

		List<Map.Entry<String,Object>> l = new ArrayList<>(t.getValueMapping().entrySet());
		Map.Entry<String,Object> entry = null;
		
		entry = l.get(0);
		assertEquals("x", entry.getKey());
		assertEquals(BigInteger.valueOf(1), entry.getValue());
		
		entry = l.get(1);
		assertEquals("y", entry.getKey());
		assertEquals(BigInteger.valueOf(2), entry.getValue());
		
		entry = l.get(2);
		assertEquals("z", entry.getKey());
		assertEquals(BigInteger.valueOf(3), entry.getValue());
		
		entry = l.get(3);
		assertEquals("w", entry.getKey());
		assertEquals(BigInteger.valueOf(4), entry.getValue());
		
		verify(t).getValueMapping();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
}