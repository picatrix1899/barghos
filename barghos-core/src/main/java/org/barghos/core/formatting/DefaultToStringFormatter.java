package org.barghos.core.formatting;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.barghos.core.api.formatting.ToStringFormatter;

/**
 * This is the default implementation of the interface {@link ToStringFormatter}.
 * It builds the string representation in a fashion like "classname(paramName=paramValue, paramName=paramValue)".
 * The classname is the lowercase simple class name of the object. Float, double and long values get formatted with
 * their respective suffix f, d or l.
 * 
 * @author picatrix1899
 */
public class DefaultToStringFormatter implements ToStringFormatter
{

	@Override
	public String format(Object obj, Map<String,Object> values)
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append(obj.getClass().getSimpleName().toLowerCase());
		
		if(values.size() > 0)
		{
			builder.append("(");
		
			Set<Map.Entry<String,Object>> valueSet = values.entrySet();
			
			Iterator<Map.Entry<String,Object>> it = valueSet.iterator();
			
			for(Map.Entry<String,Object> entry; it.hasNext();)
			{
				entry = it.next();
				
				builder.append(entry.getKey());
				builder.append("=");
				
				Object value = entry.getValue();
				
				builder.append(value);
				
				if(value instanceof Float)
				{
					builder.append("f");
				}
				else if(value instanceof Double)
				{
					builder.append("d");
				}
				else if(value instanceof Long)
				{
					builder.append("l");
				}
				
				if(it.hasNext())
				{
					builder.append(", ");
				}
			}
			
			builder.append(")");
		}
		
		return builder.toString();
	}
}