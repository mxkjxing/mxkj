package cn.fjmx.mapper;

import java.util.List;

import cn.fjmx.entity.LabelSubhead;

/**
 * 首页_标签中的小标题的持久层接口
 */
public interface LabelSubheadMapper {
	/**
	 * 根据label_id查找LabelSubhead对象
	 * @return LabelSubhead对象集合
	 */
	List<LabelSubhead> findByLabelId(Integer label_id);
}
