package DAO;

import Model.AV6Model;

import java.util.Date;
import java.util.List;

public interface AV6ModelDAO {
    AV6Model createModel();                 //C
    List<AV6Model> readAll();               //R
    AV6Model readAV6ModelById(int id);      //R
    void updateModel(AV6Model av6Model);    //U
    void deleteModelById(int id);           //D
}
