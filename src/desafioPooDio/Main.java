package desafioPooDio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso JS");
		curso2.setDescricao("descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria do java");
		mentoria1.setDescricao("descricao");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("descricao");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		Dev devJose = new Dev();
		devJose.setNome("José");
		devJose.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos José: "+devJose.getConteudosInscritos());
		devJose.progredir();
		System.out.println("---");
		System.out.println("Conteudos inscritos José Agora: "+devJose.getConteudosInscritos());
		System.out.println("Conteudos Concluidos José: "+devJose.getConteudosConcluidos());
		System.out.println(devJose.calcularTotalXp());
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		System.out.println("Conteudos inscritos Maria: "+devMaria.getConteudosInscritos());
		System.out.println("Conteudos Concluidos José: "+devJose.getConteudosConcluidos());
		
	}

}
