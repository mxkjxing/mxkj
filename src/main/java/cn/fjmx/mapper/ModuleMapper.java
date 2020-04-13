package cn.fjmx.mapper;

import java.util.List;

import cn.fjmx.entity.Module;

/**
 * 处理模块大框架的持久层接口
 */
public interface ModuleMapper {
	/**
	 * 获取所有模块大框架
	 * @return
	 */
	public List<Module> findAll(); 
}
