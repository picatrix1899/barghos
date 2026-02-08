package org.barghos.hid;

import java.util.Set;

public interface IHidDeviceInputSnapshot
{
	Set<? extends IHidDeviceInputState> states();
}
