package com.lezhi.demo.model.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {  

	@Override  
	protected Object determineCurrentLookupKey() {  
		return DataSourceSwitcher.getDataSource();
	}  
} 
