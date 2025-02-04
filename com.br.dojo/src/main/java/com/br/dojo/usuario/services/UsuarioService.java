package com.br.dojo.usuario.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.dojo.usuario.models.UsuarioModel;

@Service
public class UsuarioService {

	private List<UsuarioModel> listaUsuario = new ArrayList<UsuarioModel>(
			Arrays.asList(new UsuarioModel(0, "#", "Andressa", 16, "Casada", "Calma gente")));

	public List<UsuarioModel> buscarTodos() {
		return listaUsuario;
	}

	public String salvarComentario(UsuarioModel pessoa) {
		
		if(pessoa.getIdade()>= 18) {
		listaUsuario.add(pessoa);
		return "redirect:/";
		}else {
			return "redirect:barrado";
		}
		
	}

	public UsuarioModel buscarUsuario(int id) {
		UsuarioModel usuario = null;

		for (UsuarioModel retorno : listaUsuario) {
			if (retorno.getId() == id) {
				usuario = retorno;
			}
		}
		return usuario;
	}
	// private int id;
	// private String foto;
	// private String nome;
	// private int idade;
	// private String estadoCivil;
	// private String comentario;

}
