package com.simlearn.instructormanager.service;

import com.simlearn.instructormanager.dto.InstructorDto;
import com.simlearn.instructormanager.entity.InstructorEntity;

import java.util.List;

public interface InstructorService {
    void saveCourse(InstructorDto instructorDto);
    InstructorEntity getCourses(String username);
    List<InstructorEntity> getAllInstructors();
    void deleteInstructor(String username);
}
