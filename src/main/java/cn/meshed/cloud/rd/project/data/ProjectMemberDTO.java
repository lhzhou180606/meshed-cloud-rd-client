package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ProjectRoleEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>项目成员</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectMemberDTO {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Schema(description = "id")
    private Integer id;

    /**
     * 项目唯一标识
     */
    @Schema(description = "项目唯一标识")
    private String projectKey;

    /**
     * 成员账号id
     */
    @Schema(description = "成员账号id")
    private Long uid;

    /**
     * 成员仓库用户的ID
     */
    @Schema(description = "成员仓库用户的ID")
    private String thirdUid;

    /**
     * 用户名称
     */
    @Schema(description = "用户名称")
    private String name;

    /**
     * 项目成员的角色：管理员/开发者/浏览者
     */
    @Schema(description = "项目成员的角色")
    private ProjectRoleEnum projectRole;

    /**
     * 登入账号
     */
    @Schema(description = "登入账号")
    private String loginId;
    /**
     * 手机号
     */
    @Schema(description = "手机号")
    private String phone;
    /**
     * 邮箱
     */
    @Schema(description = "邮箱")
    private String email;
    /**
     * 校验手机号
     */
    @Schema(description = "校验手机号")
    private Boolean validPhone;
    /**
     * 校验邮箱
     */
    @Schema(description = "校验邮箱")
    private Boolean validEmail;
    /**
     * 是否禁用
     */
    @Schema(description = "是否禁用")
    private Boolean disabled;

}
