/**
 * 
 */
package tk.fondomon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tk.fondomon.entities.SmfTopic;
import tk.fondomon.repositories.SmfTopicRepository;

/**
 * @author miguel
 *
 */
@RestController
@RequestMapping("/topics")
public class SmfTopicController {
	
	@Autowired SmfTopicRepository smfTopicRepository;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	SmfTopic update(@RequestBody SmfTopic newTopic){
		smfTopicRepository.save(newTopic);
		return smfTopicRepository.findByIdFirstMsg(newTopic.getIdFirstMsg());
	}

}
