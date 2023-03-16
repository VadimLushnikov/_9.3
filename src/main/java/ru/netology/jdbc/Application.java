package ru.netology.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;;
import java.security.spec.NamedParameterSpec;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Override
//	public void run(String... args) throws Exception {
//		List<Persons> productList=jdbcTemplate.query("SELECT name, surname FROM netology.PERSONS", (rs, rowNum) -> {
//					String name = rs.getString("name");
//					String surname = rs.getString("surname");
//			System.out.println(new Persons(name,surname));
//					return new Persons(name,surname);
//				});
//	}
//	public void run(String... args) throws Exception {
//		List<Products> productList=jdbcTemplate.query("SELECT product_name, date FROM netology.ORDERS INNER JOIN netology.CUSTOMERS on orders.customer_id = netology.CUSTOMERS.id where lower(name)~~lower('АЛЕКСЕ%')", (rs, rowNum) -> {
//			String productName = rs.getString("product_name");
//			Date date = rs.getDate("date");
//			//System.out.println(new Products(productName,date));
//			return new Products(productName,date);
//		});
//		productList.forEach(System.out::println);
//	}
	public void run(String... args) throws Exception {
//		Map<String,String> map = new HashMap<>();
//		map.put("name","Алексе%");
//		List<Products> productList=namedParameterJdbcTemplate.query("SELECT product_name, date FROM netology.ORDERS INNER JOIN netology.CUSTOMERS on orders.customer_id = netology.CUSTOMERS.id where lower(name)~~lower(:name)",map,(rs, rowNum) -> {
//			String productName = rs.getString("product_name");
//			Date date = rs.getDate("date");
//			//System.out.println(new Products(productName,date));
//			return new Products(productName,date);
//		});
//		productList.forEach(System.out::println);

	}
}
