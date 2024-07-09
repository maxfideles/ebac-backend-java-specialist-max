package com.max.dao;

public interface IContractDao {

    public String salvar();

    public String search(Integer  id);

    public String update(Integer id);

    public String delete(Integer id);
}
