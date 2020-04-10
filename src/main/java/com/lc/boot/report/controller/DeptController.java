package com.lc.boot.report.controller;

import com.lc.boot.report.domain.Dept;
import com.lc.boot.report.service.IDeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lz
 * @date 2020-03-24 11:28
 */
@RestController
@RequestMapping("/report")
public class DeptController {
    @Resource
    private IDeptService deptService;

    @GetMapping("/getDept")
    public List<Dept> list() {
        return deptService.selectDeptList();
    }
}
