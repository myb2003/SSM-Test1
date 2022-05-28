package com.controller;

import com.model.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/toGoUpdate/{id}")
    public String toGoUpdate(@PathVariable("id") int id,Model model){
        Student byIdService = service.getByIdService(id);
        model.addAttribute("idService",byIdService);
        return "update";
    }

    @PutMapping("/toUpdate")
    public String toUpdate(Student student){
        int i = service.updateService(student);
        if (i>0){
            System.out.println("修改成功");
        }
        return "forward:/getAll";
    }

    @RequestMapping("/insert")
    public String toGoInsert(){
        return "insert";
    }

    @PostMapping("/toInsert")
    public String toInsert(Student student){
        int i = service.insertService(student);
        if (i>0){
            System.out.println("添加成功");
        }
        return "forward:/getAll";
    }

    @RequestMapping("/getAll")
    public String toGetAll(Model model){
        List<Student> list = service.selectService();
        System.out.println(list);
        model.addAttribute("select",list);
        return "end";
    }

    @RequestMapping("/toDelete/{id}")
    public String toDelete(@PathVariable("id") int id){
        int delete = service.delete(id);
        if (delete>0){
            System.out.println("删除成功");
        }
        return "forward:/getAll";
    }

}
