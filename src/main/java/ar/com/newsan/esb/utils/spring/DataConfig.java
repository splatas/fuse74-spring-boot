package ar.com.newsan.esb.utils.spring;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {
	
	@Bean(name = "camelServlet")
	public ServletRegistrationBean camelServletRegistrationBean() {
		
		ServletRegistrationBean registration = new ServletRegistrationBean(new CamelHttpTransportServlet(), "/stocks-service/*");
		registration.setName("CamelServlet");

		return registration;
	}
	
//	@Bean(name = "dataSource")
//	public TransactionAwareDataSourceProxy getDataSource() throws SQLException {
//
//		String datasourceURL = System.getenv("database.oracle.url");
//		String datasourceUser = System.getenv("database.oracle.username");
//		String datasourcePassword = System.getenv("database.oracle.password");
//
//		OracleDataSource newsanDatasource = new OracleDataSource();
//		newsanDatasource.setURL(datasourceURL);
//		newsanDatasource.setUser(datasourceUser);
//		newsanDatasource.setPassword(datasourcePassword);
//		
//		TransactionAwareDataSourceProxy dsProxy = new TransactionAwareDataSourceProxy();
//		dsProxy.setTargetDataSource(newsanDatasource);
//
//		return dsProxy;
//	}
	
//	@Bean(name = "mybatisConfig")
//	public ClassPathResource getMybatisConfig() {
//		
//		ClassPathResource mybatisConfig = new ClassPathResource("SqlMapConfig.xml", NewsanResource.class);
//													   
//		return mybatisConfig;
//	}
	
//	@Bean(name = "sqlSessionFactoryBean")
//	public SqlSessionFactoryBean getSqlSessionFactoryBean(ApplicationContext ctx) {
//		
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		
//		DataSource ds = (DataSource) ctx.getBean("dataSource");
//		sqlSessionFactoryBean.setDataSource(ds);
//		
//		// custom factory builder
//		CustomSqlSessionFactoryBuilder sqlSessionFactoryBuilder = (CustomSqlSessionFactoryBuilder) ctx.getBean("customSqlSessionFactoryBuilder");
//		sqlSessionFactoryBean.setSqlSessionFactoryBuilder(sqlSessionFactoryBuilder);
//		
//		// standard mybatis config file
//		ClassPathResource mybatisConfig = (ClassPathResource) ctx.getBean("mybatisConfig");
//		sqlSessionFactoryBean.setConfigLocation(mybatisConfig);
//		
//        // externalised mappers 
//		Resource[] mapperLocations = (Resource[]) ctx.getBean("mapperLocations");
//		sqlSessionFactoryBean.setMapperLocations(mapperLocations);
//		
//		return sqlSessionFactoryBean;
//	}
	
//	@Bean(name = "mapperLocations")
//	public Resource[] getMappersLocations(ApplicationContext ctx) {
//		
//		Resource order = (ClassPathResource) ctx.getBean("mapperOrder");
//		Resource product = (ClassPathResource) ctx.getBean("mapperProduct");
//		Resource customer = (ClassPathResource) ctx.getBean("mapperCustomer");
//		Resource supplier = (ClassPathResource) ctx.getBean("mapperSupplier");
//		
//		Resource[] mapperLocations = {order, product, customer, supplier};
//		return mapperLocations;
//	}
	
//	@Bean(name = "mapperOrder")
//	public ClassPathResource getMapperOrder() {
//		
//		ClassPathResource mapperOrder = new ClassPathResource("Order.xml", NewsanResource.class);
//													   
//		return mapperOrder;
//	}
	
//	@Bean(name = "mapperProduct")
//	public ClassPathResource getMapperProduct() {
//		
//		ClassPathResource mapperProduct = new ClassPathResource("Product.xml", NewsanResource.class);
//													   
//		return mapperProduct;
//	}
	
//	@Bean(name = "mapperCustomer")
//	public ClassPathResource getMapperCustomer() {
//		
//		ClassPathResource mapperCustomer = new ClassPathResource("Customer.xml", NewsanResource.class);
//													   
//		return mapperCustomer;
//	}
	
//	@Bean(name = "mapperSupplier")
//	public ClassPathResource getMapperSupplier() {
//		
//		ClassPathResource mapperSupplier = new ClassPathResource("Supplier.xml", NewsanResource.class);
//													   
//		return mapperSupplier;
//	}

//	@Bean(name = "mapperReception")
//	public ClassPathResource getMapperReception() {
//		
//		ClassPathResource mapperReception = new ClassPathResource("Reception.xml", NewsanResource.class);
//													   
//		return mapperReception;
//	}
	
//	@Bean(name = "mybatis")
//	public MyBatisComponent getMyBatisComponent(ApplicationContext ctx) {
//		
//		MyBatisComponent mybatisComp = new MyBatisComponent();
//		
//		CustomSqlSessionFactory sqlSessionFactory = (CustomSqlSessionFactory) ctx.getBean("sqlSessionFactory");
//		mybatisComp.setSqlSessionFactory(sqlSessionFactory);
//		
//		return mybatisComp;
//	}
	
//	@Bean(name = "configuration")
//	public org.apache.ibatis.session.Configuration getConfiguration(ApplicationContext ctx) throws InstantiationException, IllegalAccessException {
//		
//		CustomSqlSessionFactory bean = (CustomSqlSessionFactory)ctx.getBean("sqlSessionFactoryBean"); 
//		org.apache.ibatis.session.Configuration configuration = bean.getConfiguration();
//		
//		return configuration;
//	}
	
	
}
