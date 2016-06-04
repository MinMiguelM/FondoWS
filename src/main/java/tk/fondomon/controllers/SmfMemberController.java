package tk.fondomon.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tk.fondomon.entities.SmfMember;
import tk.fondomon.repositories.SmfMemberRepository;

@RestController
@RequestMapping("/members")
public class SmfMemberController {
	
	@Autowired SmfMemberRepository smfMemberRepository;
	
	@RequestMapping(value="/getAll",method = RequestMethod.GET)
	Collection<SmfMember> findAll(){
		return smfMemberRepository.findAll();
	}
}
