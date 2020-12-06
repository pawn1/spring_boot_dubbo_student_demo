package com.qf.serviceImpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import comqf.service.IClsService;
import comqf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 功能说明
 *
 * @author xwgg
 * @date 2020-12-06 19:17:27
 */
@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;

    @Reference
    private IClsService clsService;

    @Override
    public List<Student> list() {
        List<Student> students = stuMapper.selectList(null);
        for (Student student : students) {
            Classes classes = clsService.queryById(student.getCid());
            student.setCls(classes);
        }
        return students;
    }
}
