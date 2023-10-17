package org.barghos.util.iterator;

public interface Iterablef extends Iterable<Float>
{
	Iteratorf iteratorFloat();
	
	default Iterator<Float> iterator()
	{
		return iteratorFloat();
	}
}
