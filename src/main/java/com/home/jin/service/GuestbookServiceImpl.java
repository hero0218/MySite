package com.home.jin.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.home.jin.vo.GuestbookVO;

//@Inject
//GuestbookDAO gdao;
//GuestbookVO gvo;


@Repository
public class GuestbookServiceImpl implements GuestbookService {

	
	@Override
	public String guestbookList(GuestbookVO vo) {

		return "example";
	}

	@Override
	public int modifyGuestbook(GuestbookVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteGuestbook(GuestbookVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
