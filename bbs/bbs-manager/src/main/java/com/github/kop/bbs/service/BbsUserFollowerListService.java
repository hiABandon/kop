package com.github.kop.bbs.service;

import java.util.List;
import com.github.kop.bbs.module.entity.BbsUserFollowerList;
import com.baomidou.mybatisplus.extension.service.IService;

public interface BbsUserFollowerListService extends IService<BbsUserFollowerList> {


    int updateBatchSelective(List<BbsUserFollowerList> list);

    int batchInsert(List<BbsUserFollowerList> list);

}
