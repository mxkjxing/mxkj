package cn.fjmx.mapper;

import java.util.List;

import cn.fjmx.entity.ModuleLabelBody3;

/**
 * 查找首页模块_标签2的界面列表持久层接口
 *
 */
public interface ModuleLabelBody3Mapper {
	
	/**
	 * 根据Label_id查找界面列表2内容集合
	 * @return
	 */
	public List<ModuleLabelBody3> findByLabelId(Integer label_id);
}	
