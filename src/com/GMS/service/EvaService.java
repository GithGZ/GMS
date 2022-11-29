package com.GMS.service;

import com.GMS.dao.EvaDao;

public class EvaService {
    public String insert(String user_id, String id, String eva) {
        EvaDao ed = new EvaDao();
        return ed.insert(user_id,id,eva);
    }
}
