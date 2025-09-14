package org.barghos.impl.core.math;

import org.barghos.api.core.math.IRoundMethodF;

public class RoundMethodsF
{
	private RoundMethodsF() {}
	
	IRoundMethodF NONE = (v) -> v;
	IRoundMethodF FLOOR = (v) -> (float)Math.floor(v);
	IRoundMethodF CEIL = (v) -> (float)Math.ceil(v);
	IRoundMethodF ROUND = (v) -> (float)Math.round(v);
	IRoundMethodF TRUNCATE = (v) -> (float)(int)v;
}
