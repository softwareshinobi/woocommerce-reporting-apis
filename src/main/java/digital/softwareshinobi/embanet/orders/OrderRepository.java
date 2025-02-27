package digital.softwareshinobi.embanet.orders;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByIdAllIgnoreCase(Long id);

    List<Order> findByDate(Date date);

}
