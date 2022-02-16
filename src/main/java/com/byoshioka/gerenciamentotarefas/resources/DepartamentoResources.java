package com.byoshioka.gerenciamentotarefas.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.byoshioka.gerenciamentotarefas.dominios.Departamento;

@RestController
@RequestMapping(value="/departamentos")
public class DepartamentoResources {

    @RequestMapping(method = RequestMethod.GET)
    public List<Departamento> listar(){

        Departamento dep1 = new Departamento(1, "Financeiro");
        Departamento dep2 = new Departamento(2, "Comercial");
        Departamento dep3 = new Departamento(3, "Desenvolvimento");

        List<Departamento> lista = new ArrayList<>();
        lista.add(dep1);
        lista.add(dep2);
        lista.add(dep3);

        return lista;

    }

}
