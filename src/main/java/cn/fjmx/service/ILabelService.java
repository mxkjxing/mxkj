package cn.fjmx.service;

import java.util.List;


import cn.fjmx.vo.LabelVO;

/**
 * 处理页首标签的业务层接口
 *
 */
public interface ILabelService {
	/**
	 * 获取首页标签
	 * @return
	 */
	public List<LabelVO> findPagehomeLabel(Integer title_id);
}
