package org.barghos.hid;

public interface IHidPhantomDevice
{
	String id();
	
	void poll();
}
