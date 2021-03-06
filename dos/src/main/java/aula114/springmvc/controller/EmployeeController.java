package aula114.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import aula114.springmvc.service.EmployeeService;
import aula114.springmvc.domain.Contact;

import java.util.List;
import java.util.ArrayList;


@Controller
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(value="/show", method = RequestMethod.POST)
  public String show(Model model, @RequestParam("clave") String clave){
	Contact contact=new Contact();
	contact=employeeService.show(clave);
	model.addAttribute("contact", contact);
	return "consulta";
  }
   
  @RequestMapping(value="/employee", method = RequestMethod.GET)
  public String consulta(Model model) {
    	model.addAttribute("contact", employeeService.listIdEmployee());
    	return "list";
  }

  @RequestMapping(value="/delete", method = RequestMethod.POST)
  public String delete (Model model, @RequestParam(value = "id", required = false) String id){
//  public String delete (Model model, @ModelAttribute("contactDelete") String id){

	int c=employeeService.delete(id);

	model.addAttribute("filas",c);

	return "deleteOK";
  }

  @RequestMapping("/add")
  public String cargaInsertar (Model model){
	return "add";
  }

  @RequestMapping(value="/insert", method = RequestMethod.POST)
//  public String insertar(Model model,@ModelAttribute("contactInsert") Contact contact){
  public String insertar(Model model,@ModelAttribute Contact contact){

	int c = employeeService.insert(contact);
	model.addAttribute("resultado", c);

	return "updateOK";
	
  }

  @RequestMapping("/edit")
  public String cargaEditar (Model model){
	return "edit";
  }


  @RequestMapping(value="/editar", method = RequestMethod.POST)
 // public String editar (Model model,@ModelAttribute("contactEdit") Contact contact){
  public String editar (Model model,
		@RequestParam(value="name", required=false) String name,
		@RequestParam(value="address", required=false) String address,
		@RequestParam(value="email", required=false) String email,
		@RequestParam(value="telephone", required=false) String telephone){

	Contact contact=new Contact();
	if(name!=null){contact.setName(name);}
	if(address!=null){contact.setAddress(address);}
	if(email!=null){contact.setEmail(email);}
	if(telephone!=null){contact.setTelephone(telephone);}

	int c = employeeService.insert(contact);
	model.addAttribute("resultado", c);

	return "updateOK";
  }

}
