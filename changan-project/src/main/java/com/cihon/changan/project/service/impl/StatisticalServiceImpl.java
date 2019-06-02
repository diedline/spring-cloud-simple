package com.cihon.changan.project.service.impl;

import com.cihon.changan.common.dao.StatisticsMapper;
import com.cihon.changan.common.model.vo.Statistics;
import com.cihon.changan.common.model.vo.StatisticsExample;
import com.cihon.changan.project.service.IStatisticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@SuppressWarnings("ALL")
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class StatisticalServiceImpl implements IStatisticalService {

    @Autowired
    StatisticsMapper statisticsMapper;



    @Override
    public List<Statistics> getAllPara() {
        StatisticsExample statisticsExample = new StatisticsExample();
        return statisticsMapper.selectByExample(statisticsExample);
    }
}
