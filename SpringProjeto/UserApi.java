package br.com.projeto.SpringProjeto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(value ="/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserApi {
	@Autowired
	private UserService userservice;

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	 @PostMapping
	    @ResponseBody
	    public UserService criar(@RequestBody UserService userservice) {
	        return userservice.criar(userservice);
	    }

	    @PutMapping("/{userId}")
	    @ResponseBody
	    public UserService atualizar(@PathVariable("userId") Long userId,
	                               @RequestBody UserService userservice) {
	        return userservice.atualizar(userservice, userId);
	    }

	    @GetMapping
	    @ResponseBody
	    public List<User> getAll() {
	        return userservice.getAll();
	    }

	    @DeleteMapping("/{userId}")
	    @ResponseBody
	    public String deletar(@PathVariable("userId") Long userId) {
	        return userservice.delete(userId);
	    }

}
