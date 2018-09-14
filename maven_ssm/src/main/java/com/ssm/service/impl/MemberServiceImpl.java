package com.ssm.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ssm.dao.MemberDao;
import com.ssm.domain.Member;
import com.ssm.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService {
	 @Autowired
    MemberDao mDao;

    public Member login(String name, String passsword) throws Exception {
        System.out.println(name + passsword);
        if(StringUtils.isBlank(name)){
            System.out.println("用户名不能为空");
            return null;
        }
        if(StringUtils.isBlank(passsword)){
            System.out.println("密码不能为空");
            return null;
        }
        Member member = mDao.selectMemberByName(name);
        return member;
    }
   
}
