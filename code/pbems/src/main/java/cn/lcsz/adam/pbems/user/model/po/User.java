package cn.lcsz.adam.pbems.user.model.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

/**
 * 用户表实体类
 * @author yufs
 */
@Data
@Table(name = "sys_user")
@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class User {
    /**
     * 用户编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户联系电话
     */
    private String telphone;
    /**
     * 用户类型 1管理员2考试用户
     */
    private Integer userKind;
    /**
     * 版本号
     */
    @JsonIgnore
    private Integer version;

    /**
     * 对应的部门实体类
     */
    @JoinColumn(name = "dept_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Dept dept;

}
