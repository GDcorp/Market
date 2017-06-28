package system.repository;

import system.entity.ProductEntity;
import system.repository.impl.ProductRepositoryImpl;

import java.util.List;

/**
 * Created by Qubo on 21.06.2017.
 */

public interface ProductRepository {
    ProductRepository INSTANCE_PRODUCT = new ProductRepositoryImpl();
    List<ProductEntity> getProducts();
}
