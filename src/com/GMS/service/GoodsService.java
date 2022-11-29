package com.GMS.service;

import com.GMS.dao.GoodsDao;

import java.util.List;

public class GoodsService {
    public List Goods() {
        GoodsDao gd = new GoodsDao();
        return gd.Goods();
    }
}
