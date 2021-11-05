package com.siam.siamapi.controllers;

import com.siam.siamapi.dto.FacultyDTO;
import com.siam.siamapi.models.entities.Faculty;
import com.siam.siamapi.services.FacultyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @GetMapping
    public Iterable<Faculty> getAllFaculties () {
        return facultyService.getAllFaculties();
    }

    @GetMapping("/{id}")
    public Faculty getFacultyById (@PathVariable("id") String id) {
        return facultyService.getFacultyById(id);
    }

    @PostMapping
    public Faculty insertFaculty (@RequestBody FacultyDTO facultyDTO) {
        Faculty faculty = new Faculty();
        faculty.setName(facultyDTO.getName());
        faculty.setCode(facultyDTO.getCode());
        return facultyService.insertOrUpdateFaculty(faculty);
    }
}
