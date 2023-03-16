package ru.netology.jdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.netology.jdbc.Products;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Repository {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private String select;
    public Repository(String fileName){
        this.select=read(fileName);
    }

    public String getSelect() {
        return select;
    }
    public List<Products> getProducts(String name){
        Map<String,String> map = new HashMap<>();
        //map.put("name","Алексе%");
        //System.out.println(name);
        map.put("name",name);
        //System.out.println(map);
        //System.out.println(select);
        List<Products> productList=namedParameterJdbcTemplate.query(select,map,(rs, rowNum) -> {
            String productName = rs.getString("product_name");
            Date date = rs.getDate("date");
            int amount=rs.getInt("amount");
            //System.out.println(productName);
            //System.out.println(new Products(productName,date));
            return new Products(productName,date,amount);
        });
        //System.out.println(productList);
        return productList;
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
