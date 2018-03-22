package com.penguinpi.liferecorderbackend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author Mengnan Shi
 * @create 2018-03-22-15:03
 */

@CrossOrigin(origins = "http://localhost:8081")
@RepositoryRestResource
public interface RecordRepository extends CrudRepository<Record,Long>{

}
