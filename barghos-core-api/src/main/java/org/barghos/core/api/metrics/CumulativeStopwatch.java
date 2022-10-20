package org.barghos.core.api.metrics;

import java.util.Objects;
import java.util.function.LongSupplier;

import org.barghos.documentation.Nullable;

public class CumulativeStopwatch
{
	public static final LongSupplier DEFAULT_TIME_SUPPLIER = () -> System.nanoTime();
	public static final Resolution DEFAULT_TIME_RESOLUTION = Resolution.NANOSECONDS;
	
	private transient LongSupplier timeSupplier = DEFAULT_TIME_SUPPLIER;
	private Resolution timeResolution = DEFAULT_TIME_RESOLUTION;

	private transient long startTime;
	private transient long endTime;
	private long delta;
	
	public CumulativeStopwatch() { }
	
	public CumulativeStopwatch(LongSupplier timeSupplier, Resolution timeResolution)
	{
		setTimeSupplier(timeSupplier, timeResolution);
	}
	
	public CumulativeStopwatch setTimeSupplier(LongSupplier timeSupplier, @Nullable Resolution timeResolution)
	{
		this.timeSupplier = Objects.requireNonNull(timeSupplier);
		this.timeResolution = Objects.requireNonNullElse(timeResolution, DEFAULT_TIME_RESOLUTION);
		
		return this;
	}
	
	public CumulativeStopwatch start()
	{
		this.startTime = this.timeSupplier.getAsLong();
		
		return this;
	}
	
	public CumulativeStopwatch stop()
	{
		this.endTime = this.timeSupplier.getAsLong();
		this.delta += this.endTime - this.startTime;
		
		return this;
	}
	
	public CumulativeStopwatch reset()
	{
		this.delta = 0l;
		this.startTime = 0l;
		this.endTime = 0l;
		
		return this;
	}
	
	public long getDelta()
	{
		return this.delta;
	}
	
	public Resolution getResolution()
	{
		return this.timeResolution;
	}
	
	public String getResult(String name, Format format)
	{
		long deltaNano = 0l;
		long deltaMicro = 0l;
		long deltaMilli = 0l;
		long deltaSec = 0l;
		
		switch(this.timeResolution)
		{
			case SECONDS:
			deltaNano = this.delta * 1000 * 1000 * 1000;
			deltaMicro = this.delta * 1000 * 1000;
			deltaMilli = this.delta * 1000;
			deltaSec = this.delta;
				
			case MILLISECONDS:
			deltaNano = this.delta * 1000 * 1000;
			deltaMicro = this.delta * 1000;
			deltaMilli = this.delta;
			deltaSec = this.delta / 1000;
			
			case MICROSECONDS:
			deltaNano = this.delta * 1000;
			deltaMicro = this.delta;
			deltaMilli = this.delta / 1000;
			deltaSec = this.delta / 1000 / 1000;
				
			case NANOSECONDS:
			deltaNano = this.delta;
			deltaMicro = this.delta / 1000;
			deltaMilli = this.delta / 1000 / 1000;
			deltaSec = this.delta / 1000 / 1000 / 1000;
		}

		if(name != null)
			return name + ": " + format.format(deltaSec, deltaMilli, deltaMicro, deltaNano);
		else
			return format.format(deltaSec, deltaMilli, deltaMicro, deltaNano);
		
	}
	
	public String toString()
	{
		return "stopwatch(resolution=" + this.timeResolution.name() + ", delta=" + this.delta + ")";
	}
	
	static enum Resolution
	{
		SECONDS(1),
		MILLISECONDS(1000),
		MICROSECONDS(1000 * 1000),
		NANOSECONDS(1000 * 1000 * 1000)
		;
		
		private final long unitsPerSecond;
		
		private Resolution(long unitsPerSecond)
		{
			this.unitsPerSecond = unitsPerSecond;
		}
		
		public long unitsPerSecond()
		{
			return this.unitsPerSecond;
		}
	}
	
	static interface Format
	{
		public static final Format SEC = (sec, milli, micro, nano) -> sec + "s";
		public static final Format SEC_MILLI = (sec, milli, micro, nano) -> sec + "s/" + milli + "ms";
		public static final Format SEC_MILLI_MICRO = (sec, milli, micro, nano) -> sec + "s/" + milli + "ms/" + micro + "�s";
		public static final Format SEC_MILLI_MICRO_NANO = (sec, milli, micro, nano) -> sec + "s/" + milli + "ms/" + micro + "�s/" + nano + "ns";
		
		public static final Format MILLI = (sec, milli, micro, nano) -> milli + "ms";
		public static final Format MILLI_MICRO = (sec, milli, micro, nano) -> milli + "ms/" + micro + "�s";
		public static final Format MILLI_MICRO_NANO = (sec, milli, micro, nano) -> milli + "ms/" + micro + "�s/" + nano + "ns";
		
		public static final Format MICRO = (sec, milli, micro, nano) -> micro + "�s";
		public static final Format MICRO_NANO = (sec, milli, micro, nano) -> micro + "�s/" + nano + "ns";
		
		public static final Format NANO = (sec, milli, micro, nano) -> nano + "ns";
		
		public String format(long sec, long milli, long micro, long nano);
	}
}
