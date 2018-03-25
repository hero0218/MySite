package com.home.jin.service;

import java.util.List;

import com.home.jin.vo.GuestbookVO;

public interface GuestbookService {

	public String guestbookList(GuestbookVO vo);
	public int modifyGuestbook (GuestbookVO vo);
	public int deleteGuestbook (GuestbookVO vo);
	
}
