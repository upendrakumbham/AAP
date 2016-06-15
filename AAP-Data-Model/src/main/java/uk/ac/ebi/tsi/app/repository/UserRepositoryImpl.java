//package uk.ac.ebi.tsi.app.repository;
//
//import org.springframework.stereotype.Repository;
//
//import java.io.Serializable;
//
///**
// * Created by ukumbham on 25/05/2016.
// */
//
///**
// *
// * @param <T>
// * @param <Long>
// */
///** @Repository
//public class UserRepositoryImpl<T,Long> implements UserRepository{
//
//
//    /**
//     * Saves a given entity. Use the returned instance for further operations as the save operation might have changed the
//     * entity instance completely.
//     *
//     * @param entity
//     * @return the saved entity
//     */
//    @Override
//    public Object save(Object entity) {
//        return null;
//    }
//
//    /**
//     * Saves all given entities.
//     *
//     * @param entities
//     * @return the saved entities
//     * @throws IllegalArgumentException in case the given entity is {@literal null}.
//     */
//    @Override
//    public Iterable save(Iterable entities) {
//        return null;
//    }
//
//    /**
//     * Retrieves an entity by its id.
//     *
//     * @param serializable must not be {@literal null}.
//     * @return the entity with the given id or {@literal null} if none found
//     * @throws IllegalArgumentException if {@code id} is {@literal null}
//     */
//    @Override
//    public Object findOne(Serializable serializable) {
//        return null;
//    }
//
//    /**
//     * Returns whether an entity with the given id exists.
//     *
//     * @param serializable must not be {@literal null}.
//     * @return true if an entity with the given id exists, {@literal false} otherwise
//     * @throws IllegalArgumentException if {@code id} is {@literal null}
//     */
//    @Override
//    public boolean exists(Serializable serializable) {
//        return false;
//    }
//
//    /**
//     * Returns all instances of the type.
//     *
//     * @return all entities
//     */
//    @Override
//    public Iterable findAll() {
//        return null;
//    }
//
//    /**
//     * Returns all instances of the type with the given IDs.
//     *
//     * @param iterable
//     * @return
//     */
//    @Override
//    public Iterable findAll(Iterable iterable) {
//        return null;
//    }
//
//    /**
//     * Returns the number of entities available.
//     *
//     * @return the number of entities
//     */
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    /**
//     * Deletes the entity with the given id.
//     *
//     * @param serializable must not be {@literal null}.
//     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
//     */
//    @Override
//    public void delete(Serializable serializable) {
//
//    }
//
//    /**
//     * Deletes a given entity.
//     *
//     * @param entity
//     * @throws IllegalArgumentException in case the given entity is {@literal null}.
//     */
//    @Override
//    public void delete(Object entity) {
//
//    }
//
//    /**
//     * Deletes the given entities.
//     *
//     * @param entities
//     * @throws IllegalArgumentException in case the given {@link Iterable} is {@literal null}.
//     */
//    @Override
//    public void delete(Iterable entities) {
//
//    }
//
//    /**
//     * Deletes all entities managed by the repository.
//     */
//    @Override
//    public void deleteAll() {
//
//    }
//}
//**/