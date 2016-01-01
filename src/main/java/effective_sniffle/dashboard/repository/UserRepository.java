package effective_sniffle.dashboard.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import effective_sniffle.dashboard.model.User;

/**
 * Repository class for <code>User</code> domain objects.
 * 
 * @author Ricardo Peres
 * @since 2016-01-01
 */
public interface UserRepository {

	/**
	 * Retrieve <code>User</code>s from the data store, returning all owners.
	 *
	 * @return a <code>Collection</code> of <code>User</code>s (or an empty
	 *         <code>Collection</code> if none found)
	 */
	Collection<User> list() throws DataAccessException;

	/**
	 * Retrieve an <code>User</code> from the data store by id.
	 *
	 * @param id
	 *            the id to search for
	 * @return the <code>User</code> if found
	 * @throws org.springframework.dao.DataRetrievalFailureException
	 *             if not found
	 */
	User findById(int id) throws DataAccessException;

	/**
	 * Save an <code>User</code> to the data store, either inserting or updating
	 * it.
	 *
	 * @param user
	 *            the <code>User</code> to save
	 */
	void save(User user) throws DataAccessException;
}
