/*package com.service.jaxrs.config;



import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages={ "com.service.jaxrs.model" })
public class ApplicationContext {
	
	private static String DATABASE_URL="jdbc:mysql://localhost:3306/niit_db";
	private static String DATABASE_DRIVER="com.mysql.jdbc.Driver";
	private static String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
	private static String DATABASE_USERNAME="root";
	private static String DATABASE_PASSWORD="ashwani";
	private static String DATABASE_URL="jdbc:h2:tcp://localhost/~/REST_DB";
	private static String DATABASE_DRIVER="org.h2.Driver";
	private static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private static String DATABASE_USERNAME="sa";
	private static String DATABASE_PASSWORD="ashwani";
	
	@Bean
	public DataSource getDataSource(){
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName(DATABASE_DRIVER);
		ds.setUrl(DATABASE_URL);
		ds.setUsername(DATABASE_USERNAME);
		ds.setPassword(DATABASE_PASSWORD);
		return ds;
	}
	
	@Bean
	public SessionFactory getSessionFactory(DataSource ds){
		LocalSessionFactoryBuilder b=new LocalSessionFactoryBuilder(ds);
		b.addProperties(getHibernateProperties());
		b.scanPackages("com.service.jaxrs.model");
		return b.buildSessionFactory();
	}
	
	private Properties getHibernateProperties(){
		Properties p=new Properties();
		p.put("hibernate.dialect", DATABASE_DIALECT);
		p.put("hibernate.show_sql", "true");
		p.put("hibernate.format_sql", "true");
		p.put("hibernate.hbm2ddl.auto", "update");
		return p;
		
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sf){
		HibernateTransactionManager tm=new HibernateTransactionManager(sf);
		return tm;
	}

}
*/