package com.lc.boot.report.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.boot.report.domain.Dept;
import com.lc.boot.report.mapper.DeptMapper;
import com.lc.boot.report.service.IDeptService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lz
 * @date 2020-03-24 11:33
 */
@Service
@AllArgsConstructor
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
    @Override
    public List<Dept> selectDeptList() {
        return baseMapper.selectList(null);
    }
}
