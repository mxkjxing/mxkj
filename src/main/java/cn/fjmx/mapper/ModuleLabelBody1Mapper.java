package cn.fjmx.mapper;

import java.util.List;

import cn.fjmx.entity.ModuleLabelBody1;

/**
 * 查找首页模块_标签1的界面列表持久层接口
 *
 */
public interface ModuleLabelBody1Mapper {
	
	/**
	 * 根据Label_id查找界面列表1内容集合
	 * @return
	 */
	public List<ModuleLabelBody1> findByLabelId(Integer label_id);
}	
