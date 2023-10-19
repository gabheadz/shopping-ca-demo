package co.com.bancolombia.mongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<CartDocument/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<CartDocument/* change for adapter model */> {
}
