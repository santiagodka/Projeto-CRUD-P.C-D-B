/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import conexao.DisciplinaDAO;
import conexao.PropostadeCursoDAO;
import entidades.pojo.Disciplina;
import entidades.pojo.PropostadeCurso;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class PropostadeCursoDAOTeste {

    public static void main(String[] args) {
        Disciplina dis = new  Disciplina();
        System.out.println(dis.toString());
    }

    private static void testeExcluir() {
        PropostadeCurso pc = new PropostadeCurso();
        pc.setPk_proposta_curso(2);

        PropostadeCursoDAO dao = new PropostadeCursoDAO();
        dao.excluir(pc);
    }

    private static void testeAlterar() {
        //            testeCadastro();

        PropostadeCurso pc = new PropostadeCurso();
        pc.setPk_proposta_curso(9);
        pc.setNome_curso("matematica");
        pc.setDescricao("Curso decalculo Aplicada");
        pc.setPerfilegresso("So Passar nas Provas ou nao kkk  paga mlk");

        PropostadeCursoDAO dao = new PropostadeCursoDAO();
        dao.alterar(pc);
    }

    private static void testeCadastro() {
//        PropostadeCurso pc = new PropostadeCurso();
//        pc.setNome_curso("Fisica");
//        pc.setDescricao("Curso de Fisica Aplicada");
//        pc.setPerfilegresso("So Passar nas Provas");
//        PropostadeCursoDAO dao = new PropostadeCursoDAO();
//        dao.salvar(pc);
        Disciplina dis =new Disciplina();
        dis.setNome_disciplina("Mat");
        
        PropostadeCurso pc= new PropostadeCurso();
        pc.setPk_proposta_curso(12);
      
        DisciplinaDAO dao =new DisciplinaDAO();
        dao.cadastrar(dis);
    }

    private static void consultarTodos() {
        PropostadeCursoDAO pc = new PropostadeCursoDAO();
        List<PropostadeCurso> ListaResultado = pc.consultarTodos();

        for (PropostadeCurso  u: ListaResultado) {
            System.out.println(""+u.getNome_curso()+u.getDescricao()+u.getPerfilegresso());
            
        }
    }

    private static void BuscarId(){
        PropostadeCursoDAO dao =new PropostadeCursoDAO();
        PropostadeCurso pc= dao.consultarPorId(45);
        System.out.println(""+pc.toString());
        
      
    }

 private static void salvar(){
PropostadeCurso pc= new  PropostadeCurso();
             // pc.setId(8);
              pc.setNome_curso("Maria joao");
              pc.setDescricao("maria de soao");
              pc.setPerfilegresso("MAria de joao");
             
PropostadeCursoDAO dao = new PropostadeCursoDAO();
dao.salvar(pc);
     System.out.println("Salvo com  sucesso");

        }
}
