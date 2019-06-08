package com.cihon.changan.project.service.impl;

import com.cihon.changan.common.dao.TStatisticsMapper;
import com.cihon.changan.common.model.vo.TStatistics;
import com.cihon.changan.common.model.vo.TStatisticsExample;
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
    TStatisticsMapper statisticsMapper;



    @Override
    public List<TStatistics> getAllPara() {
        TStatisticsExample statisticsExample = new TStatisticsExample();
        return statisticsMapper.selectByExample(statisticsExample);
    }
}
