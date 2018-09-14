package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.domain.Member;

public interface MemberDao {
    Member selectMemberByName(@Param("name")String name)throws Exception;
}