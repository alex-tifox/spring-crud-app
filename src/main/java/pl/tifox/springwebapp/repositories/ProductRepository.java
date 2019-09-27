package pl.tifox.springwebapp.repositories;

import org.springframework.stereotype.Component;
import pl.tifox.springwebapp.entities.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Milk", 80));
        products.add(new Product(2L, "Butter", 40));
        products.add(new Product(3L, "Meat", 50));
    }

}
