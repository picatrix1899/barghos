package org.barghos.core.formatting;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.barghos.core.Barghos;
import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.formatting.ToStringFormatter;
import org.barghos.core.api.util.ArgumentNullException;
import org.barghos.core.api.util.Nullable;

/**
 * This is the default implementation of the interface {@link ToStringFormatter}.
 * It builds the string representation in a fashion like "classname(paramName=paramValue, paramName=paramValue)".
 * The classname is the lowercase simple class name of the object. Float, double and long values get formatted with
 * their respective suffix f, d or l. Any value which type implements the
 * {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} interface will be formatted via the
 * {@link org.barghos.core.api.formatting.FormattableToString#toFormattedString() FormattableToString.toFormattedString()} function.
 * 
 * @author picatrix1899
 */
public class DefaultToStringFormatter implements ToStringFormatter
{
	@Override
	public String format(Object obj, @Nullable Map<String,Object> values, @Nullable String customName)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(obj == null) throw new ArgumentNullException("obj");
		}
		
		StringBuilder builder = new StringBuilder();

		builder.append(customName == null ? obj.getClass().getSimpleName().toLowerCase() : customName);
		
		builder.append("(");
		
		if(values != null && values.size() > 0)
		{
			Set<Map.Entry<String,Object>> valueSet = values.entrySet();
			
			Iterator<Map.Entry<String,Object>> it = valueSet.iterator();
			
			for(Map.Entry<String,Object> entry; it.hasNext();)
			{
				entry = it.next();
				
				builder.append(entry.getKey());
				builder.append("=");
				
				Object value = entry.getValue();

				if(value instanceof Float)
				{
					builder.append(value);
					builder.append("f");
				}
				else if(value instanceof Double)
				{
					builder.append(value);
					builder.append("d");
				}
				else if(value instanceof Long)
				{
					builder.append(value);
					builder.append("l");
				}
				else if(value instanceof FormattableToString)
				{
					builder.append(((FormattableToString)value).toFormattedString());
				}
				else
				{
					builder.append(value);
				}

				if(it.hasNext()) builder.append(", ");
			}
		}
		
		builder.append(")");
		
		return builder.toString();
	}
}