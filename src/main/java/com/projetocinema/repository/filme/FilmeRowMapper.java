package com.projetocinema.repository.filme;

import com.projetocinema.domain.filme.Filme;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

@Component
public class FilmeRowMapper implements RowMapper<Filme> {

    @Override
    public Filme mapRow(ResultSet rs, int rowNum) throws SQLException {
        Filme filme = new Filme();
        filme.setNomeFilme(rs.getString("nome"));
        filme.setDescricaoFilme(rs.getString("descricao"));
        filme.setIdFilme(UUID.fromString(rs.getString("id")));

        return filme;
    }




}
