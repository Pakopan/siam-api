package com.siam.siamapi.models.repos;

//import java.util.Optional;

import com.siam.siamapi.models.entities.Faculty;

import org.springframework.data.repository.CrudRepository;

public interface FacultyRepo extends CrudRepository<Faculty, String> {
    
}
