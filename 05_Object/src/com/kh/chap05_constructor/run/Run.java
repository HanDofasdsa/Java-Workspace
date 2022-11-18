package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.*;

public class Run {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserId("user111");
		user1.setUserPwd("1234");
		user1.setUserName("동히");
		System.out.println(user1.information());

		User user2 = new User("user01", "pass01", "김갑순"); // id, pwd, name
		System.out.println(user2.information());
	}

}
