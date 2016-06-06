/**
 * 
 */
package tk.fondomon.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tk.fondomon.entities.SmfMessage;
import tk.fondomon.repositories.SmfMessageRepository;

/**
 * @author miguel
 *
 */
@RestController
@RequestMapping("/requests")
public class SmfMessageController {
	
	@Autowired SmfMessageRepository smfMessageRepository;
	
	@RequestMapping(value="/getByIdMember/{idMember}", method=RequestMethod.GET)
	List<SmfMessage> findByMemberId(@PathVariable int idMember){
		Pageable topTen = new PageRequest(0, 10);
		return smfMessageRepository.findRequestsByIdMember(idMember,topTen);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	SmfMessage add(@RequestBody SmfMessage newMessage){
		return smfMessageRepository.save(newMessage);
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	List<SmfMessage> findAllRequests(){
		Pageable topTen = new PageRequest(0, 10);
		return smfMessageRepository.findAllRequests(topTen);
	}
}
