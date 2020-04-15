package cn.fjmx.mapper;

import java.util.List;

import cn.fjmx.entity.ModuleLabelBody2;

/**
 * 查找首页模块_标签2的界面列表持久层接口
 *
 */
public interface ModuleLabelBody2Mapper {
	
	/**
	 * 根据Label_id查找界面列表2内容集合
	 * @return
	 */
	public List<ModuleLabelBody2> findByLabelId(Integer label_id);
}	
