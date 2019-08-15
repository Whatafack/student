package com.example.demo.service;

import com.example.demo.dao.DpdouyUserDao;
import com.example.demo.entity.DpdouyUserEntity;
import com.example.demo.entity.DpdouyVideoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DpdouyUserService implements DpdouyUserServiceI{
    @Autowired
    DpdouyUserDao dpdouyUserDao;

    @Override
    public int login(DpdouyUserEntity dpdouyUserEntity) {
        return dpdouyUserDao.login(dpdouyUserEntity);
    }

    @Override
    public int reg1ister(DpdouyUserEntity dpdouyUserEntity) {
        return dpdouyUserDao.reg1ister(dpdouyUserEntity);
    }

    @Override
    public int upload(DpdouyVideoEntity dpdouyVideoEntity) {
        return dpdouyUserDao.upload(dpdouyVideoEntity);
    }
}
