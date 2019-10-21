/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import entidades.pojo.PropostadeCurso;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;
import javax.ws.rs.core.Response;

/**
 *
 * @author Rodrigo
 */
public class PropostadeCursoDAO {

    private Connection con = Conexao.getConnection();

    public void cadastrar(PropostadeCurso propostadecurso) {

        //Monta SQL
        String sql = "INSERT INTO propostadecurso (nome_curso,descricao,perfilegresso) values(?,?,?)";

        try (PreparedStatement preparador = con.prepareStatement(sql)){
            //controi Prepared Statement com sql
            
            preparador.setString(1, propostadecurso.getNome_curso());
            preparador.setString(2, propostadecurso.getDescricao());
            preparador.setString(3, propostadecurso.getPerfilegresso());

            preparador.execute();
            preparador.close();
            System.out.println("Sucesso salvo !");

        } catch (SQLException ex) {
            System.out.println("ERRO no PreparedStatement " + ex.getMessage());
        }

    }

    public void alterar(PropostadeCurso propostadecurso) {

        //Monta SQL
        String sql = " UPDATE propostadecurso SET nome_curso=?,descricao=?,perfilegresso=?  WHERE pk_proposta_curso = ?";

        try (PreparedStatement preparador = con.prepareStatement(sql)){
            //controi Prepared Statement com sql
            
            preparador.setString(1, propostadecurso.getNome_curso());
            preparador.setString(2, propostadecurso.getDescricao());
            preparador.setString(3, propostadecurso.getPerfilegresso());
            preparador.setInt   (4, propostadecurso.getPk_proposta_curso());

            preparador.execute();
            preparador.close();
            System.out.println("Alterado com sucesso !");

        } catch (SQLException ex) {
            System.out.println("ERRO no PreparedStatement " + ex.getMessage());
        }

    }

    public void excluir(PropostadeCurso propostadecurso) throws IOException {

        //Monta SQL
        String sql = " DELETE FROM propostadecurso   WHERE pk_proposta_curso = ?";

        try {
            //controi Prepared Statement com sql
            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setInt(1, propostadecurso.getPk_proposta_curso());

            preparador.execute();
            preparador.close();
            System.out.println("Excluido com Sucesso com sucesso !");

        } catch (SQLException ex) {
            System.out.println("ERRO no PreparedStatement " + ex.getMessage());
             
        }

    }
    
    public List<PropostadeCurso> consultarTodos() {

        //Monta SQL
        String sql = " SELECT *FROM propostadecurso";

        List<PropostadeCurso> lista = new ArrayList<>();

        try {
            try ( //controi Prepared Statement com sql
                    PreparedStatement preparador = con.prepareStatement(sql)) {
                ResultSet resultado = preparador.executeQuery();
                while (resultado.next()) {

                    PropostadeCurso pc = new PropostadeCurso();

                    pc.setPk_proposta_curso(resultado.getInt("pk_proposta_curso"));
                    pc.setNome_curso(resultado.getString("nome_curso")); //valor  da  coluna
                    pc.setDescricao(resultado.getString("descricao"));
                    pc.setPerfilegresso(resultado.getString("perfilegresso"));
                    lista.add(pc);

                }
            }
            System.out.println("Consultado  com sucesso !");

        } catch (SQLException ex) {
            System.out.println("ERRO no PreparedStatement " + ex.getMessage());
        }
        return lista;

    }

    /**
     * faz a busca de 1 registro banco de dados por id do propodta de curso pelo
     * numero do id da proposta
     *
     * @param pk_proposta_curso
     * @param id e um inteiro que representa o numero do id do proposta ade
     * curso a ser buscado
     * @return ele retorna nulo quando nao encontra 
     *
     */
    public PropostadeCurso consultarPorId(Integer pk_proposta_curso) {
        //objeto de retorno do metodo 

        String sql = "SELECT * FROM propostadecurso WHERE pk_proposta_curso = ?";
                                    
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, pk_proposta_curso);

            //retorno da consulta em resulset
            ResultSet resultado = preparador.executeQuery();
            //sem ter  registro
            if (resultado.next()) {
                //instancia do Proposta de curso 
                PropostadeCurso pc = new PropostadeCurso();

                pc.setPk_proposta_curso(resultado.getInt("pk_proposta_curso"));
                pc.setNome_curso(resultado.getString("nome_curso"));
                pc.setDescricao(resultado.getString("descricao"));
                pc.setPerfilegresso(resultado.getString("perfilegresso"));

                return pc;
            }

        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
        }

        return null;
    }
    public void salvar(PropostadeCurso propostadecurso){
          if(propostadecurso.getPk_proposta_curso()!=null&&propostadecurso.getPk_proposta_curso()!=0){
               alterar(propostadecurso);
                System.out.println("alterardo  no banco de dados");;
              
              
          }
          else{
           
            cadastrar(propostadecurso);
             System.out.println("Cadastrou  no banco de dados");
             
          }


}

}




