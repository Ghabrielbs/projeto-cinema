package com.projetocinema.repository.filme;

import com.projetocinema.domain.filme.Filme;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class FilmeRowMapper implements RowMapper<Filme> {

    @Override
    public Filme mapRow(ResultSet rs, int rowNum) throws SQLException {
        Filme filme = new Filme();
        filme.setNome(rs.getString("nome"));
        filme.setDescricao(rs.getString("descricao"));
        filme.setId(rs.getString("id"));

        return filme;
    }
}
