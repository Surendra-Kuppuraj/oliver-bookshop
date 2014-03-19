/**
 * 
 */
package com.oliver.serviceUtil;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 * @author Surendra
 *
 */
public class DozerConfigurationImpl implements DozerConfiguration {
    	
	public Mapper createMappingConfiguration() {
		List<String> list = new ArrayList<String>();
		list.add("dozerMapping.xml");
		return new DozerBeanMapper(list);
	}
}
