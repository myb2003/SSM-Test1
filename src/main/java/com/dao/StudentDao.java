package com.dao;

import com.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    //     查看全部
    List<Student> selectDao();
    //    添加数据
    int insertDao(Student student);
    //    根据id查看
    Student getByIdDao(int id);
    //    删除
    int deleteDao(int id);
//    修改
    int updateDao(Student student);
}
