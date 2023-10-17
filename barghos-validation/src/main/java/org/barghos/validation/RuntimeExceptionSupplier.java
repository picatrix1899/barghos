package org.barghos.validation;

@FunctionalInterface
public interface RuntimeExceptionSupplier
{
	RuntimeException get(Exception e);
}
