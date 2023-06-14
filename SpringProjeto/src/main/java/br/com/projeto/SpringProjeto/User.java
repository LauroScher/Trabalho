package br.com.projeto.SpringProjeto;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

@Service
public class UserService {
    private static final Map<Long, User> request = new HashMap<>(); 
    
    public User criar(User user) {
    	Long proximoId = request.keySet().size() + 1L;
    	user.setId(proximoId);
		return user;}
    
    public User atualizar(User user, Long userId) {
    	user.put(userId, user);
    	return user;
    }
    
    public User getById (long userId) {
    	return User.get(userId);
    }
    
    public List<User> getAll () {
    	return new ArrayList<>(User.values());
    }
    
    public String delete(Long userId) {
    	User.remove(userId);
    	return "delete";
    }

	public UserService atualizar(UserService userservice, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserService criar(UserService userservice) {
		// TODO Auto-generated method stub
		return null;
	}
}
