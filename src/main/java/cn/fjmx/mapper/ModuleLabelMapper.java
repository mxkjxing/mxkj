package cn.fjmx.mapper;

import java.util.List;

import cn.fjmx.entity.ModuleLabel;

/**
 * 模块框架的标签持久层接口
 *
 */
public interface ModuleLabelMapper {
	/**
	 * 根据Module_id查找模块框架的标签
	 * @return
	 */
	public List<ModuleLabel> findByModuleId();
}
