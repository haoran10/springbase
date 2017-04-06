package wang.conge.springbase.util;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.cglib.beans.BeanCopier;

/**
 * Bean操作工具类 
 * @author haozhan.wc
 * @since  2017-04-06
 */
public class BeanUtil {
	
	private static Map<String,BeanCopier> beanCopierMap = new ConcurrentHashMap<>(64);
	
	private static <S,T> String buildBeanCopierKey(Class<S> source,Class<T> target){
		return source.getName() + "_" + target.getName();
	}
	
	public static <S,T> void copy(S source, T target){
		Objects.requireNonNull(source);
		Objects.requireNonNull(target);
		
		String key = buildBeanCopierKey(source.getClass() ,target.getClass());
		BeanCopier beanCopier =  beanCopierMap.get(key);
		if(beanCopier == null){
			beanCopier = BeanCopier.create(source.getClass() ,target.getClass(), false);//not use Converter
			beanCopierMap.put(key, beanCopier);
		}
		
		beanCopier.copy(source, target, null);
	}
}
