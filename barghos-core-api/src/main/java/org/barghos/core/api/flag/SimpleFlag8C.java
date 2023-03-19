package org.barghos.core.api.flag;


public interface SimpleFlag8C extends SimpleFlag8R
{
	SimpleFlag8C setByIndex(int index, boolean value);
	SimpleFlag8C set(byte mask, boolean value);
	SimpleFlag8C clear();
	SimpleFlag8C setFlag(byte flag);
}
