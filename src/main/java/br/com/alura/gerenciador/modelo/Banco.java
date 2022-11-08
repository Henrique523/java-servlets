package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		
		Usuario u1 = new Usuario();
		u1.setLogin("Nico");
		u1.setSenha("12345");
		
		Usuario u2 = new Usuario();
		u2.setLogin("Ana");
		u2.setSenha("12345");
		
		empresas.add(empresa1);
		empresas.add(empresa2);
		usuarios.add(u1);
		usuarios.add(u2);
	}

	public void adiciona(Empresa empresa) {
			empresa.setId(chaveSequencial++);
			empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.empresas;
	}
	
	public void removeEmpresa(Integer id) {
		
		empresas = empresas.stream()
				.filter(empresa -> !id.equals(empresa.getId()))
				.collect(Collectors.toList());
		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : empresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
		
	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario: usuarios) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		
		return null;
		
	}

}
