package lucy.study.demoGraphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import lucy.study.demoGraphQL.model.Menu;
import lucy.study.demoGraphQL.repository.MenuRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Query implements GraphQLQueryResolver {

    private static final Logger logger = LoggerFactory.getLogger(Query.class);
    private MenuRepository menuRepository;

    @Autowired
    public Query(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }

    public Iterable<Menu> findAllMenus(){
        logger.info("==========Query===========");
        logger.info(menuRepository.findAll().toString());
        return menuRepository.findAll();
    }

    public long countMenus(){
        return menuRepository.count();
    }

}
