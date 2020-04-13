package cn.fjmx.mapper;

import java.util.List;

import cn.fjmx.entity.Label;

/**
 * 处理首页_标签列表名的持久层接口
 */
public interface LabelMapper {
	/**
	 * 查询所有的首页_标签列表名
	 */
	List<Label> findByTitleId(Integer title_id);
}
