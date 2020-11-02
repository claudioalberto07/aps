package Agenda;
import java.util.List;
import java.util.ArrayList;

public class Agenda{
	private static List<Contato> lista = new ArrayList<>();
	static {
		Contato contato = new Contato();
		contato.setNome("Padrao");
		contato.setTelefone("08399327848");
		contato.setData("12/10/2020");
		Agenda.lista.add(contato);
		}
	
	public void adicionaContato(Contato contato) {
		Agenda.lista.add(contato);
	}
	
	public List<Contato> getContatos(){
		return Agenda.lista;
	}
	
	public void deleteContato(String telefone) {
		for(int i = 0; i < Agenda.lista.size(); i++) {
			if(Agenda.lista.get(i).getTelefone() == telefone) {
				Agenda.lista.remove(i);
			}
		}
	}
}