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

import com.rays.dto.EmployeDTO;
import com.rays.form.EmployeForm;
import com.rays.service.EmployeService;

@Controller
@RequestMapping(value = "Emp")
public class EmployeCtl {
	
	@Autowired
	public EmployeService employeService;
	

	
	@GetMapping
	public String display(@ModelAttribute("form") EmployeForm form, @RequestParam(required = false) Long id, Model model) {
		if (id != null && id > 0) {
			EmployeDTO dto = employeService.findBypk(id);
			form.setId(dto.getId());
			form.setName(dto.getName());
			form.setDepartment(dto.getDepartment());
			form.setLogin(dto.getLogin());
			form.setPassword(dto.getPassword());
			form.setAddress(dto.getAddress());
		}
		return "EmployeView";
	}
	
	@PostMapping
	public String submit(@ModelAttribute("form") @Valid EmployeForm form, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "EmployeView";
		}

		EmployeDTO dto = new EmployeDTO();
		dto.setId(form.getId());
		dto.setName(form.getName());
		dto.setDepartment(form.getDepartment());
		dto.setLogin(form.getLogin());
		dto.setPassword(form.getPassword());
		dto.setAddress(form.getAddress());

		if (form.getId() > 0) {
			employeService.update(dto);
		} else {
			employeService.add(dto);
		}
		return "EmployeView";
	}
	
	@GetMapping("search")
	public String display(@ModelAttribute("form") EmployeForm form, Model model) {

		

		List list = employeService.search(null);
		

		
		

		model.addAttribute("list", list);
		
		return "EmployeListView";

	}

	

	@PostMapping("search")
	public String search(@ModelAttribute("form") EmployeForm form, @RequestParam(required = false) String operation,
			Model model) {

		EmployeDTO dto = null;

		
		if (operation.equals("delete")) {
			if (form.getIds() != null && form.getIds().length > 0) {
				for (long id : form.getIds()) {
					employeService.delete(id);
				}
			}
		}

	

		List list = employeService.search(dto);

		model.addAttribute("list", list);

		return "EmployeListView";

	}
}
