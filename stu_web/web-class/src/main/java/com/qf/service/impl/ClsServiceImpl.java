package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.Classes;
import comqf.service.IClsService;
import com.qf.dao.ClsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 功能说明
 *
 * @author xwgg
 * @date 2020-12-06 18:48:25
 */
@Service
public class ClsServiceImpl implements IClsService {

    @Autowired
    private ClsMapper clsMapper;

    @Override
    public List<Classes> list() {
        return clsMapper.selectList(null);
    }

    @Override
    public Classes queryById(Integer id) {
        return clsMapper.selectById(id);
    }
}
