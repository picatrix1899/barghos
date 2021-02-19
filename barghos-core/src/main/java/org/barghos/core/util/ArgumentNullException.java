/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.core.util;

/**
 * This exception indicates that a method has been passed an argument that is null but must not be null.
 * It extends the {@link IllegalArgumentException}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class ArgumentNullException extends IllegalArgumentException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this class.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * This member contains the name of the function argument that was null.
	 */
	private String argument;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 * 
	 * @since 1.0.0.0
	 */
	public ArgumentNullException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * 
	 * @since 1.0.0.0
	 */
	public ArgumentNullException(String argument)
	{
		super();
		
		this.argument = argument;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exeption message.
	 * 
	 * @since 1.0.0.0
	 */
	public ArgumentNullException(String argument, String message)
	{
		super(message);
		
		this.argument = argument;
	}
	
	/**
	 * Returns the name of the argument this exception was created for.
	 * 
	 * @return The argument name
	 * 
	 * @since 1.0.0.0
	 */
	public String getArgument()
	{
		return this.argument;
	}
	
	@Override
	public String getMessage()
	{
		StringBuilder builder = new StringBuilder();
		if(!this.argument.isBlank())
		{
			builder.append("Argument: ");
			builder.append(this.argument);
		}
		
		if(super.getMessage() != null && !super.getMessage().isBlank())
		{
			if(!this.argument.isBlank()) builder.append("; Message: ");
			
			builder.append(super.getMessage());
		}
		
		return builder.toString();
	}
}