package Agenda;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Agenda{
	private static List<Contato> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Contato contato = new Contato();
		contato.setId(chaveSequencial++);
		contato.setNome("Padrao");
		contato.setTelefone("08399327848");
		contato.setData("12/10/2020");
		Agenda.lista.add(contato);
		}
	
	public void adicionaContato(Contato contato) {
		contato.setId(Agenda.chaveSequencial++);
		Agenda.lista.add(contato);
	}
	
	public List<Contato> getContatos(){
		return Agenda.lista;
	}
	public Contato buscaContatoId(Integer id) {
		for(Contato contato : lista) {
			if(contato.getId() == id)
				return contato;
		}
		return null;
	}
	
	public void removeContato(Integer id) {
		Iterator<Contato> it = lista.iterator();
		while(it.hasNext()) {
			Contato cont = it.next();
			if(cont.getId() == id) {
				it.remove();
			}
		}
		
	}
}