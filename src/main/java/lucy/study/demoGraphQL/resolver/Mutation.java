package lucy.study.demoGraphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lucy.study.demoGraphQL.model.Menu;
import lucy.study.demoGraphQL.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private MenuRepository menuRepository;

    @Autowired
    public Mutation(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }

    public Menu createMenu(String menuURI, String menuName,
                           String menuNameKo, String menuNameEn, String menuNameJa, String menuNameZh,
                           String menuDesc, int menuGroupId, int menuHide, int menuOrder, String adminId){
        Menu menu = new Menu();
        menu.setMenuURI(menuURI);
        menu.setMenuName(menuName);
        menu.setMenuNameKo(menuNameKo);
        menu.setMenuNameEn(menuNameEn);
        menu.setMenuNameJa(menuNameJa);
        menu.setMenuNameZh(menuNameZh);
        menu.setMenuDesc(menuDesc);
        menu.setMenuGroupId(menuGroupId);
        menu.setMenuHide(menuHide);
        menu.setMenuOrder(menuOrder);
        menu.setAdminId(adminId);

        menuRepository.save(menu);
        return menu;
    }
}
