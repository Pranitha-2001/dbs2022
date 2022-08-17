package com.dbs.spring.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbs.spring.entity.Product;
import com.dbs.spring.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public long getProductsCount() {
		return this.productRepository.count();
	}
	public boolean insertProduct(Product product) {
		System.out.println("Inserting product in database");
		if(this.productRepository.findById(product.getPid()).isPresent()) {
			return false;
		}
		try {
			this.productRepository.save(product);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;
	}
	public boolean updateProduct(Product product) {
		System.out.println("Updating product in database");
		try {
			this.productRepository.save(product);
		}
		catch (Exception e) {
			System.out.println("Error Updating product in database");
			return false;
		}
		return true;
	}
	public boolean deleteProduct(int id)throws Exception{
		System.out.println("Deleting product in database with id "+id);
		try{
			this.productRepository.deleteById(id);
		}catch (Exception e) {
			System.out.println("Error Deleting product in database");
			throw new IllegalArgumentException("Could not delete");
		}
		return true;
	}
	public Product findProductById(int id)
    {
        System.out.println("Finding product in database with id "+id);
        try {
            Optional<Product> prod = this.productRepository.findById(id);
            return prod.orElseThrow(()->{
                System.out.println("Error Finding product in database");
                return new EntityNotFoundException("Product with "+id + " does not exist");
            });
        }catch(IllegalArgumentException e )
        {
            System.out.println("Error Inserting product in database");
            return null;
        }
    }
	public List<Product> getProducts()
    {
        List<Product> products = new ArrayList<Product>();
        this.productRepository.findAll().forEach(prod->products.add(prod));
        return products;
    }
}
