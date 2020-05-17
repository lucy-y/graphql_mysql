package lucy.study.demoGraphQL.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Menu")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int menuId;

    @Column(name = "menuURI")
    private String menuURI;

    @Column(name = "menuName")
    private String menuName;

    @Column(name = "menuNameKo")
    private String menuNameKo;

    @Column(name = "menuNameEn")
    private String menuNameEn;

    @Column(name = "menuNameJa")
    private String menuNameJa;

    @Column(name = "menuNameZh")
    private String menuNameZh;

    @Column(name = "menuDesc")
    private String menuDesc;

    @Column(name = "menuGroupId")
    private Integer menuGroupId;

    @Column(name = "menuHide")
    private Integer menuHide;

    @Column(name = "menuOrder", nullable = true)
    private Integer menuOrder;

    @Column(name = "adminId")
    private String adminId;

    @Column(name = "updateAt")
    private Date updateAt;

    public Menu(){
    }

    @Override
    public String toString(){
        return "Menu [menuId="+ menuId + ", menuName=" + menuName + "]";
    }

}
