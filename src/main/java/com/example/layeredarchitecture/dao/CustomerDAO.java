package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException ;

    public void delete(String id) throws SQLException, ClassNotFoundException ;
    public void  saveCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException;
    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;
    public String genarateNewCustomerId() throws SQLException, ClassNotFoundException ;
    public void updateCustomer(String id,String name,String address) throws SQLException, ClassNotFoundException ;

    public CustomerDTO getCustomer(String newValue) throws SQLException, ClassNotFoundException ;
}
