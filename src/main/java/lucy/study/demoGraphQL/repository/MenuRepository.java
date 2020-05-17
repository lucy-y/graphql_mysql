package lucy.study.demoGraphQL.repository;

import lucy.study.demoGraphQL.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
