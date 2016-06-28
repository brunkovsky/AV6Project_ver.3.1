package DAO;

import Model.AV6Model;

import java.util.List;

public interface AV6ModelDAO {
    AV6Model createModel();                     //C
    List<AV6Model> readAll();                   //R
    void updateModelById(AV6Model av6Model);    //U
    void deleteModelById(int id);               //D
}
