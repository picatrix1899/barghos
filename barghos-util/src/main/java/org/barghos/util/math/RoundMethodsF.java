package org.barghos.util.math;

public class RoundMethodsF
{
	private RoundMethodsF() {}
	
	RoundMethodF NONE = (v) -> v;
	RoundMethodF FLOOR = (v) -> (float)Math.floor(v);
	RoundMethodF CEIL = (v) -> (float)Math.ceil(v);
	RoundMethodF ROUND = (v) -> (float)Math.round(v);
	RoundMethodF TRUNCATE = (v) -> (float)(int)v;
}
