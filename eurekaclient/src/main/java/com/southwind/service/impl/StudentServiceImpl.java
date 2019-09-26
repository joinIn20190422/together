package com.southwind.service.impl;

import com.southwind.entity.Student;
import com.southwind.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private static Map<Long,Student> map = new HashMap<>();

    static {
        map.put(1L,new Student(1L,"韩正",22));
        map.put(2L,new Student(2L,"汪洋",23));
        map.put(3L,new Student(3L,"赵乐际",24));
    }
    @Override
    public Collection<Student> findAll() {
        return map.values();
    }

    @Override
    public Student findById(long id) {
        return map.get(id);
    }

    @Override
    public void save(Student student) {
        map.put(student.getId(),student);
    }

    @Override
    public void delete(Long id) {
        map.remove(id);
    }
}
