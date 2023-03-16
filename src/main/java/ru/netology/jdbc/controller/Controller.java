package ru.netology.jdbc.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.Products;
import ru.netology.jdbc.repository.Repository;

import java.awt.*;
import java.net.http.HttpRequest;
import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {
    private Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }
    @GetMapping("products/fetch-product")
    public List<Products> getProducts(@RequestParam("name") String name, HttpServletResponse response){
        //System.out.println(repository.getProducts(name));
        return repository.getProducts(name);
    }
}
