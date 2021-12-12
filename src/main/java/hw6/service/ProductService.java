package hw6.service;

import hw6.dao.ProductDao;
import hw6.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductDao productDao = new ProductDao();

    public Product getPersonListByProductId(Long id) {
        return productDao.findById(id);
    }
}
