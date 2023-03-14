package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectStatusEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>项目传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "项目传输模型")
public class ProjectDTO {

    /**
     * uuid
     */
    @Schema(title = "通用唯一编码")
    private String uuid;

    /**
     * key
     */
    @Schema(title = "项目唯一标识")
    private String key;

    /**
     * name
     */
    @Schema(title = "项目名称")
    private String name;

    /**
     * type
     */
    @Schema(title = "项目类型")
    private ProjectTypeEnum type;

    /**
     * 状态
     */
    @Schema(title = "项目状态")
    private ProjectStatusEnum status;

    /**
     * 版本号
     */
    @Schema(title = "项目版本号")
    private String version;

    /**
     * 负责人
     */
    @Schema(title = "负责人")
    private String owner;

    /**
     * 项目授权模式
     */
    @Schema(title = "项目授权模式")
    private ProjectAccessModeEnum accessMode;

    /**
     * 描述
     */
    @Schema(title = "描述")
    private String description;

}
