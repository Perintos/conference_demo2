package com.pluralsight.conferencedemo2.configuration;


import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class PersistenceConfiguration {
	@Bean
	public DataSource datasource(){
		DataSourceBuilder<?> builder = DataSourceBuilder.create();
		System.out.println("my datasource is setting");
		builder.url("jdbc:mysql://localhost:3306/conference_demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		builder.username("root");
		builder.password("Itsascret");
		return builder.build();
	}
}
