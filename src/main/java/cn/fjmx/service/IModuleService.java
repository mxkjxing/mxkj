package cn.fjmx.service;

import java.util.List;

import cn.fjmx.vo.ModuleVO;

/**
 * 处理首页模块的业务层接口
 *
 */
public interface IModuleService {
	
	/**
	 * 获取首页所有的模块及内容集合
	 * @return
	 */
	public List<ModuleVO> modules();
	
	
}
