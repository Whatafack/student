package com.example.demo.service;

import com.example.demo.entity.DpdouyUserEntity;
import com.example.demo.entity.DpdouyVideoEntity;

import java.util.List;

public interface DpdouyUserServiceI {
    int login(DpdouyUserEntity dpdouyUserEntity);

    int reg1ister(DpdouyUserEntity dpdouyUserEntity);

    int upload(DpdouyVideoEntity dpdouyVideoEntity);
}
