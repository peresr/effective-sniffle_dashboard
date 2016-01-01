package effective_sniffle.dashboard.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import effective_sniffle.dashboard.model.Product;

/**
 * Repository class for <code>Product</code> domain objects.
 * 
 * @author Ricardo Peres
 * @since 2016-01-01
 */
public interface ProductRepository {
	Collection<Product> list() throws DataAccessException;
}
