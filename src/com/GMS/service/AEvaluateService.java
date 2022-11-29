package com.GMS.service;

import com.GMS.dao.AEvaluateDao;

import java.util.List;

public class AEvaluateService {
    public List evaluate(String id) {
        AEvaluateDao ed = new AEvaluateDao();
        return ed.evaluate(id);
    }
}
