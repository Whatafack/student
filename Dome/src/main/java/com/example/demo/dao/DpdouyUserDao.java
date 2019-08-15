package com.example.demo.dao;

import com.example.demo.entity.DpdouyUserEntity;
import com.example.demo.entity.DpdouyVideoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DpdouyUserDao {
    int login(DpdouyUserEntity dpdouyUserEntity);

    int reg1ister(DpdouyUserEntity dpdouyUserEntity);

    int upload(DpdouyVideoEntity dpdouyVideoEntity);
}
