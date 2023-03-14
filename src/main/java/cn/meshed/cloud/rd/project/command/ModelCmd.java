package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.data.RequestFieldDTO;
import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import cn.meshed.cloud.rd.project.enums.OperateEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <h1>模型操作模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "模型操作模型")
public class ModelCmd extends Command {
    /**
     * uuid
     */
    @Schema(title = "模型唯一标识")
    private String uuid;
    /**
     * 模型中文解释
     */
    @Schema(title = "模型中文解释")
    @NotBlank(message = "模型中文解释不能为空")
    private String name;
    /**
     * 模型英文标识
     */
    @Schema(title = "模型英文标识")
    @NotBlank(message = "模型英文标识不能为空")
    private String enname;
    /**
     * 模型父类
     */
    @Schema(title = "模型父类")
    @NotBlank(message = "模型父类")
    private String superClass;
    /**
     * 领域
     */
    @Schema(title = "领域")
    @NotBlank(message = "领域不能为空")
    private String domain;
    /**
     * 模型所属项目唯一标识
     */
    @Schema(title = "模型所属项目唯一标识")
    @NotBlank(message = "模型所属项目唯一标识不能为空")
    private String projectKey;
    /**
     * 模型操作模式
     */
    @Schema(title = "模型操作模式")
    private OperateEnum operate;
    /**
     * 类型
     */
    @Schema(title = "类型")
    @NotNull(message = "类型不能为空")
    private ModelTypeEnum type;
    /**
     * 详情
     */
    @Schema(title = "详情")
    @NotBlank(message = "详情不能为空")
    private String description;

    /**
     * 模型字段
     */
    @Schema(title = "模型字段")
    private List<RequestFieldDTO> fields;

}
