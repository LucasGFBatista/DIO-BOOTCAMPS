package desafio_poo_dio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import desafio_poo_dio.br.com.dio.desafio.dominio.Bootcamp;
import desafio_poo_dio.br.com.dio.desafio.dominio.Curso;
import desafio_poo_dio.br.com.dio.desafio.dominio.Dev;
import desafio_poo_dio.br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Curso> cursosExistentes = new HashSet<>();

        char resposta;
        do {
            System.out.println("Digite o nome do curso a criar: ");
            String cursoNome = sc.nextLine();
            System.out.println("Descrição do curso: ");
            String cursoDescricao = sc.nextLine();
            System.out.println("Carga  Horaria: ");
            int cargaHorario = sc.nextInt();

            cursosExistentes.add(new Curso(cargaHorario, cursoDescricao,cursoNome));

            System.out.println("Deseja criar/adicionar outro curso? (S/N)");
            resposta = sc.next().charAt(0);
            sc.nextLine();

        } while (resposta != 'N' && resposta != 'n' );


        System.out.println("Digite o nome da mentoria: ");
        String nomeMentoria = sc.nextLine();
        System.out.println("Digite a descrição: ");
        String descricaoMentoria = sc.nextLine();

        Mentoria mentoria = new Mentoria(LocalDate.now(), nomeMentoria, descricaoMentoria);

        System.out.println("Digite o nome do Bootcamp: ");
        String bootcampNome = sc.nextLine();
        System.out.println("Digite a descrição: ");
        String bootcampDescricao = sc.nextLine();

        Bootcamp bootcamp = new Bootcamp(bootcampNome, bootcampDescricao);

        for (Curso n: cursosExistentes){
            bootcamp.getConteudos().add(n);
        }

        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        sc.close();
    }

}