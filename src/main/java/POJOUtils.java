package main.java;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.naming.OperationNotSupportedException;

/**
 * <b> Contains all the Operations that can be done on POJOs </b>
 * @author balaji i
 *
 */
public class POJOUtils {

	private static final String NULL_POJO_MESSAGE = "POJO is NULL";
	
	/**
	 * <b> Converts any POJO to Map using Java Reflection <br/>
	 * 	Throws {@link OperationNotSupportedException } , if the POJO is null
	 * </b> 
	 * @param pojo
	 * @return <b> Map<String, Object> </b> 
	 */
	public static <T> Map<String, Object> getPOJOAsMap(T pojo) throws IllegalArgumentException, IllegalAccessException, OperationNotSupportedException {
		if(null == pojo)
			throw new UnsupportedOperationException(NULL_POJO_MESSAGE);
		
		Map<String, Object> pojoMap = new LinkedHashMap<String, Object>();
		
		for (Field declaredField : pojo.getClass().getDeclaredFields()) {
			declaredField.setAccessible(true);
			pojoMap.put(declaredField.getName(),declaredField.get(pojo));
		}
		
		return pojoMap;
	}

	public static <T> List<String> getPOJOFieldNames(T pojo) {
		if(null == pojo)
			throw new UnsupportedOperationException(NULL_POJO_MESSAGE);
		
		List<String> pojoFieldNames = new ArrayList<>();
		
		for (Field declaredField : pojo.getClass().getDeclaredFields()) 
			pojoFieldNames.add(declaredField.getName());
		
		return pojoFieldNames;
	}

	public static <T> List<Field> getPOJOFieldsAsList(T pojo) {
		if(null == pojo)
			throw new UnsupportedOperationException(NULL_POJO_MESSAGE);
		
		return Arrays.asList(pojo.getClass().getDeclaredFields());
	}
}