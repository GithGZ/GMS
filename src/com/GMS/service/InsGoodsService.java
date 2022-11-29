package com.GMS.service;

import com.GMS.dao.InsGoodsDao;

public class InsGoodsService {
    public String insert(String name, String price, String brief) {
        InsGoodsDao igd = new InsGoodsDao();
        return igd.insert(name,price,brief);
    }
}
