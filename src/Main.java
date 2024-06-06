import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


public class Main {
	
	public static void main (String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descricao curso JavaScript");
		curso2.setCargaHoraria(8);

		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descricão mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devRafael = new Dev();
		devRafael.setNome("Rafael");
		devRafael.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Rafael" + devRafael.getConteudosInscritos());
		devRafael.progredir();
		System.out.println("Conteúdos Inscritos Rafael" + devRafael.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Rafael" + devRafael.getConteudosConcluidos());

		System.out.println("-----------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteúdos Inscritos Rafael" + devRafael.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Joao" + devJoao.getConteudosConcluidos());

		
		
		
	}
	
}
