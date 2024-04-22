package com.rays.ctl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rays.dto.StudentDTO;
import com.rays.form.StudentForm;
import com.rays.service.StudentService;

@Controller
@RequestMapping(value = "Stu")
public class StudentCtl {
	@Autowired
	public StudentService studentService;
	
	@GetMapping
	public String display(@ModelAttribute("form")StudentForm form, @RequestParam(required = false) Long id, Model model) {
		if(id !=null && id>0) {
			StudentDTO dto=studentService.findByPk(id);
			form.setfName(dto.getfName());
			form.setlName(dto.getlName());
			form.setCourse(dto.getCourse());
			form.setDuration(dto.getDuration());
		}
		return "StudentView";
	}
	

	@PostMapping
	public String submit(@ModelAttribute("form") @Valid StudentForm form,BindingResult bindingResult,Model model) {
		
		
		if(bindingResult.hasErrors()) {
			return "StudentView";
		}
		StudentDTO dto=new StudentDTO();
		dto.setId(form.getId());
		dto.setfName(form.getfName());
		dto.setlName(form.getlName());
		dto.setCourse(form.getCourse());
		dto.setDuration(form.getDuration());
		if(form.getId()>0) {
			studentService.update(dto);
			model.addAttribute("msg","Data updated..!!!");

		}else{
			studentService.add(dto);
			model.addAttribute("msg","Data added..!!!");

		}
		
		return "StudentView";
	}
	

	
	@GetMapping("search")
	public String display(@ModelAttribute("form") StudentForm form,Model model) {
		List list=studentService.search(null);
		model.addAttribute("list", list);
		return "StudentListView";
		
	}

	@PostMapping("search")
	public String search(@ModelAttribute("form") StudentForm form, @RequestParam(required = false) String operation,Model model) {

		StudentDTO dto = null;

		
		if (operation.equals("delete")) {
			if (form.getIds() != null && form.getIds().length > 0) {
				for (long id : form.getIds()) {
					studentService.delete(id);
					model.addAttribute("msgs","data deleted.....!!!!!!");
				}
			}
		}

	if(operation.equals("reset")) {
		return "StudentListView";
	}

		List list = studentService.search(dto);

		model.addAttribute("list", list);

		return "StudentListView";

	}
	

}
