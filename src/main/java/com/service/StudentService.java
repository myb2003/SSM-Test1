package com.service;

import com.dao.StudentDao;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao dao;

    public List<Student> selectService(){
        return dao.selectDao();
    }

    public Student getByIdService(int id){
        return dao.getByIdDao(id);
    }

    public int insertService(Student student){
        return dao.insertDao(student);
    }

    public int delete(int id){
        return dao.deleteDao(id);
    }

    public int updateService(Student student){
        return dao.updateDao(student);
    }
}
