package com.mockuai.itemcenter.mop.api.util;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * 
 * @author linyue
 *
 */

public class BeanUtils {

	public static String[] getNullPropertyNames (Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
	
	public static void copyPropertiesIgnoreNull(Object src,Object target){
		org.springframework.beans.BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
	}
	
}
