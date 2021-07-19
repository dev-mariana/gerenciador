package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);		
		empresa.setNome("Avanade");
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);	
		empresa2.setNome("Alura");
		
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("mari");
		u1.setSenha("1234");
		
		Usuario u2 = new Usuario();
		u2.setLogin("gus");
		u2.setSenha("1234");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);	
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removerEmpresa(Integer id) {
		//acessa o elemento, remove ele e passa para o próximo elemento da lista se tiver
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa empresa = it.next();
			
			if(empresa.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa editarEmpresa(Integer id) {
		for(Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}
	
	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		
		return null;
	}
}