package cn.fjmx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	/**
	 * 后台模块大框架修改图片
	 * @param module_id
	 * @param avatar
	 */
	public Integer updateAvatarMid(@Param("module_id") Integer module_id,@Param("module_avatar") String module_avatar);
}
