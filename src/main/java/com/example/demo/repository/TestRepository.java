package com.example.demo.repository;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long>{
	
	@Query(value = "select provider,party_id,product_code,count(actual_status) from test_entity where actual_status= false group by provider",nativeQuery=true)
	//@Query(name="getGroupDetails", value = "select provider, party_id from test_entity where actual_status= false group by provider",nativeQuery=true)
	List<String> findactualStatus();

}





/*
 * INSERT INTO test_entity(activity_code, actual_status, date_time, party_id,
 * product_code, provider, status) VALUES ('2', false, '2019-05-08', 1, '100',
 * 'rohit', 0);
 * 
 * ALTER TABLE test_test ADD COLUMN rtest VARCHAR(55) DEFAULT NULL;
 * 
 * SELECT rtest FROM test_test;
 */