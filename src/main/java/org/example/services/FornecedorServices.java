package org.example.services;

import org.example.dto.FornecedorDTO;
import org.example.entities.Contato;
import org.example.entities.Fornecedor;
import org.example.repositories.FornecedorRepositories;
import org.springframework.stereotype.Service;


@Service
public class FornecedorServices {
    public Fornecedor update(Long id, FornecedorDTO objDto){
        try{
            Fornecedor entity = findById(id);

            //Atualiza os dados do fornecedor
            entity.setRazaoSocial(objDto.getRazaoSocialSocial());
            entity.setNomeFantasia(objDto.getNomeFantasia());
            entity.setCnpj(objDto.getCnpj());
            entity.setStatus(objDto.getStatus());

            // Atualza o contato
            Contato contato = entity.getContato().get(0);
            contato.setConCelular(objDto.getConCelular());
            contato.setConTelefoneComercial(objDto.getConTelefoneComercial());
            contato.setConEmail(objDto.getConEmail());
            contato.setConEmailSecundario(objDto.getConEmailSecundario());


            //Salva as alterações
            return FornecedorRepositories.save(entity);
        }
        catch (Exception e){
            throw new RuntimeException("Erro ao atualizar o fornecedor", e);
        }
    }
}
