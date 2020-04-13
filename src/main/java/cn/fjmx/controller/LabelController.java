package cn.fjmx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fjmx.service.ILabelService;
import cn.fjmx.util.JsonResult;
import cn.fjmx.vo.LabelVO;


/**
 * 获取首页标签的控制器
 *
 */
@RestController
@CrossOrigin
@RequestMapping("label")
public class LabelController extends BaseController{
	
	@Autowired
	private ILabelService service;
	
	/**
	 * 
	 */
	@GetMapping("{title_id}/getAll")
	public JsonResult<List<LabelVO>> getAll(@PathVariable("title_id") Integer title_id){
		List<LabelVO> listVOs = service.findPagehomeLabel(title_id);
		return new JsonResult<List<LabelVO>>(OK,listVOs);
	}
}
