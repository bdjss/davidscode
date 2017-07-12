package org.david.code.mongodb;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by william on 2017/6/19.
 */
@Repository
public class CustomerRepository {

    @Resource
    private MongoTemplate mongoTemplate;

    public Customer findOne(String id) {
        return this.mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), Customer.class);
    }

    public List<Customer> findAll() {
        return this.mongoTemplate.findAll(Customer.class);
    }

}
