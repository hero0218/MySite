package com.home.jin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.jin.vo.GuestbookVO;


//@Autowired
//GuestbookService gs;


@Controller
@RequestMapping("/guestbook")
public class GuestbookController {

	@RequestMapping("/guestbooklist")
	public String guestbookList(Model model, GuestbookVO vo)
	{
		//model.addAttribute("gvo", gs.guestbookList(vo));
		
		
		return "/guestbook"; 
	}
	
	
	
}
