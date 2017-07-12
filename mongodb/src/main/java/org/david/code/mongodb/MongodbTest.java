package org.david.code.mongodb;

import com.mongodb.MongoClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.UUID;

/**
 * Created by william on 2017/6/19.
 */
public class MongodbTest {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
        List<Customer> customerList = customerRepository.findAll();
        System.out.println(customerList.size());

    }

}
