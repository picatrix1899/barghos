package org.barghos.validation;

import java.io.PrintStream;
import java.io.PrintWriter;

@FunctionalInterface
public interface ExceptionHandler 
{
	void handle(Exception e);
	
	@SuppressWarnings("unused")
	static ExceptionHandler ignore()
	{
		return (e) -> {};
	}
	
	static ExceptionHandler printStackTrace()
	{
		return (e) -> {e.printStackTrace();};
	}
	
	static ExceptionHandler printStackTrace(PrintStream s)
	{
		return (e) -> {e.printStackTrace(s);};
	}
	
	static ExceptionHandler printStackTrace(PrintWriter w)
	{
		return (e) -> {e.printStackTrace(w);};
	}
	
	static ExceptionHandler crash()
	{
		return (e) -> {throw new Error(e);};
	}
	
	static ExceptionHandler throwRuntime(RuntimeExceptionSupplier f)
	{
		return (e) -> {throw f.get(e);};
	}
}
