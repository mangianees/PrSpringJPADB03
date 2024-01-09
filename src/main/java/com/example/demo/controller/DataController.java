package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.DataModelRepo;
import com.example.demo.data.DataModel;

@Controller
public class DataController {
	@Autowired
	DataModelRepo repo;
	
	@GetMapping("home")
	public String home()
	{
		return "home.jsp";
	}
	
	@GetMapping("/AddDataModel")
	public String AddDataModel(DataModel dataModelObj) {
		repo.save(dataModelObj);
		return "home.jsp";
	}
	
	@GetMapping("/GetDataModel")
	public ModelAndView GetDataModel(@RequestParam int aid)
	{
		ModelAndView mv = new ModelAndView();

		DataModel dataModelObj = repo.findById(aid).orElse(new DataModel());
		mv.addObject("dataModelObj",dataModelObj);
		mv.setViewName("ShowData.jsp");
	
		return mv;
	}

}
