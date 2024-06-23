package org.barghos.util.list;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

import org.barghostest.util.collection.core.iterator.FloatIterator;
import org.barghostest.util.collection.core.iterator.FloatListIterator;
import org.barghostest.util.collection.core.iterator.FloatSpliterator;

public interface FloatList extends List<Float>
{
	boolean containsFloat(float value);
	
	float[] toFloatArray();
	
	float[] toFloatArray(float[] res);
	
	default float[] toFloatArray(IntFunction<float[]> generator)
	{
		return toFloatArray(generator.apply(0));
	}
	
	boolean addFloat(float value);
	
	boolean removeFloat(float value);
	
	float getFloat(int index);
	
	float setFloat(int index, float value);
	
	void insertFloat(int index, float element);
	
	float removeFloatAt(int index);
	
	int indexOfFloat(float value);

	int lastIndexOfFloat(float value);
	
	FloatList subFloatList(int fromIndex, int toIndex);
	
	FloatIterator floatIterator();
	
	FloatListIterator floatListIterator();

	FloatListIterator floatListIterator(int index);
	
	FloatSpliterator floatSpliterator();
	
	@Override
	default boolean contains(Object o)
	{
		return containsFloat((float) o);
	}

	@Override
	default Iterator<Float> iterator()
	{
		return floatIterator();
	}

	@Override
	default Float[] toArray()
	{
		return ArrayUtils.convertToObject(toFloatArray());
	}

	@Override
	@SuppressWarnings("unchecked")
	default <T> T[] toArray(T[] a)
	{
		Float[] dataObj = toArray();
		
		if (a.length < dataObj.length) return (T[]) Arrays.copyOf(dataObj, dataObj.length, a.getClass());
			
		System.arraycopy(dataObj, 0, a, 0, dataObj.length);
		
		if (a.length > dataObj.length) a[dataObj.length] = null;
		
		return a;
	}

	@Override
	default boolean add(Float e)
	{
		return addFloat(e);
	}

	@Override
	default boolean remove(Object o)
	{
		return removeFloat((float) o);
	}

	@Override
	boolean containsAll(Collection<?> c);

	@Override
	boolean addAll(Collection<? extends Float> c);

	@Override
	boolean addAll(int index, Collection<? extends Float> c);

	@Override
	boolean removeAll(Collection<?> c);

	@Override
	boolean retainAll(Collection<?> c);

	@Override
	default void replaceAll(UnaryOperator<Float> operator)
	{
		Objects.requireNonNull(operator);
		final ListIterator<Float> li = this.listIterator();
		while (li.hasNext()) {
			li.set(operator.apply(li.next()));
		}
	}

	@Override
	@SuppressWarnings({"unchecked", "rawtypes"})
	default void sort(Comparator<? super Float> c)
	{
		Object[] a = this.toArray();
		Arrays.sort(a, (Comparator) c);
		ListIterator<Float> i = this.listIterator();
		for (Object e : a) {
			i.next();
			i.set((Float) e);
		}
	}

	@Override
	boolean equals(Object o);

	@Override
	default Float get(int index)
	{
		return getFloat(index);
	}

	@Override
	default Float set(int index, Float element)
	{
		return setFloat(index, element);
	}

	@Override
	default void add(int index, Float element)
	{
		insertFloat(index, element);
	}

	@Override
	default Float remove(int index)
	{
		return removeFloatAt(index);
	}

	@Override
	default int indexOf(Object o)
	{
		return indexOfFloat((float) o);
	}

	@Override
	default int lastIndexOf(Object o)
	{
		return lastIndexOfFloat((float) o);
	}

	@Override
	default ListIterator<Float> listIterator()
	{
		return floatListIterator();
	}

	@Override
	default ListIterator<Float> listIterator(int index)
	{
		return floatListIterator(index);
	}

	@Override
	default List<Float> subList(int fromIndex, int toIndex)
	{
		return subFloatList(fromIndex, toIndex);
	}
	
	@Override
	default Spliterator<Float> spliterator()
	{
		 return floatSpliterator();
	}
}