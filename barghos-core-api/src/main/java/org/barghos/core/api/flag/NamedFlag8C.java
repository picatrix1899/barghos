package org.barghos.core.api.flag;


public interface NamedFlag8C extends NamedFlag8R, SimpleFlag8C
{
	NamedFlag8C putMask(String name, byte mask);
	NamedFlag8C setByName(String name, boolean value);
	NamedFlag8C clearMasks();
}
