package com.bboniao.hbase.service.impl;

import com.bboniao.hbase.pojo.GetItem;
import com.bboniao.hbase.service.BatchGetService;

import java.util.List;

/**
 * hbase原生批量get实现
 * Created by bboniao on 11/5/14.
 */
public class NativeBatchGetServiceImpl implements BatchGetService {
    @Override
    public List<GetItem> batch(List<GetItem> getItems) {
        return null;
    }
}
