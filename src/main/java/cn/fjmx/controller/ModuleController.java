package cn.fjmx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fjmx.service.IModuleService;
import cn.fjmx.util.JsonResult;
import cn.fjmx.vo.ModuleVO;

/**
 * 获取首页模块的控制器
 *
 */
@RestController
@CrossOrigin
@RequestMapping("module")
public class ModuleController extends BaseController{
	@Autowired
	IModuleService service;
	
	@GetMapping("getModules")
	public JsonResult<List<ModuleVO>> getModules() {
		List<ModuleVO> moduleVOs = service.modules();
		return new JsonResult<List<ModuleVO>>(OK,moduleVOs);
	}
}
