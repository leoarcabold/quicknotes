package org.example;

import dao.AnotacaoDAO;
import dao.CategoriaDAO;
import dao.DBConnection;
import model.Anotacao;
import model.Categoria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        CategoriaDAO dao = new CategoriaDAO();
//        dao.insert("LAZER");

//       List<Categoria> categorias =  dao.findAll();
//        for (int i = 0; i < categorias.size(); i++) {
//            System.out.println(categorias.get(i));
//        }

AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
        List<Anotacao> anotacao = anotacaoDAO.listar();
        for (Anotacao a:anotacao) {
            System.out.println(a);
        }
    }
}