package com.simlearn.instructormanager.controller;

import com.simlearn.instructormanager.dto.InstructorDto;
import com.simlearn.instructormanager.entity.InstructorEntity;
import com.simlearn.instructormanager.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:5173")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @PostMapping("/course")
    public void saveInstructorCourse(@RequestBody InstructorDto instructor) {
        instructorService.saveCourse(instructor);
    }

    @GetMapping("/courses/{username}")
    public InstructorEntity getCourses(@PathVariable String username) {
        return instructorService.getCourses(username);
    }

    @GetMapping("/all-instructors")
    public List<InstructorEntity> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @DeleteMapping("/instructor/{username}")
    public void deleteInstructor(@PathVariable String username) {
        instructorService.deleteInstructor(username);
    }
}
