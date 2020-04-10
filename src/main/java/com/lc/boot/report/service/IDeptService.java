package com.lc.boot.report.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.boot.report.domain.Dept;

import java.util.List;

/**
 * @author lz
 * @date 2020-03-24 11:31
 */
public interface IDeptService extends IService<Dept> {
    List<Dept> selectDeptList();
}
