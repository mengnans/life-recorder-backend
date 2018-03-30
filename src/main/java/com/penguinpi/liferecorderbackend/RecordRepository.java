package com.penguinpi.liferecorderbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author Mengnan Shi
 * @create 2018-03-22-15:03
 */

@CrossOrigin("http://localhost:8081")
@RepositoryRestResource(collectionResourceRel = "records", path = "records")
public interface RecordRepository extends PagingAndSortingRepository<Record,Long> {

}
