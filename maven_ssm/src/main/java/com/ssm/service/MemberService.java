package com.ssm.service;

import com.ssm.domain.Member;

public interface MemberService {
	 Member login(String name, String passsword) throws Exception;
}
