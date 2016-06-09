/**
 * 
 */
package tk.fondomon.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import tk.fondomon.entities.SmfMessage;

/**
 * @author miguel
 *
 */
public interface SmfMessageRepository extends JpaRepository<SmfMessage, Integer>{

	List<SmfMessage> findRequestsByIdMember(int idMember,Pageable pageable);
	List<SmfMessage> findAllRequests(Pageable pageable);
	SmfMessage findByPosterTime(int time);
}
