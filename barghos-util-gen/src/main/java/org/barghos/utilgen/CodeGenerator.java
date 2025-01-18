package org.barghos.utilgen;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Function;

public class CodeGenerator
{
	
	public static void main(String[] args)
	{
        try {
    		String path = Paths.get("src/generated/java").toAbsolutePath().toString();
    		
    		if(args.length > 0) path = args[0];
    		
    		generateConsumers(path);

        	
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	public static void generateConsumers(String path) throws Exception
	{
		generateConsumer(path, "BigDecimal", "BigDecimal", "Bigd", "bigds", "\nimport java.math.BigDecimal;\n");
		generateConsumer(path, "BigInteger", "BigInteger", "Bigi", "bigis", "\nimport java.math.BigInteger;\n");
		generateConsumer(path, "boolean", "Boolean", "Bo", "bools", "");
		generateConsumer(path, "boolean", "Boolean", "Bo", "bools", "");
		generateConsumer(path, "byte", "Byte", "B", "bytes", "");
		generateConsumer(path, "char", "Character", "C", "chars", "");
		generateConsumer(path, "double", "Double", "D", "doubles", "");
		generateConsumer(path, "float", "Float", "F", "floats", "");
		generateConsumer(path, "int", "Integer", "I", "ints", "");
		generateConsumer(path, "long", "Long", "L", "longs", "");
		generateConsumer(path, "Object", "Object", "O", "objs", "");
		generateConsumer(path, "short", "Short", "S", "shorts", "");
		generateConsumer(path, "String", "String", "Str", "strings", "");
	}
	
	public static void generateConsumer(String path, String primitiveTypeName, String boxedTypeName, String shortName, String subPackage, String additionalImports) throws Exception
	{
		final String[] files = {
			"ConsumerBo",
			"ConsumerBoA",
			"ConsumerBoA2",
			"ConsumerBoA3",
			"Consumer2Bo",
			"Consumer2BoA",
			"Consumer2BoA2",
			"Consumer2BoA3",
			"Consumer3Bo",
			"Consumer3BoA",
			"Consumer3BoA2",
			"Consumer3BoA3",
			"Consumer4Bo",
			"Consumer4BoA",
			"Consumer4BoA2",
			"Consumer4BoA3",
			
			"ConsumerExBo",
			"ConsumerExBoA",
			"ConsumerExBoA2",
			"ConsumerExBoA3",
			"ConsumerEx2Bo",
			"ConsumerEx2BoA",
			"ConsumerEx2BoA2",
			"ConsumerEx2BoA3",
			"ConsumerEx3Bo",
			"ConsumerEx3BoA",
			"ConsumerEx3BoA2",
			"ConsumerEx3BoA3",
			"ConsumerEx4Bo",
			"ConsumerEx4BoA",
			"ConsumerEx4BoA2",
			"ConsumerEx4BoA3"
		};
		
		final String baseTemplatePath = "/templates/consumer/";
		final String packagePath = "org/barghos/util/consumer/" + subPackage;
		
		final Function<String,String> processor = (c) -> {
			
			c = c.replaceAll("//#ANCHOR:ADDITIONAL_IMPORTS", additionalImports);
			c = c.replaceAll("package org.barghos.util.consumer;", "package org.barghos.util.consumer." + subPackage + ";");
			c = c.replaceAll("boolean", primitiveTypeName);
			c = c.replaceAll("Boolean", boxedTypeName);
			c = c.replaceAll("Bo", shortName);
			
			return c;
		};
		
		for(String file : files)
		{
			String templatePath = baseTemplatePath + file + ".txt";
			String classFileName = file.replaceAll("Bo", shortName) + ".java";
			String classFilePath = Paths.get(path, packagePath, classFileName).toString();
			
			processFile(templatePath, classFilePath, processor);
		}
	}
	
	public static void processFile(String resource, String outFilePath, Function<String,String> processor) throws Exception
	{
		InputStream is = CodeGenerator.class.getResourceAsStream(resource);
		
		String content = new String(is.readAllBytes(), StandardCharsets.UTF_8);
		
		is.close();
		
		content = processor.apply(content);
		
		Path outPath = Paths.get(outFilePath);
		
		Files.createDirectories(outPath.getParent());

		System.out.println("Generated: " + outPath);
		
		Files.writeString(outPath, content);

	}
}
