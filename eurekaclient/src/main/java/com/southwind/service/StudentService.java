package com.southwind.service;

import com.southwind.entity.Student;

import java.util.Collection;

public interface StudentService {

    public Collection<Student> findAll();

    public Student findById(long id);

    public void save(Student student);

    public void delete(Long id);
}
