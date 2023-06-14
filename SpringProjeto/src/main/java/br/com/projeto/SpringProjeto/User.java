package br.com.projeto.SpringProjeto;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class User {
	private long id;
	private String nome;
	private String senha;
	private int data;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void put(Long userId, User user) {
		// TODO Auto-generated method stub
		
	}
	public static User get(long userId) {
		// TODO Auto-generated method stub
		return null;
	}
	public static Object values() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void remove(Long userId) {
		// TODO Auto-generated method stub
		
	}
