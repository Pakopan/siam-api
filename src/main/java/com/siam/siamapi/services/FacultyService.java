package com.siam.siamapi.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.siam.siamapi.models.entities.Faculty;
import com.siam.siamapi.models.repos.FacultyRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FacultyService {
    
    @Autowired
    private FacultyRepo facultyRepo;

    public Iterable<Faculty> getAllFaculties () {
        return facultyRepo.findAll();
    }

    public Faculty getFacultyById (String id) {
        Optional<Faculty> faculty = facultyRepo.findById(id);
        if (!faculty.isPresent()) return null;
        else return faculty.get();
    }

    public Faculty insertOrUpdateFaculty (Faculty faculty) {
        return facultyRepo.save(faculty);
    }
}
