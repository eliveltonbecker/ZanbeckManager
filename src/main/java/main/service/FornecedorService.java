package main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import main.models.Fornecedor;

@Service
public interface FornecedorService {
	List<Fornecedor> getAll();
	void save(Fornecedor cliente);
	void delete(Fornecedor cliente);
}
