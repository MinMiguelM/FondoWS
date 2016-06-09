/**
 * 
 */
package tk.fondomon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.fondomon.entities.SmfTopic;

/**
 * @author miguel
 *
 */
public interface SmfTopicRepository extends JpaRepository<SmfTopic, Integer>{
	
	SmfTopic findByIdFirstMsg(int id);
}
